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
public class DtoUsuario {
    
  private int idusuario;
  private String nombre;
  private String apellido;
  private String usuario;
  private String contrasena;
  private boolean habilitado;
  private Timestamp fecha_in;
  private Timestamp fecha_out;

    public DtoUsuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public DtoUsuario(int idusuario, String nombre, String apellido, String usuario, String contrasena, boolean habilitado, Timestamp fecha_in, Timestamp fecha_out) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.habilitado = habilitado;
        this.fecha_in = fecha_in;
        this.fecha_out = fecha_out;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public Timestamp getFecha_in() {
        return fecha_in;
    }

    public void setFecha_in(Timestamp fecha_in) {
        this.fecha_in = fecha_in;
    }

    public Timestamp getFecha_out() {
        return fecha_out;
    }

    public void setFecha_out(Timestamp fecha_out) {
        this.fecha_out = fecha_out;
    }
  
  
}
