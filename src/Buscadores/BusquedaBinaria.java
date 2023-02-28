package Buscadores;

import javax.swing.JOptionPane;

/**
 *
 * @author Fisher
 */
public class BusquedaBinaria {

    /*
    BUSQUEDA BINARIA
    
    A diferencia de la secuencial, el arreglo debe estar con valores de forma ordenada de forma ascendente para 
    poder realizar la busqueda.
    
     */
    public static void main(String[] args) {
        int arreglo[] = {1, 2, 3, 4, 5}; //TIENE QUE ESTAR ORDENADO DE FORMA CRECIENTE
        int dato, inf, sup, mitad, i;
        boolean bypass = false;

        //ENTRADA
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar"));

        //BUSQUEDA BINARIA
        inf = 0;
        sup = arreglo.length;
        i = 0;
        mitad = (inf + sup) / 2;
        while (inf <= sup && i < arreglo.length) {
            if (arreglo[mitad] == dato) {
                bypass = true;
                break; //Se rompe el ciclo ya que se encontro el valor en la posicion MITAD
            }
            if (arreglo[mitad] > dato) {
                //Refrescamos los valores
                sup = mitad;
                mitad = (inf + sup) / 2;
            }
            if (arreglo[mitad] < dato) {
                //Refrescamos los valores
                inf = mitad;
                mitad = (inf + sup) / 2;
            }
            i++;
        }
        //CONFIRMACION DE BUSQUEDA
        if (bypass == true) {
            JOptionPane.showMessageDialog(null, "El numero a sido encontrado en la posicion: " + mitad);
        } else {
            JOptionPane.showMessageDialog(null, "El numero no esta en el arreglo");
        }

    }

}
