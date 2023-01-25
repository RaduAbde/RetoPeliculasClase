package com.company;

public class Pelicula {
    private String nombre;
    private String genero;
    private int estrellas;
    private int sala;
    private double precio;
    private boolean vista;

    public Pelicula(String nombre, String genero, int estrellas, int sala, double precio, boolean vista) {
        this.nombre = nombre;
        this.genero = genero;
        this.estrellas = estrellas;
        this.sala = sala;
        this.precio = precio;
        this.vista = vista;
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

    public boolean getVista() {
        return vista;
    }
}