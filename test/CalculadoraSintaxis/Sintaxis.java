/*
 * NOMBRE: Fisher
 * FECHA: 28/05/22
 * PROYECTO: ED2022
 */
package CalculadoraSintaxis;

import Colecciones.Coleccion;
import Colecciones.NodoGen;
import Colecciones.Pila;

/**
 * Super Clase que contiene los atributos y metodos necesarios para realizar una
 * sintaxis de calculadoras.
 *
 * @author Fisherk2
 */
public class Sintaxis {

    protected final Calculo EXPRESION;
    protected final Pila<Calculo> ENTRY_STACK;
    protected final int NUM_CARACTERES;
    protected final String STR_ENTRADA;
    protected Numero num;
    protected Operador op;
    protected Simbolo symb;
    protected Coleccion<Numero> conjNumeros; //numeros del 0 al 9
    protected Coleccion<Operador> conjOperadores;//n numero de operadores
    protected Coleccion<Simbolo> conjSimbolos;//n numero de simbolos
    protected boolean estaBienEscrito;

    public Sintaxis(String entrada) {
        cargarNumerosEnteros();
        estaBienEscrito = true; //Estara correcto por defecto hasta que se demuestre lo contrario
        EXPRESION = new Calculo(entrada);
        NUM_CARACTERES = EXPRESION.N_CHAR;
        STR_ENTRADA = EXPRESION.OPERACION;
        ENTRY_STACK = new Pila<>();
    }

    @Override
    public String toString() {
        return EXPRESION.toString();
    }

    public int getNumCaracteres() {
        return NUM_CARACTERES;
    }

    public String getRespuesta() {
        return "Aqui recibiras una confirmacion dependiendo de la sintaxis instanciada";
    }

    /**
     * Metodo que determina el conjunto de valores enteros que se deben
     * encontrar en una operacion matematica
     */
    private void cargarNumerosEnteros() {
        for (int i = 0; i < 10; i++) {
            String numero = String.valueOf(i);// Convertimos los valores de las iteraciones en cadenas.
            conjNumeros.agregar(new NodoGen<>(new Numero(numero, -1))); //Cargamos al conjunto numeros enteros del 0 al 9
        }
    }

}
