/*
 * NOMBRE: Fisher
 * FECHA: 15/05/22
 * PROYECTO: ED2022
 */
package AdivinaPalabra;

/**
 * Clase que almacenara caracteres sin repeticion ni orden
 *
 * @author Fisherk2
 */
public class Conjunto {

    private NodoLetra inicio, fin;
    private int numLetras;

    public Conjunto() {
        inicio = fin = null;
        numLetras = 0;
    }

    /**
     * Metodo que vacia el conjunto por completo
     */
    public void clear() {
        inicio = fin = null;
    }

    /**
     * Metodo que va agregando letras, las letras NO se pueden repetir,
     *
     * @param letra
     */
    public void add(char letra) {
        if (!buscar(letra)) { //Si la letra ya esta en el conjunto, no se agregara.
            NodoLetra nuevo = new NodoLetra(letra);
            if (estaVacio()) {
                inicio = fin = nuevo;//Si esta vacio el conjunto, se iniciara uno nuevo
            } else {
//            fin.siguiente = nuevo;
                fin.setSiguiente(nuevo);
                fin = fin.getSiguiente();
            }
        }

    }

    public boolean estaVacio() {
        return inicio == null;
    }

    /**
     * Metodo que busca todos los elementos del conjunto.
     *
     * @param letra
     * @return TRUE: Si encontro la letra del conjunto, FALSE: No se encuentra
     * en el conjunto.
     */
    public boolean buscar(char letra) {
        NodoLetra temp = inicio;

        while (temp != null) {
            if (temp.getLetra() == letra) {
                return true; //Se encontro la letra en la lista
            }
            temp = temp.getSiguiente(); //Recorremos el siguiente nodo.
        }
        return false; //No se encuentra en la lista.
    }

    /**
     * Obtienes el numero de caracteres dentro del conjunto
     *
     * @return El numero de letras del conjunto.
     */
    public int getSize() {
        NodoLetra temp = inicio;
        if (temp == null) {
            return 0;//Significa que no hay elementos en el conjunto
        }
        numLetras = 0;//Para que vuelva a contar
        while (temp != null) {
            numLetras++;//Cuenta por cada ciclo hasta que los nodos se terminen
            temp = temp.getSiguiente(); //Recorremos el siguiente nodo.
        }
        return numLetras;
    }

    /**
     * Devolvera el nodo de la posicion ingresada.
     *
     * @param posicion
     * @return Nodo que contiene una letra.
     */
    public NodoLetra obtener(int posicion) {
        NodoLetra temp = inicio;
        for (int i = 0; temp != null && i <= posicion; i++) {
            if (i == posicion) {
                return new NodoLetra(temp.getLetra());
            } else {
                temp = temp.getSiguiente(); //Pasamos al siguiente nodo
            }
        }
        return null;
    }

}
