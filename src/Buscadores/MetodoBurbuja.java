/*
Ordenamientos: Metodo burbuja
 */
package Buscadores;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MetodoBurbuja {

    public static void main(String[] args) {
        MetodoBurbuja burbuja = new MetodoBurbuja();
        //METODO BURBUJA CON NUMEROS
        burbuja.metodoBurbuja();
        //METODO BURBUJA CON STRINGS
        burbuja.metodoBurbujaStrings();
    }

    public void metodoBurbuja() {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, aux;//Se crea el arreglo y el numero de elementos del arreglo

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));
        arreglo = new int[nElementos]; //Le asignamos el numero de elementos al arreglo

        for (int i = 0; i < nElementos; i++) {//Pedimos los numeros al usuario
            System.out.print((i + 1) + ".- Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        //Metodo de burbuja
        for (int i = 0; i < nElementos - 1; i++) {//Porque solo se tratan con numeros antes del ultimo, ya que este no tiene siguiente
            for (int j = 0; j < nElementos - 1; j++) {//Sirve para ordenar y acomodar el arreglo
                if (arreglo[j] > arreglo[j + 1]) {//Si numeroACTUAL > numeroSiguiente
                    aux = arreglo[j]; //Se guarda momentaneamente antes de cambiar al siguiente
                    arreglo[j] = arreglo[j + 1]; //Se intercambia al anterior
                    arreglo[j + 1] = aux; //Se guarda el valor respaldado al siguiente
                }
            }
        }

        //Imprimir los resultados del arreglo de forma creciente y decreciente
        System.out.println("\nARREGLO ORDENADO EN FORMA CRECIENTE");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println("\nARREGLO ORDENADO EN FORMA DECRECIENTE");
        for (int i = nElementos - 1; i >= 0; i--) {//Porque llega de 0 a 4
            System.out.print(arreglo[i] + " - ");
        }
    }

    private void metodoBurbujaStrings() {
        Scanner teclado = new Scanner(System.in);
        String[] nombres;
        int nElementos;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("INGRESE NUMERO DE NOMBRES POR ACOMODAR"));
        nombres = new String[nElementos]; //DECLARAMOS EL NUMERO DE ELEMENTOS DE NUESTRO ARREGLO
        //ENTRADA DE DATOS
        for (int i = 0; i < nElementos; i++) {
            System.out.print((i + 1) + ".- ESCRIBA UN NOMBRE: ");
            nombres[i] = teclado.next();
        }
        //IMPRESION DE FORMA DESORDENADA
        System.out.println("__________________________________\n"
                + "El arreglo de forma desordenada: ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " ");
        }
        System.out.println("__________________________________\n");

        //METODO BURBUJA CON STRINGS
        String aux;
        for (int i = 0; i < nElementos - 1; i++) {//Porque solo se tratan con Strings antes del ultimo, ya que este no tiene siguiente
            for (int j = 0; j < nElementos - 1; j++) {
                /*
                El metodo String.compareTo() devuelve un entero, si es 0, significa que las cadenas tienen el mismo valor hexagesimal, en cambio si es mayor a cero, 
                significa que el primero es una cadena con valor hexagesimal mayor (osea que en orden alfabetico va despues), caso contrario si es menor a cero
                significa que el primero es una cadena con valor hexagesimal menor (osea que en order alfabetico va primero o antes).
                 */
                if (nombres[j].compareTo(nombres[j + 1]) > 0) {//Estamos comparando el primer String con el segundo, por lo tanto si StringACTUAL > StringSiguiente
                    aux = nombres[j]; //Se guarda momentaneamente antes de cambiar al siguiente
                    nombres[j] = nombres[j + 1]; //Se intercambia al anterior
                    nombres[j + 1] = aux; //Se guarda el valor respaldado al siguiente
                }
            }
        }

        //Imprimir los resultados del arreglo de forma creciente y decreciente
        System.out.println("\nARREGLO ORDENADO EN FORMA CRECIENTE");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(nombres[i] + " - ");
        }
        System.out.println("\nARREGLO ORDENADO EN FORMA DECRECIENTE");
        for (int i = nElementos - 1; i >= 0; i--) {//Porque llega de 0 a 4
            System.out.print(nombres[i] + " - ");
        }
    }

}
