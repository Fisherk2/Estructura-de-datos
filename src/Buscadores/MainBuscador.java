/*
 * NOMBRE: Fisher
 * FECHA: 4/03/22
 * PROYECTO: ED2022
 */
package Buscadores;

/**
 *
 * @author Fisherk2
 */
public class MainBuscador {

    public static void main(String[] search) {
        int[] arreglo = new int[]{1, 34, 66, 99, 1283};
        Searcher buscar = new Searcher();

        System.out.println("El valor que busca esta en la posicion: " + buscar.lineal(arreglo, 34));
        System.out.println("El valor que busca esta en la posicion: " + buscar.binaria(arreglo, 34));

    }

}
