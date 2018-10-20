/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.think.pruebas;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import org.think.dao.DaoCliente;
import org.think.dto.DtoCliente;


import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcos Nunez
 */
public class HacerPruebas {


   
    
    public static void main(String[] arg){
       String aBuscar = "Super Colmado Fred";
        
        try {
            DaoCliente cT = new DaoCliente();
            String sql = cT.getSelectForCliente();
            ResultSet rs = cT.getResultSetCliente(sql, aBuscar);
            printConsulta(rs);
            
        } catch (SQLException e) {
             System.out.println(e.getMessage());
            Logger.getLogger(HacerPruebas.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
        private static void printConsulta(ResultSet rs){
        
        try{
            ResultSetMetaData meta = rs.getMetaData();
            
            for(int i = 1;i < meta.getColumnCount(); i++){
                System.out.print(meta.getColumnLabel(1).concat("\t"));
            }
            
            String[] data = new String[meta.getColumnCount()];
            
            while(rs.next()){
                for(int i = 1; i < data.length; i++){
                    System.out.print(rs.getString(i).concat("\t"));
                }
                System.out.println();
            }
                    
       }catch(SQLException e){
           System.out.println("Error en la metadata: ".concat(e.getMessage()));
       }
        
    }
}
