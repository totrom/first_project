/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.think.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import org.think.db.DB;
import org.think.utility.Util;

/**
 *
 * @author Marcos Nunez
 */
public class DaoProducto {
        
    Connection conexion = null;
    DB db;
    
    
    public DaoProducto() throws SQLException{
        
        try{
            db = new DB();

        }catch(SQLException e){
            throw e;
            }
    }
    
    public DefaultTableModel getBusquedaForProducto(String buscar) throws SQLException
    {
        DefaultTableModel resultado = new DefaultTableModel();
        String sql = getSelectForProducto();
        
        try{
            ResultSet rs = getResultSetProducto(sql, buscar);
            ResultSetMetaData meta = rs.getMetaData();
            
            for(int i = 1; i <= meta.getColumnCount(); i++){
                resultado.addColumn(meta.getColumnLabel(i));
             }
            Object[] row = new Object[meta.getColumnCount()];
            
            while(rs.next()){
                for(int i = 0; i < row.length; i++){
                    row[i] = rs.getObject(i+1);
                }
                resultado.addRow(row);
            }  
        }catch(SQLException e){
            throw e;
        }
        
        return resultado;      
    }
    //poner privado
    public String getSelectForProducto(){
            String sql = "SELECT \n" +
                        "  idproducto as id,\n" +
                        "  descripcion as nombre,\n" +
                        "  precio,\n" +
                        "  cantidad,\n" +
                        "  costo,\n" +
                        "  itbis,\n" +
                        "  min_porc\n" +
                        "FROM \n" +
                        "public.producto WHERE descripcion ilike ?;";      
        return sql;
    }
    
    //poner privado
    public ResultSet getResultSetProducto(String sql, String buscar) throws SQLException{
        PreparedStatement prs = null;
        buscar = Util.entrePorciento(buscar);
        
        try{
            conexion = db.getConection();
            prs = conexion.prepareStatement(sql);
            prs.setString(1, buscar);
            ResultSet rs = prs.executeQuery();
            return rs;
        }catch(SQLException e){
            throw e;
        }

       
    }
}
