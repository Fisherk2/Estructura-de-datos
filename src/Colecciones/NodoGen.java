/*
 * NOMBRE: Fisher
 * FECHA: 22/05/22
 * PROYECTO: ED2022
 */
package Colecciones;

/**
 * Clase nodo doble enlazado que almacena un objeto generico.
 *
 *
 * @author Fisherk2
 * @param <T> Un objeto cualquiera.
 */
public class NodoGen<T> {

    private T contenido;
    protected NodoGen<T> izq, der;

    public NodoGen(T contenido) {
        this.contenido = contenido;
        izq = der = null;
    }

    public T getContenido() {
        if(contenido == null){
            return null;
        }
        return contenido;
    }

    public void setContenido(T objeto) {
        this.contenido = objeto;
    }
}
