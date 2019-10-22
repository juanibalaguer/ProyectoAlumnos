/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import proyectoconeccion.Conectar;

/**
 *
 * @author garba
 */
public class CursadaData {
    Conectar coneCC;
    Connection conC=null;
    public CursadaData(Conectar con){
        conC=con.conexion();
        coneCC=con;
    }
    
    public void guardarCursada(Cursada cursada){
        try{
        //Conectar conector=new Conectar();
        //con=conector.conexion();
        String sql="INSERT INTO cursada (idAlumno,idMateria,nota) VALUES (?,?,?)";
        PreparedStatement st=conC.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        st.setInt(1, cursada.getAlumno().getIdAlumno());
        st.setInt(2, cursada.getMateria().getIdMateria());
        st.setDouble(3, cursada.getNota());
        st.executeUpdate();
        ResultSet rs=st.getGeneratedKeys();
        if(rs.next()){
            cursada.setIdCursada(rs.getInt(1));
            System.out.println("Se ingresó la cursada a la base de datos");
            
        } else {
            System.out.println("No se pudo obtener el ID");
        }
        //con.close();
        st.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void actualizarCursada(Cursada cursada){
        try{
        //Conectar conector=new Conectar();
        //con=conector.conexion();
        String sql="UPDATE cursada SET idAlumno=?,idMateria=?,nota=? WHERE idCursada=?";
        PreparedStatement st=conC.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        st.setInt(1, cursada.getAlumno().getIdAlumno());
        st.setInt(2, cursada.getMateria().getIdMateria());
        st.setDouble(3, cursada.getNota());
        st.setInt(4, cursada.getIdCursada());
        st.executeUpdate();
        ResultSet rs=st.getGeneratedKeys();
        System.out.println("Se actualizó la cursada en la base de datos");
        
        //con.close();
        st.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    
    public void borrarCursada(int id){
        try{
        //Conectar conector=new Conectar();
        //con=conector.conexion();
        String sql="DELETE FROM cursada WHERE idCursada = ?";
        PreparedStatement st=conC.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        st.setInt(1, id);
        st.executeUpdate();
        System.out.println("Se borró la cursada de la base de datos");
        
        //con.close();
        st.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public Cursada buscarCursada(int id){
        Cursada cursada= new Cursada();
        try{
        //Conectar conector=new Conectar();
        //con=conector.conexion();
        String sql="SELECT * FROM cursada WHERE idCursada=?";
        PreparedStatement st=conC.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        
        st.setInt(1, id);
        ResultSet rs=st.executeQuery();
        
        while (rs.next()){
            Alumno alumno=buscarAlumno(rs.getInt("idAlumno"));
            Materia materia=buscarMateria(rs.getInt("idMateria"));
            cursada.setIdCursada(rs.getInt("idCursada"));
            cursada.setAlumno(alumno);
            cursada.setMateria(materia);
            cursada.setNota(rs.getInt("nota"));

            
        }
       // con.close();
        st.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return cursada;
    }
    
    
    public List<Cursada> obtenerCursadas(){
        List<Cursada> cursadas= new ArrayList<>();
        try {
        //Conectar conector=new Conectar();
        //con=conector.conexion();
        String sql="SELECT * FROM cursada";
        PreparedStatement st=conC.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        ResultSet rs=st.executeQuery();
        
        while (rs.next()){
            Cursada unacursada=new Cursada();
            Alumno alumno=buscarAlumno(rs.getInt("idAlumno"));
            Materia materia=buscarMateria(rs.getInt("idMateria"));
            unacursada.setIdCursada(rs.getInt("idCursada"));
            unacursada.setAlumno(alumno);
            unacursada.setMateria(materia);
            unacursada.setNota(rs.getInt("nota"));
            cursadas.add(unacursada);
            
        }
       // con.close();
        st.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return cursadas;
    }
    
    public Alumno buscarAlumno(int id){
        AlumnoData alum=new AlumnoData(coneCC);
        return alum.buscarAlumno(id);
    }
    
    public Materia buscarMateria(int id){
        MateriaData mat=new MateriaData(coneCC);
        return mat.buscarMateria(id);
    }

}
