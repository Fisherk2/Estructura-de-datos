/*
 * NOMBRE: Fisher
 * FECHA: 16/03/22
 * PROYECTO: ED2022
 */

package Nodos;

/**
 * Clase que representa un objeto abstracto, en este caso, un nodo sencillo
 * @author Fisherk2
 */
public class Nodo {
    String informacion;
    Nodo siguiente;
    
    public Nodo(String info){
        informacion=info;
        siguiente=null; //Indica que el objeto de adelante no existe, a menos que se instancie el siguiente (OPCIONAL DECLARARLO)
    }

    public String getInformacion() {
        return informacion;
    }
    
}
