/*
 * NOMBRE: Fisher
 * FECHA: 21/05/22
 * PROYECTO: ED2022
 */
package GoL;

/**
 * Clase que muestra graficamente las Reglas del juego de la vida.
 *
 * @author Fisherk2
 */
public class WdRules extends javax.swing.JDialog {

    public WdRules(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents(); //CODIGO GENERADO
        this.setLocationRelativeTo(null); //CENTRAMOS LA VENTANA
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRules = new javax.swing.JPanel();
        etReglas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaDefinicion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaReglas = new javax.swing.JTextArea();
        iconGol = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REGLAS DEL JUEGO DE LA VIDA");

        panelRules.setBackground(new java.awt.Color(153, 153, 255));

        etReglas.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 36)); // NOI18N
        etReglas.setForeground(new java.awt.Color(0, 0, 0));
        etReglas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etReglas.setText("REGLAS");
        etReglas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        areaDefinicion.setEditable(false);
        areaDefinicion.setBackground(new java.awt.Color(153, 153, 255));
        areaDefinicion.setColumns(20);
        areaDefinicion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        areaDefinicion.setForeground(new java.awt.Color(0, 0, 0));
        areaDefinicion.setRows(5);
        areaDefinicion.setText("El “Juego de la vida” es un autómata\ncelular, es decir, un modelo matemático para un\nsistema dinámico que evoluciona en pasos\ndiscretos, que se compone de una “rejilla” o\n“tablero” extendida hasta el infinito\n(teóricamente) en sus dos dimensiones que\ndelimita unas celdas sobre las cual se van a\nproducir las interacciones.\n\nEste juego está basado en la evolución\nde estados sucesivos, en los cuales las\ncondiciones del estado futuro dependen\nsolamente de las condiciones del estado anterior,\npor tanto no se requiere de la entrada de datos\ndurante el desarrollo del mismo, y es tan sólo el\nestado inicial y las normas del juego lo que\ndeterminada el desarrollo del juego. Por tanto la\nparticipación en el mismo únicamente consiste\nen determinar las condiciones iniciales en\nfunción del resultado que se quiera obtener en\nun número de turnos concreto, o a perpetuidad.");
        areaDefinicion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(areaDefinicion);

        areaReglas.setEditable(false);
        areaReglas.setBackground(new java.awt.Color(153, 153, 255));
        areaReglas.setColumns(20);
        areaReglas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        areaReglas.setForeground(new java.awt.Color(0, 0, 0));
        areaReglas.setRows(5);
        areaReglas.setText("Leyes genéticas\nde Conway:\n\n1- Supervivencia: Cada individuo o célula\nque cumpla el requisito de tener 2 ó 3 vecinos\nvivos sobrevive a la siguiente generación (por\ntanto su estado se mantiene inalterado en el\nsiguiente turno.\n\n2- Fallecimiento: Una célula viva que tenga\nmenos de 2 vecinos fallece por aislamiento o\nsoledad en el siguiente estado o turno. Una\ncélula viva que tenga más de trés vecinos vivos\nmuere por superpoblación en el siguiente estado\no turno.\n\n3- Nacimiento: Si una celda vacía pasa a\ntener en su vecindad exactamente 3 células\nvivas su estado futuro en el siguiente turno será\nel de célula viva (nacimiento de nuevo\nindividuo).\n");
        areaReglas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(areaReglas);

        iconGol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconGol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GoL/Recursos/GoL.png"))); // NOI18N
        iconGol.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panelRulesLayout = new javax.swing.GroupLayout(panelRules);
        panelRules.setLayout(panelRulesLayout);
        panelRulesLayout.setHorizontalGroup(
            panelRulesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etReglas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelRulesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelRulesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(iconGol, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelRulesLayout.setVerticalGroup(
            panelRulesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRulesLayout.createSequentialGroup()
                .addComponent(etReglas)
                .addGroup(panelRulesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRulesLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelRulesLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(iconGol, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jScrollPane1.getAccessibleContext().setAccessibleParent(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRules, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRules, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaDefinicion;
    private javax.swing.JTextArea areaReglas;
    private javax.swing.JLabel etReglas;
    private javax.swing.JLabel iconGol;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelRules;
    // End of variables declaration//GEN-END:variables

}
