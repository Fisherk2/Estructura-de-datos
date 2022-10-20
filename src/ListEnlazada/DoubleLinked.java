/*
 * NOMBRE: Fisher
 * FECHA: 15/04/22
 * PROYECTO: ED2022
 */
package ListEnlazada;

/**
 * Clase de listas de nodos enlazados dobles.
 *
 * @author Fisherk2
 */
public class DoubleLinked {

    NodoLinked inicio, fin;

    public DoubleLinked() {
        inicio = fin = null;
    }

    public void limpiar() {
        inicio = fin = null;
    }

    public boolean estaVacio() {
        return inicio == null;
    }

    public void agregar(String info) {
        NodoLinked nuevo = new NodoLinked(info);

        if (estaVacio()) {
            inicio = fin = nuevo;
        } else {
            nuevo.anterior = fin;
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public void agregar(int posicion, String info) {
        NodoLinked nuevo = new NodoLinked(info);

        if (estaVacio()) {
            agregar(info);
            return;
        }
        //Cuando queremos agregar en la primer posicion:
        if (posicion == 0) {
            inicio.anterior = nuevo;
            nuevo.siguiente = inicio;
            inicio = nuevo;
        } //Cuando queremos agregar en la segunda o mas posicion:
        else {
            NodoLinked aux = inicio;
            for (int i = 1; aux != null && i <= posicion; i++) {
                aux = aux.siguiente;
            }
            if (aux == null) {
                fin.siguiente = nuevo;
                nuevo.anterior = fin;
                fin = nuevo;
            } else {
                aux.anterior.siguiente = nuevo;
                nuevo.anterior = aux.anterior;
                nuevo.siguiente = aux;
                aux.anterior = nuevo;
            }
        }
    }

    public void remover(int posicion) {
        //Cuando es el primer nodo:
        if (posicion == 0) {                                        
            if (inicio != null) {
                if (inicio.siguiente != null) {
                    inicio.siguiente.anterior = null;
                }
                inicio = inicio.siguiente;
            }
        } 
        //Cuando es el segundo o mas nodo:
        else {                                                           
            NodoLinked temp = inicio;
            for (int i = 1; temp != null && i <= posicion; i++) {
                temp = temp.siguiente;
            }
            if (temp != null) {
                if (temp.siguiente == null) {                 //- Si quiere borrar al último
                    fin = temp.anterior;
                    fin.siguiente = null;
                    temp.anterior = null;
                } else {                                                   //- Si se desea borrar un nodo que no es el inicial ni el final
                    temp.anterior.siguiente = temp.siguiente;
                    temp.siguiente.anterior = temp.anterior;
                }
            }
        }
    }
}
