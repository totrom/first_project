/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.think.dto;

/**
 *
 * @author Marcos Nunez
 */
public class DtoFacturaDetalle {
    
    float precio;
    float itbis;
    float descuento;
    int cantidad;
    int idproducto_producto;
    int no_factura_factura;

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getItbis() {
        return itbis;
    }

    public void setItbis(float itbis) {
        this.itbis = itbis;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdproducto_producto() {
        return idproducto_producto;
    }

    public void setIdproducto_producto(int idproducto_producto) {
        this.idproducto_producto = idproducto_producto;
    }

    public int getNo_factura_factura() {
        return no_factura_factura;
    }

    public void setNo_factura_factura(int no_factura_factura) {
        this.no_factura_factura = no_factura_factura;
    }
    
    
}
