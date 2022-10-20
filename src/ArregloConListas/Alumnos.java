/*
 * NOMBRE: Fisher
 * FECHA: 11/02/22
 * PROYECTO: ED2022
 */
package ArregloConListas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Fisher
 */
public class Alumnos {

    private List listaAsistencia[]; //Es un arreglo que contiene listas

    /**
     * Constructor que instancia un arreglo con una lista por espacio de
     * memoria.
     */
    public Alumnos() {
        listaAsistencia = new List[27]; //Declaramos los espacios de memoria que debe tener el arreglo por letra del abecedario latino
        for (int i = 0; i < listaAsistencia.length; i++) {
            listaAsistencia[i] = new ArrayList(); //Declaramos un objeto (ArrayList) por cada espacio de memoria del arreglo
        }

    }

    /**
     * Metodo que agrega nombres a las listas de acuerdo a la posicion de la
     * primer letra del nombre ingresado, A= 0, B= 1...
     *
     * @param nombre
     */
    private void agregarNombre(String nombre) {
        int posicion = nombre.charAt(0) - 'A'; //Sacamos el valor numerico del primer caracter con respecto al codigo ASCII
        listaAsistencia[posicion].add(nombre); //Agregamos el nombre a la lista en el espacio de memoria dependiendo del primer caracter del nombre
    }

    /**
     * Metodo que imprime la lista de nombres de la letra que desea buscar
     *
     * @param posicion
     */
    private void impresion(int posicion) {
        for (int i = 0; i < listaAsistencia[posicion].size(); i++) { //Ciclo que termina cuando pasa por todos los elementos de la lista
            System.out.println(listaAsistencia[posicion].get(i)); //Imprime los nombres que estan en la posicion indicada del parametro del metodo
        }
    }

    /**
     * Interfaz de opciones que el usuario debe ingresar.
     */
    public void interfaz() {
        String[] opcion = new String[]{"Agregar", "Imprimir"};
        String[] abecedario = new String[]{
            "A", "B", "C",
            "D", "E", "F",
            "G", "H", "I",
            "J", "K", "L",
            "M", "N", "Ñ",
            "O", "P", "Q",
            "R", "S", "T",
            "U", "V", "W",
            "X", "Y", "Z",};
        int seleccion;
        //Programa termina cuando no se presiona ninguno de los dos botones de la seleccion
        do {
            seleccion = JOptionPane.showOptionDialog(null, "¿Que desea hacer?", "MENU PRINCIPAL", -1,
                    JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]);
            switch (seleccion) {
                case 0:
                    agregarNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre", "AGREGAR NOMBRE",
                            JOptionPane.INFORMATION_MESSAGE));
                    break;
                case 1:
                    String strPosicion = (String) JOptionPane.showInputDialog(null, "¿Que lista desea imprimir?", "IMPRIMIR LISTA",
                            JOptionPane.QUESTION_MESSAGE, null, abecedario, abecedario[0]);
                    impresion(strPosicion.charAt(0) - 'A'); //Mandamos el valor de la letra seleccionada al metodo impresion
                    break;
            }
        } while (seleccion >= 0 && seleccion <= 1);

    }
}
