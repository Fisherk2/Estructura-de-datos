/*
 * NOMBRE: Fisher
 * FECHA: 27/02/22
 * PROYECTO: ED2022
 */
package Ordenadores;

import java.util.ArrayList;

/**
 * Clase que ordena datos dependiendo del metodo estatico seleccionado, ya sea
 * el Bubble Sort, Radix Sort, Fast Sort...
 *
 * @author Fisherk2
 */
public class Ordenador {

    /**
     * Metodo Burbuja que ordena de nxm
     *
     * @param a
     */
    public static void bubbleSort(int[] a) {
        int temp;
        for (int i = 0; i < a.length - 1; i++) { //Porque solo se tratan con numeros antes del ultimo, ya que este no tiene siguiente
            for (int j = i + 1; j < a.length; j++) { //Sirve para ordenar y acomodar el arreglo
                if (a[j] < a[i]) { //Si numeroACTUAL > numeroSiguiente
                    temp = a[i]; //Se guarda momentaneamente antes de cambiar al siguiente
                    a[i] = a[j]; //Se intercambia al anterior
                    a[j] = temp; //Se guarda el valor respaldado al siguiente
                }
            }
        }
    }

    /**
     * Metodo Radix que ordena primero encontrando el valor maximo, para despues
     * sacar su numero de digitos y por ultimo reacomodarlo iteradas veces
     * respectivamente por este numero de digitos.
     *
     * @param a
     */
    public static void radixSort(int[] a) {
        int mayor = findMaxValue(a);
        int nDígitos = String.valueOf(mayor).length(); //Numero de digitos del valor mayor, 344=3 digitos
        int posición = 1;//Nuevo

        while (nDígitos-- > 0) { //Mientras el numero de digitos sea mayor a 0, este seguira acomodandose, por cada iteracion, se reduce un digito.
            reacomodo(a, posición);
            posición *= 10;//Nuevo digito
        }
    }

    /**
     * Metodo Rapido que ordena con un rango especifico de espacios de un
     * arreglo.
     *
     * @param a
     * @param inicio
     * @param fin
     */
    public static void fastSort(int[] a, int inicio, int fin) {
        if (inicio < fin) {
            int comienzo = a[inicio];// Iniciamos con el valor del rango de inicio
            ArrayList<Integer> menores = new ArrayList(); //Lista con valores menores al del comienzo
            ArrayList<Integer> mayores = new ArrayList(); //Lista con valores mayores al del comienzo
            //Vaciamos el arreglo en dos listas dependiendo del valor inicial
            for (int i = inicio + 1; i <= fin; i++) {
                if (a[i] < comienzo) {
                    menores.add(a[i]);
                } else if (a[i] >=comienzo) {
                    mayores.add(a[i]);
                }
            }
            
            //?????????
            int posicion = inicio + menores.size();
            int j = inicio; //El interador empieza desde el valor del rango de inicio
            for (int i = 0; i < menores.size(); i++, j++) {
                a[j] = menores.get(i);
            }
            
            a[j++] = comienzo;//?????
            
            for (int i = 0; i < mayores.size(); i++) {
                a[j++] = mayores.get(i);
            }
            
            //Recursividad
            fastSort(a, inicio, posicion - 1);
            fastSort(a, posicion + 1, fin);
        }
    }

    /**
     * Busca el valor mas alto del arreglo
     *
     * @param a
     * @return Valor maximo del arreglo
     */
    private static int findMaxValue(int[] a) {
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    /**
     * Reacomoda el arreglo por digito iterado.
     *
     * @param a
     * @param posición
     */
    private static void reacomodo(int[] a, int posición) {
        ArrayList<Integer>[] tablaHash = new ArrayList[10];//Creamos un arreglo local con 10 listas
        int rango = 10;//10 elementos por lista

        //Llenamos el arreglo local con los valores del arreglo original
        for (int i = 0; i < tablaHash.length; i++) {//Creacion de una lista por cada espacio del arreglo local
            tablaHash[i] = new ArrayList();
        }

        for (int i = 0; i < a.length; i++)//Agregamos elementos a la lista dependiendo del espacio del arreglo local
        {
            tablaHash[(a[i] / posición) % rango].add(a[i]);
        }

        //Vaciamos el arreglo local con 10 listas a nuestro arreglo original
        for (int i = 0, k = 0; i < tablaHash.length; i++) {
            for (int j = 0; j < tablaHash[i].size(); j++) {
                a[k++] = tablaHash[i].get(j);
            }
        }
    }
}
