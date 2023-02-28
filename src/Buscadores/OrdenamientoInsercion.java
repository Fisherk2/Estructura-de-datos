/*
Ordenamiento por insercion
 */
package Buscadores;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class OrdenamientoInsercion {

    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
          int arreglo [],nElementos,pos,aux;
          
          nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de elementos del arreglo"));
          
          arreglo = new int [nElementos];
          
          System.out.println("Rellene el arreglo");
          for (int i = 0; i < nElementos; i++) {
              System.out.print((i+1)+".- Inserte su numero: ");
              arreglo[i] = entrada.nextInt();
        }
          //Ordenamiento por insercion
          for (int i = 0; i < nElementos; i++) {
            pos = i; //Posicion de la flecha
            aux = arreglo[i]; //El respaldo del primer valor
            
              while ((pos>0)&&(arreglo[pos-1]>aux)) { //Nuestro numero a la izquierda sea mayor al numero actual, saltar si nuestro numero esta en posicion 0 ya que no tiene izquierda                  
                  arreglo[pos] = arreglo[pos-1];
                  pos--;//Es para que cuando llegue a cero, termine de hacer el cambio de valores
              }
              arreglo[pos] = aux; //Se refresca (actualiza) el numero de la posicion
        }
          //Impresion en forma ascendente y descendente
          System.out.println("\nORDEN ASCEDENTE: ");
          for (int i = 0; i < nElementos; i++) {
              System.out.print(arreglo[i]+" - ");
        }
          System.out.println("\nORDEN DESCENDENTE: ");
          for (int i = nElementos-1; i >=0; i--) {//Se cuenta del 0 a 4
              System.out.print(arreglo[i]+" - ");
        }
    }
    
}
