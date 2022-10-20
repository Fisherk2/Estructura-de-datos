/*
 * NOMBRE: Fisher
 * FECHA: 15/05/22
 * PROYECTO: ED2022
 */
package AdivinaPalabra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase que almacena el banco de palabras de un fichero de texto
 *
 * @author Fisherk2
 */
public class BancoPalabras {

    private File ficheroPalabras;
    private String palabra;
    private int numPalabras;

    public BancoPalabras() {
        creacionFichero();
        existeFichero();
        lecturaContenido();
        palabra = asignacionAleatoria(numPalabras);
    }

    /**
     * Metodo que verifica la existencia del Banco de Palabras
     */
    private void existeFichero() {
        if (ficheroPalabras.exists()) {//Si el archivo existe, enviara un mensaje
            System.out.println("El Fichero con banco de palabras existe");
            System.out.println("\nLA RUTA DE TU ARCHIVO SE ENCUENTRA AQUI:\n" + ficheroPalabras.getAbsolutePath());
            System.out.println("Este archivo se puede leer?: " + ficheroPalabras.canRead());

        } else {
            System.err.println("NO EXISTE FICHERO, PORFAVOR ENCUENTRE O CREE UN ARCHIVO DE TEXTO CON EL NOMBRE 'bancoPalabras.txt' EN LA SIGUIENTE RUTA:");
            System.err.println(ficheroPalabras.getAbsolutePath());
        }
    }

    private void creacionFichero() {
        try {
            ficheroPalabras = new File("C:\\Users\\msi\\Desktop\\ITL\\Cursos de programacion\\Ficheros\\bancoPalabras.txt");
            if (ficheroPalabras.createNewFile()) {//Si el archivo a sido creado, enviara un mensaje
                System.out.println("\n---------------------------\n"
                        + "El archivo se ha creado exitosamente");
            }
        } catch (IOException ex) {
            System.err.println("NO SE PUDO CREAR EL ARCHIVO " + ex);
        }
    }

    private void lecturaContenido() {
        numPalabras = conteoPalabras();
    }

    /**
     * Metodo que detecta y cuenta cuantas palabras tiene el fichero
     *
     * @return
     */
    private int conteoPalabras() {
        String detector;
        int numLineas = 0;
        //Se encapsula en un bloque Try Catch porque puede lanzar IO Exceptions
        try {
            FileReader lector = new FileReader(ficheroPalabras);
            BufferedReader lectura = new BufferedReader(lector);

            System.out.println("PALABRAS DENTRO DEL FICHERO:");
            detector = lectura.readLine(); //Leera la primer linea que se encuentra en el fichero hasta que llegue a un null
            if (detector == null) { //SI NO HAY PALABRAS EN EL FICHERO
                System.out.println("NO HAY PALABRAS EN EL FICHERO");
            } else { //SI TIENE POR LO MENOS UNA PALABRA.
                while (detector != null) {//Si no hay vacios en nuestro archivos, entonces se tiene que seguir leyendo el archivo
                    System.out.println("\n" + (numLineas+1) + ".-" + detector);
                    detector = lectura.readLine(); //Volvera a leer la siguiente linea hasta encontrar con un vacio
                    numLineas++;
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println("ERROR, NO SE PUEDE ENCONTRAR EL ARCHIVO " + ex);
        } catch (IOException ex) {
            System.err.println("ERROR, NO SE PUEDE LEER EL ARCHIVO " + ex);
        }
        System.out.println("\nNUMERO DE PALABRAS DENTRO DEL FICHERO: "+numLineas);
        return numLineas;
    }

    /**
     * Metodo que selecciona una palabra aleatorio del Banco de palabras
     *
     * @param tamaño numero de palabras que contiene el Banco de palabras
     * @return Una linea del Fichero 'bancoPalabras.txt'
     */
    private String asignacionAleatoria(int tamaño) {
        String palabraAleatoria = "";
        int aleatorio = (int) (Math.random() * tamaño);//Generamos un numero aleatorio del 0 al numero de palabras

        System.out.println("\nPALABRA ESCOGIDA AL AZAR: ");
        try {
            FileReader lector = new FileReader(ficheroPalabras);
            BufferedReader lectura = new BufferedReader(lector);

            for (int i = 0; i < tamaño; i++) {
                if (aleatorio == i) {//LA LINEA QUE COINCIDA CON ALEATORIO SE ALMACENARA
                    palabraAleatoria = lectura.readLine();
                    if (palabraAleatoria == null) {
                        System.err.println("ERROR, NO EXISTE PALABRA EN LA POSICION " + aleatorio);
                    }
                } else {
                    lectura.readLine();//Pasara a la siguiente linea
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println("ERROR, NO SE PUEDE ENCONTRAR EL ARCHIVO " + ex);
        } catch (IOException ex) {
            System.err.println("ERROR, NO SE PUEDE LEER EL ARCHIVO " + ex);
        }

        System.out.print(palabraAleatoria + "\n");
        return palabraAleatoria;
    }

    /**
     * Metodo que selecciona una palabra aleatoria.
     */
    public void setPalabraRandom() {
        palabra = asignacionAleatoria(numPalabras);
    }

    public String getPalabra() {
        return palabra;
    }

}
