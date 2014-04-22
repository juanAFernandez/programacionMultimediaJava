/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Lienzo.java
 *
 * Created on 18-mar-2014, 18:23:01
 */
package simplePaintV2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.util.ArrayList;

/**
 *
 * @author juan
 */
public class Lienzo extends javax.swing.JPanel {

    
    /*Atributos:
     * Todo lo necesario para representar cualquier tipo de objeto dentro 
     * de este pequeño paint. 
     * Un par de puntos, uno para el punto solo y los dos para la linea, al
     * menos un color y algún parámetro para el control del tipo de figura.
     */
    Point p;
    Color color;
    Point aLinea, bLinea;
    ArrayList <Shape> vShape;
    
    final static int PUNTO=1;

    private String figura="punto";
    private boolean relleno;
    private int forma;
    //Estilofinal  
    float dash1[] = {10.0f};
    final BasicStroke stroke;
    
    private Shape shapeTemporal;
    
    /** Creates new form Lienzo */
    public Lienzo() {
        initComponents();
        this.setBackground(Color.white);
        vShape = new ArrayList<Shape>();
        //Para que por defecto empiece con punto.
        forma=PUNTO;
        shapeTemporal=null;
        stroke = new BasicStroke (7.0F, BasicStroke.CAP_BUTT, 
                                  BasicStroke.JOIN_BEVEL);
    }
    
    
    
    //Métodos de la variable.
    public void setColor(Color nuevoColor){
        this.color=nuevoColor;
    }
    public Color getColor(){
        return this.color; 
    }
    
    //Para el control de la figura.

    public void setFigura(String nuevaFigura){
        this.figura=nuevaFigura;
    }
    public String getFigura(){
        return this.figura;
    }
    
    //Para el control del relleno.

    public void setRelleno(boolean nuevoEstado){
        this.relleno=nuevoEstado;
    }
    public boolean getRelleno(){
        return this.relleno;
    }
    
    
    public void clear(){
        this.p=null;
    }
    
    

    
    private void createShape(){
        switch(forma){
            case 1: //Punto
                shapeTemporal = new Line2D.Float(p,p);
                break;
        }
        vShape.add(shapeTemporal);
    }
    
     @Override
     public void paint (Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        
        g2d.setPaint(color);
        
        //g2d.setStroke(stroke);
        //Recorremos el vector de figuras
        for(Shape s:vShape) {
            if(relleno) 
                g2d.fill(s);
            g2d.draw(s);
        }
     }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        p=evt.getPoint();
        this.createShape();
        repaint();
    }//GEN-LAST:event_formMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        aLinea=evt.getPoint();
        
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        bLinea=evt.getPoint();
        repaint();
    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        repaint();
        
    }//GEN-LAST:event_formMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
