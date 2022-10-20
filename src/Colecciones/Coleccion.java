/*
 * NOMBRE: Fisher
 * FECHA: 22/05/22
 * PROYECTO: ED2022
 */
package Colecciones;

/**
 * Clase que almacena nodos de doble enlace genericos con forma de conjunto sin repeticion.
 *
 * @author Fisherk2
 * @param <T> Cualquier objeto.
 */
public class Coleccion<T> {

    private NodoGen<T> inicio, fin;
    private int tamaño;

    public Coleccion() {
        inicio = fin = null;
        tamaño = 0;
    }

    public boolean estaVacio() {
        return inicio == null;
    }

    public void vaciar() {
        inicio = fin = null;
        tamaño = 0;
    }

    /**
     * Metodo que almacena un objeto nuevo generico a la coleccion
     *
     *
     * @param nodoNuevo Nodo con un objeto generico
     */
    public void agregar(NodoGen<T> nodoNuevo) {
        if (contiene(nodoNuevo.getContenido())) { //Si el nodo ya esta dentro de la coleccion, se omite el agregado
            return;
        }
        if (estaVacio()) {
            inicio = fin = nodoNuevo; //Lo dejamos al principio de la coleccion.
        } else {
            // io
            nodoNuevo.izq = fin; //

            fin.der = nodoNuevo;//Lo colocamos adelante de la coleccion.
            fin = fin.der;//Recorremos un nodo
        }
        tamaño++; //Incrementamos el contador del tamaño de la coleccion.
    }

    /**
     * Metodo que busca un objeto contenido en un nodo dentro de la coleccion
     *
     * @param objeto El objeto que se desea encontrar dentro de la coleccion
     * @return TRUE: El objeto se encuentra en la coleccion, de lo contrario no
     * esta aqui.
     */
    public boolean contiene(T objeto) {
        NodoGen<T> temp = inicio;
        while (temp != null) {
            if (temp.getContenido().equals(objeto)) {
                return true;
            } else {
                temp = temp.der;
            }
        }
        return false;
    }

    /**
     * Metodo que te devuelve el numero de elementos dentro de la coleccion.
     *
     * @return Numero de objetos.
     */
    public int size() {
        return tamaño;
    }

    /**
     * Metodo que extrae un nodo con informacion especifica del objeto buscado.
     *
     * @param objeto El objeto que quieres encontrar
     * @return El nodo donde se almacena ese objeto.
     */
    public NodoGen<T> obtener(T objeto) {
        NodoGen<T> temp = inicio;
        while (temp != null) {
            if (temp.getContenido().equals(objeto)) {
                return temp;
            } else {
                temp = temp.der;
            }
        }
        return temp;
    }

    /**
     * Metodo que extrae un nodo con la posicion especifica.
     *
     * @param posicion Posicion en la coleccion de objetos.
     * @return El nodo donde se ubica la posicion indicada.
     */
    public NodoGen<T> obtener(int posicion) {
        NodoGen<T> temp = inicio;
        for (int i = 0; temp != null && i <= posicion; i++) {
            if (i == posicion) {
                return new NodoGen<>(temp.getContenido());
            } else {
                temp = temp.der; //Pasamos al siguiente nodo
            }
        }
        return null;
    }

    /**
     * Metodo que devuelve el indice del nodo que contiene el objeto.
     *
     * @param objeto El objeto que queremos encontrar
     * @return La posicion del objeto buscado, si no existe el indice, devolvera
     * -1.
     */
    public int indiceDe(T objeto) {
        int i = 0;
        NodoGen<T> temp = inicio;
        while (temp != null) {
            if (objeto.equals(temp.getContenido())) {
                return i;
            }
            temp = temp.der; //Recorremos el siguiente nodo.
            i++;
        }
        return -1; //No se encuentra en la lista.
    }

    /**
     * Metodo que elimina un objeto especificado de la coleccion
     *
     * @param objeto El objeto que queremos eliminar de la coleccion.
     */
    public void borrar(T objeto) {
        if (estaVacio()) {
            return;
        }
        NodoGen<T> temp = inicio;

        while (temp != null) {
            if (temp.getContenido().equals(objeto)) {
                tamaño--;
                if (inicio == fin) {            //Si solo tenemos un elemento en la coleccion
                    vaciar();
                    break;
                } else if (temp == inicio) {    //Si el elemento que queremos borrar esta al inicio.
                    inicio = inicio.der;
                    inicio.izq = null;//Rompemos el enlace de la izquierda
                    break;
                } else if (temp == fin) {       //Si el elemento que queremos borrar esta al final
                    fin = fin.izq;
                    fin.der = null; //Rompemos el enlace de la derecha
                    break;
                } else {                        //Si el elemento que queremos borrar esta entre el inicio y fin.
                    temp.izq.der = temp.der; //Reasignamos los enlaces a la derecha
                    temp.der.izq = temp.izq; //Reasignamos los enlaces a la izquierda
                    break;
                }
            } else {
                temp = temp.der;//Recorremos el siguiente nodo.
            }
        } //CICLO
    }

    /**
     * Metodo que elimina un objeto encontrado en la posicion de la coleccion.
     *
     * @param posicion Donde se encuentra el objeto a borrar
     */
    public void borrar(int posicion) {
        if (posicion == 0) {             //-Cuando es el primer nodo:
            if (inicio != null) {
                if (inicio.der != null) {
                    inicio.der.izq = null;
                }
                inicio = inicio.der;
                tamaño--;
            }
        } else {                         //-Cuando es el segundo o mas nodo:
            NodoGen<T> temp = inicio;
            for (int i = 1; temp != null && i <= posicion; i++) {
                temp = temp.der;
            }
            if (temp != null) {
                if (temp.der == null) {  //- Si quiere borrar al último
                    fin = temp.izq;
                    fin.der = null;
                    temp.der = null;
                } else {                 //- Si se desea borrar un nodo que no es el inicial ni el final
                    temp.izq.der = temp.der;
                    temp.der.izq = temp.izq;
                }
                tamaño--;
            }//NO BORRA NADA.
        }
    }

    @Override
    public String toString() {
        String resultado = "";
        NodoGen<T> temp = inicio;
        while (temp != null) {
            resultado += temp.getContenido().toString() + "\n";
            temp = temp.der;
        }
        return resultado;
    }

    //METODOS PENDIENTES
    /**
     * Metodo (NO USAR) que elimina un objeto especifico de la coleccion.
     *
     * @param objeto
     */
    public void remover(T objeto) {
        if (estaVacio()) {
            return;
        }
        NodoGen<T> temp = inicio;

        while (temp != null) {
            if (contiene(objeto)) { //Si el dato que mandamos existe en la coleccion
                tamaño--;
                if (inicio == fin) { //Si solo hay un elemento en la coleccion
                    vaciar();
                    break;
                } else if (inicio == temp) {  //Si el elemento que queremos borrar esta al inicio.
                    inicio = inicio.der; //Recorremos el inicio a la derecha
                    inicio.izq = null; //Rompemos enlace de la izquierda de inicio
                    break;
                } else if (fin == temp) { //Si el elemento que queremos borrar esta al final.
                    fin = fin.izq; //Recorremos el final a la izquierda
                    fin.der = null; //Rompemos el enlace de la derecha de fin
                    break;
                } else {//Si el elemento que queremos borrar esta entre el inicio y final
                    temp.izq.der = temp.der; //Actualizamos enlace de la derecha de temp
                    temp.der.izq = temp.izq;//Actualizamos enlace de la izquierda de temp
                    break;
                }
            } else {
                temp = temp.der; //Recorremos el siguiente nodo
            }
        }
    }

    /**
     * Metodo (NO USAR) que elimina un objeto especifico de la coleccion.
     *
     * @param objeto
     */
    public void remover1(T objeto) {
        NodoGen<T> temp = inicio;
        if (!estaVacio()) { //Asumir que no esta vacio
            //Terminara cuando se encuentre el objeto contiene();
            while (!temp.getContenido().equals(objeto)) {
                temp = temp.der; //Recorrer un nodo
                if (temp == null) {
                    return;//No se encuentra en la coleccion
                }
            }
            //Lo encontramos
            tamaño--;
            if (inicio == fin) {
                vaciar();
                return; //SE VACIO LA COLECCION 
            } else if (temp == inicio) { //ES EL PRIMERO?
                inicio = temp.der;
            } else { //NO ES EL PRIMERO
                temp.der = temp;
                temp.izq.der = temp.der;
            }
            if (temp == fin) {//ES EL ULTIMO?
                fin = temp.izq;
            } else {//NO ES EL ULTIMO
                temp = temp.der;
                temp.der.izq = temp.izq;
            }
        }
    }

}
