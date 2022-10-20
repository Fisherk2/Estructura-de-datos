/*
 * NOMBRE: Fisher
 * FECHA: 2/02/22
 * PROYECTO: ED2022
 */
package EquipoAleatorios;

import java.util.ArrayList;

/**
 *
 * @author Fisher
 */
public class MainEquipo {

    public static void main(String[] args) {
        //ESTRUCTURA DE DATOS ESTATICA 
        String[] estudiantes = {
            "Nombre 1",
            "Nombre 2",
            "Nombre 3",
            "Nombre 4",
            "Nombre 5",
            "Nombre 6",
            "Nombre 7",
            "Nombre 8",
            "Nombre 9",
            "Nombre 10",
            "Nombre 11",
            "Nombre 12",};

        //ESTRUCTURA DE DATOS DINAMICOS
        ArrayList<String> desordenado = new ArrayList();

        //AGREGAMOS ELEMENTOS DEL ARREGLO DE FORMA DESORDENADA A LA LISTA
        while (estudiantes.length > desordenado.size()) {//Mientras el tamaño del arreglo sea mas grande que el de la lista, este seguira en bucle
            //Numero entre el cero y el numero de elementos del arreglo (10)
            int alAzar;
            alAzar = (int) (Math.random() * estudiantes.length);
            if (!desordenado.contains(estudiantes[alAzar])) { //Si no se repite el elemento, este se agrega a la lista
                desordenado.add(estudiantes[alAzar]); //Se agrega elemento al azar.
            }
        }

        //IMPRESION DE NOMBRES DE FORMA ALEATORIA
        for (int i = 0, n = 1; i < desordenado.size(); i += 3, n++) {//Ira de tres en tres
            System.out.println("Equipo " + n + ": "
                    + desordenado.get(i)
                    + ", " + desordenado.get(i + 1)
                    + ", " + desordenado.get(i + 2));
        }
    }

}
