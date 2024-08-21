package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //CINECOLOMBIA

        Scanner leerTeclado = new Scanner(System.in);

        //OBCION DE PELICULAS
        int opcionPeliculas;
        ArrayList<HashMap<String, Object>> peliculas = new ArrayList<>();

        do {
            HashMap<String, Object> pelicula = new HashMap<>();

            System.out.println("digita una opcion de pelicula: ");
            opcionPeliculas = leerTeclado.nextInt();
            //limpiar buffer
            leerTeclado.nextLine();

            if (opcionPeliculas == 1) {
                System.out.println("ingresa una pelicula");
                System.out.print("ingresa nombre de la pelicula");
                String nombrePelicula = leerTeclado.nextLine();
                System.out.print("duracion de la pelicula");
                int duracionPelicula = leerTeclado.nextInt();
                System.out.println("sinopsis de la pelicula");
                String sinopsisPelicula = leerTeclado.nextLine();
                int idPelicula = new Random().nextInt(100);
                pelicula.put("nombre", nombrePelicula);
                pelicula.put("duracion", duracionPelicula);
                pelicula.put("sinopsis",sinopsisPelicula);
                pelicula.put("id", idPelicula);
                System.out.println("ingresa fecha de estreno");

                LocalDate fechaEstrenoPelicula;
                System.out.print("anio estreno pelicula ");
                int anioEstreno= leerTeclado.nextInt();
                System.out.print("mes estreno pelicula ");
                int mesEstreno= leerTeclado.nextInt();
                System.out.print("dia estreno pelicula ");
                int diaEstreno= leerTeclado.nextInt();
                fechaEstrenoPelicula=LocalDate.of(anioEstreno,mesEstreno,diaEstreno);


                //Arreglo
                peliculas.add(pelicula);

            } else if (opcionPeliculas ==2) {
                System.out.println("mostrar lista de peliculas");
                for (HashMap<String, Object> peliculaAuxiliar : peliculas){
                    System.out.println(peliculaAuxiliar);
                }

            } else if (opcionPeliculas ==3) {
                System.out.println("buscar producto");
                System.out.print("Digita el nombre de la pelicula que quieres ver: ");
                String nombrePeliculaBuscar=leerTeclado.nextLine();

                for (HashMap<String, Object> peliculaAuxiliar : peliculas){
                    if (nombrePeliculaBuscar.equals(peliculaAuxiliar.get("nombre"))){
                        System.out.println("pelicula encontrada");
                        System.out.println(peliculaAuxiliar);
                    }
                }

            } else if (opcionPeliculas ==4) {
                System.out.println("modificar producto");
            } else if (opcionPeliculas ==5) {
                System.out.println("saliendo");
            }else {
                System.out.println("opcion invalida");
            }
        }while (opcionPeliculas !=0);


    }
}