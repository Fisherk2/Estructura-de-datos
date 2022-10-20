/*
 * NOMBRE: Fisher
 * FECHA: 22/05/22
 * PROYECTO: ED2022
 */
package Colecciones;

//LOS PAQUETES ESTA EN TEST PACKAGES
import CalculadoraSintaxis.Numero;
import GoL.Celula;

/**
 * Clase que prueba los metodos de la coleccion.
 *
 * @author Fisherk2
 */
public class MainColeccion {

    public static void main(String[] args) {
//        new MainColeccion().probarColeccion();
        new MainColeccion().probarPilaDinamica();
    }

    private void probarColeccion() {
        Coleccion<Celula> celulas = new Coleccion<>();
        celulas.agregar(new NodoGen<>(new Celula(0, 0)));
        celulas.agregar(new NodoGen<>(new Celula(1, 65)));
        celulas.agregar(new NodoGen<>(new Celula(142, 56)));
        celulas.agregar(new NodoGen<>(new Celula(0, 0)));
        celulas.agregar(new NodoGen<>(new Celula(9, 1)));
        celulas.agregar(new NodoGen<>(new Celula(5, 2)));

        System.out.println(celulas);
        System.out.println("La celula " + new Celula(9, 1).toString()
                + " esta en la coleccion: " + celulas.contiene(new Celula(9, 1)));
        System.out.println("El tamaño de la coleccion es de: " + celulas.size());
        System.out.println("______________________");
        celulas.borrar(new Celula(1, 65));
        celulas.borrar(3);//[5][2]
//        celulas.remover(new Celula(1, 65));
//        celulas.remover1(new Celula(1, 65));
        System.out.println(celulas);
        System.out.println("El tamaño de la coleccion es de: " + celulas.size());
        System.out.println("Esta vacio la coleccion?: " + celulas.estaVacio());
        System.out.println("La tercer celula almacenada fue: " + celulas.obtener(2).getContenido().toString());
//        System.out.println("Buscamos la celula [9][1]: " + celulas.obtener(new Celula(9, 1)).getContenido().toString());
        System.out.println("La celula [1][65] se encuentra en la posicion: " + celulas.indiceDe(new Celula(1, 65)));
        System.out.println("_____________________");
        celulas.vaciar();
        System.out.println(celulas);
        System.out.println("Esta vacio la coleccion?: " + celulas.estaVacio());
    }

    private void probarPilaDinamica() {
        Pila<Numero> pilaDinamica = new Pila<>();

//        System.out.println(pilaDinamica.getPeek().getContenido().toString());
        pilaDinamica.push(new NodoGen<>(new Numero("0", -1)));
        pilaDinamica.push(new NodoGen<>(new Numero("1", -1)));
        pilaDinamica.push(new NodoGen<>(new Numero("2", -1)));
        pilaDinamica.push(new NodoGen<>(new Numero("3", -1)));
        pilaDinamica.push(new NodoGen<>(new Numero("4", -1)));
        pilaDinamica.push(new NodoGen<>(new Numero("5", -1)));
        pilaDinamica.push(new NodoGen<>(new Numero("6", -1)));
        pilaDinamica.push(new NodoGen<>(new Numero("7", -1)));
        pilaDinamica.push(new NodoGen<>(new Numero("8", -1)));
        pilaDinamica.push(new NodoGen<>(new Numero("9", -1)));

        System.out.println("\nEl tamaño de la pila es de: " + pilaDinamica.getTamaño());

        System.out.println("\nEl elememento que esta en el tope de la pila es: "
                + pilaDinamica.getPeek().getContenido().toString());

        System.out.println("\nEl numero 8 contiene en la pila?: "
                + pilaDinamica.contiene(new Numero("2", 45)));

        System.out.println("\nEl indice del numero 7 es: "
                + pilaDinamica.indiceDe(new Numero("7", 0)));

        System.out.println("\nLos elementos contenidos en esta pila son: " + pilaDinamica
                + "\n_____________________________________________________________________");

        System.out.println("Primer elemento borrado: " + pilaDinamica.pop().getContenido().toString());
        pilaDinamica.pop();
        pilaDinamica.pop();
        pilaDinamica.pop();

        System.out.println("\nEl tamaño de la pila es de: " + pilaDinamica.getTamaño());
        System.out.println("\nEl elememento que esta en el tope de la pila es: "
                + pilaDinamica.getPeek().getContenido().toString());

        System.out.println("\nLos elementos contenidos en esta pila son: " + pilaDinamica
                + "\n_____________________________________________________________________");

        pilaDinamica.vaciar();

        System.out.println("\nEl tamaño de la pila es de: " + pilaDinamica.getTamaño());
        System.out.println("\nEl elememento que esta en el tope de la pila es: "
                + pilaDinamica.getPeek().getContenido());

        System.out.println("\nLos elementos contenidos en esta pila son: " + pilaDinamica
                + "\n_____________________________________________________________________");
    }

}
