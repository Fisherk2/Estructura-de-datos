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
public class Simbolo extends Calculo {

    private final String STR_SIMBOLO;
    private final int PROPOSITO, POS_CHAR;//La posicion donde se encuentra el caracter del CALCULO
    private boolean esSimbolo;

    public Simbolo(String entrada, int posChar) {
        super(entrada);
        esSimbolo = true;
        PROPOSITO = verificarEntrada(entrada);
        STR_SIMBOLO = entrada;
        POS_CHAR = posChar;
    }

    /**
     * Metodo que verifica si la entrada es un simbolo numerico o no.
     *
     * @param entrada Un caracter cualquiera en String.
     * @return Funcion del simbolo ingresado, si no es simbolo, sera -1.
     */
    private int verificarEntrada(String entrada) {
        switch (entrada) {
            case ".":
                return 0;
            case ",":
                return 1;
            case "^":
                return 2;
            case "(":
                return 3;
            case ")":
                return 4;
            case "[":
                return 5;
            case "]":
                return 6;
            case "{":
                return 7;
            case "}":
                return 8;
            default:
                System.err.println(POS_CHAR + ".- No es un simbolo");
                esSimbolo = false;
                return -1;//Si se ingresa un caracter que no sea un operador, por default le damos un valor de -1
        }
    }

    public String getSTR_SIMBOLO() {
        return STR_SIMBOLO;
    }

    public int getPROPOSITO() {
        return PROPOSITO;
    }

    public boolean isSimbolo() {
        return esSimbolo;
    }

    //ESTE METODO SE SOBREESCRIBIO PARA MODIFICAR EL CONTAINS() YA QUE ESTE COMPARA OBJETOS REFERENCIADOS Y NO SUS CONTENIDOS
    @Override
    public boolean equals(Object object) {
        if (object != null && object.getClass() == this.getClass()) {
            if (this.PROPOSITO == ((Simbolo) object).PROPOSITO) {
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
        return "\nEntrada inicial: " + STR_SIMBOLO
                + "\nProposito: " + PROPOSITO
                + "\nPosicion del calculo: " + POS_CHAR
                + "\n¿Es un simbolo?: " + esSimbolo;
    }
}
