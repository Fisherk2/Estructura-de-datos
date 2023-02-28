package Buscadores;

import javax.swing.JOptionPane;

/*
Busqueda secuencial
 */
public class BusquedaSecuencial {

    public static void main(String[] args) {
        int arreglo[] = {3, 9, 7, 2, 3}; //Valores ya establecidos en un arreglo
        int dato; //El valor que queremos encontrar

        dato = Integer.parseInt(JOptionPane.showInputDialog("¿QUE NUMERO DESEA BUSCAR?"));

        //Busqueda Secuencial (bucle WHILE) 
        int i = 0;
        boolean byPass = false; //Es la señal de que hemos o no encontrado el valor que ingresamos en dato
        while (i < 5 && byPass == false) { //Se repetira el ciclo hasta que i supere los 5 espacios o el byPass sea verdadero   
            if (arreglo[i] == dato) { //Si nuestro valor de la posicion i es igual al dato que buscamos, activamos el byPass
                byPass = true;
            }
            i++;
        }

        if (byPass == false) {
            JOptionPane.showMessageDialog(null, "EL NUMERO QUE INGRESO NO SE ENCUENTRA EN EL ARREGLO");
        } else {
            JOptionPane.showMessageDialog(null, "EL NUMERO QUE INGRESO HA SIDO ENCONTRADO EN LA POSICION "+(i-1));//Se le resta una posicion porque al final del bucle se le suma 1 cuando avanza a la siguiente posicion
        }

    }

}
