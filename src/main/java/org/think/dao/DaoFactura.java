/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.think.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.think.db.DB;
import org.think.dto.DtoFactura;

/**
 *
 * @author Marcos Nunez
 */
public class DaoFactura {
    
    Connection conection = null;
    DB db;
    DtoFactura dtoOrden;
    
    public DaoFactura() throws SQLException{
        
        try{
            db = new DB();
            
        }catch(SQLException e){
            throw e;
        }
    }
    
    public void insertarFactura(DtoFactura factura) throws SQLException{
        
        String sql = "INSERT INTO public.factura(\n" +
                    "  no_factura," +
                    "  comentario," +
                    "  idcliente_cliente," +
                    "  idusuario_usuario" +
                    ")\n" +
                    "VALUES(?, ?, ?, ?);";
        
        try{
         conection = db.getConection();
         conection.setAutoCommit(false);
         
         PreparedStatement prt = conection.prepareStatement(sql); 
         prt.setInt(1, factura.getNo_factura());
         prt.setString(2, factura.getComentario());
         prt.setInt(3, factura.getIdcliente_cliente());
         prt.setInt(4, factura.getIdusuario_usuario());
         prt.execute();
         
         conection.commit();
         
        }catch(SQLException e){   
            conection.rollback();
            throw e;
         }
        
        finally{
           if(!conection.equals(null)) conection.close();
           
       }
        
        
    }
    
    public void insertarFacturaDetalles(){
        
    }
    
    
    
}
