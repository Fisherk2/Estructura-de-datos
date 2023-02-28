package Colecciones;

/**
 * Clase Persona que almacena todos los datos de un empleado, este implementa la
 * clase generica Comparable, que nos servira para usar correctamente la clase
 * Collections y sus metodos, enviamos como argumento de esta clase generica
 * esta misma clase, que es la misma que el de nuestra lista
 *
 * @author Fisher
 */
public class Persona2 implements Comparable<Persona2> {

    //Atributos
    private String nombre, apellido, pais;
    private int edad;
    private double sueldo;

    public Persona2(String nombre, String apellido, String pais, int edad, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
    }
    
    //DECLARAMOS LOS METODOS ABSTRACTOS QUE NECESITAMOS PARA ORDENAR NUESTROS OBJETOS DE LA LISTA
    @Override
    public int compareTo(Persona2 sujeto) {
        //Ver metodo burbuja para saber que tipo de valores debemos retornar
        int respuesta = 0;
        //ORDENARA OBJETOS POR EDAD
//        respuesta = this.edad-sujeto.getEdad();
        //ORDENARA OBJETOS POR NOMBRE
        respuesta = this.nombre.compareTo(sujeto.getNombre());

        return respuesta;
    }

}
