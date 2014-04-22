/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simplePaintV2;

/**
 *
 * @author juan
 */
public class simplePaint {
           public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                
                
                /*Antes de crear cualquier ventana, especificamos el "look and feel"
                de nuestro programa, en este caso sólo para que los bordes fueran un 
                poco más suaves. */
                try {
                    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                        }
                    }
                    } catch (ClassNotFoundException ex) {
                      java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                      } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                        } catch (IllegalAccessException ex) {
                          java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                            }
                
                
                new VentanaPrincipal().setVisible(true);
                
                
            }
        });
    }
}
