/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.think.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
    
   
    
    public DefaultTableModel getBusquedaforCliente(String buscar) throws SQLException
    {
        DefaultTableModel resultado = new DefaultTableModel();
        String sql = getSelectForCliente();
        
        try{
            ResultSet rs = getResultSetCliente(sql, buscar);      
        }catch(SQLException e){
            throw e;
        }
        
        return resultado;      
    }
    //poner privado
    public String getSelectForCliente(){
        String sql = "SELECT \n" +
                    " idcliente,\n" +
                    " nombre,\n" +
                    " direccion,\n" +
                    " fecha_registrado\n" +
                    "FROM \n" +
                    "public.cliente \n" +
                    "WHERE nombre ilike ? \n" +
                    "or nombre ilike ?;";       
        return sql;
    }
    
    //poner privado
    public ResultSet getResultSetCliente(String sql, String buscar) throws SQLException{
        PreparedStatement prs = null;
        
        try{
            conexion = db.getConection();
            prs = conexion.prepareStatement(sql);
            prs.setString(1, sql);
            prs.setString(2, sql);
            ResultSet rs = prs.executeQuery();
            return rs;
        }catch(SQLException e){
            throw e;
        }
    }
    
    public void probar(){
        conexion = db.getConection();
        JOptionPane.showMessageDialog(null, "Todo ha salido bien");
    }
}
