/*
 * NOMBRE: Fisher
 * FECHA: 19/05/22
 * PROYECTO: ED2022
 */
package GoL;

/**
 * Clase que almacena toda la informacion de una celula del juego.
 *
 * @author Fisherk2
 */
public class Celula {

    private int x, y;
    private boolean estado;

    public Celula(int x, int y) {
        this.x = x;
        this.y = y;
        estado = true; //Cada que se crea una celula, esta estara viva.
    }

    public Celula(int x, int y, boolean estado) {
        this.x = x;
        this.y = y;
        this.estado = estado; //Cada que se crea una celula, se le asignara un estado.
    }

    public boolean isAlive() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //ESTE METODO SE SOBREESCRIBIO PARA MODIFICAR EL CONTAINS() YA QUE ESTE COMPARA OBJETOS REFERENCIADOS Y NO SUS CONTENIDOS
    @Override
    public boolean equals(Object object) {
        if (object != null && object.getClass() == this.getClass()) {
            if (this.x == ((Celula) object).x && this.y == ((Celula) object).y) {
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
        return "(" + x + ", " + y + ")";
    }

}
