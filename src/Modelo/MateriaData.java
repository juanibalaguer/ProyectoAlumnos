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
public class MateriaData {
    Connection conM=null;
    public MateriaData(Conectar con){
        conM=con.conexion();
    }
    
    public void guardarMateria(Materia materia){
        try{
        //Conectar conector=new Conectar();
        //con=conector.conexion();
        String sql="INSERT INTO materia (nombre,responsable,periodo) VALUES (?,?,?)";
        PreparedStatement st=conM.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        st.setString(1, materia.getNombre());
        st.setString(2, materia.getResponsable());
        st.setString(3, materia.getPeriodo());
        st.executeUpdate();
        ResultSet rs=st.getGeneratedKeys();
        if(rs.next()){
            materia.setIdMateria(rs.getInt(1));
            System.out.println("Se ingresó la materia a la base de datos");
            
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
    
    public void actualizarMateria(Materia materia){
        try{
        //Conectar conector=new Conectar();
        //con=conector.conexion();
        String sql="UPDATE materia SET nombre=?,responsable=?,periodo=? WHERE idMateria=?";
        PreparedStatement st=conM.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        st.setString(1, materia.getNombre());
        st.setString(2, materia.getResponsable());
        st.setString(3, materia.getPeriodo());
        st.setInt(4, materia.getIdMateria());
        st.executeUpdate();
        ResultSet rs=st.getGeneratedKeys();
        System.out.println("Se actualizó la materia en la base de datos");
        
        //con.close();
        st.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    
    public void borrarMateria(int id){
        try{
        //Conectar conector=new Conectar();
        //con=conector.conexion();
        String sql="DELETE FROM materia WHERE idMateria= ?";
        PreparedStatement st=conM.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        st.setInt(1, id);
        st.executeUpdate();
        System.out.println("Se borró la materia de la base de datos");
        
        //con.close();
        st.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public Materia buscarMateria(int id){
        Materia materia= new Materia();
        try{
        //Conectar conector=new Conectar();
        //con=conector.conexion();
        String sql="SELECT * FROM materia WHERE idMateria=?";
        PreparedStatement st=conM.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        
        st.setInt(1, id);
        ResultSet rs=st.executeQuery();
        
        while (rs.next()){
            materia.setIdMateria(rs.getInt("idMateria"));
            materia.setNombre(rs.getString("nombre"));
            materia.setResponsable(rs.getString("responsable"));
            materia.setPeriodo(rs.getString("periodo"));
            
        }
       // con.close();
        st.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return materia;
    }
    
    
    public List<Materia> obtenerMaterias(){
        List<Materia> materias= new ArrayList<Materia>();
        try {
        //Conectar conector=new Conectar();
        //con=conector.conexion();
        String sql="SELECT * FROM materia";
        PreparedStatement st=conM.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        ResultSet rs=st.executeQuery();
        
        while (rs.next()){
            Materia unamateria=new Materia();
            unamateria.setIdMateria(rs.getInt("idMateria"));
            unamateria.setNombre(rs.getString("nombre"));
            unamateria.setResponsable(rs.getString("responsable"));;
            unamateria.setPeriodo(rs.getString("periodo"));
            materias.add(unamateria);
            
        }
       // con.close();
        st.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return materias;
    }
}
