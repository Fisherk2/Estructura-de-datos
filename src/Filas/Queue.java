/*
 * NOMBRE: Fisher
 * FECHA: 24/03/22
 * PROYECTO: ED2022
 */
package Filas;

/**
 * Lista de elementos FIFO (First in, First out).
 *
 * @author Fisherk2
 */
public class Queue {

    private Nodo inicio, fin;
    private int contador;

    public Queue() {
        inicio = fin = null; //Cuando se instancia una fila, esta empezara como vacia.
        contador = 0;
    }

    public boolean estaVacio() {
        return inicio == null;
    }

    public int tamaño() {
        return contador;
    }

    Nodo primeroFila() {
        return inicio;
    }

    Nodo ultimoFila() {
        return fin;
    }

    /**
     * Metodo que ingresara un objeto a la fila, este elemento ingresado estara
     * detras del primero y asi sucesivamente.
     *
     * @param informacionNueva
     */
    public void entrarFila(String informacionNueva) {
        Nodo nodoNew = new Nodo(informacionNueva);
        if (estaVacio()) { //Si esta vacio, sera el primero y ultimo de la fila, ya que solo sera un elemento en cola.
            inicio = fin = nodoNew;
        } else {
            fin.next = nodoNew; //Si ya hay elementos, este sera el siguiente de la fila.
            fin = nodoNew;
        }
        contador++; //Recorremos un lugar de la fila
    }

    Nodo salirEnOrdenFila() {
        if (estaVacio()) {
            return null;
        }else{
            Nodo temporal = inicio; //Guardamos el primero ya que este es el que va salir
            inicio=inicio.next;//Asignamos el elemento que estaba por detras hacia adelante
            contador--;// Recorremos un espacio de la fila
            return temporal;//Devolvemos el primero de la fila que estaba antes de ser sacado.
        }
    }
}

/**
 * Clase que representa un objeto, en este caso, un nodo sencillo.
 *
 * @author Fisherk2
 */
class Nodo {

    String informacion;
    Nodo next;

    public Nodo(String info) {
        informacion = info;
        next = null;
    }
}
