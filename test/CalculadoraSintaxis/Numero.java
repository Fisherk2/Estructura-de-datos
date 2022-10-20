/*
 * NOMBRE: Fisher
 * FECHA: 28/05/22
 * PROYECTO: ED2022
 */
package CalculadoraSintaxis;

/**
 * Subclase que determina las propiedades de los numero enteros.
 *
 * @author Fisherk2
 */
public class Numero extends Calculo {

    private final String STR_NUMERO;
    private final int VALOR, POS_CHAR;//La posicion donde se encuentra el caracter del CALCULO
    private boolean esNumero;

    public Numero(String entrada, int posChar) {
        super(entrada);
        esNumero = true;
        VALOR = verificarEntrada(entrada);
        STR_NUMERO = entrada;
        POS_CHAR = posChar;
    }

    /**
     * Metodo que verifica si la entrada es un valor numerico o no.
     *
     * @param entrada Un caracter cualquiera en String.
     * @return Valor numerico del caracter ingresado, si no es un numero, por
     * defecto sera -1.
     */
    private int verificarEntrada(String entrada) {
        int valorReal;
        try {
            valorReal = Integer.parseInt(entrada);//Convertimos la entrada en un valor numerico entero.
        } catch (NumberFormatException errorNUM) {
            System.err.println(POS_CHAR + ".- No es un numero: " + errorNUM);
            valorReal = -1; //Si se ingresa un caracter no numero, por default le damos un valor de -1
            esNumero = false;
        }
        return valorReal;
    }

    public String getSTR_NUMERO() {
        return STR_NUMERO;
    }

    public int getVALOR() {
        return VALOR;
    }

    public boolean isNumero() {
        return esNumero;
    }

    //ESTE METODO SE SOBREESCRIBIO PARA MODIFICAR EL CONTAINS() YA QUE ESTE COMPARA OBJETOS REFERENCIADOS Y NO SUS CONTENIDOS
    @Override
    public boolean equals(Object object) {
        if (object != null && object.getClass() == this.getClass()) {
            if (this.VALOR == ((Numero) object).VALOR) {
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
        return "\n-Entrada inicial: " + STR_NUMERO
                + "\nValor: " + VALOR
                + "\nPosicion del calculo: " + POS_CHAR
                + "\n¿Es un numero?: " + esNumero;
    }

}
