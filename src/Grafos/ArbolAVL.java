/*
 * NOMBRE: Fisher
 * FECHA: 05/05/22
 * PROYECTO: ED2022
 */
package Grafos;

import javax.swing.JOptionPane;

/**
 * Clase para trabajar con árboles binarios de búsqueda balanceados AVL
 *
 * @author Fisherk2
 */
public class ArbolAVL {

    private NodoAVL raiz;
    private int nNodos;

    public ArbolAVL() {
        raiz = null;
        nNodos = 0;
    }

    /**
     * Método para obtener la raíz del árbol
     *
     * @return La raíz del árbol.
     */
    public NodoAVL getRaíz() {
        return raiz;
    }

    /**
     * Método para vaciar TODO el árbol.
     */
    public void vaciar() {
        raiz = null;
    }

    /**
     * Método para determinar si un árbol está vacío.
     *
     * @return TRUE: el árbol está vacío, FALSE: el arbol contiene nodos.
     */
    public boolean estaVacío() {
        return raiz == null;
    }

    /**
     * Método para conocer el tamaño de un árbol.
     *
     * @return Numero de nodos, es la cantidad de elementos en el árbol.
     */
    public int tamaño() {
        return nNodos;
    }

    /**
     * Método para imprimir el contenido del árbol.
     */
    public void imprimir() {
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione un boton", "ELIJA SU IMPRESION", -1, JOptionPane.INFORMATION_MESSAGE, null, new String[]{"InOrden", "PreOrder", "PostOrden"}, "InOrden");
        if (estaVacío()) {
            System.out.println("Arbol vacío");
            JOptionPane.showMessageDialog(null, "ERROR, EL ARBOL ESTA VACIO");
        } else {
            System.out.println("Raíz : " + raiz.valor);
            switch (seleccion) {
                case 0:
                    inOrder(raiz);
                    break;
                case 1:
                    preOrder(raiz);
                    break;
                case 2:
                    postOrder(raiz);
                    break;
            }
        }
        System.out.println();
    }

    /**
     * Método para recorrer el árbol en inOrden.
     *
     * @param nodo La raiz del arbol
     */
    private void inOrder(NodoAVL nodo) {
        if (nodo != null) {
            inOrder(nodo.izquierda);
            System.out.print(nodo.valor + ":" + nodo.altura + "\t");
            inOrder(nodo.derecha);
        }
    }

    /**
     * Método para recorrer el árbol en preOrden.
     *
     * @param nodo La raiz del arbol
     */
    private void preOrder(NodoAVL nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + ":" + nodo.altura + "\t");
            preOrder(nodo.izquierda);
            preOrder(nodo.derecha);
        }
    }

    /**
     * Método para recorrer el árbol en postOrden.
     *
     * @param nodo La raiz del arbol
     */
    private void postOrder(NodoAVL nodo) {
        if (nodo != null) {
            postOrder(nodo.izquierda);
            postOrder(nodo.derecha);
            System.out.print(nodo.valor + ":" + nodo.altura + "\t");
        }
    }

    /**
     * Método para insertar un dato en el árbol, ignora los duplicados y
     * balancea si es necesario.
     *
     * @param dato El elemento a insertar.
     */
    public void agregar(int dato) {
        raiz = agregar(dato, raiz);
    }

    /**
     * Método auxiliar para agregar en el árbol.
     *
     * @param dato Elemento a agregar.
     * @param n Raiz del árbol o subárbol.
     * @return NodoAvl: La nueva raíz.
     */
    private NodoAVL agregar(int dato, NodoAVL n) {
        //EN CASO DE QUE SEA EL PRIMER NODO EN EL ARBOL, ESTE SERA LA RAIZ
        if (n == null) {
            n = new NodoAVL(dato);
            nNodos++;//Acumulamos numero de nodos
        } //EN CASO DE QUE YA EXISTA NODOS EN EL ARBOL
        else if (dato < n.valor) { //IRA POR LA IZQUIERDA DE LA RAIZ
            n.izquierda = agregar(dato, n.izquierda);
            //ROTARA EN CASO DE QUE EL PESO DEL ARBOL TENGA UNA DIFERENCIA MAYOR DE 1
            if (altura(n.izquierda) - altura(n.derecha) == 2) {
                if (dato < n.izquierda.valor) {
                    System.out.println("Rotando por izquierda al insertar valor " + dato);
                    System.out.println("Se afectará el nodo con valor " + n.valor);
                    n = rotarIzq(n);
                } else {
                    System.out.println("Rotando primero por derecha al insertar valor " + dato);
                    System.out.println("Se afectará el nodo con valor " + n.izquierda.valor);
                    n = rotarDer(n.izquierda);

                    System.out.println("Rotando ahora por izquierda con el valor " + n.izquierda.valor);
                    System.out.println("Se afectará el nodo con valor " + n.valor);
                    n = rotarIzq(n);
                }
            }
        } else if (dato > n.valor) { //IRA POR LA DERECHA DE LA RAIZ
            n.derecha = agregar(dato, n.derecha);
            //ROTARA EN CASO DE QUE EL PESO DEL ARBOL TENGA UNA DIFERENCIA MAYOR DE 1
            if (altura(n.derecha) - altura(n.izquierda) == 2) {
                if (dato > n.derecha.valor) {
                    System.out.println("Rotando por derecha al insertar valor " + dato);
                    System.out.println("Se afectará el nodo con valor " + n.valor);
                    n = rotarDer(n);
                } else {
                    System.out.println("Rotando primero por izquierda al insertar valor " + dato);
                    System.out.println("La raíz del subárbol a afectar es : " + n.derecha.valor);
                    System.out.println("Se afectará el nodo con valor " + n.derecha.valor);
                    n.derecha = rotarIzq(n.derecha);

                    System.out.println("Rotando por derecha con el valor " + n.derecha.valor);
                    System.out.println("Se afectará el nodo con valor " + n.valor);
                    n = rotarDer(n);
                }
            }
        } else { //EN CASO DE QUE EL DATO INGRESADO YA SE ENCUENTRA EN EL ARBOL
            return n; //Termina el metodo.
        }
        n.altura = max(altura(n.izquierda), altura(n.derecha)) + 1; //???????
        return n;
    }

    /**
     * Método privado para conocer la altura de un nodo.
     *
     * @param n Nodo del que se desea conocer su altura.
     * @return Altura del nodo.
     */
    private int altura(NodoAVL n) {
        if (n == null) {
            return -1;
        } else {
            return n.altura;
        }
    }

    /**
     * Método para rotar a la izquierda.
     *
     * @param n Nodo raíz del subarbol que se va a rotar.
     * @return Nodo raíz del subárbol después de la rotación.
     */
    private NodoAVL rotarIzq(NodoAVL n) {
        NodoAVL nRaiz = n.izquierda;

        n.izquierda = nRaiz.derecha;
        nRaiz.derecha = n;
        n.altura = max(altura(n.izquierda), altura(n.derecha)) + 1; //?????
        nRaiz.altura = max(altura(nRaiz.izquierda), n.altura) + 1; //?????
        return nRaiz;
    }

    /**
     * Método para rotar a la derechaa
     *
     * @param n Nodo raíz del subárbol que se va a rotar
     * @return Nodo raíz del subárbol después de la rotación
     */
    private NodoAVL rotarDer(NodoAVL n) {
        NodoAVL nRaiz = n.derecha;

        n.derecha = nRaiz.izquierda;
        nRaiz.izquierda = n;
        n.altura = max(altura(n.izquierda), altura(n.derecha)) + 1; //??????
        nRaiz.altura = max(altura(nRaiz.derecha), n.altura) + 1; //??????
        return nRaiz;
    }

    /**
     * Método privado para retornar el menor de dos enteros que se comparan
     *
     * @param a Primer valor
     * @param b Segundo valor
     * @return A si a es mayor o igual a B, o B en caso contrario.
     */
    private int max(int a, int b) {
        return a >= b ? a : b; //Si A es mayor o igual a B, devuelve A, en caso contrario B
    }

    /**
     * Método interno para encontrar el menor elemento en un subárbol.
     *
     * @param n Nodo raíz del árbol.
     * @return El nodo que contiene el elemento de menor valor.
     */
    public NodoAVL encuentraMin(NodoAVL n) {
        if (n == null) { //En caso de que el nodo ingresado esta vacio
            return null;
        } else if (n.izquierda == null) { //En caso de que no tenga hoja/nodo izquierdo
            return n;
        }
        return encuentraMin(n.izquierda); //Repetir hasta retornar el nodo
    }

    /**
     * Método para encontrar un elemento en el árbol.
     *
     * @param dato El dato a buscar.
     * @return TRUE: si el elemento se encontró, FALSE: si no.
     */
    public boolean contiene(int dato) {
        return encontrar(dato, raiz) != null;
    }

    /**
     * Método interno para encontrar un elemento en un subárbol
     *
     * @param dato Elemento buscado.
     * @param n Raíz del arbol.
     * @return NodoAVL que contiene el elemento encontrado o null si no.
     */
    public NodoAVL encontrar(int dato, NodoAVL n) {
        while (n != null) {//TERMINAR CUANDO NO HAYA UN NODO QUE BUSCAR
            if (dato < n.valor) {//SI EL DATO ES MENOR QUE EL NODO, RECORRER POR LA IZQUIERDA
                n = n.izquierda;
            } else if (dato > n.valor) {//SI EL DATO ES MAYOR QUE EL NODO, RECORRER POR LA DERECHA
                n = n.derecha;
            } else {
                return n;//SI EL DATO QUE BUSCAMOS ES IGUAL AL DEL NODO
            }
        }
        return null; //NO SE ENCONTRO EL DATO EN EL ARBOL
    }

    /**
     * Método para eliminar un elemento del árbol, en caso de no encontrarlo no
     * hace nada.
     *
     * @param dato dato a eliminar
     */
    public void eliminar(int dato) {
        //PENDIENTE
    }
}
