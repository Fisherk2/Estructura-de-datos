/*
 * NOMBRE: Fisher
 * FECHA: 27/03/22
 * PROYECTO: ED2022
 */
package Linea;

/**
 *
 * @author Fisherk2
 */
public class MainLinea {

    public static void main(String[] args) {
        Line retas = new Line();
        
        retas.in("Gerardo", "Nestor", "Daniel");
        retas.in("Alberto", "Camilo", "Arnoldo");
        
        //Busqueda que nos arrojara un boolean
        System.out.println(retas.search("Arnoldo", "Camilo", "Alberto")); 
        
        //Vacia toda la fila
        while (retas.inicio != null) {
            Memoria temp = retas.out();
            System.out.println(temp.info + ", " + temp.derecha.info + ", " + temp.derecha.derecha.info);
        }

    }

}
