/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconeccion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author garba
 */
public class Conectar {
    
    Connection con= null;
    
    public Connection conexion()
    {
        try {
                Class.forName("com.mysql.jdbc.Driver");
                con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/universidad","root","");
                System.out.println("Conexión exitosa!!");
                
            }
       catch  (ClassNotFoundException | SQLException e){
           System.out.println(e.getMessage());
           
           } 
        return con;
    }
}
