/*
 * NOMBRE: Fisher
 * FECHA: 15/04/22
 * PROYECTO: ED2022
 */
package ListEnlazada;

/**
 * Clase de listas de nodos enlazados simple.
 *
 * @author Fisherk2
 */
public class LinkedList {

    NodoLinked inicio, fin;

    public LinkedList() {
        inicio = fin = null;
    }

    public void limpiar() {
        inicio = fin = null;
    }

    /**
     * Metodo que devuelve un nodo de una posicion.
     *
     * @param posicion
     * @return
     */
    public NodoLinked obtener(int posicion) {
        NodoLinked temp = inicio;
        for (int i = 0; temp != null && i <= posicion; i++) {
            if (i == posicion) {
                return new NodoLinked(temp.info);
            } else {
                temp = temp.siguiente; //Pasamos al siguiente nodo
            }
        }
        return null;
    }

    /**
     * Metodo que elimina un nodo de una posicion.
     *
     * @param posicion
     * @return
     */
    public NodoLinked remover(int posicion) {
        NodoLinked temp = inicio;
        //Cuando el nodo es el primero:
        if (posicion == 0 && temp != null) {
            inicio = inicio.siguiente;
            return new NodoLinked(temp.info);
        }
        //Cuando el nodo es el segundo o mas:
        int i = 1;
        while (temp != null && i <= posicion) {
            if (i == posicion) {
                NodoLinked aux = new NodoLinked(temp.siguiente.info);
                if (temp.siguiente == fin) {
                    fin = temp;
                }
                temp.siguiente = temp.siguiente.siguiente;
                return aux;
            } else {
                temp = temp.siguiente; //Recorremos al siguiente nodo
                i++;
            }
        }
        return null;
    }

    public NodoLinked obtenerPrimero() {
        if (inicio != null) {
            return new NodoLinked(inicio.info);
        } else {
            return null;
        }
    }

    public NodoLinked obtenerUltimo() {
        if (fin != null) {
            return new NodoLinked(fin.info);
        } else {
            return null;
        }
    }

    /**
     * Metodo que devuelve el indice del nodo que contiene info.
     *
     * @param info
     * @return
     */
    public int indiceDe(String info) {
        int i = 0;
        NodoLinked temp = inicio;
        while (temp != null) {
            if (info.equals(temp.info)) {
                return i;
            }
            temp = temp.siguiente; //Recorremos el siguiente nodo.
            i++;
        }
        return -1; //No se encuentra en la lista.
    }

    public void agregar(int posicion, String info) {
        NodoLinked nuevo = new NodoLinked(info);

        //Cuando quieres agregar en la primer posicion:
        if (posicion == 0) {
            if (inicio != null) {
                nuevo.siguiente = inicio;
                inicio = nuevo; //Se posiciona al principio de la lista
            } else {
                inicio = fin = nuevo;
            }
        } //Cuando quieres agregar en la segunda o mas posicion:
        else {
            NodoLinked aux = inicio;
            int i = 1;
            while (nuevo != null && i <= posicion) {
                if (i == posicion) {
                    nuevo.siguiente = aux.siguiente;
                    aux.siguiente = nuevo;
                    return;
                } else {
                    if (aux.siguiente != null) {
                        aux = aux.siguiente;
                    }
                    i++;
                }
            }
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public void agregar(String info) {
        NodoLinked nuevo = new NodoLinked(info);

        if (inicio == null) {
            inicio = fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = fin.siguiente;
        }
    }
}
