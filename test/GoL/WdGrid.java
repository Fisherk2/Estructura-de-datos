/*
 * NOMBRE: Fisher
 * FECHA: 20/05/22
 * PROYECTO: ED2022
 */
package GoL;

/**
 * Clase que muestra graficamete las celulas vivas y muertas del juego de la
 * vida.
 *
 * @author Fisherk2
 */
public class WdGrid extends javax.swing.JDialog {


    public WdGrid(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents(); //CODIGO GENERADO
        areaTextoGrid.setText(""); //INICIAMOS SIN CELULAS VIVAS
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGrid = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTextoGrid = new javax.swing.JTextArea();

        setTitle("GRID");
        setResizable(false);

        panelGrid.setBackground(new java.awt.Color(51, 0, 51));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        areaTextoGrid.setEditable(false);
        areaTextoGrid.setBackground(new java.awt.Color(51, 51, 51));
        areaTextoGrid.setColumns(20);
        areaTextoGrid.setFont(new java.awt.Font("Lato Light", 0, 12)); // NOI18N
        areaTextoGrid.setForeground(new java.awt.Color(255, 255, 255));
        areaTextoGrid.setRows(5);
        areaTextoGrid.setText("xxxxxx.....xxxx...xxx\nx.x.xxxxx.xxxxx.xx..\nx.xx.xxxxxxxxxx......\nx................x.....x.......\n....................x.x..xx...");
        areaTextoGrid.setCaretColor(new java.awt.Color(51, 51, 51));
        areaTextoGrid.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(areaTextoGrid);

        javax.swing.GroupLayout panelGridLayout = new javax.swing.GroupLayout(panelGrid);
        panelGrid.setLayout(panelGridLayout);
        panelGridLayout.setHorizontalGroup(
            panelGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGridLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelGridLayout.setVerticalGroup(
            panelGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGridLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGrid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGrid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo que cambiara el contenido del area de texto respecto a la
     * configuracion de celulas.
     * @param grid La configuracion de celulas dentro de un GRID.
     */
    public void actualizarGrid(ControlCell grid) {
        areaTextoGrid.setText(grid.toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTextoGrid;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelGrid;
    // End of variables declaration//GEN-END:variables

}
