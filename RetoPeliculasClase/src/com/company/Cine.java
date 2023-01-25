package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Cine {

    private Pelicula[] peliculas;

    public Cine() {
        this.peliculas = LeerArchivo();
    }


    public static int identificarTamArray(){
        int length = 0;
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {

            archivo = new File ("/home/ALU1W/Escritorio/RetoPeliculasClase/peliculas.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            //leemos el fichero y lo añadimos al array
            String linea;
            while((linea=br.readLine())!=null){
                length++;
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }finally{

            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }

        return length;
    }



    public static Pelicula[] LeerArchivo(){
        Pelicula[] pelicula = new Pelicula[identificarTamArray()];
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        int contador = 0;

        try {

            archivo = new File ("/home/ALU1W/Escritorio/RetoPeliculasClase/peliculas.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            //leemos el fichero y lo añadimos al array
            String linea;
            while((linea=br.readLine())!=null){

                String nombre = linea.split(";")[0];
                String genero = linea.split(";")[1];
                int estrellas = Integer.parseInt(linea.split(";")[2]);
                int sala = Integer.parseInt(linea.split(";")[3]);
                double precio = Double.parseDouble(linea.split(";")[4]);
                boolean esVista;
                if (linea.split(";")[5].equals("S")){
                    esVista = true;
                }else {
                    esVista = false;
                }
                Pelicula pelicula1 = new Pelicula(nombre,genero,estrellas,sala,precio,esVista);

                pelicula[contador] = pelicula1;
                contador++;
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }finally{

            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
        return pelicula;
    }

}
