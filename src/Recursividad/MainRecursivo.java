/*
 * NOMBRE: Fisher
 * FECHA: 4/03/22
 * PROYECTO: ED2022
 */
package Recursividad;

/**
 * Ejemplos de recursividad.
 *
 * @author Fisherk2
 */
public class MainRecursivo {

    public static void main(String[] rcsvd) {
        new MainRecursivo().imprimir("Fisher");
        System.out.println(new MainRecursivo().factorial(4));
        System.out.println(new MainRecursivo().potencia(2, 4));

        for (int i = 1; i <= 10; i++) {// 1 al 10
            int r = new MainRecursivo().fibonacci(i);
            System.out.println(i+" - "+ r);
        }
    }

    /**
     * Metodo que imprime una cadena de texto sustrayendo caracter por caracter.
     *
     * @param texto
     */
    private void imprimir(String texto) {
        if (texto != null && texto.length() > 0) {
            System.out.println(texto.charAt(0));//Con salto de linea para notar que se estan imprimiento los caracteres
            imprimir(texto.substring(1, texto.length()));//Se recorre un caracter hasta que texto sea nulo
        }
    }

    /**
     * Metodo que imprime un numero factorial.
     *
     * @param num
     * @return El factorial de un numero n!.
     */
    private int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1); //Se vuelve a multiplicar por el numero - 1
        }
    }

    /**
     * Metodo que imprime un numero elevado a n.
     *
     * @param a
     * @param n
     * @return La potencia de un numero n
     */
    private int potencia(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            return a * potencia(a, n - 1); //Se multiplica asi mismo por un n veces hasta llegar a cero
        }
    }

    /**
     * Metodo que calcula el valor en la secuencia de fibonacci ingresado en el parametro.
     * @param n
     * @return Valor en la iteraccion ingresada.
     */
    private int fibonacci(int n) {
        if (n==1) {
            return 0;
        }else if (n==2) {
            return 1;
        }else {
            return fibonacci(n-1)+fibonacci(n-2); //Comienza a sumar a partir del segundo y tercer resultado
        }
    }
}
