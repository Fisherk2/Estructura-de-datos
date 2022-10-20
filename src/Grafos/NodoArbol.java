/*
 * NOMBRE: Fisher
 * FECHA: 28/04/22
 * PROYECTO: ED2022
 */
package Grafos;

/**
 * Clase Nodo con estructura para Arbol de busqueda binaria
 *
 * @author Fisherk2
 */
public class NodoArbol {

    int dato;
    //IZQ=Valor menor que el nodo, DER=Valor mayor que el nodo
    NodoArbol izq;
    NodoArbol der;

    public NodoArbol(int dato) {
        this.dato = dato;
        izq = der = null;
    }

}
