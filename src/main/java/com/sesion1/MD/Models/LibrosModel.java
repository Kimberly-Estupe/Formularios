package com.sesion1.MD.Models;

public class LibrosModel {
    private String Nombre;
    private String autor;
    private int paginas;
    private String genero;
    private String sinopsis;

    //constructores
    public LibrosModel() {}
    public LibrosModel(String Nombre, String autor, int paginas, String genero, String sinopsis) {
        this.Nombre = Nombre;
        this.autor = autor;
        this.paginas = paginas;
        this.genero = genero;
        this.sinopsis = sinopsis;
    }

    //getter
    public String getNombre() {
        return Nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getGenero() {
        return genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    //setter
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}

