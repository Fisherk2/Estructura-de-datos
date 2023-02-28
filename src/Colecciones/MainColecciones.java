package Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * COLECCIONES: El api de Java nos proporciona el framework de las colecciones
 * que nos permite utilizar diferentes estructuras de datos para almacenar y
 * recuperar objetos de cualquier clase. Dichas colecciones no forman parte del
 * lenguaje, sino que son clases definidas en el paquete java.util.
 *
 * @author Fisher
 */
public class MainColecciones {

    public static void main(String[] args) {
        MainColecciones navegador = new MainColecciones();

        navegador.listaDatosPrimitivos();
        navegador.listaObjetos();
        navegador.Equals_HashCode();
        navegador.Set();
        navegador.Map();

    }

    /**
     * Creacion de una lista con datos primitivos probando diferentes metodos.
     */
    private void listaDatosPrimitivos() {
        /*
        La clase List se debe importar del paquete se me menciona al principio. Hacemos un downCast para trabajar mejor con la clase ArrayList.
        Los simbolos < > de diamante significa que es de una clase generica, osea que depende mucho de que atribute le pases dentro de esos diamantes.
      
        Aqui unos cuantos metodos utiles de la clase ArrayList:
        .add( ) = añade
        .remove( ) = elimina
        .size( ) = obtiene el tamaño de la lista
        .get( posicion ) = obtiene el elemento de una posicion
        .indexOf( ) = obtiene la posicion de un elemento
        .clear( ) = elimina los elementos de toda la lista
        .isEmpty( ) = indica si esta vacia la lista
        
        Aqui unos metodos de la clase estatica Collections que puede combinarse con nuestras listas:
        Collections.sort( lista ) = ordena los elementos de una lista
        Collections.reverse( lista ) = invierte los elementos de una lista
        Colections.max( lista ) = devuelve el elemento con maximo valor
        Collections.min( lista ) = devuelve el elemento con minimo valor
         */
        List<Integer> listaDeNumeros = new ArrayList<>();
        //El metodo .add( ) sirve para agregar elementos de una lista.
        listaDeNumeros.add(1);
        listaDeNumeros.add(2);
        listaDeNumeros.add(3);//Posicion 2
        listaDeNumeros.add(4);
        //Para recorrer los valores de una lista, debemos crear un ciclo for Each (Variable temporal para recorre el ciclo : NombreLista)
        System.out.println("Elementos que se encuentran en nuestra lista: ");
        for (Integer i : listaDeNumeros) {
            System.out.print(i + "  ");
        }
        //Para quitar elementos de una lista se usa .remove( posicion )
        System.out.println("\nQuitamos el tercer elemento: ");
        listaDeNumeros.remove(2); //Quitamos el elemento de la posicion 2
        for (Integer i : listaDeNumeros) {
            System.out.print(i + "  ");
        }
        //Para ver de que tamaño es nuestra lista, se usa .size( )
        System.out.println("\nEl tamaño de la lista ahora es de " + listaDeNumeros.size());
        //Para obtener el elemento de una posicion, se debe usar .get( posicion )
        System.out.println("El elemento de la posicion 2 ahora es " + listaDeNumeros.get(2));
        //Para obtener la posicion de un elemento, se debe usar .indexOf( elemento de la posicion que quieres buscar ), si sale un valor negativo, significa que no existe tal elemento en la lista
        System.out.println("El elemento 3 se encuentra en la posicion " + listaDeNumeros.indexOf(3));
        //Para borrar todos los elementos de una lista, se usa .clear ( )
        System.out.println("Hemos limpiado la lista ahora agregaremos nuevos elementos: ");
        listaDeNumeros.clear(); //Con esto se borra todo lo que contenia la lista
        listaDeNumeros.add(33);
        listaDeNumeros.add(64);
        listaDeNumeros.add(99);
        listaDeNumeros.add(23);
        for (Integer i : listaDeNumeros) {
            System.out.print(i + "  ");
        }
        //Para ordenar de menor a mayor permanentemente, se debe declarar la clase estatica Collections que hereda de Object y usando .sort( List< T> ) ordenamos nuestros elementos
        System.out.println("\nElementos ordenados de menor a mayor: ");
        Collections.sort(listaDeNumeros);//Ordenamos ascendentemente
        for (Integer i : listaDeNumeros) {
            System.out.print(i + "  ");
        }
        //Para saber si nuestra lista esta vacia, se debe usar .isEmpty( )
        System.out.println("\n¿Nuestra lista esta vacia?: " + listaDeNumeros.isEmpty());
        //Para encontrar el elemento con mayor valor, se usa Collections.max( List < T > )
        System.out.println("El elemento mayor es: " + Collections.max(listaDeNumeros));
        //Para encontrar el elemento con menor valor, se usa Collections.min( List < T > )
        System.out.println("El elemento mayor es: " + Collections.min(listaDeNumeros));
        //Para invertir el orden de nuestros elementos, se usa Collections.reverse( List < T > )
        System.out.println("Invertimos el orden de nuestros elementos: ");
        Collections.reverse(listaDeNumeros);//Invertimos el orden en que se encontraba la lista
        for (Integer i : listaDeNumeros) {
            System.out.print(i + "  ");
        }
    }

    /**
     * Creacion de una lista con objetos probando la clase Comparator y
     * Comparable para ordenar nuestros elementos de la lista.
     */
    private void listaObjetos() {
        /*
        La clase List se debe importar del paquete se me menciona al principio. Hacemos un downCast para trabajar mejor con la clase ArrayList.
        Los simbolos < > de diamante significa que es de una clase generica, osea que depende mucho de que atributo le pases dentro de esos diamantes.
         */
        List<Persona> listaDePersonas = new ArrayList<>();
        List<Persona2> listaDePersonas2 = new ArrayList<>();

        //Agregamos un objeto instanciandolo directamente en el argumento del metodo .add( objeto ), opcionalmente puede declarar el objeto antes y agregarlo.
        listaDePersonas.add(new Persona("Fisher", "Zuñiga", "Mexico", 24, 200.5));
        listaDePersonas.add(new Persona("Alberto", "Gomez", "Chile", 22, 150.78));
        listaDePersonas.add(new Persona("Knight", "Zuñiga", "Peru", 18, 334.56));
        listaDePersonas.add(new Persona("Gaby", "Manzano", "Argentina", 25, 520.64));
        //Para recorrer los valores de una lista, debemos crear un ciclo for Each (Variable temporal para recorre el ciclo : NombreLista)
        System.out.println("Elementos que se encuentran en nuestra lista 1: ");
        for (Persona empleado : listaDePersonas) {
            System.out.println("______________________");
            System.out.println(
                    "Nombre: " + empleado.getNombre()
                    + "\nApellido: " + empleado.getApellido()
                    + "\nEdad: " + empleado.getEdad()
                    + "\nPais: " + empleado.getPais()
                    + "\nSueldo: " + empleado.getSueldo());
        }
        //Para ordenar los objetos de una lista con COMPARATOR, debemos crear una nueva clase e identificar el valor a ordenar, en este caso, la edad
        ComparatorListas comparator = new ComparatorListas();//Creamos un objeto que implementa el Comparator
        Collections.sort(listaDePersonas, comparator);//Sirve para ordenar de menor a mayor dependiendo del valor edad del objeto
        System.out.println("\n(COMPARATOR)Elementos ordenados de menor a mayor dependiendo de la edad: ");
        for (Persona empleado : listaDePersonas) {
            System.out.println("______________________");
            System.out.println(
                    "Nombre: " + empleado.getNombre()
                    + "\nApellido: " + empleado.getApellido()
                    + "\nEdad: " + empleado.getEdad()
                    + "\nPais: " + empleado.getPais()
                    + "\nSueldo: " + empleado.getSueldo());
        }

        //Para ordenar los objetos de una lista con COMPARABLE, debemos implementar esa clase en la clase del objeto que hicimos lista, en este caso Persona
        Persona2 sujeto1 = new Persona2("Fisher", "Zuñiga", "Mexico", 20, 200.5);
        Persona2 sujeto2 = new Persona2("Alberto", "Gomez", "Chile", 28, 150.78);
        Persona2 sujeto3 = new Persona2("Gaby", "Manzano", "Argentina", 32, 520.64);
        Persona2 sujeto4 = new Persona2("Knight", "Zuñiga", "Peru", 18, 334.56);

        listaDePersonas2.add(sujeto1);
        listaDePersonas2.add(sujeto2);
        listaDePersonas2.add(sujeto3);
        listaDePersonas2.add(sujeto4);

        Collections.sort(listaDePersonas2);//Sirve para ordenar de menor a mayor dependiendo del valor del nombre del objeto
        System.out.println("\n(COMPARABLE)Elementos ordenados de menor a mayor dependiendo del nombre: ");
        for (Persona2 empleado : listaDePersonas2) {
            System.out.println("______________________");
            System.out.println(
                    "Nombre: " + empleado.getNombre()
                    + "\nApellido: " + empleado.getApellido()
                    + "\nEdad: " + empleado.getEdad()
                    + "\nPais: " + empleado.getPais()
                    + "\nSueldo: " + empleado.getSueldo());
        }
    }

    /**
     * Probando el metodo Equals y HasCode para identificar similitudes de
     * contenido entre objetos.
     */
    private void Equals_HashCode() {
        /*
        Debemos añadir los metodos equals( ) y hashCode( ) en la clase del objeto que queremos comparar.
        HASH:
        Los hash son la salida de un algoritmo de hash, básicamente, estos algoritmos tienen como objetivo producir una cadena única de longitud fija.
        Son solo datos que se pueden representar en forma binaria, un algoritmo hash puede tomar esos datos 
        y ejecutar un cálculo complejo en ellos y generar una cadena de longitud fija como resultado del cálculo. 
        El resultado es el valor hash del archivo o el resumen del mensaje.
        Generalmente, estos códigos hash se utilizan para generar un índice, en el que se almacena el valor.
        

         */
        Persona sujeto1 = new Persona("Fisher", 24);//sujeto1 = hash = valor unico binario
        Persona sujeto2 = new Persona("Fisher", 24);//sujeto2 = hash = valor unico binario
        Persona sujeto3 = new Persona("Fisher", 24);//sujeto3 = hash = valor unico binario

        //ESTA COMPARANDO EL ALCANCE EN MEMORIA, NO SUS VALORES
        if (sujeto1 == sujeto2) {
            System.out.println("Los objetos tienen la misma referencia en memoria");
        } else {
            System.out.println("Los objetos no tienen la misma referencia en memoria");
        }
        //COMPARA LOS ATRIBUTOS DEL OBJETO
        if (sujeto1.equals(sujeto3)) {
            System.out.println("Los objetos son iguales");
        } else {
            System.out.println("Los objetos no son iguales");
        }
        //COMPARA LOS VALORES BINARIOS DE CADA OBJETO, OSEA QUE TIENE LOS MISMOS DATOS
        if (sujeto1.hashCode() == sujeto2.hashCode()) {
            System.out.println("Los hash son iguales");
        } else {
            System.out.println("Los hash no son iguales");
        }

    }

    /**
     * Explicacion de la clase interface Set: HashSet, TreeSet y LinkedHashSet.
     */
    private void Set() {
        /*
        HashSet: Es el conjunto de datos que no se almacena en un orden especifico, garantiza que no hay 
        duplicados.
        TreeSet: Son los elementos del conjunto que se almacenan de menor a mayor.
        LinkedHashSet: Son los elementos del conjunto que se encuentran en el orden que se insertan, similar a una lista
        pero sin dejar ingresar valores repetidos.
         */
        //HASHSET
        Set<String> conjuntoHash = new HashSet<>();
        //Agregamos elementos
        conjuntoHash.add("Fisher");
        conjuntoHash.add("Fisher");
        conjuntoHash.add("Alberto");
        conjuntoHash.add("Fisher");
        conjuntoHash.add("Knight");
        conjuntoHash.add("Gomez");
        //Se va imprimir todos los elementos de la lista sin ningun orden, ademas de un solo elemento por duplicado
        System.out.println("Conjunto con HashSet: ");
        for (String nombres : conjuntoHash) {
            System.out.println("Nombres: " + nombres);
        }
        //TREESET
        Set<String> conjuntoTree = new TreeSet<>();
        //Agregamos elementos
        conjuntoTree.add("Fisher");
        conjuntoTree.add("Zuñiga");
        conjuntoTree.add("Alberto");
        conjuntoTree.add("Fisher");
        conjuntoTree.add("Knight");
        conjuntoTree.add("Gomez");
        //Se va imprimir todos los elementos de la lista de orden ascendente, ademas de un solo elemento por duplicado
        System.out.println("\nConjunto con TreeSet: ");
        for (String nombres : conjuntoTree) {
            System.out.println("Nombres: " + nombres);
        }
        //LINKEDHASHSET
        Set<Character> conjuntoLinked = new LinkedHashSet<>();
        //Agregamos elementos
        conjuntoLinked.add('b');
        conjuntoLinked.add('a');
        conjuntoLinked.add('r');
        conjuntoLinked.add('a');
        conjuntoLinked.add('X');
        conjuntoLinked.add('r');
        conjuntoLinked.add('T');
        //Se va imprimir todos los elementos de la lista de orden en que se añaden los elementos, ademas de un solo elemento por duplicado
        System.out.println("\nConjunto con LinkedHashSet: ");
        for (char letras : conjuntoLinked) {
            System.out.println("Letras: " + letras);
        }

    }

    /**
     * Explicacion de la clase Map (Diccionario): HashMap, TreeMap,
     * LinkedHashMap.
     */
    private void Map() {
        /*
        La clase Map nos va permitir crear y añadir elementos como las listas anteriores, pero con la diferencia que usamos llaves.
        Lasl llaves tendran el rol de un index a la hora de buscar algun elemento de una lista, estas son unicas en todo el diccionario.
         */
        //HASHMAP: Dentro del generico se pasa la llave y luego el tipo de elementos de la lista
        Map<Integer, String> diccionarioHash = new HashMap<>();//Esta lista tendra un entero como llave y estara lleno de cadenas de texto
        //Agregamos elementos con una llave y una cadena de argumento
        diccionarioHash.put(1, "Fisher");
        diccionarioHash.put(5, "Alberto");
        diccionarioHash.put(9, "Gomez");
        diccionarioHash.put(33, "Knight"); //Este elemento no se va imprimir ya que un elemento ya agregado tiene la misma llave
        diccionarioHash.put(33, "Alberto");
        diccionarioHash.put(1, "Fish");//Por lo tanto, agarrara la ultima declaracion como valor final para el elemento

        //Se va imprimir todos los elementos del diccionario sin orden en especifico, los valores se van a repetir, pero no si sus llaves coinciden
        System.out.println("Diccionario con HashMap: ");
        for (Entry<Integer, String> entrada : diccionarioHash.entrySet()) {//FOR con Entry para recorrer todo el diccionario
            System.out.println("Clave del nombre: " + entrada.getKey() + " - Valor: " + entrada.getValue());
        }

        //TREEMAP: Dentro del generico se pasa la llave y luego el tipo de elementos de la lista
        Map<Character, String> diccionarioTree = new TreeMap<>();//Esta lista tendra un char como llave y estara lleno de cadenas de texto
        //Agregamos elementos con una llave y una cadena de argumento
        diccionarioTree.put('A', "Fisher");
        diccionarioTree.put('B', "Alberto");
        diccionarioTree.put('C', "Gomez");
        diccionarioTree.put('D', "Knight"); //Este elemento no se va imprimir ya que un elemento ya agregado tiene la misma llave
        diccionarioTree.put('D', "Alberto");
        diccionarioTree.put('A', "Fish");//Por lo tanto, agarrara la ultima declaracion como valor final para el elemento

        //Se va imprimir todos los elementos del diccionario en orden ascendente dependiendo del la llave, los valores se van a repetir, pero no si sus llaves coinciden
        System.out.println("\nDiccionario con TreeMap: ");
        for (Entry<Character, String> entrada : diccionarioTree.entrySet()) {//FOR con Entry para recorrer todo el diccionario
            System.out.println("Clave del nombre: " + entrada.getKey() + " - Valor: " + entrada.getValue());
        }
        //LINKEDHASHMAP: Dentro del generico se pasa la llave y luego el tipo de elementos de la lista
        Map<Float, String> diccionarioLinked = new LinkedHashMap<>();//Esta lista tendra un char como llave y estara lleno de cadenas de texto
        //Agregamos elementos con una llave y una cadena de argumento
        diccionarioLinked.put(1.9f, "Fisher");
        diccionarioLinked.put(1.4f, "Alberto");
        diccionarioLinked.put(1.2f, "Gomez");
        diccionarioLinked.put(1.6f, "Knight"); //Este elemento no se va imprimir ya que un elemento ya agregado tiene la misma llave
        diccionarioLinked.put(1.6f, "Alberto");
        diccionarioLinked.put(1.9f, "Fish");//Por lo tanto, agarrara la ultima declaracion como valor final para el elemento

        //Se va imprimir todos los elementos del diccionario en orden en que se colocan las llaves, los valores se van a repetir, pero no si sus llaves coinciden
        System.out.println("\nDiccionario con LinkedHashMap: ");
        for (Entry<Float, String> entrada : diccionarioLinked.entrySet()) {//FOR con Entry para recorrer todo el diccionario
            System.out.println("Clave del nombre: " + entrada.getKey() + " - Valor: " + entrada.getValue());
        }

    }
}//CLASS

