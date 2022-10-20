/*
 * NOMBRE: Fisher
 * FECHA: 28/05/22
 * PROYECTO: ED2022
 */
package Colecciones;

/**
 * Clase que almacena nodos de doble enlace genericos con forma de estructura de
 * pila.
 *
 * @author Fisherk2
 * @param <T> Cualquier objeto.
 */
public class Pila<T> {

    private NodoGen<T> peek;
    private int tope;

    public Pila() {
        peek = null;
        tope = -1;
    }

    public boolean estaVacio() {
        return peek == null;
    }

    public void vaciar() {
        peek = null;
        tope = -1;
    }

    /**
     * Metodo que saca un nodo generico de la pila
     * @return El nodo que sacaste.
     */
    public NodoGen<T> pop() {
        if (estaVacio()) {
            return null; //NO SE HACE NADA
        }
        NodoGen<T> temp = peek;

        if (tope == 0) {
            vaciar();
            return temp;
        } else {
            temp.der = null; //El nuevo peek no va tener derecha
            peek = temp.izq; //Recorremos el  nodo a la izquierda
            peek.der = null; //Referenciamos que despues del peek no hay nada
            tope--;
            return temp;
        }

    }

    /**
     * Metodo que agrega un nodo generico a la pila.
     *
     * @param nodoNuevo Nodo con un objeto cualquiera.
     */
    public void push(NodoGen<T> nodoNuevo) {
        if (estaVacio()) {
            peek = nodoNuevo;
        } else {
            nodoNuevo.izq = peek; //El izquierdo sera el primero que fue apilado
            peek.der = nodoNuevo; //Lo apilamos
            peek = peek.der; //Hacemos una nueva referencia al ultimo nodo apilado.
        }
        tope++; //Marcamos la posicion del peek.
    }

    /**
     * Metodo que devuelve el indice del nodo que contiene el objeto.
     *
     * @param objeto El objeto que queremos encontrar
     * @return La posicion del objeto buscado, si no existe el indice, devolvera
     * -1.
     */
    public int indiceDe(T objeto) {
        int i = tope;
        NodoGen<T> temp = peek;
        while (temp != null) {
            if (objeto.equals(temp.getContenido())) {
                return i;
            }
            temp = temp.izq; //Recorremos el siguiente nodo.
            i--;
        }
        return -1; //No se encuentra en la pila.
    }

    /**
     * Metodo que busca un objeto contenido en un nodo dentro de la pila
     *
     * @param objeto El objeto que se desea encontrar dentro de la pila
     * @return TRUE: El objeto se encuentra en la pila, de lo contrario no esta
     * aqui.
     */
    public boolean contiene(T objeto) {
        NodoGen<T> temp = peek;
        while (temp != null) {
            if (temp.getContenido().equals(objeto)) {
                return true;
            } else {
                temp = temp.izq;
            }
        }
        return false; //No se encuentra en la pila
    }

    public NodoGen<T> getPeek() {
        if (estaVacio()) { //No va retornar ningun nodo
            return new NodoGen<>(null);
        }
        return peek;
    }

    public int getTamaño() {
        return tope + 1;
    }

    @Override
    public String toString() {
        if (estaVacio()) {
            return "LA PILA ESTA VACIA";
        }
        String resultado = "";
        NodoGen<T> temp = peek;
        while (temp != null) {
            resultado += temp.getContenido().toString() + "\n";
            temp = temp.izq; //Recorrer al anterior
        }
        return resultado;
    }

}
