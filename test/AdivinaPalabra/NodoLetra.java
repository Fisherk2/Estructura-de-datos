/*
 * NOMBRE: Fisher
 * FECHA: 15/05/22
 * PROYECTO: ED2022
 */
package AdivinaPalabra;

/**
 * Clase nodo enlazado que almacena un caracter
 * @author Fisherk2
 */
public class NodoLetra {

    private final char LETRA;
    private NodoLetra anterior, siguiente;

    public NodoLetra(char letra) {
        this.LETRA = letra;
        anterior = siguiente = null;
    }

    public char getLetra() {
        return LETRA;
    }

    public NodoLetra getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoLetra anterior) {
        this.anterior = anterior;
    }

    public NodoLetra getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLetra siguiente) {
        this.siguiente = siguiente;
    }


    
    
}
