/*
 * NOMBRE: Fisher
 * FECHA: 19/05/22
 * PROYECTO: ED2022
 */
package AdivinaPalabra;

/**
 * Clase que almacenara caracteres sin repeticion ni orden (Version ED)
 *
 * @author Fisherk2
 */
public class Conjunto2 {

    NodoLetra inicio, fin;

    public Conjunto2() {
        inicio = fin = null;
    }

    public void agregar(char c) {
        if (inicio == null) {
            inicio = fin = new NodoLetra(c);
        } else {
            NodoLetra temp = inicio;
            while (temp != null) {
                if (temp.getLetra() == c) {
                    return; //TERMINA SI HAY UNA LETRA REPETIDA
                } else {
                    temp = temp.getSiguiente();
                }
            }
            NodoLetra nuevo = new NodoLetra(c);
//            fin.siguiente = nuevo;
            fin.setSiguiente(nuevo);
            fin = fin.getSiguiente();
        }
    }

    public boolean existe(char c) {
        NodoLetra temp = inicio;

        while (temp != null) {
            if (temp.getLetra() == c) {
                return true;
            } else {
                temp = temp.getSiguiente();
            }
        }
        return false;
    }

    public void limpiar() {
        inicio = fin = null;
    }

    @Override
    public String toString() {
        String resultado = "{";

        NodoLetra temp = inicio;
        while (temp != null) {
            resultado += temp.getLetra() + "\t";
            temp = temp.getSiguiente();
        }
        resultado += "}";

        return resultado;
    }

}
