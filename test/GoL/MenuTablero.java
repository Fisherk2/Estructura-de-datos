/*
 * NOMBRE: Fisher
 * FECHA: 20/05/22
 * PROYECTO: ED2022
 */
package GoL;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 * Clase donde mostramos la ventana de opciones.
 *
 * @author Fisherk2
 */
public class MenuTablero extends javax.swing.JFrame {

    private final WdGrid VENTANA_GRID;
    private final ControlCell GRID;
    private int x, y, numGen;

    public MenuTablero() {
        initComponents(); //CODIGO GENERADO
        agruparRB();
        this.setLocation(1050, 0); //POSICION INICIAL DE LA VENTANA
        VENTANA_GRID = new WdGrid(this, false); //MOSTRAMOS AL ARRANCAR, LA VENTANA GRID
        mostrarGrid();
        GRID = new ControlCell(); //Creamos un centro de control de celulas para que se vea reflejado en la ventana GRID
        numGen = 0; //Iniciamos contador de generaciones
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdGrupo = new javax.swing.ButtonGroup();
        panelTablero = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaEjemplo = new javax.swing.JTextArea();
        botonGrid = new javax.swing.JButton();
        botonRules = new javax.swing.JButton();
        etTitulo = new javax.swing.JLabel();
        eRepresentX = new javax.swing.JLabel();
        eRepresentDot = new javax.swing.JLabel();
        ePatrones = new javax.swing.JLabel();
        eCoordenada = new javax.swing.JLabel();
        eX = new javax.swing.JLabel();
        eX1 = new javax.swing.JLabel();
        icon_Patron = new javax.swing.JLabel();
        cajaTy = new javax.swing.JTextField();
        cajaTx = new javax.swing.JTextField();
        botonMatarTodo = new javax.swing.JButton();
        botonGenerar = new javax.swing.JButton();
        botonSkipGen = new javax.swing.JButton();
        botonMatarCelula = new javax.swing.JButton();
        rb1Cell = new javax.swing.JRadioButton();
        rbBaliza = new javax.swing.JRadioButton();
        rbBlinker = new javax.swing.JRadioButton();
        rbGlider = new javax.swing.JRadioButton();
        rbLightSS = new javax.swing.JRadioButton();
        rbSapo = new javax.swing.JRadioButton();
        eNGen = new javax.swing.JLabel();
        botonReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JUEGO DE LA VIDA by Fisher");
        setResizable(false);

        panelTablero.setBackground(new java.awt.Color(204, 255, 204));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        areaEjemplo.setEditable(false);
        areaEjemplo.setBackground(new java.awt.Color(51, 51, 51));
        areaEjemplo.setColumns(20);
        areaEjemplo.setFont(new java.awt.Font("Lato Light", 0, 24)); // NOI18N
        areaEjemplo.setForeground(new java.awt.Color(255, 255, 255));
        areaEjemplo.setRows(5);
        areaEjemplo.setText("x..xxxx.....xxxx...xxx\nx.x.xxxxx.xxxxx.xx..\nx.xx.xxxxxxxxxx......\nx................x.....x.......\n....................x.x..xx...\nx.x.xxxxx.xxxxx.xx..\nx.xx.xxxxxxxxxx......\nx................x.....x.......\n....................x.x..xx...\nx.x.xxxxx.xxxxx.xx..\nx.xx.xxxxxxxxxx......\nx................x.....x.......\n....................x.x..xx...\nx.x.xxxxx.xxxxx.xx..\nx.xx.xxxxxxxxxx......\nx................x.....x.......\n....................x.x..xx...\nx.x.xxxxx.xxxxx.xx..\nx.xx.xxxxxxxxxx......\nx................x.....x.......\n....................x.x..xx...\nx.x.xxxxx.xxxxx.xx..\nx.xx.xxxxxxxxxx......\nx................x.....x.......\n....................x.x..xx...");
        areaEjemplo.setCaretColor(new java.awt.Color(51, 51, 51));
        areaEjemplo.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(areaEjemplo);

        botonGrid.setBackground(new java.awt.Color(255, 255, 255));
        botonGrid.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        botonGrid.setForeground(new java.awt.Color(0, 0, 0));
        botonGrid.setText("SHOW GRID");
        botonGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGridActionPerformed(evt);
            }
        });

        botonRules.setBackground(new java.awt.Color(153, 153, 255));
        botonRules.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        botonRules.setForeground(new java.awt.Color(0, 0, 0));
        botonRules.setText("RULES");
        botonRules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRulesActionPerformed(evt);
            }
        });

        etTitulo.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 36)); // NOI18N
        etTitulo.setForeground(new java.awt.Color(0, 0, 0));
        etTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etTitulo.setText("GAME OF LIFE");
        etTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        eRepresentX.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        eRepresentX.setForeground(new java.awt.Color(0, 0, 0));
        eRepresentX.setText("[X] Representa una celula viva");

        eRepresentDot.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        eRepresentDot.setForeground(new java.awt.Color(0, 0, 0));
        eRepresentDot.setText("[.] Representa una celula muerta");

        ePatrones.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        ePatrones.setForeground(new java.awt.Color(0, 0, 0));
        ePatrones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ePatrones.setText("PATRONES:");

        eCoordenada.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        eCoordenada.setForeground(new java.awt.Color(0, 0, 0));
        eCoordenada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eCoordenada.setText("Coordenada (P):");

        eX.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        eX.setForeground(new java.awt.Color(0, 0, 0));
        eX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eX.setText("X");

        eX1.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        eX1.setForeground(new java.awt.Color(0, 0, 0));
        eX1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eX1.setText("Y");

        icon_Patron.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GoL/Recursos/patronBaliza.PNG"))); // NOI18N
        icon_Patron.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cajaTy.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        cajaTy.setText("0");

        cajaTx.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        cajaTx.setText("0");

        botonMatarTodo.setBackground(new java.awt.Color(102, 0, 0));
        botonMatarTodo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        botonMatarTodo.setForeground(new java.awt.Color(255, 255, 255));
        botonMatarTodo.setText("MATAR TODAS LA CELULAS");
        botonMatarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMatarTodoActionPerformed(evt);
            }
        });

        botonGenerar.setBackground(new java.awt.Color(0, 102, 0));
        botonGenerar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        botonGenerar.setForeground(new java.awt.Color(255, 255, 255));
        botonGenerar.setText("GENERAR CELULA/PATRON");
        botonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarActionPerformed(evt);
            }
        });

        botonSkipGen.setBackground(new java.awt.Color(0, 153, 153));
        botonSkipGen.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        botonSkipGen.setForeground(new java.awt.Color(255, 255, 255));
        botonSkipGen.setText("NEXT GEN");
        botonSkipGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSkipGenActionPerformed(evt);
            }
        });

        botonMatarCelula.setBackground(new java.awt.Color(102, 0, 0));
        botonMatarCelula.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        botonMatarCelula.setForeground(new java.awt.Color(255, 255, 255));
        botonMatarCelula.setText("MATAR UNA CELULA");
        botonMatarCelula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMatarCelulaActionPerformed(evt);
            }
        });

        rb1Cell.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        rb1Cell.setSelected(true);
        rb1Cell.setText("Una celula:");
        rb1Cell.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rb1CellStateChanged(evt);
            }
        });

        rbBaliza.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        rbBaliza.setText("Baliza: ");
        rbBaliza.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbBalizaStateChanged(evt);
            }
        });

        rbBlinker.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        rbBlinker.setText("Blinker:");
        rbBlinker.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbBlinkerStateChanged(evt);
            }
        });

        rbGlider.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        rbGlider.setText("Glider:");
        rbGlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbGliderStateChanged(evt);
            }
        });

        rbLightSS.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        rbLightSS.setText("Light Space Ship");
        rbLightSS.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbLightSSStateChanged(evt);
            }
        });

        rbSapo.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        rbSapo.setText("Sapo");
        rbSapo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbSapoStateChanged(evt);
            }
        });

        eNGen.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        eNGen.setForeground(new java.awt.Color(0, 0, 0));
        eNGen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eNGen.setText("N° Generacion: 0");

        botonReiniciar.setBackground(new java.awt.Color(51, 0, 153));
        botonReiniciar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        botonReiniciar.setForeground(new java.awt.Color(255, 255, 255));
        botonReiniciar.setText("REINICIAR JUEGO");
        botonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTableroLayout = new javax.swing.GroupLayout(panelTablero);
        panelTablero.setLayout(panelTableroLayout);
        panelTableroLayout.setHorizontalGroup(
            panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTableroLayout.createSequentialGroup()
                        .addGroup(panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTableroLayout.createSequentialGroup()
                                .addComponent(botonGrid, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addGroup(panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(eNGen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonSkipGen, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                                .addGap(100, 100, 100)
                                .addComponent(botonRules, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(panelTableroLayout.createSequentialGroup()
                        .addGroup(panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(eRepresentDot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(eRepresentX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(botonMatarTodo)
                            .addComponent(botonGenerar)
                            .addComponent(botonMatarCelula)
                            .addComponent(botonReiniciar))
                        .addGroup(panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTableroLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelTableroLayout.createSequentialGroup()
                                        .addGroup(panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelTableroLayout.createSequentialGroup()
                                                .addComponent(ePatrones)
                                                .addGap(18, 18, 18)
                                                .addComponent(eCoordenada, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(rbSapo)
                                            .addComponent(rbLightSS))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(panelTableroLayout.createSequentialGroup()
                                        .addGroup(panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbBaliza)
                                            .addComponent(rbBlinker)
                                            .addComponent(rbGlider)
                                            .addComponent(rb1Cell))
                                        .addGap(49, 49, 49)
                                        .addGroup(panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(panelTableroLayout.createSequentialGroup()
                                                .addComponent(eX1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cajaTy, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelTableroLayout.createSequentialGroup()
                                                .addComponent(eX)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cajaTx, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTableroLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(icon_Patron)
                                .addGap(81, 81, 81))))))
        );
        panelTableroLayout.setVerticalGroup(
            panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etTitulo)
                .addGap(18, 18, 18)
                .addGroup(panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelTableroLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eRepresentX, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eRepresentDot, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(botonMatarTodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonMatarCelula))
                    .addGroup(panelTableroLayout.createSequentialGroup()
                        .addGroup(panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ePatrones)
                            .addComponent(eCoordenada))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTableroLayout.createSequentialGroup()
                                .addComponent(rb1Cell)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbBaliza))
                            .addGroup(panelTableroLayout.createSequentialGroup()
                                .addGroup(panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(eX)
                                    .addComponent(cajaTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(eX1)
                                    .addComponent(cajaTy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbBlinker)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbGlider)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbLightSS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbSapo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(icon_Patron)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eNGen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGrid, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRules, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSkipGen, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo que al presionar el boton GRID, este mostrara graficamente las
     * celulas vivas o muertas.
     *
     * @param evt
     */
    private void botonGridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGridActionPerformed
        mostrarGrid();
    }//GEN-LAST:event_botonGridActionPerformed

    /**
     * Metodo que al presionar el boton Rules, este mostrara graficamente las
     * reglas del juego de la vida.
     *
     * @param evt
     */
    private void botonRulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRulesActionPerformed
        new WdRules(this, true).setVisible(true);
    }//GEN-LAST:event_botonRulesActionPerformed

    private void botonMatarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMatarTodoActionPerformed
        GRID.killCells();
        numGen = 0; //Reiniciamos el contador de generaciones
        actualizarTablero();
    }//GEN-LAST:event_botonMatarTodoActionPerformed

    private void botonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarActionPerformed
        cajaExcepcion();
        GRID.crearCell(rbSelected(), x, y);
        actualizarTablero();
    }//GEN-LAST:event_botonGenerarActionPerformed

    private void botonSkipGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSkipGenActionPerformed
        GRID.nextGen();
        numGen++;
        actualizarTablero();
    }//GEN-LAST:event_botonSkipGenActionPerformed

    private void botonMatarCelulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMatarCelulaActionPerformed
        cajaExcepcion();
        GRID.killCells(x, y);
        actualizarTablero();
    }//GEN-LAST:event_botonMatarCelulaActionPerformed

    private void rb1CellStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rb1CellStateChanged
        rbSelected(rb1Cell, "");
    }//GEN-LAST:event_rb1CellStateChanged

    private void rbBalizaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbBalizaStateChanged
        rbSelected(rbBaliza, "patronBaliza.png");
    }//GEN-LAST:event_rbBalizaStateChanged

    private void rbBlinkerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbBlinkerStateChanged
        rbSelected(rbBlinker, "patronBlinker.png");
    }//GEN-LAST:event_rbBlinkerStateChanged

    private void rbGliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbGliderStateChanged
        rbSelected(rbGlider, "patronGlider.png");
    }//GEN-LAST:event_rbGliderStateChanged

    private void rbLightSSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbLightSSStateChanged
        rbSelected(rbLightSS, "patronLightSpaceShip.png");
    }//GEN-LAST:event_rbLightSSStateChanged

    private void rbSapoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbSapoStateChanged
        rbSelected(rbSapo, "patronSapo.png");
    }//GEN-LAST:event_rbSapoStateChanged

    private void botonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReiniciarActionPerformed
        GRID.limpiarGrid();
        numGen = 0; //Reiniciamos el contador de generaciones
        actualizarTablero();
    }//GEN-LAST:event_botonReiniciarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaEjemplo;
    private javax.swing.JButton botonGenerar;
    private javax.swing.JButton botonGrid;
    private javax.swing.JButton botonMatarCelula;
    private javax.swing.JButton botonMatarTodo;
    private javax.swing.JButton botonReiniciar;
    private javax.swing.JButton botonRules;
    private javax.swing.JButton botonSkipGen;
    private javax.swing.JTextField cajaTx;
    private javax.swing.JTextField cajaTy;
    private javax.swing.JLabel eCoordenada;
    private javax.swing.JLabel eNGen;
    private javax.swing.JLabel ePatrones;
    private javax.swing.JLabel eRepresentDot;
    private javax.swing.JLabel eRepresentX;
    private javax.swing.JLabel eX;
    private javax.swing.JLabel eX1;
    private javax.swing.JLabel etTitulo;
    private javax.swing.JLabel icon_Patron;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelTablero;
    private javax.swing.JRadioButton rb1Cell;
    private javax.swing.JRadioButton rbBaliza;
    private javax.swing.JRadioButton rbBlinker;
    private javax.swing.JRadioButton rbGlider;
    private javax.swing.JRadioButton rbLightSS;
    private javax.swing.JRadioButton rbSapo;
    private javax.swing.ButtonGroup rdGrupo;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo que sirve para agrupar todos los RADIOBUTTON para solo poder
     * marcar una de las opciones.
     */
    private void agruparRB() {
        rdGrupo.add(rb1Cell);
        rdGrupo.add(rbBaliza);
        rdGrupo.add(rbBlinker);
        rdGrupo.add(rbGlider);
        rdGrupo.add(rbLightSS);
        rdGrupo.add(rbSapo);
    }

    /**
     * Metodo que cambia graficamente el menu dependiendo de que RADIO BUTTON se
     * presione.
     *
     * @param rb Radio boton seleccionado
     * @param strRB Nombre del archivo .png
     *
     */
    private int rbSelected(JRadioButton rb, String iconRb) {
        if (rb1Cell.isSelected()) {
            icon_Patron.setIcon(null); //Se deshabilita la imagen
            icon_Patron.setText("");
            botonMatarCelula.setEnabled(true);//Se habilita el boton cuando se presiona "Una celula"
        } else if (rb1Cell.isSelected() != true && rb.isSelected() == true) {
            botonMatarCelula.setEnabled(false);
            icon_Patron.setIcon(
                    new ImageIcon("C:\\Users\\msi\\Desktop\\ITL\\4to Semestre\\Estructura de datos\\ED2022\\src\\GoL\\Recursos\\" + iconRb));
        }
        return -1;
    }

    /**
     * Metodo que devuelve el patron seleccionado por los Radio Botones
     *
     * @return Entero 1 al 6
     */
    private int rbSelected() {
        if (rb1Cell.isSelected()) {
            return ControlCell.ONE_CELL;
        } else if (rbBaliza.isSelected()) {
            return ControlCell.BALIZA;
        } else if (rbBlinker.isSelected()) {
            return ControlCell.BLINKER;
        } else if (rbGlider.isSelected()) {
            return ControlCell.GLIDER;
        } else if (rbLightSS.isSelected()) {
            return ControlCell.LSS;
        } else if (rbSapo.isSelected()) {
            return ControlCell.SAPO;
        }
        return -1;
    }

    /**
     * Metodo que cuida la integridad de la caja de coordenadas verificando si
     * se ingresaron valores numericos
     */
    private void cajaExcepcion() {
        try {
            x = Integer.parseInt(cajaTx.getText());
            y = Integer.parseInt(cajaTy.getText());
        } catch (NumberFormatException e) {
            System.err.println("ERROR, NO SE INTRODUJO UN VALOR NUMERICO EN LAS COORDENADAS");
            JOptionPane.showMessageDialog(null, "ERROR AL INGRESAR COORDENADA"
                    + "\nPorfavor, introduzca valores numericos enteros");
            x = -1;
            y = -1;
        }
    }

    /**
     * Metodo que abre la ventana GRID.
     */
    private void mostrarGrid() {
        java.awt.EventQueue.invokeLater(new Runnable() {//Seguira en proceso cuando se cierre la ventana GRID.
            @Override
            public void run() {
                VENTANA_GRID.setVisible(true);
            }
        });
    }

    /**
     * Metodo que borra el contenido de la caja de texto de las coordenadas y
     * actualizar la ventana GRID.
     */
    private void actualizarTablero() {
        cajaTx.setText("0");
        cajaTy.setText("0");
        eNGen.setText("N° Generaciones: " + numGen);
        VENTANA_GRID.actualizarGrid(GRID);
    }
}
