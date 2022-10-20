/*
 * NOMBRE: Fisher
 * FECHA: 15/05/22
 * PROYECTO: ED2022
 */
package AdivinaPalabra;

import java.util.HashSet;
import java.util.Set;

/**
 * Clase que bloqueara graficamente las letras utilizadas erroneamente en los
 * intentos de adivinar la palabra.
 *
 * @author Fisherk2
 */
public class Teclado {

//    private Set<Character> letrasBloqueadas;
    private Conjunto letrasBloqueadas;
    char[] arregloCaracteres;

    public Teclado() {
//        letrasBloqueadas = new HashSet<>();
        letrasBloqueadas = new Conjunto();
    }

    public void bloqTeclas(String palabraIntento, String palabraCorrecta) {
        char [] letras = palabraIntento.toLowerCase().toCharArray();
        
        //AGREGAMOS LAS LETRAS QUE NO COINCIDEN CON LA PALABRA CORRECTA
        for(char letraIntento : letras)
                if(!palabraCorrecta.contains(String.valueOf(letraIntento))){
                    letrasBloqueadas.add(letraIntento);
                }

        
    }

    public void desbloquearTeclas() {
        letrasBloqueadas.clear();
    }

//    public Set<Character> getLetrasBloqueadas() {
//        return letrasBloqueadas;
//    }
    public Conjunto getLetrasBloqueadas() {
        return letrasBloqueadas;
    }

    public char[] getArregloCaracteres() {
        if (!letrasBloqueadas.estaVacio()) {
            arregloCaracteres = new char[letrasBloqueadas.getSize()];
            for (int i = 0; i < arregloCaracteres.length; i++) {
                arregloCaracteres[i] = letrasBloqueadas.obtener(i).getLetra();//Obtenemos la letra del nodo de la posicion del iterador
            }
            return arregloCaracteres;
        }
        return arregloCaracteres = new char[]{' '};//Retorna un arreglo vacio de caracteres

    }

}
