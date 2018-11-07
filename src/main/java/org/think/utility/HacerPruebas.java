/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.think.utility;

import java.sql.SQLException;
import java.util.Date;
import org.think.dto.DtoFactura;

/**
 *
 * @author Marcos Nunez
 */
public class HacerPruebas {
    

    
    
    public static void main(String[] ar){
        String date = new java.text.SimpleDateFormat("HH:mm:ss dd/MM/yyyy").format(new Date());
        
        DtoFactura dtoFactura = new DtoFactura();
        
        dtoFactura.setFecha(date);
        
        System.out.println(dtoFactura.getFecha());


        
    }
    
    
    
    public static int buscarId(){
        int id = 0;
        
        try{
            id = Util.getIdTabla("cliente");
            System.out.println("Id = " + id);
        }catch(SQLException e)
        {
            System.out.println("Error " + e.getMessage());
        }
        
        return id;
    }
    
    public static void actualizarId(int id){
        
        
        try{
            Util.updateIdTabla("cliente", id);
            
        }catch(SQLException e)
        {
            System.out.println("Error " + e.getMessage());
        }
    }
 }

