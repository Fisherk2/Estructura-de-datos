package Colecciones;

import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 * Clase que implementa una clase interface generica Comparator que nos servira
 * para usar correctamente la clase Collections y sus metodos, enviamos como
 * argumento de esta clase generica la clase Persona, que es la misma que el de
 * nuestra lista
 *
 * @author Fisher
 */
public class ComparatorListas implements Comparator<Persona> {

    //DECLARAMOS LOS METODOS ABSTRACTOS QUE NECESITAMOS PARA ORDENAR NUESTROS OBJETOS DE LA LISTA
    @Override
    public int compare(Persona sujeto1, Persona sujeto2) {
        //VER EJERCICIO DE METODO BURBUJA, Devolvera positivo si sujeto1>sujeto2, caso contrario seria negativo, y si son iguales, seria cero.
        int respuesta = 0;
        //ORDENARA OBJETOS POR EDAD
        if (sujeto1.getEdad() > sujeto2.getEdad()) {
            respuesta = 1;
        } else if (sujeto1.getEdad() < sujeto2.getEdad()) {
            respuesta = -1;
        } else {
            respuesta = 0;
        }
        //ORDENARA OBJETOS POR NOMBRE
//        respuesta = sujeto1.getNombre().compareTo(sujeto2.getNombre()); 

        return respuesta;
    }
}
