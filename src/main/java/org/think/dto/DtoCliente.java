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
public class DtoCliente {
  private String nombre;
  private int idcliente;
  private String direccion;
  private Timestamp fecha_registrado;

    public DtoCliente() {
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public Timestamp getFecha_registrado() {
        return fecha_registrado;
    }

    public void setFecha_registrado(Timestamp fecha_registrado) {
        this.fecha_registrado = fecha_registrado;
    }

    public DtoCliente(String nombre, int idcliente, String direccion, Timestamp fecha_registrado) {
        this.nombre = nombre;
        this.idcliente = idcliente;
        this.direccion = direccion;
        this.fecha_registrado = fecha_registrado;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
