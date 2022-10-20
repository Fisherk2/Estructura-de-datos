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
public class Searcher {

    private int posicion;

    /**
     * Metodo que realizar una busqueda desde la primera a la ultima posicion de
     * manera ascendente
     *
     * @param arreglo
     * @param n
     * @return La posicion del numero a buscar, si es negativo, significa que no
     * se encuentra.
     */
    public int lineal(int[] arreglo, int n) {
        posicion = -1;
        for (int i = 0; i < arreglo.length; i++) {
            if (n == arreglo[i]) {
                posicion = i;
            }
        }
        return posicion;
    }

    /**
     * Metodo que busca un numero de un arreglo ordenado ascendentemente
     * partiendo a la mitad el arreglo buscando numeros mayores o menores que el
     * numero partido.
     *
     * @param arreglo
     * @param n
     * @return La posicion del numero a buscar, si es negativo, significa que no
     * se encuentra.
     */
    public int binaria(int[] arreglo, int n) {
        //NOTA: EL ARREGLO DEBE ESTAR ORDENADO ASCENDENTEMENTE
        int inf = 0, sup = arreglo.length, i = 0, mitad = (inf + sup) / 2;
        posicion = -1;
        while (inf <= sup && i < arreglo.length) {
            if (arreglo[mitad] == n) {
                posicion = mitad; //Se rompe el ciclo ya que se encontro el valor en la posicion MITAD
                break;
            }
            if (arreglo[mitad] > n) {
                //Refrescamos los valores
                sup = mitad;
                mitad = (inf + sup) / 2;
            }
            if (arreglo[mitad] < n) {
                //Refrescamos los valores
                inf = mitad;
                mitad = (inf + sup) / 2;
            }
            i++;
        }
        return posicion;
    }

}
