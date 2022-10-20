/*
 * NOMBRE: Fisher
 * FECHA: 24/03/22
 * PROYECTO: ED2022
 */
package Filas;

import javax.swing.JOptionPane;

/**
 * Clase que genera y prueba el funcionamiento de las filas (FIFO)
 *
 * @author Fisherk2
 */
public class mainQueue {

    public static void main(String[] fila) {

        Queue filaPrueba = new Queue();
        String info;

        while ((info=JOptionPane.showInputDialog("Ingrese elemento entrante de la fila")) != null) {
            filaPrueba.entrarFila(info);
        }

        if (filaPrueba.tamaño() > 0) {
            System.out.println("Se ingresaron " + filaPrueba.tamaño() + " elementos en la fila");
            System.out.println("El primero en entrar fue: " + filaPrueba.primeroFila().informacion);
            System.out.println("El ultimo en entrar fue: " + filaPrueba.ultimoFila().informacion);

            System.out.println("Lo que contiene la fila es: ");
            while (!filaPrueba.estaVacio()) {
                System.out.println(filaPrueba.salirEnOrdenFila().informacion);
            }
        }

    }

}
