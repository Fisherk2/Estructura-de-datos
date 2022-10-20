/*
 * NOMBRE: Fisher
 * FECHA: 28/05/22
 * PROYECTO: ED2022
 */
package CalculadoraSintaxis;

import Colecciones.NodoGen;
import Colecciones.Pila;

/**
 * Subclase que realiza la sintaxis de una calculadora sencilla.
 *
 * @author Fisherk2
 */
public class SyntaxSencillo extends Sintaxis {

    public SyntaxSencillo(String entradaSencilla) {
        super(entradaSencilla);
        cargarOperadores();
        cargarSimbolos();
        cargarPilaConEntrada();
    }

    /**
     * Metodo que disecciona en caracteres la entrada de sintaxis sencilla y lo
     * almacena a la pila de entrada.
     */
    private void cargarPilaConEntrada() {
        String[] diseccion = STR_ENTRADA.split("");
        for (int i = 0; i < diseccion.length; i++) {
            num = new Numero(diseccion[i], i);
            op = new Operador(diseccion[i], i);
            symb = new Simbolo(diseccion[i], i);

            if (num.isNumero()) {
                ENTRY_STACK.push(new NodoGen<>(num));
            } else if (op.isOperador()) {
                ENTRY_STACK.push(new NodoGen<>(op));
            } else if (symb.isSimbolo()) {
                ENTRY_STACK.push(new NodoGen<>(symb));
            } else {
                estaBienEscrito = false;
            }
        }
    }

    /**
     * Metodo que determina los operadores aritmeticos legales que se deben
     * encontrar en una operacion matematica.
     */
    private void cargarOperadores() {
        conjOperadores.agregar(new NodoGen<>(new Operador("+", -1))); //Agregamos la adicion
        conjOperadores.agregar(new NodoGen<>(new Operador("-", -1))); //Agregamos la sustraccion
        conjOperadores.agregar(new NodoGen<>(new Operador("*", -1))); //Agregamos la multiplicacion
        conjOperadores.agregar(new NodoGen<>(new Operador("x", -1))); //Agregamos la multiplicacion
        conjOperadores.agregar(new NodoGen<>(new Operador("X", -1))); //Agregamos la multiplicacion
        conjOperadores.agregar(new NodoGen<>(new Operador("/", -1))); //Agregamos la division
    }

    /**
     * Metodo que determina los simbolos disponibles para realizar una operacion
     * matematica.
     */
    private void cargarSimbolos() {
        conjSimbolos.agregar(new NodoGen<>(new Simbolo(".", -1))); //Agregamos el punto
        conjSimbolos.agregar(new NodoGen<>(new Simbolo(",", -1))); //Agregamos la coma
        conjSimbolos.agregar(new NodoGen<>(new Simbolo("^", -1))); //Agregamos el exponente de un numero
        conjSimbolos.agregar(new NodoGen<>(new Simbolo("(", -1))); //Agregamos el parentesis apertura
        conjSimbolos.agregar(new NodoGen<>(new Simbolo(")", -1))); //Agregamos el parentesis de cierre
        conjSimbolos.agregar(new NodoGen<>(new Simbolo("[", -1))); //Agregamos el corchete de apertura
        conjSimbolos.agregar(new NodoGen<>(new Simbolo("]", -1))); //Agregamos el corchete de cierre
        conjSimbolos.agregar(new NodoGen<>(new Simbolo("{", -1))); //Agregamos la llave de apertura
        conjSimbolos.agregar(new NodoGen<>(new Simbolo("}", -1))); //Agregamos la llave de cierre
    }

    @Override
    public String toString() {
        return "Entrada: " + STR_ENTRADA;
    }

    @Override
    public int getNumCaracteres() {
        return NUM_CARACTERES;
    }

    @Override
    public String getRespuesta() {
        if (estaBienEscrito) {
            return "Puede calcularse tu operacion aritmetica";
        }

        return "SYNTAX ERROR, vuelva a ingresar una operacion aritmetica correcta";
    }

}
