/*
 * NOMBRE: Fisher
 * FECHA: 27/02/22
 * PROYECTO: ED2022
 */
package Ordenadores;

/**
 * Clase principal que imprime un cronometro en milisegundos del tiempo tardado
 * de cada tipo de ordenamiento.
 *
 * @author Fisherk2
 */
public class MainOrden {

    public static void main(String[] args) {
        //Creacion de arreglos
        Dato data = new Dato(100_000, 50); //Enviamos los espacios y rango de datos (0-50)
//        Dato data = new Dato(1_000_000, 500); //Enviamos los espacios y rango de datos (0-500)
//        Dato data = new Dato(5_000_000, 50000); //Enviamos los espacios y rango de datos (0-5000)

        new MainOrden().cromometrar(data);

        //Impresion del arreglo ordenado
        System.out.println(data);
    }

    /**
     * Impresion del tiempo tardado en ordenar un arreglo
     *
     * @param data
     */
    public void cromometrar(Dato data) {
        int[] arregloRadix = data.getArreglo().clone();//Copia del arreglo original
        int[] arregloBubble = data.getArreglo().clone(); //Copia del arreglo original
        int[] arregloFast = data.getArreglo().clone(); //Copia del arreglo original

        long inicio, fin;

        //Impresion del tiempo en ordenar el arreglo
        System.out.println("------------------------");
        inicio = System.currentTimeMillis();
        Ordenador.radixSort(arregloRadix);
        fin = System.currentTimeMillis();
        System.out.println("Con Radix Sort ordenados en " + (fin - inicio) + " milisegundos");
        
        System.out.println("------------------------");
        inicio = System.currentTimeMillis();
        Ordenador.bubbleSort(arregloBubble);
        fin = System.currentTimeMillis();
        System.out.println("Con bubble Sort ordenados en " + (fin - inicio) + " milisegundos");
        
        System.out.println("------------------------");
        inicio = System.currentTimeMillis();
        Ordenador.fastSort(arregloFast, 0, arregloFast.length-1);
        fin = System.currentTimeMillis();

        System.out.println("Con Fast Sort ordenados en " + (fin - inicio) + " milisegundos");

//        data.setArreglo(arregloRadix);
//        data.setArreglo(arregloBubble);
        data.setArreglo(arregloFast);
    }
}
