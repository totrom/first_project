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
public class DtoProducto {
  private int idproducto;
  private String descripcion;
  private float precio;
  private int cantidad;
  private float costo;
  private float itbis;
  private float min_porc;

    public DtoProducto() {
    }

    public DtoProducto(int idproducto, String descripcion, float precio, int cantidad, float costo, float itbis, float min_porc) {
        this.idproducto = idproducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.costo = costo;
        this.itbis = itbis;
        this.min_porc = min_porc;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public float getItbis() {
        return itbis;
    }

    public void setItbis(float itbis) {
        this.itbis = itbis;
    }

    public float getMin_porc() {
        return min_porc;
    }

    public void setMin_porc(float min_porc) {
        this.min_porc = min_porc;
    }
  
  
}
