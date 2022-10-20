/*
 * NOMBRE: Fisher
 * FECHA: 15/05/22
 * PROYECTO: ED2022
 */
package AdivinaPalabra;

/**
 * Clase para probar el juego WORD GUESS
 * estructurados
 *
 * @author Fisherk2
 */
public class MainWG {

    public static void main(String[] wg) {
        new MainWG().pruebaSet();
    }

    private void pruebaSet() {
        new MenuJuego().setVisible(true); //VENTANA DEL MENU DEL JUEGO
    }

}
