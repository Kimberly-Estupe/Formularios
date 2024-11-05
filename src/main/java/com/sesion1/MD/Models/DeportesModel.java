package com.sesion1.MD.Models;

public class DeportesModel {
    private String nombre;
    private int cantidadJugadores;
    private int duracion;//en minutos
    private String equipamiento;
    private String descripcion;

    //constructor
    public DeportesModel(){}

    public DeportesModel(String nombre, String cantidadJugadores, String duracion, String equipamiento, String descripcion) {
        this.nombre = nombre;
        this.cantidadJugadores = Integer.parseInt(cantidadJugadores);
        this.duracion = Integer.parseInt(duracion);
        this.equipamiento = equipamiento;
        this.descripcion = descripcion;
    }

    //getter
    public String getNombre() {
        return nombre;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getEquipamiento() {
        return equipamiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    //setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidadJugadores(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

    public void setDuracion(int duracion) {
        this.duracion = (duracion);
    }

    public void setEquipamiento(String equipamiento) {
        this.equipamiento = equipamiento;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
