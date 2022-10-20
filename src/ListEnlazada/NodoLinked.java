/*
 * NOMBRE: Fisher
 * FECHA: 15/04/22
 * PROYECTO: ED2022
 */
package ListEnlazada;

/**
 * Nodo de listas enlazadas.
 *
 * @author Fisherk2
 */
public class NodoLinked {

    String info;
    NodoLinked anterior, siguiente;

    NodoLinked(String info) {
        this.info = info;
        anterior = siguiente = null;
    }

}
