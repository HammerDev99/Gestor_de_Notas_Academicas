package sistemagestionnotas;

/**
 * @author1 Daniel Arbeláez Álvarez
 * @author2 Sebastián Mejía Serna
 */

public class framePresentación extends javax.swing.JFrame 
{
    
    public framePresentación() 
    {
        initComponents();
        
        new Thread(new Tempo()).start();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        progreso = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestión de Notas Académicas");

        jPanel1.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.BorderLayout());

        progreso.setBackground(new java.awt.Color(0, 255, 255));
        progreso.setForeground(new java.awt.Color(255, 0, 0));
        progreso.setStringPainted(true);
        jPanel2.add(progreso, java.awt.BorderLayout.PAGE_END);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemagestionnotas/imagenes/presentacion.jpg"))); // NOI18N
        jPanel2.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(framePresentación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(framePresentación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(framePresentación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(framePresentación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new framePresentación().setVisible(true);
            }
        });
    }
    
    private class Tempo implements Runnable
    {
        @Override
        public void run()
        {
            for(int i = 0; i <= 100; i++)
            {
                progreso.setValue(i);
                progreso.repaint();
                try
                {            
                    Thread.sleep(100);// pausa para el splash                    
                }
                catch(InterruptedException ex)
                {
                    System.out.println("Error " + ex.getMessage());
                }
            }
            dispose();
            new frameInicioSesion().setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar progreso;
    // End of variables declaration//GEN-END:variables

}
