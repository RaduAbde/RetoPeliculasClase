package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cine cine = new Cine();

        System.out.println();
        System.out.println("Lista películas:");
        cine.mostrarPeliculas();

        do {
            System.out.println();
            System.out.println("Menú de opciones de ordenación:");
            System.out.println("1. Ordenar por nombre");
            System.out.println("2. Ordenar por género");
            System.out.println("3. Ordenar por estrellas");
            System.out.println("4. Ordenar por sala");
            System.out.println("5. Ordenar por precio");
            System.out.println("6. Ordenar por vista");
            System.out.println("7. búsqueda combinada según varios criterios");
            System.out.println("0. Salir");
            System.out.print("Ingrese el número de la opción deseada: ");

            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    cine.ordenarPorNombre();
                    break;
                case 2:
                    cine.ordenarPorGenero();
                    break;
                case 3:
                    cine.ordenarPorEstrellas();
                    break;
                case 4:
                    cine.ordenarPorSala();
                    break;
                case 5:
                    cine.ordenarPorPrecio();
                    break;
                case 6:
                    cine.ordenarPorVista();
                    break;
                case 7:
                    System.out.print("Introduce el precio mínimo: ");
                    double precioMin = sc.nextDouble();

                    System.out.print("Introduce el precio máximo: ");
                    double precioMax = sc.nextDouble();

                    System.out.print("Introduce si has visto o no la película (True o False) ");
                    boolean vista = sc.nextBoolean();

                    System.out.print("Introduce el número de estrellas: ");
                    int estrellas = sc.nextInt();
                    sc.nextLine();  // Consume el salto de línea generado por nextInt()

                    System.out.print("Introduce el genero: ");
                    String genero = sc.nextLine();

                    cine.buscarPeliculas(precioMin, precioMax, vista, estrellas, genero);
                    System.exit(0);
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Opción inválida escriba otra opción");
                    System.out.println();

            }
            // mostrar las películas ordenadas
            cine.mostrarPeliculas();

        }while (true);
    }
}