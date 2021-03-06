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
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
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
    
    
    Point2D a, b;
    
    
    ArrayList <Shape> vShape;
    
    /*Variables globales de la clase Lienzo que nos serán
     * útiles para modificar la figura 
     */
    final static int PUNTO=1;
    final static int LINEA=2;
    final static int RECTANGULO=3;
    final static int OVALO=4;
    //Para que por defecto sea un punto.
    static int forma=PUNTO;

    private String figura="punto";
    
    
    private boolean relleno;

    
    //Estilofinal  
    float dash1[] = {10.0f};
    final BasicStroke stroke;
    
    //T
    private Shape figuraTemporal;
    
    /** Constructor de lienzo */
    public Lienzo() {
        initComponents();
        this.setBackground(Color.white);
        vShape = new ArrayList<Shape>();
        color=Color.BLACK;
        figuraTemporal=null;
       // stroke = new BasicStroke (7.0F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
        stroke=new BasicStroke(10f);
    }
    
    
    
    //Métodos de la variable.
    public void setColor(Color nuevoColor){
        this.color=nuevoColor;
    }
    public Color getColor(){
        return this.color; 
    }
    
    //Para el control de la figura ya no necesitamos usar métodos ya 
    //que usamos las variable globales de la clase.
    
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
    
    //Funcion para crear una figura y añadirla al vector de figuras (Shape=forma/figura)
    private void createShape(){
        /*Vamos a aprovechar las variables globales de la clase para crear el tipo de
         figura con un switch*/
        switch(forma){
            
            case PUNTO:
               //Para el punto no hay una función específica y usamos Line2D con el mismo punto.
               /*
                 El constructor funciona así:
                    public Line2D.Float(Point2D p1, Point2D p2)
                    Constructs and initializes a Line2D from the specified Point2D objects.
                    Parameters:
                    p1 - the start Point2D of this line segment 
                    p2 - the end Point2D of this line segment
                 */
               figuraTemporal = new Line2D.Float(a,a);
                break;
                
            case LINEA:
                figuraTemporal = new Line2D.Float(a, b);
                break;
                
            case RECTANGULO:
                figuraTemporal = new Rectangle2D.Double(p.getX(),p.getY(),1,1);
                break;
                
            case OVALO:
                figuraTemporal = new Ellipse2D.Double(p.getX(),p.getY(),1,1);
                break;
                
        }
        //Añadimos la figura creada al vector de figuras vShape:
        vShape.add(figuraTemporal);
    }
    
     @Override
     public void paint (Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        
        //Establecemos el color general.
        g2d.setPaint(color);
        
        //Establecemos el estilo, que podremos modificar.
        g2d.setStroke(stroke);
        
        //Recorremos el vector de figuras que fuimos llenando en createShape()
        for(Shape s:vShape) {
            if(a!=null){
            if(relleno) 
                g2d.fill(s);
            g2d.draw(s);
        }
        }
        System.out.println(vShape.size());        
     }

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
        //p=evt.getPoint();
        a=evt.getPoint();
        //System.out.println("X: "+a.getX()+" Y: "+a.getY());
        this.createShape();
        repaint();
    }//GEN-LAST:event_formMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        a=evt.getPoint();
        
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        //b=evt.getPoint();
        //repaint();
    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        b=evt.getPoint();
        this.createShape();
        repaint();
        
        
    }//GEN-LAST:event_formMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
