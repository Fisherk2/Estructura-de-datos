/*
 * NOMBRE: Fisher
 * FECHA: 28/04/22
 * PROYECTO: ED2022
 */
package Grafos;

/**
 * Clase que prueba los algoritmos de los grafos.
 *
 * @author Fisherk2
 */
public class MainGrafos {

    public static void main(String[] graphs) {
//        new MainGrafos().arbolBinario();
        new MainGrafos().arbolAVL();

    }

    /**
     * Impresion del contenido de un ARBOL BINARIO DE BUSQUEDA.
     */
    private void arbolBinario() {
        ArbolBinBusq arbol = new ArbolBinBusq();

        arbol.agregar(50);
        arbol.agregar(25);
        arbol.agregar(12);//NODO QUE SERA BORRADO
        arbol.agregar(6);
        arbol.agregar(3);
        arbol.agregar(1);
        arbol.agregar(37);

        arbol.borrar(12);
        System.out.println("La raíz tiene al " + arbol.raiz.dato);

        NodoArbol encontrado = arbol.buscar(50);
        if (encontrado != null) {
            System.out.println("\n" + encontrado.dato
                    + ": a la izquierda " + ((encontrado.izq != null) ? encontrado.izq.dato : "NO HAY HOJA")
                    + " y a la derecha " + ((encontrado.der != null) ? encontrado.der.dato : "NO HAY HOJA"));
        } else {
            System.err.println("ERROR, EL NUMERO QUE INTENTO BUSCAR NO SE ENCUENTRA EN EL ARBOL");
        }
        arbol.inOrder(arbol.raiz, "Es la raiz"); //Impresion INORDER del arbol
    }

    /**
     * Impresion, adicion y eliminacion de nodos de un ARBOL DE BUSQUEDA BINARA
     * AVL
     */
    private void arbolAVL() {
        int[] datos;

        datos = new int[]{7, 5, 8, 4, 6};
//        datos = new int[]{7, 5, 8, 4, 6, 3};
//        datos = new int[]{100, 50, 150, 20, 70, 130, 170, 10, 30, 5, 4};

        ArbolAVL arbol = new ArbolAVL();

        for (int i : datos) {
            arbol.agregar(i);
        }

        arbol.imprimir();

        for (int i : datos) {
            NodoAVL f = arbol.encontrar(i, arbol.getRaíz());
            if (f != null) {
                System.out.println(
                        ((f.izquierda != null) ? f.izquierda.valor : null)
                        + " < " + f.valor + " > "
                        + ((f.derecha != null) ? f.derecha.valor : null));
            }
        }
    }
}
