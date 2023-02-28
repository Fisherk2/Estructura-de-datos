package Buscadores;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Fisher
 */
public class OrdenamientoPorSeleccion {

    /*
    ORDENAMIENTO POR SELECCION
    
    Es un algoritmo de ordenamiento que requiere O(n^2) operaciones para ordenar una lista de n numeros.
    Su funcionamiento es el siguiente:
    1.- Buscar el minimo elemento de la lista
    2.-Intercambiar con el primer elemento.
    3.-Buscar el minimo del resto de la lista.
    4.- Intercambiar con el segundo.
    5.- Y asi sucesivamente
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int arreglo[],nElementos,min,aux;
        nElementos= Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero de elementos del arreglo"));
        arreglo = new int[nElementos]; //Arreglo con n Elementos elegidos por el usuario
        
        //ENTRADA 
        System.out.println("Rellenando arreglo: ");
        for(int i=0; i<nElementos;i++){
            System.out.print((i+1)+".- Digite un numero: ");
            arreglo[i]=entrada.nextInt();
        }
        
        //ORDENAMIENTO POR SELECCION
        for (int i = 0; i < nElementos; i++) { //POSICION DEL NUMERO QUE VAMOS A INTERCAMBIAR
            min=i; //Elemento menor del arreglo
            for (int j = i+1; j < nElementos ; j++) {//Empieza a comparar los numeros siguientes al que vamos a intercambiar
                if(arreglo[j]<arreglo[min]){ //Encontramos el valor minimo de todos los valores comparados
                    min=j;
                }
            }
            //INTERCAMBIO DE VALORES
            aux = arreglo[i]; //Almacenamos en una variable temporal el valor que vamos a sustituir por el menor
            arreglo[i]=arreglo[min]; //El valor minimo se almacena en la posicion del numero que teniamos que intercambiar
            arreglo[min]=aux; //El valor sustituido se almacena en el hueco que dejo el valor minimo
        }
        
        System.out.println("\nARREGLO ORDENADO POR SELECCION: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+" ");
        }
        
    }
    
}
