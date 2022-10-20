/*
 * NOMBRE: Fisher
 * FECHA: 28/05/22
 * PROYECTO: ED2022
 */
package CalculadoraSintaxis;

/**
 * Super clase que contiene los elementos de una operacion numerica.
 *
 * @author Fisherk2
 */
public class Calculo {

    protected final String OPERACION;
    protected final int N_CHAR;

    public Calculo(String entrada) {
        OPERACION = entrada;
        N_CHAR = OPERACION.length(); //Contamos el numero de caracteres de la operacion entrante.
    }

    @Override
    public String toString() {
        return "\nOPERACION=" + OPERACION + "\n Numero de caracteres=" + N_CHAR;
    }

}
