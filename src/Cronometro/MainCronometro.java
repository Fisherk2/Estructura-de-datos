/*
 * NOMBRE: Fisher
 * FECHA: 16/02/22
 * PROYECTO: ED2022
 */
package Cronometro;

/**
 *
 * @author Fisherk2
 */
public class MainCronometro {

    public static void main(String[] tiempoEjecucion) {
        long inicio= System.currentTimeMillis(); //Inicio = 0
        int[] arreglo = new int[1_000_000];//Generamos un arreglo de espacio gigante para almacenar numeros aleatorios
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=(int)(Math.random()*1_000_000);//Generamos un numero aleatorio por cada iteracion
        }
        int contador=1;
        for (int n : arreglo) {
            System.out.println(contador+" .-"+n);
            contador++;
        }
        System.out.println("");//SALTO DE LINEA CUANDO TERMINE DE IMPRIMIR TODOS LOS NUMEROS
        
        long fin= System.currentTimeMillis();//Fin = Tiempo transcurrido en la ejecucion del codigo
        System.out.println("La impresion tardo: "+(fin-inicio)+" Milisegundos");
        
    }
    
}
