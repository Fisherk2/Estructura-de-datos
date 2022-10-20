/*
 * NOMBRE: Fisher
 * FECHA: 27/02/22
 * PROYECTO: ED2022
 */
package Ordenadores;

/**
 * Clase que genera datos de numeros aleatorios en un arreglo.
 *
 * @author Fisherk2
 */
public class Dato {

    private int[] arreglo;

    public Dato(int espacios, int rangoDatos) {
        this.arreglo = new int[espacios];
        this.arreglo = generarDatos(arreglo, rangoDatos);
    }

    /**
     * Genera numeros aleatorios del 0 al rango de datos que se ingrese en el
     * constructor.
     *
     * @param arreglo
     * @param rangoDatos
     * @return arreglo[]
     */
    private int[] generarDatos(int[] arreglo, int rangoDatos) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * rangoDatos);
        }
        return arreglo;
    }

    public int[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }

    @Override
    public String toString() {
        //Imprimir los resultados del arreglo de forma creciente y decreciente
        System.out.println("\nARREGLO ORDENADO EN FORMA CRECIENTE");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println((i + 1) + ": " + arreglo[i]);
        }
        System.out.println("\nARREGLO ORDENADO EN FORMA DECRECIENTE");
        for (int i = arreglo.length - 1; i >= 0; i--) {
            System.out.println((i + 1) + ": " + arreglo[i]);
        }
        return "\n";
    }

}
