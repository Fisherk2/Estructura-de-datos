/*
 * NOMBRE: Fisher
 * FECHA: 23/03/22
 * PROYECTO: ED2022
 */
package Pilas;

/**
 * Estructura de datos estatica de nodos con forma de pila.
 *
 * @author Fisherk2
 */
public class Estatica {

    String[] arregloInfo;
    int tope; //Sera la tapa o el limite de nuestro Stack

    public Estatica(int tamaño) {
        arregloInfo = new String[tamaño];
        tope = -1;
    }

    public boolean estaVacia() {
        return tope == -1; //Cuando tope sea -1, es porque no hay informacion en la pila
    }

    public boolean estaLleno() {
        return tope == arregloInfo.length - 1; //Cuando el tope sea el tamaño del arreglo -1, es porque la pila no puede almacenar mas datos
    }

    /**
     * Sacar el nodo de una pila estatica.
     *
     * @return informacion del nodo.
     */
    public String pop() {
        if (estaVacia()) {
            return null; //Si la pila esta vacia, esta no regresara ningun valor
        } else {
            String info = arregloInfo[tope];
            tope--; //Baja la posicion de la pila
            return info;
        }
    }

    /**
     * Agregar un nodo a la pila estatica.
     *
     * @param infoNueva
     */
    public void push(String infoNueva) {
        if (!estaLleno()) { //Si no esta lleno, agregar un nodo con nueva informacion
            arregloInfo[++tope] = infoNueva; //Se recorre un espacio en la pila
        }
        System.out.println("STACK LLENO");
    }

    /**
     * Lee la informacion del nodo que esta hasta arriba de la pila estatica
     * @return 
     */
    public String peek() {
        if(estaVacia()){// Si esta vacio, no va regresar ninguna informacion
            return null;
        }else{
            return arregloInfo[tope];
        }
    }
}
