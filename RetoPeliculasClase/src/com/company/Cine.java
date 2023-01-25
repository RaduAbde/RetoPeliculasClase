package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Cine {
    private Pelicula[] peliculas;

    public Cine() {
        this.peliculas = LeerArchivo();
    }

    public static int identificarTamArray() {
        int length = 0;
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {

            archivo = new File("./RetoPeliculasClase/peliculas.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            //leemos el fichero y lo añadimos al array
            String linea;
            while ((linea = br.readLine()) != null) {
                length++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        return length;
    }


    public static Pelicula[] LeerArchivo() {
        Pelicula[] pelicula = new Pelicula[identificarTamArray()];
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        int contador = 0;

        try {

            archivo = new File("./RetoPeliculasClase/peliculas.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            //leemos el fichero y lo añadimos al array
            String linea;
            while ((linea = br.readLine()) != null) {

                String nombre = linea.split(";")[0];
                String genero = linea.split(";")[1];
                int estrellas = Integer.parseInt(linea.split(";")[2]);
                int sala = Integer.parseInt(linea.split(";")[3]);
                double precio = Double.parseDouble(linea.split(";")[4]);
                boolean esVista;
                if (linea.split(";")[5].equals("S")) {
                    esVista = true;
                } else {
                    esVista = false;
                }
                Pelicula pelicula1 = new Pelicula(nombre, genero, estrellas, sala, precio, esVista);

                pelicula[contador] = pelicula1;
                contador++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return pelicula;
    }

    public void ordenarPorNombre() {
        for (int i = 0; i < peliculas.length; i++) {
            for (int j = 0; j < peliculas.length - i - 1; j++) {
                if (peliculas[j].getNombre().compareTo(peliculas[j + 1].getNombre()) > 0) {
                    Pelicula temp = peliculas[j];
                    peliculas[j] = peliculas[j + 1];
                    peliculas[j + 1] = temp;
                }
            }
        }
    }

    public void ordenarPorGenero() {
        for (int i = 0; i < peliculas.length; i++) {
            for (int j = 0; j < peliculas.length - i - 1; j++) {
                if (peliculas[j].getGenero().compareTo(peliculas[j + 1].getGenero()) > 0) {
                    Pelicula temp = peliculas[j];
                    peliculas[j] = peliculas[j + 1];
                    peliculas[j + 1] = temp;
                }
            }
        }
    }

    public void ordenarPorEstrellas() {
        for (int i = 0; i < peliculas.length; i++) {
            for (int j = 0; j < peliculas.length - i - 1; j++) {
                if (peliculas[j].getEstrellas() > peliculas[j + 1].getEstrellas()) {
                    Pelicula temp = peliculas[j];
                    peliculas[j] = peliculas[j + 1];
                    peliculas[j + 1] = temp;
                }
            }
        }
    }

    public void ordenarPorSala() {
        for (int i = 0; i < peliculas.length; i++) {
            for (int j = 0; j < peliculas.length - i - 1; j++) {
                if (peliculas[j].getSala() > peliculas[j + 1].getSala()) {
                    Pelicula temp = peliculas[j];
                    peliculas[j] = peliculas[j + 1];
                    peliculas[j + 1] = temp;
                }
            }
        }
    }

    public void ordenarPorPrecio() {
        for (int i = 0; i < peliculas.length; i++) {
            for (int j = 0; j < peliculas.length - i - 1; j++) {
                if (peliculas[j].getPrecio() > peliculas[j + 1].getPrecio()) {
                    Pelicula temp = peliculas[j];
                    peliculas[j] = peliculas[j + 1];
                    peliculas[j + 1] = temp;
                }
            }
        }
    }

    public void ordenarPorVista() {
        for (int i = 0; i < peliculas.length; i++) {
            for (int j = 0; j < peliculas.length - i - 1; j++) {
                if (!peliculas[j].getVista() && peliculas[j + 1].getVista()) {
                    Pelicula temp = peliculas[j];
                    peliculas[j] = peliculas[j + 1];
                    peliculas[j + 1] = temp;
                }
            }
        }
    }

    public void buscarPeliculas(double precioMin, double precioMax, boolean vista, int estrellas, String genero) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getPrecio() >= precioMin && pelicula.getPrecio() <= precioMax && pelicula.getVista() == vista
                    && pelicula.getEstrellas() >= estrellas && pelicula.getGenero().equalsIgnoreCase(genero)) {
                System.out.println(pelicula.getNombre() + " " + pelicula.getGenero() + " " + pelicula.getEstrellas() + " " + pelicula.getSala() + " " + pelicula.getPrecio() + " " + pelicula.getVista());
            }
        }
    }

    public void mostrarPeliculas() {
        for (int i = 0; i < peliculas.length; i++) {
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("Película: " + peliculas[i].getNombre() + " Género: " + peliculas[i].getGenero() + " Estrellas: " + peliculas[i].getEstrellas() + " Sala: " + peliculas[i].getSala() + " Precio: " + peliculas[i].getPrecio() + "€ Vista: " + peliculas[i].getVista() + ".");
        }
    }
}