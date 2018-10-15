/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.think.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.think.db.DB;
/**
 *
 * @author Marcos Nunez
 */
public class DaoCliente {
    
    Connection conexion = null;
    DB db;
    
    /**
     *
     * @throws SQLException
     */
    public DaoCliente() throws SQLException{
        try{
            db = new DB();
            
        }catch(SQLException e){
            throw e;
        }
  
    }
    
    public void probar(){
        conexion = db.getConection();
        JOptionPane.showMessageDialog(null, "Todo ha salido bien");
    }
}
