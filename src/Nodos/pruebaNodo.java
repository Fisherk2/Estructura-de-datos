/*
 * NOMBRE: Fisher
 * FECHA: 23/03/22
 * PROYECTO: ED2022
 */

package Nodos;

/**
 * Clase que crea y prueba la funcion de un Nodo sencillo
 * @author Fisherk2
 */
public class pruebaNodo {

    public static void main(String[] nods) {
        Nodo demo = new Nodo("Mensaje");
        System.out.println(demo.informacion);
        
        Nodo sujeto = new Nodo("Fisher"); //Fisher
        sujeto.siguiente=new Nodo("Alberto"); //Fisher - Alberto
        sujeto.siguiente.siguiente = new Nodo("Zuñiga"); //Fisher - Alberto - Zuñiga
        sujeto.siguiente.siguiente.siguiente= new Nodo("Gomez"); //Fisher - Alberto - Zuñiga - Gomez
        
        Nodo temporal = sujeto;
        
        while (temporal!=null) {
            System.out.println(temporal.getInformacion());
            temporal = temporal.siguiente; //Pasamos al siguiente nodo
        }
        
    }

}
