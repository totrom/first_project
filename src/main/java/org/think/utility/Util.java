/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.think.utility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import org.think.db.DB;

/**
 *
 * @author Marcos Nunez
 */
public class Util {
    
       
    /**
     * Metodo: porcientoEntre
     * Accion: Anadir porciento entre una cadena de caracteres
     * @param s cadena de caracteres
     * @return la cadena de caracteres entre porcientos
     */

    
    public static String entrePorciento(String s){
          return "%" + s + "%";
          
    }
    
    public static int getIdTabla(String t) throws SQLException{
        int id = 0;
        DB db = new DB();
        Connection conexion = null;
        //t = "'"+t+"'";
        String sql = "  SELECT \n" +
                        "  id\n" +
                        "FROM \n" +
                        "  public.secuencia \n" +
                        "  WHERE tabla = ?;";
          
       // Connection conexion = DB.getConection();
        
       try{
             conexion = db.getConection();
             PreparedStatement prInsert = conexion.prepareStatement(sql);
             prInsert.setString(1, t);
             ResultSet rs = prInsert.executeQuery();
             
             rs.next();
             id = rs.getInt(1);
             
             
        }catch(SQLException error){
            throw error;
            
        }
       finally{
           if(!conexion.equals(null)) conexion.close();
           
       }

        return id;
    }
    
    public static void updateIdTabla(String tabla, int newId) throws SQLException{
        
        DB db = new DB();
        Connection conexion = null;
        String sql = "UPDATE public.secuencia \n" +
                    "SET " +
                    "id = ? " +
                    "WHERE " +
                    "tabla = ? ;";
        
        try{
            conexion = db.getConection(); 
            conexion.setAutoCommit(false);
            
            PreparedStatement prInsert = conexion.prepareStatement(sql);
            prInsert.setInt(1, newId);
            prInsert.setString(2, tabla);
            prInsert.execute();
            
            conexion.commit();
  
        }catch(SQLException error){
            conexion.rollback();
            throw error;
            
        }
       finally{
           if(!conexion.equals(null)) conexion.close();
           
       }
    }
    
    public static String getFecha(){
        String date = new java.text.SimpleDateFormat("HH:mm:ss dd/MM/yyyy").format(new Date());
        return date;
    }
}
