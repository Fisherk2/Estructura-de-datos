/*
 * NOMBRE: Fisher
 * FECHA: 20/05/22
 * PROYECTO: ED2022
 */
package GoL;

/**
 * Clase principal que prueba el juego de la vida
 *
 * @author Fisherk2
 */
public class MainGoL {

    public static void main(String[] gol) {

        new MainGoL().run();
//        new MainGoL().pruebaControlCell();
    }

    private void run() {
        new MenuTablero().setVisible(true);
    }

    private void pruebaControlCell() {
        ControlCell grid = new ControlCell();

        grid.crearCell(ControlCell.ONE_CELL, 0, 1);
        grid.crearCell(ControlCell.ONE_CELL, 2, 0);
        grid.crearCell(ControlCell.ONE_CELL, 0, 0);
        grid.crearCell(ControlCell.ONE_CELL, 454, 1000);
        grid.crearCell(ControlCell.ONE_CELL, 0, 0);

        System.out.println(ControlCell.CELULAS);
        System.out.println("La celula [0][0] esta viva?: " + grid.estaViva(0, 0));
        System.out.println("La celula [89][1] esta viva?: " + grid.estaViva(89, 1));
        System.out.println("_______________________________");

        System.out.println("La celula [0][0] se encuentra en: " + ControlCell.CELULAS.indiceDe(new Celula(0, 0))); //2
        System.out.println("_________________________");
        grid.killCells(0, 0);
        System.out.println("La celula [0][0] esta viva?: " + grid.estaViva(0, 0));
        grid.killCells();
        System.out.println("La celula [454][1000] esta viva?: " + grid.estaViva(454, 1000));
        grid.reviveCell(0, 0);
        System.out.println(ControlCell.CELULAS);
        System.out.println("La celula [0][0] esta viva?: " + grid.estaViva(0, 0));
        System.out.println("______________________________");
        grid.limpiarGrid();
        System.out.println(ControlCell.CELULAS);
        System.out.println("______________________________");
        grid.crearCell(ControlCell.ONE_CELL, 15, 1);
        grid.crearCell(ControlCell.ONE_CELL, -2, 2);
        grid.crearCell(ControlCell.ONE_CELL, 0, -36);
        grid.crearCell(ControlCell.ONE_CELL, -1, -1);
        grid.crearCell(ControlCell.ONE_CELL, 2, 10);

        System.out.println(ControlCell.CELULAS);
        System.out.println("La celula [15][1] esta afuera?: " + grid.estaFuera(15, 1));
        System.out.println("La celula [-2][2] esta afuera?: " + grid.estaFuera(-2, 2));
        System.out.println("La celula [0][-36] esta afuera?: " + grid.estaFuera(0, -36));
        System.out.println("La celula [-1][-1] esta afuera?: " + grid.estaFuera(-1, -1));
        System.out.println("La celula [2][10] esta afuera?: " + grid.estaFuera(2, 10));
        System.out.println("______________________________\n");
        grid.limpiarGrid();
        grid.crearCell(ControlCell.ONE_CELL, 2, 1);
        grid.crearCell(ControlCell.ONE_CELL, 0, 0);
        grid.crearCell(ControlCell.ONE_CELL, 1, 2);
        grid.crearCell(ControlCell.ONE_CELL, 1, 1);
        grid.killCells(0, 0);
        System.out.println(grid);
        System.out.println("Tamaño del GRID resultante: " + grid.getGridSizeX() + "x" + grid.getGridSizeY());
        System.out.println("______________________________\n");
        grid.nextGen();
        System.out.println(grid);
        System.out.println("Tamaño del GRID resultante: " + grid.getGridSizeX() + "x" + grid.getGridSizeY());

    }

}
