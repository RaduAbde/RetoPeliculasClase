package com.company;

public class Pelicula {

    private String nombre;
    private String genero;
    private int estrellas;
    private int sala;
    private double precio;
    private boolean esVista;

    public Pelicula(String nombre, String genero, int estrellas, int sala, double precio, boolean esVista) {
        this.nombre = nombre;
        this.genero = genero;
        this.estrellas = estrellas;
        this.sala = sala;
        this.precio = precio;
        this.esVista = esVista;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setEsVista(boolean esVista) {
        this.esVista = esVista;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public int getSala() {
        return sala;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isEsVista() {
        return esVista;
    }
}

