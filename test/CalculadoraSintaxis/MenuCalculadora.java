/*
 * NOMBRE: Fisher
 * FECHA: 28/05/22
 * PROYECTO: ED2022
 */
package CalculadoraSintaxis;

import java.awt.Color;

/**
 * Clase que muestra graficamente la entrada donde se verificara la sintaxis de
 * una calculadora sencilla.
 *
 * @author Fisherk2
 */
public class MenuCalculadora extends javax.swing.JFrame {

    private Sintaxis syntaxCal;
    private String entrada, respuesta;

    public MenuCalculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        eTitulo = new javax.swing.JLabel();
        cajaCalculadora = new javax.swing.JTextField();
        botonSubmit = new javax.swing.JButton();
        eResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora sencilla");
        setResizable(false);

        panelMenu.setBackground(new java.awt.Color(255, 153, 153));

        eTitulo.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        eTitulo.setForeground(new java.awt.Color(0, 0, 0));
        eTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eTitulo.setText("PRUEBA SINTAXIS DE UNA CALCULADORA SENCILLA");

        cajaCalculadora.setBackground(new java.awt.Color(51, 51, 51));
        cajaCalculadora.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        cajaCalculadora.setForeground(new java.awt.Color(255, 255, 255));
        cajaCalculadora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaCalculadora.setText("[(5+10)*15]/12");

        botonSubmit.setBackground(new java.awt.Color(51, 51, 51));
        botonSubmit.setFont(new java.awt.Font("Lato", 1, 36)); // NOI18N
        botonSubmit.setForeground(new java.awt.Color(255, 255, 255));
        botonSubmit.setText("Submit");
        botonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSubmitActionPerformed(evt);
            }
        });

        eResultado.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        eResultado.setForeground(new java.awt.Color(0, 102, 0));
        eResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eResultado.setText("Aqui aparecera la respuesta de la entrada enviada a la sintaxis");

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajaCalculadora)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addComponent(botonSubmit)
                        .addGap(18, 18, 18)
                        .addComponent(eResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eTitulo)
                .addGap(27, 27, 27)
                .addComponent(cajaCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSubmitActionPerformed
        entrada = cajaCalculadora.getText();
        syntaxCal = new SyntaxSencillo(entrada);
        respuesta = syntaxCal.getRespuesta();
        if (syntaxCal.estaBienEscrito) {
            eResultado.setForeground(Color.BLUE);
            eResultado.setText(respuesta);
        }
        eResultado.setForeground(Color.RED);
        eResultado.setText(respuesta);
    }//GEN-LAST:event_botonSubmitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSubmit;
    private javax.swing.JTextField cajaCalculadora;
    private javax.swing.JLabel eResultado;
    private javax.swing.JLabel eTitulo;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables

}
