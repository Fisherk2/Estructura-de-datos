/*
 * NOMBRE: Fisher
 * FECHA: 28/05/22
 * PROYECTO: ED2022
 */
package CalculadoraSintaxis;

/**
 * Subclase que determina las propiedades de los operadores aritmeticos.
 *
 * @author Fisherk2
 */
public class Operador extends Calculo {

    private final String STR_OPERADOR;
    private final int FUNCION, POS_CHAR;//La posicion donde se encuentra el caracter del CALCULO
    private boolean esOperador;

    public Operador(String entrada, int posChar) {
        super(entrada);
        esOperador = true;
        FUNCION = verificarEntrada(entrada);
        STR_OPERADOR = entrada;
        POS_CHAR = posChar;
    }

    /**
     * Metodo que verifica si la entrada es un operador numerico o no.
     *
     * @param entrada Un caracter cualquiera en String.
     * @return Funcion del operador ingresado, si no es un operador, sera -1.
     */
    private int verificarEntrada(String entrada) {
        switch (entrada) {
            case "+":
                return 0;
            case "-":
                return 1;
            case "x":
                return 2;
            case "X":
                return 2;
            case "*":
                return 2;
            case "/":
                return 3;
            default:
                System.err.println(POS_CHAR + ".- No es un operador");
                esOperador = false;
                return -1;//Si se ingresa un caracter que no sea un operador, por default le damos un valor de -1
        }
    }

    public String getSTR_OPERADOR() {
        return STR_OPERADOR;
    }

    public int getFUNCION() {
        return FUNCION;
    }

    public boolean isOperador() {
        return esOperador;
    }

    //ESTE METODO SE SOBREESCRIBIO PARA MODIFICAR EL CONTAINS() YA QUE ESTE COMPARA OBJETOS REFERENCIADOS Y NO SUS CONTENIDOS
    @Override
    public boolean equals(Object object) {
        if (object != null && object.getClass() == this.getClass()) {
            if (this.FUNCION == ((Operador) object).FUNCION) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "\nEntrada inicial: " + STR_OPERADOR
                + "\nFuncion: " + FUNCION
                + "\nPosicion del calculo: " + POS_CHAR
                + "\n¿Es un operador?: " + esOperador;
    }
}
