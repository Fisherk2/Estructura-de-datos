/*
 * NOMBRE: Fisher
 * FECHA: 21/05/22
 * PROYECTO: ED2022
 */
package GoL;

import Colecciones.Coleccion;
import Colecciones.NodoGen;

/**
 * Clase que controla la natalidad de las celulas.
 *
 * @author Fisherk2
 */
public class ControlCell implements Grid {

    private int grid_X, grid_Y;
    private String grid;

    public ControlCell() {
        grid_X = 0;
        grid_Y = 0;
        grid = "";
    }

    @Override
    public boolean estaViva(int x, int y) {
        //Verificaremos si la celula en las coordenadas esta viva en la coleccion de celulas.
        if (CELULAS.obtener(new Celula(x, y)) == null) {
            return false; //Porque ni siquiera esta en el conjunto de celulas
        }
        return CELULAS.obtener(new Celula(x, y)).getContenido().isAlive();
    }

    @Override
    public void killCells() {
        for (int i = 0; i < CELULAS.size(); i++) {
            CELULAS.obtener(i).getContenido().setEstado(false); //Matamos la celula de la posicion del conjunto
        }
    }

    @Override
    public void killCells(int x, int y) {
        CELULAS.borrar(new Celula(x, y, true));
        CELULAS.agregar(new NodoGen<>(new Celula(x, y, false))); //Agregamos una celula muerta
    }

    @Override
    public void crearCell(int patron, int x, int y) {
        //ALMACENAMOS EL PATRON CON CELULAS VIVAS EN UN ARREGLO DE 5X4
        for (int i = 0; i < PATRON_CELL.length; i++) { //Filas
            for (int j = 0; j < PATRON_CELL[i].length; j++) { //Columnas
                if (!estaFuera(x + i, y + j)) {
                    PATRON_CELL[i][j] = new Celula(x + i, y + j);
                } else {
                    PATRON_CELL[i][j] = new Celula(x + i, y + j, false); //Estara muerta
                }
            }

            switch (patron) {
                case ONE_CELL://[x][y], 1 celula
                    if (estaFuera(x, y)) {
                        CELULAS.agregar(new NodoGen<>(new Celula(x, y, false))); //Estara muerta
                    } else {
                        CELULAS.agregar(new NodoGen<>(new Celula(x, y)));
                    }
                    break;
                case BALIZA:// [0,0][0,1][1,0][1,1][2,2][2,3][3,2][3,3], 8 celulas
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[0][0]));
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[0][1]));
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[1][0]));
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[1][1]));
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[2][2]));
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[2][3]));
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[3][2]));
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[3][3]));
                    break;
                case BLINKER://[0,0][0,1][0,2], 3 celulas
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[0][0]));
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[1][0]));
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[2][0]));
                    break;
                case GLIDER://[0,1][1,2][2,0][2,1][2,2], 5 celulas
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[1][0]));
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[2][1]));
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[0][2]));
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[1][2]));
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[2][2]));
                    break;
                case SAPO://[0,1][0,2][0,3][1,0][1,1][1,2], 6 celulas
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[1][0]));
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[2][0]));
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[3][0]));
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[0][1]));
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[1][1]));
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[2][1]));
                    break;
                case LSS://[0,1][0,4][1,0][2,0][2,4][3,0][3,1][3,2][3,3], 9 celulas
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[1][0]));
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[4][0]));
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[0][1]));
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[0][2]));
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[4][2]));
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[0][3]));
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[1][3]));
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[2][3]));
                    CELULAS.agregar(new NodoGen<>(PATRON_CELL[3][3]));
                    break;
            }
        }
//        setGridSize();
    }

    @Override
    public void nextGen() {
        //Pasara por cada contenido del conjunto
        for (int i = 0; i < CELULAS.size(); i++) {
            gridVecino(i);
            int vecinos = contarVecinos();
            System.out.println(i + " celula tiene: " + vecinos + " vecinos");
            //Aplicar las tres reglas del juego de la vida
            primeraRegla(i, vecinos); //SUPERVIVENCIA
            segundaRegla(i, vecinos); //FALLECIMIENTO
            tercerRegla(i, vecinos); //NACIMIENTO
        }
    }

    @Override
    public void reviveCell(int x, int y) {
        CELULAS.borrar(new Celula(x, y, false));
        CELULAS.agregar(new NodoGen<>(new Celula(x, y, true))); //Agregamos como nueva celula viva
    }

    @Override
    public void limpiarGrid() {
        CELULAS.vaciar();
        grid = "";
        setGridSize(0, 0);
    }

    @Override
    public void setGridSize(int x, int y) {
        this.grid_X = x;
        this.grid_Y = y;
    }

    @Override
    public int getGridSizeX() {
        return grid_X;
    }

    @Override
    public int getGridSizeY() {
        return grid_Y;
    }

    @Override
    public boolean estaFuera(int x, int y) {
        Celula cell = new Celula(x, y);
        return cell.getX() < 0 || cell.getY() < 0;
    }

    @Override
    public String toString() {
        Coleccion<Celula> cellDentro = new Coleccion<>();
        grid = "";
        Celula cell;
        //Recorremos celula por celula dentro del conjunto y agregamos los que estan dentro del GRID
        for (int i = 0; i < CELULAS.size(); i++) {
            cell = CELULAS.obtener(i).getContenido();
            if (!estaFuera(cell.getX(), cell.getY())) { //No agregar si esta fuera del GRID
                cellDentro.agregar(new NodoGen<>(cell));
            }
        }
        //Establecemos las dimensiones del GRID DE LA IMPRESION.
        setGridSize();
        //Imprimimos las celulas que estan dentro del GRID
        for (int i = 0; i < grid_Y; i++) {
            for (int j = 0; j < grid_X; j++) {
                if (cellDentro.obtener(new Celula(j, i)) != null) {//Si existe una celula, imprimira un caracter.
                    cell = cellDentro.obtener(new Celula(j, i)).getContenido();
                    if (cell.isAlive()) {
                        grid += "x";
                    } else {
                        grid += "°";
                    }
                } else {
                    grid += "-";
                }
            }
            grid += "\n";//Salto de linea por cada renglon
        }
        return grid;
    }

    /**
     * Metodo que crea una matriz de area de supervivencia dependiendo de la
     * celula P del centro de la cuadricula.
     */
    private void gridVecino(int i) {
        Celula p;
        int pX, pY;
        //DECLARAR LA CELULA COMO PUNTO P
        p = CELULAS.obtener(i).getContenido(); //Obtenemos la celula del punto P
        //Obtenemos las coordenadas del punto P
        pX = p.getX();
        pY = p.getY();
        //UBICAR LOS PUNTOS VECINOS

        for (int j = 0; j < SURVIVE_AREA.length; j++) {
            for (int k = 0; k < SURVIVE_AREA[j].length; k++) {
                if (CELULAS.obtener(new Celula(pX - (k - 1), pY + (j - 1))) != null) {
                    SURVIVE_AREA[j][k] = CELULAS.obtener(new Celula(pX - (k - 1), pY + (j - 1))).getContenido();
                } else {
                    SURVIVE_AREA[j][k] = new Celula(pX - (k - 1), pY + (j - 1), false);
                }
            }
//            SURVIVE_AREA[0][0] = CELULAS.obtener(new Celula(pX - 1, pY - 1)).getContenido();
//            SURVIVE_AREA[0][1] = CELULAS.obtener(new Celula(pX, pY - 1)).getContenido();
//            SURVIVE_AREA[0][2] = CELULAS.obtener(new Celula(pX + 1, pY - 1)).getContenido();
//            SURVIVE_AREA[1][0] = CELULAS.obtener(new Celula(pX - 1, pY)).getContenido();
//            SURVIVE_AREA[1][1] = p; //ESTA EN EL CENTRO DE LA CUADRICULA
//            SURVIVE_AREA[1][2] = CELULAS.obtener(new Celula(pX + 1, pY - 1)).getContenido();
//            SURVIVE_AREA[2][0] = CELULAS.obtener(new Celula(pX - 1, pY + 1)).getContenido();
//            SURVIVE_AREA[2][1] = CELULAS.obtener(new Celula(pX, pY + 1)).getContenido();
//            SURVIVE_AREA[2][2] = CELULAS.obtener(new Celula(pX + 1, pY + 1)).getContenido();
        }
    }

    /**
     * Metodo que cuenta las celulas vivas del area de supervivencia del punto
     * P.
     *
     * @return Numero de vecinos dentro del area de supervivencia.
     */
    private int contarVecinos() {
        int vecinos = 0;
        for (int i = 0; i < SURVIVE_AREA.length; i++) {
            for (int j = 0; j < SURVIVE_AREA[i].length; j++) {
                //NO CONTARA LA CELULA DEL PUNTO P QUE SE ENCUENTRA EN [1][1]
                if (i != 1 && j != 1) {
                    if (SURVIVE_AREA[i][j].isAlive()) {
                        vecinos++;
                    }
                }
            }
        }
        return vecinos;
    }

    /**
     * Metodo que aplica la primer regla para la celula del punto P del area de
     * supervivencia: Cada individuo o célula que cumpla el requisito de tener 2
     * ó 3 vecinos vivos sobrevive a la siguiente generación
     *
     * @param i Posicion donde se encuentra la celula en el conjunto
     * @param vecinos Numero de vecinos del area de supervivencia
     */
    private void primeraRegla(int i, int vecinos) {
        Celula cell = CELULAS.obtener(i).getContenido();
        if (vecinos != 2 || vecinos != 3) {
//            CELULAS.obtener(i).getContenido().setEstado(false); //Matamos la celula de la posicion del conjunto
            killCells(cell.getX(), cell.getY());
        }
    }

    /**
     * Metodo que aplica la segunda regla para la celula del punto P del area de
     * supervivencia: Una célula viva que tenga menos de 2 vecinos fallece por
     * aislamiento o soledad en el siguiente estado o turno. Una célula viva que
     * tenga más de trés vecinos vivos muere por superpoblación en el siguiente
     * estado o turno.
     *
     * @param i Posicion donde se encuentra la celula en el conjunto
     * @param vecinos Numero de vecinos del area de supervivencia
     */
    private void segundaRegla(int i, int vecinos) {
        Celula cell = CELULAS.obtener(i).getContenido();
        if (vecinos < 2 || vecinos > 3) {
//            CELULAS.obtener(i).getContenido().setEstado(false); //Matamos la celula de la posicion del conjunto
            killCells(cell.getX(), cell.getY());
        }
    }

    /**
     * Metodo que aplica la tercera regla para la celula del punto P del area de
     * supervivencia: Si una celda vacía pasa a tener en su vecindad exactamente
     * 3 células vivas su estado futuro en el siguiente turno será el de célula
     * viva
     *
     * @param i Posicion donde se encuentra la celula en el conjunto
     * @param vecinos Numero de vecinos del area de supervivencia
     */
    private void tercerRegla(int i, int vecinos) {
        Celula cell = CELULAS.obtener(i).getContenido();
        if (vecinos == 3) {
//            CELULAS.obtener(i).getContenido().setEstado(true); //Revivimos la celula de la posicion del conjunto
            reviveCell(cell.getX(), cell.getY());
        }
    }

    /**
     * Metodo que va actualizar el tamaño del GRID cuando se vayan agregando
     * elementos del conjunto de celulas
     */
    private void setGridSize() {
        Coleccion<Celula> cellDentro = new Coleccion<>();
        Celula cell;
        int x, y;

        //Recorremos celula por celula dentro del conjunto y agregamos los que estan dentro del GRID
        for (int i = 0; i < CELULAS.size(); i++) {
            cell = CELULAS.obtener(i).getContenido();
            if (!estaFuera(cell.getX(), cell.getY())) { //No agregar si esta fuera del GRID
                cellDentro.agregar(new NodoGen<>(cell));
            }
        }
        //Acotamos el tamaño del GRID
        for (int i = 0; i < cellDentro.size(); i++) {
            cell = cellDentro.obtener(i).getContenido();
            x = cell.getX() + 1;
            y = cell.getY() + 1;
            if (x >= grid_X) {
                this.grid_X = x;
            }
            if (y >= grid_Y) {
                this.grid_Y = y;
            }
        }

    }

}
