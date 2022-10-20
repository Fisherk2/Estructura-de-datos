/*
 * NOMBRE: Fisher
 * FECHA: 28/05/22
 * PROYECTO: ED2022
 */
package CalculadoraSintaxis;

/**
 * Clase principal que prueba las clases de la sintaxis de una calculadora
 * sencilla.
 *
 * @author Fisherk2
 */
public class MainCalculadora {

    public static void main(String[] compilator) {
        new MainCalculadora().run();
//        new MainCalculadora().probarSintaxisSimple();
    }

    private void run() {
        new MenuCalculadora().setVisible(true);
    }

    private void probarSintaxisSimple() {
        
    }

}
