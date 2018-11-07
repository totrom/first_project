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
import org.think.dto.DtoFacturaDetalle;

/**
 *
 * @author Marcos Nunez
 */
public class DaoFacturaDetalle {
        
    Connection conection = null;
    DB db;
    
    /**
     *
     * @throws SQLException
     */
    public DaoFacturaDetalle() throws SQLException{
        try{
            db = new DB();
            
        }catch(SQLException e){
            throw e;
        }
    }
    
        public void insertarFacturaDetalle(DtoFacturaDetalle detalle) throws SQLException{
        
        String sql = "INSERT INTO public.factura_detalles(" +
                    "  precio," +
                    "  cantidad," +
                    "  itbis," +
                    "  descuento," +
                    "  idproducto_producto," +
                    "  no_factura_factura" +
                    ")VALUES(?, ?, ?, ?, ?, ?);";
        
        try{
         conection = db.getConection();
         conection.setAutoCommit(false);
         
         PreparedStatement prt = conection.prepareStatement(sql); 
         prt.setFloat(1, detalle.getPrecio());
         prt.setInt(2, detalle.getCantidad());
         prt.setFloat(3, detalle.getItbis());
         prt.setFloat(4, detalle.getDescuento());
         prt.setInt(5, detalle.getIdproducto_producto());
         prt.setInt(6, detalle.getNo_factura_factura());
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
}
