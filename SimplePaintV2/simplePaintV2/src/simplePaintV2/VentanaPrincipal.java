/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaPrincipal.java
 *
 * Created on 18-mar-2014, 9:11:07
 */
package simplePaintV2;

import java.awt.Color;
import java.util.ArrayList;


/**
 *
 * @author juan
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    /** Creates new form VentanaPrincipal */
    public VentanaPrincipal() {
        
        initComponents();
        this.setExtendedState(6);
        this.setTitle("Simple Paint");
        this.labelEstado.setText("Punto");
        this.lapizToggleButton.setSelected(true);
       
    }
    
     //Ventanas
     ArrayList ventanas = new ArrayList();
             
     //VentanaInterna vi = new VentanaInterna();
     
     
     
        //EL paint de la JFrame está en la madre.

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
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
        panelColores = new javax.swing.JPanel();
        botonAzul = new javax.swing.JButton();
        botonRojo = new javax.swing.JButton();
        botonNegro = new javax.swing.JButton();
        botonBlanco = new javax.swing.JButton();
        botonAmarillo = new javax.swing.JButton();
        botonVerde = new javax.swing.JButton();
        panelGrosor = new javax.swing.JPanel();
        spinner = new javax.swing.JSpinner();
        panelFormato = new javax.swing.JPanel();
        checkEditar = new javax.swing.JCheckBox();
        checkRelleno = new javax.swing.JCheckBox();
        escritorioCentro = new javax.swing.JDesktopPane();
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
        lapizToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simplePaintV2/iconos/Lapiz.gif"))); // NOI18N
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
        lineaToggleBUtton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simplePaintV2/iconos/Linea.gif"))); // NOI18N
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
        rectanguloToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simplePaintV2/iconos/Rectangulo.gif"))); // NOI18N
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
        ovaloToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simplePaintV2/iconos/Ovalo.gif"))); // NOI18N
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

        panelColores.setBorder(javax.swing.BorderFactory.createTitledBorder("Color"));

        botonAzul.setBackground(new java.awt.Color(-16776961,true));
        botonAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAzulActionPerformed(evt);
            }
        });

        botonRojo.setBackground(new java.awt.Color(-65536,true));
        botonRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRojoActionPerformed(evt);
            }
        });

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

        botonAmarillo.setBackground(new java.awt.Color(-256,true));
        botonAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAmarilloActionPerformed(evt);
            }
        });

        botonVerde.setBackground(new java.awt.Color(-16711936,true));
        botonVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerdeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelColoresLayout = new javax.swing.GroupLayout(panelColores);
        panelColores.setLayout(panelColoresLayout);
        panelColoresLayout.setHorizontalGroup(
            panelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelColoresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelColoresLayout.createSequentialGroup()
                        .addComponent(botonBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelColoresLayout.createSequentialGroup()
                        .addComponent(botonNegro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelColoresLayout.setVerticalGroup(
            panelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColoresLayout.createSequentialGroup()
                .addGroup(panelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonNegro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelGrosor.setBorder(javax.swing.BorderFactory.createTitledBorder("Grosor"));

        javax.swing.GroupLayout panelGrosorLayout = new javax.swing.GroupLayout(panelGrosor);
        panelGrosor.setLayout(panelGrosorLayout);
        panelGrosorLayout.setHorizontalGroup(
            panelGrosorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGrosorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelGrosorLayout.setVerticalGroup(
            panelGrosorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGrosorLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panelFormato.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        checkEditar.setText("Editar");
        checkEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkEditarActionPerformed(evt);
            }
        });

        checkRelleno.setText("Relleno");
        checkRelleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRellenoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFormatoLayout = new javax.swing.GroupLayout(panelFormato);
        panelFormato.setLayout(panelFormatoLayout);
        panelFormatoLayout.setHorizontalGroup(
            panelFormatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFormatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkRelleno)
                    .addComponent(checkEditar))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelFormatoLayout.setVerticalGroup(
            panelFormatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormatoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkRelleno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkEditar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelSurEncimaLayout = new javax.swing.GroupLayout(panelSurEncima);
        panelSurEncima.setLayout(panelSurEncimaLayout);
        panelSurEncimaLayout.setHorizontalGroup(
            panelSurEncimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSurEncimaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelGrosor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
        );
        panelSurEncimaLayout.setVerticalGroup(
            panelSurEncimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSurEncimaLayout.createSequentialGroup()
                .addGroup(panelSurEncimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelSurEncimaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(panelFormato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelSurEncimaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelSurEncimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelGrosor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelColores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        panelSur.add(panelSurEncima, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelSur, java.awt.BorderLayout.PAGE_END);
        getContentPane().add(escritorioCentro, java.awt.BorderLayout.CENTER);

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

        Guardar.setText("Guardar");
        Archivo.add(Guardar);

        jMenuBar1.add(Archivo);

        Edicion.setText("Edicion");

        verBarraEstado.setSelected(true);
        verBarraEstado.setText("Ver barra de estado");
        verBarraEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verBarraEstadoActionPerformed(evt);
            }
        });
        Edicion.add(verBarraEstado);

        jMenuBar1.add(Edicion);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNegroActionPerformed
       // this.lienzo1.setColor(Color.black);
        this.repaint();
    }//GEN-LAST:event_botonNegroActionPerformed

    private void botonRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRojoActionPerformed
        
       // this.lienzo1.setColor(Color.red);
        this.repaint();
    }//GEN-LAST:event_botonRojoActionPerformed

    private void botonAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAzulActionPerformed
        //this.lienzo1.setColor(Color.blue);
        this.repaint();
    }//GEN-LAST:event_botonAzulActionPerformed

    private void botonBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBlancoActionPerformed
        //this.lienzo1.setColor(Color.white);
        this.repaint();
    }//GEN-LAST:event_botonBlancoActionPerformed

    private void botonAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAmarilloActionPerformed
        //this.lienzo1.setColor(Color.yellow);
        this.repaint();
    }//GEN-LAST:event_botonAmarilloActionPerformed

    private void botonVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerdeActionPerformed
        //this.vi.setColor(Color.GREEN);
        //this.lienzo1.setColor(Color.green);
        this.repaint();
    }//GEN-LAST:event_botonVerdeActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        /*
         Tenemos un entorno multiventana, por tanto cada vez que pinchamos
         en nuevo, debe crearse una ventana nueva (vi) y añadirse al
         escritorio (DesktopPane), hacerse visible y volverse a pintar la ventana
         para que aparezca.*/
        VentanaInterna vi = new VentanaInterna();
        escritorioCentro.add(vi);
        vi.setVisible(true);
        this.repaint();
    }//GEN-LAST:event_NuevoActionPerformed

    private void checkRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRellenoActionPerformed
        //this.lienzo1.setRelleno(true);
        this.repaint();
    }//GEN-LAST:event_checkRellenoActionPerformed

//Acción al pulsar el botón/icono del lapiz en la barra de herramientas superior.
    private void lapizToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapizToggleButtonActionPerformed
        //Escribimos "Punto" en la barra de estado inferior.
        this.labelEstado.setText("Punto");
        //Asignamos el tipo de figura punto en la clase Lienzo.
        Lienzo.forma=Lienzo.PUNTO;
        //Lo que hacíamos antes: this.lienzo1.setFigura("punto");        
    }//GEN-LAST:event_lapizToggleButtonActionPerformed

    private void lineaToggleBUttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineaToggleBUttonActionPerformed
        this.labelEstado.setText("Linea");
        Lienzo.forma=Lienzo.LINEA;
    }//GEN-LAST:event_lineaToggleBUttonActionPerformed

    private void rectanguloToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectanguloToggleButtonActionPerformed
        this.labelEstado.setText("Rectángulo");
        Lienzo.forma=Lienzo.RECTANGULO;
    }//GEN-LAST:event_rectanguloToggleButtonActionPerformed

    private void ovaloToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovaloToggleButtonActionPerformed
        this.labelEstado.setText("Ovalo");
        Lienzo.forma=Lienzo.OVALO;
    }//GEN-LAST:event_ovaloToggleButtonActionPerformed

    private void checkEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkEditarActionPerformed

    private void verBarraEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verBarraEstadoActionPerformed
        
        if(this.verBarraEstado.getState()){
            this.panelSurAbajo.setVisible(true);
        }
        if(this.verBarraEstado.getState()==false){
            this.panelSurAbajo.setVisible(false);
        }
        this.repaint();
    }//GEN-LAST:event_verBarraEstadoActionPerformed

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
    private javax.swing.JCheckBox checkEditar;
    private javax.swing.JCheckBox checkRelleno;
    private javax.swing.JDesktopPane escritorioCentro;
    private javax.swing.ButtonGroup grupoBotonesBarraHerramientas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JToggleButton lapizToggleButton;
    private javax.swing.JToggleButton lineaToggleBUtton;
    private javax.swing.JToggleButton ovaloToggleButton;
    private javax.swing.JPanel panelColores;
    private javax.swing.JPanel panelFormato;
    private javax.swing.JPanel panelGrosor;
    private javax.swing.JPanel panelNorte;
    private javax.swing.JPanel panelSur;
    private javax.swing.JPanel panelSurAbajo;
    private javax.swing.JPanel panelSurEncima;
    private javax.swing.JToggleButton rectanguloToggleButton;
    private javax.swing.JSpinner spinner;
    private javax.swing.JCheckBoxMenuItem verBarraEstado;
    // End of variables declaration//GEN-END:variables
}
