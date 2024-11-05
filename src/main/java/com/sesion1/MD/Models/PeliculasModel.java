package com.sesion1.MD.Models;

public class PeliculasModel {
    private String nombre;
    private int duracion;
    private String genero;
    private String descripcion;

    //constructor(s)
    public PeliculasModel(){}

    public PeliculasModel(String nombre, int duracion, String genero, String descripcion) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.descripcion = descripcion;
    }

    //Getter
    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
