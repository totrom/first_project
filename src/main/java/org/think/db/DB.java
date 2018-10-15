/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.think.db;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Marcos Nunez
 */
public class DB {
    
    private final String user = "postgres";
    private final String pass = "9900";
    private final String url = "jdbc:postgresql://localhost:5432/first_draft_facturacion";
    
    private Connection conexion;
            
    public DB() throws SQLException{
        try{
             bdConnection();
             
        }catch(SQLException ex){
            throw ex;
            
        }
    }
    
    public Connection getConection(){
        return this.conexion;
    }
    
    private void bdConnection() throws SQLException{

       try{
        conexion = java.sql.DriverManager.getConnection(url, user, pass);
         
       }catch(SQLException e){
           throw e;
       }
        
    }
}
