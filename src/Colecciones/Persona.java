package Colecciones;

import java.util.Objects;

/**
 * Clase Persona que almacena todos los datos de un empleado.
 *
 * @author Fisher
 */
public class Persona {

    //Atributos
    private String nombre, apellido, pais;
    private int edad;
    private double sueldo;

    public Persona(String nombre, String apellido, String pais, int edad, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public Persona(String nombre, int edad) { 
        this.nombre = nombre;
        this.edad = edad;
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
    
    /*
    Para comparar el valor de un objeto con otro de esta clase, 
    debemos insertar los bloques de codigo equals & hashCode haciendo click derecho e insertar codigo, y
    seleccionando todos los atributos del objeto.
    */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.apellido);
        hash = 97 * hash + Objects.hashCode(this.pais);
        hash = 97 * hash + this.edad;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        return true;
    }
    
    

}
