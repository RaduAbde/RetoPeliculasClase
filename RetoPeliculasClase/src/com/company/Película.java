package com.company;

public class Película {
    private String nombre;
    private int estrellas;
    private int sala;
    private double precio;
    private boolean aSidoVista;

    public Película(String nombre, int estrellas, int sala, double precio, boolean aSidoVista) {
        this.nombre = nombre;
        this.estrellas = estrellas;
        this.sala = sala;
        this.precio = precio;
        this.aSidoVista = aSidoVista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isaSidoVista() {
        return aSidoVista;
    }

    public void setaSidoVista(boolean aSidoVista) {
        this.aSidoVista = aSidoVista;
    }
}
