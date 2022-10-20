/*
 * NOMBRE: Fisher
 * FECHA: 27/03/22
 * PROYECTO: ED2022
 */
package Linea;

/**
 * Clase que guarda lineas de texto con estructura de datos en Filas (Queue).
 *
 * @author Fisherk2
 */
public class Line {

    Memoria inicio, fin;

    Line() {
        inicio = fin = null;
    }

    /**
     * Constructor que pasa como argumento tres cadenas de texto, cada uno
     * asignado a su nodo correspondiente.
     *
     * @param i1
     * @param i2
     * @param i3
     */
    void in(String i1, String i2, String i3) {
        Memoria m1 = new Memoria(i1),
                m2 = new Memoria(i2),
                m3 = new Memoria(i3);

        m1.derecha = m2; //m1-m2
        m2.derecha = m3; //m1-m2-m3

        if (inicio == null) { //Rango de valores iniciales cuando no hay memoria
            inicio = m1;
            fin = m3;
        } else { //Rango de valores cuando ya hay valores en la memoria
            fin.derecha = m1;
            fin = m3;
        }
    }

    Memoria out() {
        if (inicio == null) {
            return null;
        } else {
            Memoria m1 = new Memoria(inicio.info),
                    m2 = new Memoria(inicio.derecha.info),
                    m3 = new Memoria(inicio.derecha.derecha.info);
            //Se recorre los espacios de memoria
            m1.derecha = m2;
            m2.derecha = m3;
            inicio = inicio.derecha.derecha.derecha;
            return m1; //Sacara de la fila el primer valor que estaba en ella

        }
    }

    boolean search(String i1, String i2, String i3) {
        Memoria temp = inicio;

        while (temp != null) {
            String text = temp.info + temp.derecha.info + temp.derecha.derecha.info;
            if (text.contains(i1) && text.contains(i2) && text.contains(i3)) {
                return true;
            } else {
                temp = temp.derecha.derecha.derecha;//Se van buscando nodos de 3 en 3
            }
        }
        return false;
    }
}
