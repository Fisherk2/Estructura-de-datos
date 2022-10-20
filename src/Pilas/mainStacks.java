/*
 * NOMBRE: Fisher
 * FECHA: 23/03/22
 * PROYECTO: ED2022
 */
package Pilas;

/**
 * Clase que genera y prueba las pilas
 *
 * @author Fisherk2
 */
public class mainStacks {

    public static void main(String[] args) {
        Estatica torreDisco = new Estatica(3);
        torreDisco.push("Disco 1");
        torreDisco.push("Disco 2");
        torreDisco.push("Disco 3");
        
        while (!torreDisco.estaVacia()) {            
            System.out.println(torreDisco.pop());
        }
    }

}
