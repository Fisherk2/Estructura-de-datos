/*
 * NOMBRE: Fisher
 * FECHA: 27/03/22
 * PROYECTO: ED2022
 */
package Linea;

/**
 * Clase que almacena la memoria de las lineas en forma de nodo
 * @author Fisherk2
 */
public class Memoria {

    String info;
    Memoria derecha;

    Memoria(String info) {
        this.info = info;
        derecha = null;
    }
}
