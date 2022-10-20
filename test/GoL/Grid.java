/*
 * NOMBRE: Fisher
 * FECHA: 21/05/22
 * PROYECTO: ED2022
 */
package GoL;

import Colecciones.Coleccion;

/**
 * Clase interface que obliga la implementacion de metodos y atributos
 * necesarios para la realizacion del Juego de la vida.
 *
 * @author Fisherk2
 */
public interface Grid {

    /**
     * Verifica la existencia de una celula dentro de la coleccion.
     *
     * @param x Coordenada en X
     * @param y Coordenada en Y
     * @return Estado de la celula; TRUE: viva, FALSE: muerta.
     */
    public boolean estaViva(int x, int y);

    /**
     * Metodo que vacia la coleccion de celulas.
     */
    public void limpiarGrid();

    /**
     * Metodo que mata una celula del GRID.
     *
     * @param x Coordenada en X
     * @param y Coordenada en Y
     */
    public void killCells(int x, int y);

    /**
     * Metodo que mata todas las celulas del GRID, pero no las borra.
     */
    public void killCells();

    /**
     * Metodo que crea celulas dependiendo del patron y la posicion ingresada.
     *
     * @param patron 1-6
     * @param x Coordenada en X
     * @param y Coordenada en Y
     */
    public void crearCell(int patron, int x, int y);

    /**
     * Metodo que revive una celula fallecida.
     *
     * @param x Coordenada en X
     * @param y Coordenada en Y
     */
    public void reviveCell(int x, int y);

    /**
     * Metodo que matara o revivira celulas dependiendo de la configuracion de
     * nuestras celulas.
     */
    public void nextGen();

    /**
     * Metodo que establece el tamaño del GRID.
     *
     * @param x Filas
     * @param y Columnas
     */
    public void setGridSize(int x, int y);
    
    /**
     * Dimension en X del Grid.
     * @return Tamaño en X.
     */
    public int getGridSizeX();

    /**
     * Dimension en Y del Grid.
     * @return Tamaño en Y.
     */
    public int getGridSizeY();

    /**
     * Metodo que te avisa si la celula que ingresaste esta afuera del GRID o
     * no.
     *
     * @param x Coordenada en X
     * @param y Coordenada en Y
     * @return TRUE: La celula se encuentra afuera del GRID, FALSE: Esta dentro
     * del GRID.
     */
    public boolean estaFuera(int x, int y);

    /**
     * Coleccion que almacena celulas con informacion: Coordenadas y estado de
     * vida.
     */
    Coleccion<Celula> CELULAS = new Coleccion<>();

    /**
     * Plantilla para patrones de celulas de 5x4 espacios.
     */
    Celula[][] PATRON_CELL = new Celula[5][4];

    /**
     * Plantilla donde se ubicara una celula P en el centro de la cuadricula
     */
    Celula[][] SURVIVE_AREA = new Celula[3][3];

    //SON LOS TIPOS DE PATRONES QUE PODEMOS GENERAR EN EL GRID
    public final int ONE_CELL = 1;
    public final int BALIZA = 2;
    public final int BLINKER = 3;
    public final int GLIDER = 4;
    public final int LSS = 5;
    public final int SAPO = 6;

}
