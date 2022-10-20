/*
 * NOMBRE: Fisher
 * FECHA: 15/05/22
 * PROYECTO: ED2022
 */
package AdivinaPalabra;

import java.awt.Color;
import java.util.Set;
import javax.swing.JLabel;

/**
 * Clase que muestra el menu del Juego de adivinar palabras
 *
 * @author Fisherk2
 */
public class MenuJuego extends javax.swing.JFrame {

    private int numIntento;
    private String strIntento, palabraCorrecta;
    private boolean guess; //ADIVINO?
    //NO ESTA PERMITIDO MODIFICAR EL FICHERO DURANTE LA EJECUCION
    private final BancoPalabras BANCO = new BancoPalabras();
    private final Teclado TECLAS_BLOQ = new Teclado();

    //CONSTRUCTOR DE LA VENTANA DEL JUEGO
    public MenuJuego() {
        initComponents();//CODIGO GENERADO
        numIntento = 1;
        areaTexto.setText("Bienvenido!" + "\nTrata de adivinar" + "\nTienes 5 intentos\n");
        palabraCorrecta = BANCO.getPalabra(); //SE ASIGNARA UNA PALABRA DEL BANCO DE PALABRAS
        guess = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        cajaPalabra = new javax.swing.JTextField();
        botonExit = new javax.swing.JButton();
        botonGuess = new javax.swing.JButton();
        botonNewG = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        labelSubtitulo = new javax.swing.JLabel();
        labelPalabra = new javax.swing.JLabel();
        msjPCorrecta = new javax.swing.JLabel();
        msjResultado = new javax.swing.JLabel();
        labelTeclasB = new javax.swing.JLabel();
        qTecla = new javax.swing.JLabel();
        aTecla = new javax.swing.JLabel();
        zTecla = new javax.swing.JLabel();
        wTecla = new javax.swing.JLabel();
        sTecla = new javax.swing.JLabel();
        xTecla = new javax.swing.JLabel();
        eTecla = new javax.swing.JLabel();
        dTecla = new javax.swing.JLabel();
        cTecla = new javax.swing.JLabel();
        rTecla = new javax.swing.JLabel();
        fTecla = new javax.swing.JLabel();
        vTecla = new javax.swing.JLabel();
        tTecla = new javax.swing.JLabel();
        gTecla = new javax.swing.JLabel();
        bTecla = new javax.swing.JLabel();
        yTecla = new javax.swing.JLabel();
        hTecla = new javax.swing.JLabel();
        nTecla = new javax.swing.JLabel();
        uTecla = new javax.swing.JLabel();
        jTecla = new javax.swing.JLabel();
        mTecla = new javax.swing.JLabel();
        iTecla = new javax.swing.JLabel();
        kTecla = new javax.swing.JLabel();
        oTecla = new javax.swing.JLabel();
        lTecla = new javax.swing.JLabel();
        pTecla = new javax.swing.JLabel();
        ñTecla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADIVINA LA PALABRA");
        setLocationByPlatform(true);
        setResizable(false);

        panelMain.setBackground(new java.awt.Color(204, 204, 255));
        panelMain.setAutoscrolls(true);

        labelTitulo.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 48)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("WORD GUESS GAME");

        cajaPalabra.setFont(new java.awt.Font("Dubai", 0, 36)); // NOI18N
        cajaPalabra.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        botonExit.setBackground(new java.awt.Color(255, 0, 51));
        botonExit.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        botonExit.setText("EXIT");
        botonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExitActionPerformed(evt);
            }
        });

        botonGuess.setBackground(new java.awt.Color(51, 255, 51));
        botonGuess.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        botonGuess.setText("GUESS");
        botonGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuessActionPerformed(evt);
            }
        });

        botonNewG.setBackground(new java.awt.Color(0, 204, 255));
        botonNewG.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        botonNewG.setText("NEW GAME");
        botonNewG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNewGActionPerformed(evt);
            }
        });

        areaTexto.setEditable(false);
        areaTexto.setBackground(new java.awt.Color(102, 102, 102));
        areaTexto.setColumns(20);
        areaTexto.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        areaTexto.setForeground(new java.awt.Color(255, 255, 255));
        areaTexto.setRows(5);
        jScrollPane1.setViewportView(areaTexto);

        labelSubtitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelSubtitulo.setForeground(new java.awt.Color(0, 0, 153));
        labelSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelSubtitulo.setText("ADIVINA LA PALABRA:");

        labelPalabra.setForeground(new java.awt.Color(0, 102, 0));
        labelPalabra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelPalabra.setText("LA PALABRA FUE:");

        msjPCorrecta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        msjPCorrecta.setForeground(new java.awt.Color(0, 153, 0));
        msjPCorrecta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msjPCorrecta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        msjResultado.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        msjResultado.setForeground(new java.awt.Color(255, 0, 0));
        msjResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        labelTeclasB.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        labelTeclasB.setForeground(new java.awt.Color(102, 0, 102));
        labelTeclasB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTeclasB.setText("TECLAS BLOQUEADAS");

        qTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        qTecla.setForeground(new java.awt.Color(0, 0, 204));
        qTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qTecla.setText("Q");

        aTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        aTecla.setForeground(new java.awt.Color(0, 0, 204));
        aTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTecla.setText("A");

        zTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        zTecla.setForeground(new java.awt.Color(0, 0, 204));
        zTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zTecla.setText("Z");

        wTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        wTecla.setForeground(new java.awt.Color(0, 0, 204));
        wTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wTecla.setText("W");

        sTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        sTecla.setForeground(new java.awt.Color(0, 0, 204));
        sTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sTecla.setText("S");

        xTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        xTecla.setForeground(new java.awt.Color(0, 0, 204));
        xTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xTecla.setText("X");

        eTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        eTecla.setForeground(new java.awt.Color(0, 0, 204));
        eTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eTecla.setText("E");

        dTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        dTecla.setForeground(new java.awt.Color(0, 0, 204));
        dTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dTecla.setText("D");

        cTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        cTecla.setForeground(new java.awt.Color(0, 0, 204));
        cTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cTecla.setText("C");

        rTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        rTecla.setForeground(new java.awt.Color(0, 0, 204));
        rTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rTecla.setText("R");

        fTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        fTecla.setForeground(new java.awt.Color(0, 0, 204));
        fTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fTecla.setText("F");

        vTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        vTecla.setForeground(new java.awt.Color(0, 0, 204));
        vTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vTecla.setText("V");

        tTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        tTecla.setForeground(new java.awt.Color(0, 0, 204));
        tTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tTecla.setText("T");

        gTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        gTecla.setForeground(new java.awt.Color(0, 0, 204));
        gTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gTecla.setText("G");

        bTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        bTecla.setForeground(new java.awt.Color(0, 0, 204));
        bTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bTecla.setText("B");

        yTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        yTecla.setForeground(new java.awt.Color(0, 0, 204));
        yTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yTecla.setText("Y");

        hTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        hTecla.setForeground(new java.awt.Color(0, 0, 204));
        hTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hTecla.setText("H");

        nTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        nTecla.setForeground(new java.awt.Color(0, 0, 204));
        nTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nTecla.setText("N");

        uTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        uTecla.setForeground(new java.awt.Color(0, 0, 204));
        uTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uTecla.setText("U");

        jTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jTecla.setForeground(new java.awt.Color(0, 0, 204));
        jTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTecla.setText("J");

        mTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        mTecla.setForeground(new java.awt.Color(0, 0, 204));
        mTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mTecla.setText("M");

        iTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        iTecla.setForeground(new java.awt.Color(0, 0, 204));
        iTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iTecla.setText("I");

        kTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        kTecla.setForeground(new java.awt.Color(0, 0, 204));
        kTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kTecla.setText("K");

        oTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        oTecla.setForeground(new java.awt.Color(0, 0, 204));
        oTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oTecla.setText("O");

        lTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lTecla.setForeground(new java.awt.Color(0, 0, 204));
        lTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTecla.setText("L");

        pTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        pTecla.setForeground(new java.awt.Color(0, 0, 204));
        pTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pTecla.setText("P");

        ñTecla.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        ñTecla.setForeground(new java.awt.Color(0, 0, 204));
        ñTecla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ñTecla.setText("Ñ");

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelSubtitulo)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelTeclasB, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(zTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(qTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(xTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(wTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelMainLayout.createSequentialGroup()
                                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(uTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(iTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(kTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(oTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ñTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(msjResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(botonGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonNewG, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPalabra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(msjPCorrecta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cajaPalabra))
                .addGap(0, 26, Short.MAX_VALUE))
            .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGap(31, 31, 31)
                .addComponent(labelSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cajaPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(msjPCorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(botonNewG, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botonGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelPalabra)))
                        .addGap(18, 18, 18)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(labelTeclasB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelMainLayout.createSequentialGroup()
                                        .addComponent(qTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(aTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(zTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                                        .addComponent(wTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(xTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                                        .addComponent(rTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(vTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                                        .addComponent(tTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(gTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelMainLayout.createSequentialGroup()
                                        .addComponent(yTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelMainLayout.createSequentialGroup()
                                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelMainLayout.createSequentialGroup()
                                                .addComponent(uTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelMainLayout.createSequentialGroup()
                                                .addComponent(iTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(kTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelMainLayout.createSequentialGroup()
                                                .addComponent(oTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelMainLayout.createSequentialGroup()
                                                .addComponent(pTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ñTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelMainLayout.createSequentialGroup()
                                        .addComponent(eTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(87, 87, 87)
                                .addComponent(msjResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(botonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo que al presionar el boton GUESS, estara trabajando con la caja de
     * texto ingresada por el usuario
     *
     * @param evt
     */
    private void botonGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuessActionPerformed
        if (numIntento == 5) {
            strIntento = cajaPalabra.getText(); //Tomamos el valor de la caja
            areaTexto.append("\nIntento numero " + numIntento + ": \n" + strIntento); //Añade mas texto a la area
            msjResultado.setText("INTENTOS TERMINADOS, PERDISTE :C");
            terminarJuego(guess);
        } else {
            strIntento = cajaPalabra.getText(); //Tomamos el valor de la caja
            areaTexto.append("\nIntento numero " + numIntento + ": \n" + strIntento); //Añade mas texto a la area
        }
        guess = adivinoPalabra();//ADIVINO LA PALABRA?
        bloquearTeclas(strIntento);
        limpiarCaja();
        numIntento++;
    }//GEN-LAST:event_botonGuessActionPerformed

    private void botonNewGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNewGActionPerformed
        restaurarJuego();
    }//GEN-LAST:event_botonNewGActionPerformed

    private void botonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExitActionPerformed
        System.exit(0); //EL PROGRAMA TERMINA
    }//GEN-LAST:event_botonExitActionPerformed

    /**
     * Metodo que limpiara la caja de texto
     */
    private void limpiarCaja() {
        cajaPalabra.setText("");
    }

    /**
     * Metodo que reinicia los valores de algunos componentes para un nuevo
     * juego.
     */
    private void restaurarJuego() {
        areaTexto.setText("Hola de nuevo!" + "\nTrata de adivinar" + "\nTienes 5 intentos\n");
        numIntento = 1;
        guess = false;
        botonGuess.setEnabled(true); //Desbloqueamos el boton
        cajaPalabra.setEditable(true); //Desbloqueamos la caja
        msjResultado.setText("");
        msjResultado.setForeground(Color.red);
        msjPCorrecta.setText("");
        limpiarCaja();
        //REASIGNAMOS UNA NUEVA PALABRA ALEATORIA DEL BANCO DE PALABRAS
        BANCO.setPalabraRandom();
        palabraCorrecta = BANCO.getPalabra();
        desbloquearLetras();
    }

    /**
     * Metodo que compara el texto ingresado en la caja con la palabra correcta.
     *
     * @return TRUE: La palabra que ingresaste fue la correcta, FALSE: La
     * palabra que ingresaste fue la incorrecta.
     */
    private boolean adivinoPalabra() {
        if (strIntento.equalsIgnoreCase(palabraCorrecta)) {
            msjResultado.setText("FELICIDADES, ACERTASTE :D");
            msjResultado.setForeground(Color.green);
            terminarJuego(true);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo que bloquea los botones y muestra la respuesta correcta
     *
     * @param guess Es el resultado de la comparacion de la caja de texto y la
     * palabra a adivinar.
     */
    private void terminarJuego(boolean guess) {
        //SIRVE PARA NO DUPLICAR EL AREA DE TEXTO CUANDO SE ADIVINE EN EL QUINTO INTENTO
        if (guess) {
            botonGuess.setEnabled(false); //Bloqueamos el boton
            cajaPalabra.setEditable(false); //Bloqueamos la caja
            msjPCorrecta.setText(palabraCorrecta);
        } else {
            areaTexto.append("\nJUEGO TERMINADO" + "\nINICIA OTRO NUEVO JUEGO\n");
            botonGuess.setEnabled(false); //Bloqueamos el boton
            cajaPalabra.setEditable(false); //Bloqueamos la caja
            msjPCorrecta.setText(palabraCorrecta);
        }

    }

    /**
     * Metodo que bloquea las letras que fueron erroneas en el intento
     *
     * @param intento La palabra que se intento adivinar
     */
    private void bloquearTeclas(String intento) {
        TECLAS_BLOQ.bloqTeclas(intento, palabraCorrecta);

//        Set<Character> teclasBloqueadas = TECLAS_BLOQ.getLetrasBloqueadas();//SET
        char[] teclasBloqueadas = TECLAS_BLOQ.getArregloCaracteres();

        System.out.println("\nTECLAS BLOQUEADAS:");
        for (char tecla : teclasBloqueadas) {
            System.out.print(tecla + ", ");
            cambiarColor(tecla);
        }
    }

    /**
     * Metodo que cambia de color de la fuente de las etiquetas de teclados
     *
     * @param tecla Letra que va cambiar de color
     */
    private void cambiarColor(Character tecla) {
        JLabel[] arregloEtiquetas = new JLabel[panelMain.getComponentCount()];

        //ALMACENAR SOLO LOS COMPONENTES JLABEL EN EL ARREGLO DE ETIQUETAS
        for (int i = 0, j = 0; i < arregloEtiquetas.length; i++) {
            if (panelMain.getComponent(i).getClass() == qTecla.getClass()) {
                arregloEtiquetas[j] = (JLabel) panelMain.getComponent(i);
                j++;
            }
        }
        //CAMBIAR DE COLOR LA LETRA DE LA ETIQUETA QUE COINCIDA CON EL DEL PARAMETRO
        for (JLabel etiqueta : arregloEtiquetas) {
            //COMPARARA LAS ETIQUETAS QUE SOLO TENGAN UNA LETRA
            if (etiqueta != null && etiqueta.getText().length() == 1) {
                if (etiqueta.getText().toLowerCase().charAt(0) == tecla) {
                    etiqueta.setForeground(Color.red);
                }
                if (tecla == '|') {
                    etiqueta.setForeground(Color.blue);
                }
            }
        }

//        switch (tecla) {
//            case 'q':
//                qTecla.setForeground(Color.red);
//                break;
//            case 'a':
//                aTecla.setForeground(Color.red);
//                break;
//            case 'z':
//                zTecla.setForeground(Color.red);
//                break;
//            case 'w':
//                wTecla.setForeground(Color.red);
//                break;
//            case 's':
//                sTecla.setForeground(Color.red);
//                break;
//            case 'x':
//                xTecla.setForeground(Color.red);
//                break;
//            case 'e':
//                eTecla.setForeground(Color.red);
//                break;
//            case 'd':
//                dTecla.setForeground(Color.red);
//                break;
//            case 'c':
//                cTecla.setForeground(Color.red);
//                break;
//            case 'r':
//                rTecla.setForeground(Color.red);
//                break;
//            case 'f':
//                fTecla.setForeground(Color.red);
//                break;
//            case 'v':
//                vTecla.setForeground(Color.red);
//                break;
//            case 't':
//                tTecla.setForeground(Color.red);
//                break;
//            case 'g':
//                gTecla.setForeground(Color.red);
//                break;
//            case 'b':
//                bTecla.setForeground(Color.red);
//                break;
//            case 'y':
//                yTecla.setForeground(Color.red);
//                break;
//            case 'h':
//                hTecla.setForeground(Color.red);
//                break;
//            case 'n':
//                nTecla.setForeground(Color.red);
//                break;
//            case 'u':
//                uTecla.setForeground(Color.red);
//                break;
//            case 'j':
//                jTecla.setForeground(Color.red);
//                break;
//            case 'm':
//                mTecla.setForeground(Color.red);
//                break;
//            case 'i':
//                iTecla.setForeground(Color.red);
//                break;
//            case 'k':
//                kTecla.setForeground(Color.red);
//                break;
//            case 'o':
//                oTecla.setForeground(Color.red);
//                break;
//            case 'l':
//                lTecla.setForeground(Color.red);
//                break;
//            case 'p':
//                pTecla.setForeground(Color.red);
//                break;
//            case 'ñ':
//                ñTecla.setForeground(Color.red);
//                break;
//            default:
//                qTecla.setForeground(Color.blue);
//                aTecla.setForeground(Color.blue);
//                zTecla.setForeground(Color.blue);
//                wTecla.setForeground(Color.blue);
//                sTecla.setForeground(Color.blue);
//                xTecla.setForeground(Color.blue);
//                eTecla.setForeground(Color.blue);
//                dTecla.setForeground(Color.blue);
//                cTecla.setForeground(Color.blue);
//                rTecla.setForeground(Color.blue);
//                fTecla.setForeground(Color.blue);
//                vTecla.setForeground(Color.blue);
//                tTecla.setForeground(Color.blue);
//                gTecla.setForeground(Color.blue);
//                bTecla.setForeground(Color.blue);
//                yTecla.setForeground(Color.blue);
//                hTecla.setForeground(Color.blue);
//                nTecla.setForeground(Color.blue);
//                uTecla.setForeground(Color.blue);
//                jTecla.setForeground(Color.blue);
//                mTecla.setForeground(Color.blue);
//                iTecla.setForeground(Color.blue);
//                kTecla.setForeground(Color.blue);
//                oTecla.setForeground(Color.blue);
//                lTecla.setForeground(Color.blue);
//                pTecla.setForeground(Color.blue);
//                ñTecla.setForeground(Color.blue);
//        }
    }

    private void desbloquearLetras() {
        TECLAS_BLOQ.desbloquearTeclas(); //Desbloqueamos las teclas
        cambiarColor('|'); //Restaura todos los colores del teclado
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aTecla;
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JLabel bTecla;
    private javax.swing.JButton botonExit;
    private javax.swing.JButton botonGuess;
    private javax.swing.JButton botonNewG;
    private javax.swing.JLabel cTecla;
    private javax.swing.JTextField cajaPalabra;
    private javax.swing.JLabel dTecla;
    private javax.swing.JLabel eTecla;
    private javax.swing.JLabel fTecla;
    private javax.swing.JLabel gTecla;
    private javax.swing.JLabel hTecla;
    private javax.swing.JLabel iTecla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTecla;
    private javax.swing.JLabel kTecla;
    private javax.swing.JLabel lTecla;
    private javax.swing.JLabel labelPalabra;
    private javax.swing.JLabel labelSubtitulo;
    private javax.swing.JLabel labelTeclasB;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel mTecla;
    private javax.swing.JLabel msjPCorrecta;
    private javax.swing.JLabel msjResultado;
    private javax.swing.JLabel nTecla;
    private javax.swing.JLabel oTecla;
    private javax.swing.JLabel pTecla;
    private javax.swing.JPanel panelMain;
    private javax.swing.JLabel qTecla;
    private javax.swing.JLabel rTecla;
    private javax.swing.JLabel sTecla;
    private javax.swing.JLabel tTecla;
    private javax.swing.JLabel uTecla;
    private javax.swing.JLabel vTecla;
    private javax.swing.JLabel wTecla;
    private javax.swing.JLabel xTecla;
    private javax.swing.JLabel yTecla;
    private javax.swing.JLabel zTecla;
    private javax.swing.JLabel ñTecla;
    // End of variables declaration//GEN-END:variables

    public String getStrIntento() {
        return strIntento;
    }

    public String getPalabraCorrecta() {
        return palabraCorrecta;
    }

}
