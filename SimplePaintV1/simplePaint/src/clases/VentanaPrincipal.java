/*
 * VentanaPrincipal.java
 *
 * Created on 18-mar-2014, 9:11:07
 */
package clases;
import java.awt.Color;
/**
 *
 * @author Juan Antonio Fernández Sánchez
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    /** Creates new form VentanaPrincipal */
    public VentanaPrincipal() {
        
        initComponents();
        //Para que se inicie a pantalla completa:
        this.setExtendedState(6);
        //Para colocar el título en el programa:
        this.setTitle("Simple Paint");
        //Para inicializar el mensaje de estado a punto:
        this.labelEstado.setText("Punto");
        //Para inicializar con el botón seleccionado del lapiz:
        this.lapizToggleButton.setSelected(true);
    }
    
        //EL paint de la JFrame está en la madre.

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        grupoBotonesBarraHerramientas = new javax.swing.ButtonGroup();
        panelNorte = new javax.swing.JPanel();
        barraHerramientas = new javax.swing.JToolBar();
        lapizToggleButton = new javax.swing.JToggleButton();
        lineaToggleBUtton = new javax.swing.JToggleButton();
        rectanguloToggleButton = new javax.swing.JToggleButton();
        ovaloToggleButton = new javax.swing.JToggleButton();
        panelSur = new javax.swing.JPanel();
        panelSurAbajo = new javax.swing.JPanel();
        labelEstado = new javax.swing.JLabel();
        panelSurEncima = new javax.swing.JPanel();
        botonNegro = new javax.swing.JButton();
        botonBlanco = new javax.swing.JButton();
        botonRojo = new javax.swing.JButton();
        botonAmarillo = new javax.swing.JButton();
        botonAzul = new javax.swing.JButton();
        botonVerde = new javax.swing.JButton();
        checkRelleno = new javax.swing.JCheckBox();
        lienzo1 = new clases.Lienzo();
        jMenuBar1 = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        Nuevo = new javax.swing.JMenuItem();
        Abrir = new javax.swing.JMenuItem();
        Guardar = new javax.swing.JMenuItem();
        Edicion = new javax.swing.JMenu();
        verBarraEstado = new javax.swing.JCheckBoxMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        barraHerramientas.setRollover(true);

        grupoBotonesBarraHerramientas.add(lapizToggleButton);
        lapizToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Lapiz.gif"))); // NOI18N
        lapizToggleButton.setFocusable(false);
        lapizToggleButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lapizToggleButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lapizToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapizToggleButtonActionPerformed(evt);
            }
        });
        barraHerramientas.add(lapizToggleButton);

        grupoBotonesBarraHerramientas.add(lineaToggleBUtton);
        lineaToggleBUtton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Linea.gif"))); // NOI18N
        lineaToggleBUtton.setFocusable(false);
        lineaToggleBUtton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lineaToggleBUtton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lineaToggleBUtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineaToggleBUttonActionPerformed(evt);
            }
        });
        barraHerramientas.add(lineaToggleBUtton);

        grupoBotonesBarraHerramientas.add(rectanguloToggleButton);
        rectanguloToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Rectangulo.gif"))); // NOI18N
        rectanguloToggleButton.setFocusable(false);
        rectanguloToggleButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rectanguloToggleButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        rectanguloToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectanguloToggleButtonActionPerformed(evt);
            }
        });
        barraHerramientas.add(rectanguloToggleButton);

        grupoBotonesBarraHerramientas.add(ovaloToggleButton);
        ovaloToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Ovalo.gif"))); // NOI18N
        ovaloToggleButton.setFocusable(false);
        ovaloToggleButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ovaloToggleButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ovaloToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovaloToggleButtonActionPerformed(evt);
            }
        });
        barraHerramientas.add(ovaloToggleButton);

        javax.swing.GroupLayout panelNorteLayout = new javax.swing.GroupLayout(panelNorte);
        panelNorte.setLayout(panelNorteLayout);
        panelNorteLayout.setHorizontalGroup(
            panelNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraHerramientas, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );
        panelNorteLayout.setVerticalGroup(
            panelNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraHerramientas, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        getContentPane().add(panelNorte, java.awt.BorderLayout.PAGE_START);

        panelSur.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelSurAbajoLayout = new javax.swing.GroupLayout(panelSurAbajo);
        panelSurAbajo.setLayout(panelSurAbajoLayout);
        panelSurAbajoLayout.setHorizontalGroup(
            panelSurAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSurAbajoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(515, Short.MAX_VALUE))
        );
        panelSurAbajoLayout.setVerticalGroup(
            panelSurAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSurAbajoLayout.createSequentialGroup()
                .addComponent(labelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelSur.add(panelSurAbajo, java.awt.BorderLayout.PAGE_END);

        botonNegro.setBackground(new java.awt.Color(-16777216,true));
        botonNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNegroActionPerformed(evt);
            }
        });

        botonBlanco.setBackground(new java.awt.Color(-1,true));
        botonBlanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBlancoActionPerformed(evt);
            }
        });

        botonRojo.setBackground(new java.awt.Color(-65536,true));
        botonRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRojoActionPerformed(evt);
            }
        });

        botonAmarillo.setBackground(new java.awt.Color(-256,true));
        botonAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAmarilloActionPerformed(evt);
            }
        });

        botonAzul.setBackground(new java.awt.Color(-16776961,true));
        botonAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAzulActionPerformed(evt);
            }
        });

        botonVerde.setBackground(new java.awt.Color(-16711936,true));
        botonVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerdeActionPerformed(evt);
            }
        });

        checkRelleno.setText("Relleno");
        checkRelleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRellenoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSurEncimaLayout = new javax.swing.GroupLayout(panelSurEncima);
        panelSurEncima.setLayout(panelSurEncimaLayout);
        panelSurEncimaLayout.setHorizontalGroup(
            panelSurEncimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSurEncimaLayout.createSequentialGroup()
                .addGroup(panelSurEncimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSurEncimaLayout.createSequentialGroup()
                        .addComponent(botonBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSurEncimaLayout.createSequentialGroup()
                        .addComponent(botonNegro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 420, Short.MAX_VALUE)
                .addComponent(checkRelleno)
                .addContainerGap())
        );
        panelSurEncimaLayout.setVerticalGroup(
            panelSurEncimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSurEncimaLayout.createSequentialGroup()
                .addGroup(panelSurEncimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonNegro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSurEncimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSurEncimaLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(checkRelleno)
                .addContainerGap())
        );

        panelSur.add(panelSurEncima, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelSur, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout lienzo1Layout = new javax.swing.GroupLayout(lienzo1);
        lienzo1.setLayout(lienzo1Layout);
        lienzo1Layout.setHorizontalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );
        lienzo1Layout.setVerticalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );

        getContentPane().add(lienzo1, java.awt.BorderLayout.CENTER);

        Archivo.setText("Archivo");

        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        Archivo.add(Nuevo);

        Abrir.setText("Abrir");
        Archivo.add(Abrir);

        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Guardar.gif"))); // NOI18N
        Guardar.setText("Guardar");
        Archivo.add(Guardar);

        jMenuBar1.add(Archivo);

        Edicion.setText("Edicion");

        verBarraEstado.setSelected(true);
        verBarraEstado.setText("ver barra de estado");
        Edicion.add(verBarraEstado);

        jMenuBar1.add(Edicion);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNegroActionPerformed
        this.lienzo1.setColor(Color.black);
        this.repaint();
    }//GEN-LAST:event_botonNegroActionPerformed

    private void botonRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRojoActionPerformed
        this.lienzo1.setColor(Color.red);
        this.repaint();
    }//GEN-LAST:event_botonRojoActionPerformed

    private void botonAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAzulActionPerformed
        this.lienzo1.setColor(Color.blue);
        this.repaint();
    }//GEN-LAST:event_botonAzulActionPerformed

    private void botonBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBlancoActionPerformed
        this.lienzo1.setColor(Color.white);
        this.repaint();
    }//GEN-LAST:event_botonBlancoActionPerformed

    private void botonAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAmarilloActionPerformed
        this.lienzo1.setColor(Color.yellow);
        this.repaint();
    }//GEN-LAST:event_botonAmarilloActionPerformed

    private void botonVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerdeActionPerformed
        this.lienzo1.setColor(Color.green);
        this.repaint();
    }//GEN-LAST:event_botonVerdeActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        this.lienzo1.clear();
        this.repaint();
    }//GEN-LAST:event_NuevoActionPerformed

    private void checkRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRellenoActionPerformed
        this.lienzo1.setRelleno(true);
        this.repaint();
    }//GEN-LAST:event_checkRellenoActionPerformed

    private void lapizToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapizToggleButtonActionPerformed
        this.labelEstado.setText("Punto");
        this.lienzo1.setFigura("punto");        
    }//GEN-LAST:event_lapizToggleButtonActionPerformed

    private void lineaToggleBUttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineaToggleBUttonActionPerformed
        this.labelEstado.setText("Linea");
        this.lienzo1.setFigura("linea");
    }//GEN-LAST:event_lineaToggleBUttonActionPerformed

    private void rectanguloToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectanguloToggleButtonActionPerformed
        this.labelEstado.setText("Rectángulo");
        this.lienzo1.p=null;
        this.lienzo1.aLinea=null;
        this.lienzo1.bLinea=null;
        this.lienzo1.setFigura("rectangulo");
    }//GEN-LAST:event_rectanguloToggleButtonActionPerformed

    private void ovaloToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovaloToggleButtonActionPerformed
        this.labelEstado.setText("Ovalo");
        this.lienzo1.setFigura("ovalo");
    }//GEN-LAST:event_ovaloToggleButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Abrir;
    private javax.swing.JMenu Archivo;
    private javax.swing.JMenu Edicion;
    private javax.swing.JMenuItem Guardar;
    private javax.swing.JMenuItem Nuevo;
    private javax.swing.JToolBar barraHerramientas;
    private javax.swing.JButton botonAmarillo;
    private javax.swing.JButton botonAzul;
    private javax.swing.JButton botonBlanco;
    private javax.swing.JButton botonNegro;
    private javax.swing.JButton botonRojo;
    private javax.swing.JButton botonVerde;
    private javax.swing.JCheckBox checkRelleno;
    private javax.swing.ButtonGroup grupoBotonesBarraHerramientas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JToggleButton lapizToggleButton;
    private clases.Lienzo lienzo1;
    private javax.swing.JToggleButton lineaToggleBUtton;
    private javax.swing.JToggleButton ovaloToggleButton;
    private javax.swing.JPanel panelNorte;
    private javax.swing.JPanel panelSur;
    private javax.swing.JPanel panelSurAbajo;
    private javax.swing.JPanel panelSurEncima;
    private javax.swing.JToggleButton rectanguloToggleButton;
    private javax.swing.JCheckBoxMenuItem verBarraEstado;
    // End of variables declaration//GEN-END:variables
}
