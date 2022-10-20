/*
 * NOMBRE: Fisher
 * FECHA: 28/04/22
 * PROYECTO: ED2022
 */
package Grafos;

/**
 * Clase que contiene nodos en forma de arbol binario de busqueda.
 *
 * @author Fisherk2
 */
public class ArbolBinBusq {

    NodoArbol raiz;

    ArbolBinBusq() {
        raiz = null;
    }

    /**
     * Si el nodo del parametro no tiene izquierda y derecha, este sera una
     * HOJA.
     *
     * @param nodo
     * @return boolean
     */
    public boolean esHoja(NodoArbol nodo) {
        return nodo.izq == null && nodo.der == null; //Si no tiene izquierda y derecha, este nodo es HOJA
    }

    public void agregar(int dato) {
        NodoArbol nuevo = new NodoArbol(dato);

        if (raiz == null) { //En caso de que no exista un arbol, se empieza por el nuevo.
            raiz = nuevo;
        } else {
            NodoArbol temp = raiz; //Para no sobrescribir la raiz.
            while (true) {//Ciclo infinito hasta que se cumpla las condiciones
                if (nuevo.dato == temp.dato) { //Si el dato que ingresamos vale lo mismo que la raiz, se cancela la adicion.
                    return; //Rompemos el ciclo
                }
                //Si el dato que ingresamos vale menos que la raiz, este se colocara a la HOJA IZQUIERDA
                if (nuevo.dato < temp.dato) {
                    if (temp.izq != null) { //Si esta ocupado la HOJA IZQUIERDA de la raiz, esta se desplazara al siguiente nivel
                        temp = temp.izq;
                    } else {
                        temp.izq = nuevo; //Si no esta ocupado, este tomara el lugar de la HOJA IZQUIERDA
                        return; //Rompemos el ciclo
                    }
                    //Si el dato que ingresamos vale mas que la raiz, este se colocara a la HOJA DERECHA
                } else if (nuevo.dato > temp.dato) {
                    if (temp.der != null) { //Si esta ocupado la HOJA DERECHA de la raiz, esta se desplazara al siguiente nivel
                        temp = temp.der;
                    } else {
                        temp.der = nuevo; //Si no esta ocupado, este tomara el lugar de la HOJA DERECHA
                        return; //Rompemos el ciclo
                    }
                }
            }

        }
    }

    /**
     * Imprime arbol INORDER.
     *
     * @param nodo
     * @param posicion
     */
    public void inOrder(NodoArbol nodo, String posicion) {
        if (nodo != null) { //La recursividad acabara cuando nodo sea NULL
            inOrder(nodo.izq, "Se va a Izquierda"); //Imprimira el izquierdo
            System.out.println(nodo.dato + "- " + posicion);
            inOrder(nodo.der, "Se va a Derecha"); //Imprimira el derecho
        }
    }

    /**
     * Imprime arbol PREORDER.
     *
     * @param nodo
     * @param posicion
     */
    public void preOrder(NodoArbol nodo, String posicion) {
        if (nodo != null) { //La recursividad acabara cuando nodo sea NULL
            System.out.println(nodo.dato + "- " + posicion);
            preOrder(nodo.izq, "Se va a Izquierda"); //Imprimira el izquierdo
            preOrder(nodo.der, "Se va a Derecha"); //Imprimira el derecho
        }
    }

    /**
     * Imprime arbol POSTORDER.
     *
     * @param nodo
     * @param posicion
     */
    public void postOrder(NodoArbol nodo, String posicion) {
        if (nodo != null) { //La recursividad acabara cuando nodo sea NULL
            postOrder(nodo.izq, "Se va a Izquierda"); //Imprimira el izquierdo
            postOrder(nodo.der, "Se va a Derecha"); //Imprimira el derecho
            System.out.println(nodo.dato + "- " + posicion);
        }
    }

    public NodoArbol buscar(int dato) {
        NodoArbol temp = raiz;

        while (temp != null) { //No entrara en ciclo si no existe NODO
            if (temp.dato == dato) {
                return temp; //El ciclo termina hasta que el dato sea encontrado en el arbol y devuelve el nodo del valor buscado.
            } else {
                if (dato < temp.dato) { //Si el dato es menor que el nodo, se intercambiara por su HOJA IZQUIERDA
                    temp = temp.izq;
                } else {
                    temp = temp.der; //Si el dato es mayor que el nodo, se intercambiara por su HOJA DERECHA
                }
            }
        }
        return null;
    }

    /**
     * Metodo que elimina un nodo de un arbol y se remplazara por el nodo mas
     * grande del lado izquierdo del arbol, si no tiene iquierda, se le
     * remplazara por el nodo mas pequeño de la derecha del arbol.
     *
     * @param info
     */
    public void borrar(int info) {
        NodoArbol temp = raiz, temp2 = temp, temp3 = null, temp4 = null; //Guardamos dos nodos temporales de la raiz y declaramos dos vacios
        boolean hayaBorrado = false, porIzq = true;

        //Mientras halla por lo menos un nodo y este no halla sido borrado, entrara en el ciclo de borrado.
        while (!hayaBorrado && temp != null) {
            if (temp.dato == info) {
                System.out.println("Borrando...");
                if (esHoja(temp)) {
                    //SOLO SI HAY UN NODO Y ES LA MISMA HOJA
                    if (temp == raiz) {
                        raiz = null;
                    } else //HAY MAS NODOS Y ESTE ES UNA HOJA
                    if (porIzq) { //SI EL NODO ESTA A LA IZQUIERDA
                        temp2.izq = null;
                    } else {
                        temp2.der = null;
                    }
                } else { // HAY MAS NODOS, RECORRE POR EL NODO CON MAYOR VALOR DE LA IZQUIERDA
                    if (temp.izq != null) { //SI NO TIENE IZQUIERDA EL NODO INICIAL DE RECORRIDO, SE IRA POR EL MAS PEQUEÑO DE LA DERECHA
                        temp3 = temp.izq;
                        temp4 = temp3;
                        while (temp4.der != null) {
                            temp3 = temp4;
                            temp4 = temp4.der;
                        }
                        temp.dato = temp4.dato;
                        if (temp3 != temp4) {
                            temp3.der = temp4.izq;
                        } else {
                            temp.izq = temp3.izq;
                        }
                    } else { //SI TIENE IZQUIERDA, IRA EN RECORRIDO HASTA ENCONTRAR EL MAS GRANDE
                        temp3 = temp.der;
                        temp4 = temp3;
                        while (temp4.izq != null) {
                            temp3 = temp4;
                            temp4 = temp4.izq;
                        }
                        temp.dato = temp4.dato;
                        if (temp3 != temp4) {
                            temp3.izq = temp4.der;
                        } else {
                            temp.der = temp3.der;
                        }
                    }
                }
                hayaBorrado = true; //BYPASS que avisa que los nodos han sido desplazados y sustituidos
            } else { //SUCEDERA CUANDO LA RAIZ NO ES EL NODO QUE ESTAMOS BUSCANDO Y SE ENCUENTRA ENTRE LAS RAICES
                temp2 = temp;
                if (info < temp.dato) { //VIAJARA POR LA IZQUIERDA
                    temp = temp.izq;
                    porIzq = true;
                } else {
                    temp = temp.der; //VIAJARA POR LA DERECHA
                    porIzq = false;
                }

            }
        }
        //SI EL DATO BUSCADO NO SE ENCUENTRA EN EL ARBOL EN GENERAL
        if (temp == null) {
            System.out.println(info + " no está en el árbol");
        }
    }
}
