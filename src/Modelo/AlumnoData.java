/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import static java.sql.Date.valueOf;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import proyectoconeccion.Conectar;


/**
 *
 * @author garba
 */
public class AlumnoData {
    Connection conA=null;
    
    public AlumnoData(Conectar con){
        conA=con.conexion();
    }
    
    public void guardarAlumno(Alumno alumno){
        try{
        //Conectar conector=new Conectar();
        //con=conector.conexion();
        String sql="INSERT INTO alumno (nombre,dni,domicilio,fechaNacimiento) VALUES (?,?,?,?)";
        PreparedStatement st=conA.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        st.setString(1, alumno.getNombre());
        st.setInt(2, alumno.getDni());
        st.setString(3,alumno.getDomicilio());
        st.setDate(4, valueOf(alumno.getFechaNacimiento()));
        st.executeUpdate();
        ResultSet rs=st.getGeneratedKeys();
        if(rs.next()){
            alumno.setIdAlumno(rs.getInt(1));
            System.out.println("Se ingresó el alumno a la base de datos");
            
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
    
    public void actualizarAlumno(Alumno alumno){
        try{
        //Conectar conector=new Conectar();
        //con=conector.conexion();
        List<Integer> todoslosids=obtenerIDs();
        if(todoslosids.contains(alumno.getIdAlumno())){
        String sql="UPDATE   alumno SET nombre=?,dni=?,domicilio=?,fechaNacimiento=? WHERE idAlumno=?";
        PreparedStatement st=conA.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        st.setString(1, alumno.getNombre());
        st.setInt(2, alumno.getDni());
        st.setString(3,alumno.getDomicilio());
        st.setDate(4, valueOf(alumno.getFechaNacimiento()));
        st.setInt(5, alumno.getIdAlumno());
        st.executeUpdate();
        ResultSet rs=st.getGeneratedKeys();
        System.out.println("Se actualizó el alumno solicitado en la base de datos");
        st.close();
        }
        
        else {
            System.out.println("El alumno no se encuentra en la base de datos");
        }
        
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    
    public void borrarAlumno(int id){
        try{
        //Conectar conector=new Conectar();
        //con=conector.conexion();
        List<Integer> todoslosids=obtenerIDs();
        if(todoslosids.contains(id)){
        String sql="DELETE FROM alumno WHERE `alumno`.`idAlumno` = ?";
        PreparedStatement st=conA.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        st.setInt(1, id);
        st.executeUpdate();
        System.out.println("Se borró el alumno de la base de datos");
        
        //con.close();
        st.close();
        } 
        else{
            System.out.println("El alumno solicitado no existe en la base de datos");
        }}
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public Alumno buscarAlumno(int id){
        Alumno alumno= new Alumno();
        try{
        //Conectar conector=new Conectar();
        //con=conector.conexion();
        
        String sql="SELECT * FROM alumno WHERE idAlumno=?";
        PreparedStatement st=conA.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        
        st.setInt(1, id);
        ResultSet rs=st.executeQuery();
        
        while (rs.next()){
            alumno.setIdAlumno(rs.getInt("idAlumno"));
            alumno.setNombre(rs.getString("nombre"));      
            alumno.setDni(rs.getInt("dni"));
            alumno.setDomicilio(rs.getString("domicilio"));
            alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
            
        }
       // con.close();
        st.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return alumno;
    }
    
    
    public List<Alumno> obtenerAlumnos(){
        List<Alumno> alumnos= new ArrayList<Alumno>();
        try {
        //Conectar conector=new Conectar();
        //con=conector.conexion();
        String sql="SELECT * FROM alumno";
        PreparedStatement st=conA.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        ResultSet rs=st.executeQuery();
        
        while (rs.next()){
            Alumno unalumno=new Alumno();
            unalumno.setIdAlumno(rs.getInt("idAlumno"));
            unalumno.setNombre(rs.getString("nombre"));
            unalumno.setDni(rs.getInt("dni"));
            unalumno.setDomicilio(rs.getString("domicilio"));
            unalumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
            
            alumnos.add(unalumno);
            
        }
       // con.close();
        st.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return alumnos;
    }

    public List<Integer> obtenerIDs(){
        
        List<Integer> ids= new ArrayList<>();
        try{
            
        String sql="SELECT * FROM alumno";
        PreparedStatement st=conA.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        ResultSet rs=st.executeQuery();
        
        
        while (rs.next()){

            int unid=rs.getInt("idAlumno");
            ids.add(unid);
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return ids;
        
    }
}
