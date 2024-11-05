package com.sesion1.MD.Models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BebidasModel {
    private String Nombre;
    private String Tipo;
    private int Tam; // Tamaño
    private String FechaVencimiento;


    //constructor
    public BebidasModel(){}

    public BebidasModel(String Nombre, String Tipo,  String Tam, String FechaVencimiento) {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Tam = Integer.parseInt(Tam);
        this.FechaVencimiento = FechaVencimiento;
    }

    //getter
    public String getNombre() {
        return Nombre;
    }

    public String getTipo() {
        return Tipo;
    }


    public int getTam() {
        return Tam;
    }

    public String getFechaVencimiento() {
        return FechaVencimiento;
    }

    //setter

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setTam(int Tam) {
        this.Tam = Tam;
    }

    public void setFechaVencimiento(String FechaVencimiento) {
        this.FechaVencimiento = FechaVencimiento;
    }
}
