/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.think.dto;

import java.sql.Timestamp;


/**
 *
 * @author Marcos Nunez
 */
public class DtoFactura {


  private int no_factura;
  private String fecha;
  private String comentario;
  private int idcliente_cliente;
  private int idusuario_usuario;

    public int getNo_factura() {
        return no_factura;
    }

    public void setNo_factura(int no_factura) {
        this.no_factura = no_factura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getIdcliente_cliente() {
        return idcliente_cliente;
    }

    public void setIdcliente_cliente(int idcliente_cliente) {
        this.idcliente_cliente = idcliente_cliente;
    }

    public int getIdusuario_usuario() {
        return idusuario_usuario;
    }

    public void setIdusuario_usuario(int idusuario_usuario) {
        this.idusuario_usuario = idusuario_usuario;
    }
  
  
  
    
}
