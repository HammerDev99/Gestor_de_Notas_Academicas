package sistemagestionnotas;

/**
 * @author1 Daniel Arbeláez Álvarez
 * @author2 Sebastián Mejía Serna
 */

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public final class SistemaGNotas extends javax.swing.JFrame 
{
    int ingresar;   
    
    public SistemaGNotas() 
    {
        initComponents();        
        
        //Dimension Dimen = getToolkit().getScreenSize(); //Obtiene el Tamaño de la Pantala
        //resize(Dimen.width, Dimen.height);//Ancho y Altura   
        setLocationRelativeTo(null);
        setResizable(false);   
    }

    public void setIngresar(int t)
    {
        ingresar = t;
    }
    
    public void pintarSaludo()
    {
        switch(ingresar)
        {
            case 0:
                lblWelcome.setText("Bienvenido Coordinador");
            break;
                
            case 1:
                lblWelcome.setText("Bienvenido Docente");                
            break;
                
            case 2:
                lblWelcome.setText("Bienvenido Estudiante");
            break;
                
            case 3:
                lblWelcome.setText("Bienvenido Secretario");
            break;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInferior = new javax.swing.JPanel();
        panelSuperior = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        desktopSGN = new javax.swing.JDesktopPane();
        btnCronograma = new javax.swing.JButton();
        btnEstudiantiles = new javax.swing.JButton();
        btnInstitucionales = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnBandera = new javax.swing.JButton();
        btnVirgen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestión de Notas Académicas");

        panelInferior.setBackground(new java.awt.Color(255, 255, 255));

        panelSuperior.setBackground(new java.awt.Color(255, 255, 255));

        lblWelcome.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(409, 409, 409))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        desktopSGN.setBackground(new java.awt.Color(0, 204, 255));

        btnCronograma.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnCronograma.setText("Cronograma Actividades");
        btnCronograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCronogramaActionPerformed(evt);
            }
        });

        btnEstudiantiles.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnEstudiantiles.setText("Datos Estudiantiles");
        btnEstudiantiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudiantilesActionPerformed(evt);
            }
        });

        btnInstitucionales.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnInstitucionales.setText("Datos Institucionales");
        btnInstitucionales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstitucionalesActionPerformed(evt);
            }
        });

        btnCerrarSesion.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        btnBandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemagestionnotas/imagenes/bandera.png"))); // NOI18N
        btnBandera.setToolTipText("Bandera de la Institución");
        btnBandera.setBorder(null);

        btnVirgen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemagestionnotas/imagenes/virgen.png"))); // NOI18N
        btnVirgen.setToolTipText("Nuestra Señora de Chiquinquirá");
        btnVirgen.setBorder(null);

        javax.swing.GroupLayout desktopSGNLayout = new javax.swing.GroupLayout(desktopSGN);
        desktopSGN.setLayout(desktopSGNLayout);
        desktopSGNLayout.setHorizontalGroup(
            desktopSGNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopSGNLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(btnVirgen, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addGroup(desktopSGNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCronograma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEstudiantiles, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInstitucionales, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(204, 204, 204)
                .addComponent(btnBandera, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        desktopSGNLayout.setVerticalGroup(
            desktopSGNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopSGNLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(desktopSGNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnBandera, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVirgen, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, desktopSGNLayout.createSequentialGroup()
                        .addComponent(btnCronograma, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnEstudiantiles, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInstitucionales, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        desktopSGN.setLayer(btnCronograma, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopSGN.setLayer(btnEstudiantiles, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopSGN.setLayer(btnInstitucionales, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopSGN.setLayer(btnCerrarSesion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopSGN.setLayer(btnBandera, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopSGN.setLayer(btnVirgen, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelInferiorLayout = new javax.swing.GroupLayout(panelInferior);
        panelInferior.setLayout(panelInferiorLayout);
        panelInferiorLayout.setHorizontalGroup(
            panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktopSGN)
        );
        panelInferiorLayout.setVerticalGroup(
            panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInferiorLayout.createSequentialGroup()
                .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopSGN))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEstudiantilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudiantilesActionPerformed
        
        switch(ingresar)
        {
            case 0:
                IframeCoordinador coordi = new IframeCoordinador();     
                Dimension panCor = Toolkit.getDefaultToolkit().getScreenSize(); //este metodo devuelve el tamaño de la pantalla 
                Dimension venCor = coordi.getSize(); //obtenemos el tamaño de la ventana 
                coordi.setLocation((panCor.width - venCor.width) / 2, (panCor.height - venCor.height) / 4); //para centrar la ventana lo hacemos con el siguiente calculo
                desktopSGN.add(coordi);           
                coordi.show();
            break;
                
            case 1:
                IframeDocente docen = new IframeDocente();
                Dimension panDoc = Toolkit.getDefaultToolkit().getScreenSize(); //este metodo devuelve el tamaño de la pantalla 
                Dimension venDoc = docen.getSize(); //obtenemos el tamaño de la ventana 
                docen.setLocation((panDoc.width - venDoc.width) / 2, (panDoc.height - venDoc.height) / 4); //para centrar la ventana lo hacemos con el siguiente calculo
                desktopSGN.add(docen);           
                docen.show();
            break;
                
            case 2:                
                IframeEstudiante estu = new IframeEstudiante();
                Dimension panEst = Toolkit.getDefaultToolkit().getScreenSize(); //este metodo devuelve el tamaño de la pantalla 
                Dimension venEst = estu.getSize(); //obtenemos el tamaño de la ventana 
                estu.setLocation((panEst.width - venEst.width) / 2, (panEst.height - venEst.height) / 4); //para centrar la ventana lo hacemos con el siguiente calculo
                desktopSGN.add(estu);           
                estu.show();
            break;
                
            case 3:
                IframeSecretario secre = new IframeSecretario();
                Dimension panSec = Toolkit.getDefaultToolkit().getScreenSize(); //este metodo devuelve el tamaño de la pantalla 
                Dimension venSec = secre.getSize(); //obtenemos el tamaño de la ventana 
                secre.setLocation((panSec.width - venSec.width) / 2, (panSec.height - venSec.height) / 4); //para centrar la ventana lo hacemos con el siguiente calculo
                desktopSGN.add(secre);           
                secre.show();
            break;
        }
    }//GEN-LAST:event_btnEstudiantilesActionPerformed

    private void btnCronogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCronogramaActionPerformed
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize(); //este metodo devuelve el tamaño de la pantalla  
        IframeCronograma crono = new IframeCronograma();
        
        Dimension ventana = crono.getSize(); //obtenemos el tamaño de la ventana 
        crono.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 4); //para centrar la ventana lo hacemos con el siguiente calculo
                       
        desktopSGN.add(crono);           
        crono.show();
    }//GEN-LAST:event_btnCronogramaActionPerformed

    private void btnInstitucionalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstitucionalesActionPerformed
        DialogInformaciónColegio infor = new DialogInformaciónColegio(this,true);
        infor.setVisible(true);
    }//GEN-LAST:event_btnInstitucionalesActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        int salir = JOptionPane.showConfirmDialog(null,"Seguro que Desea Cerrar Sesión","Confirmar",JOptionPane.YES_NO_OPTION);
        if(JOptionPane.YES_OPTION == salir)
        {
            dispose();
            frameInicioSesion inicio = new frameInicioSesion();
            inicio.setVisible(true);
        }
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    public void tipoUsuario()
    {
        
    }
    
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
            java.util.logging.Logger.getLogger(SistemaGNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaGNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaGNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaGNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaGNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBandera;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCronograma;
    private javax.swing.JButton btnEstudiantiles;
    private javax.swing.JButton btnInstitucionales;
    private javax.swing.JButton btnVirgen;
    private javax.swing.JDesktopPane desktopSGN;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelSuperior;
    // End of variables declaration//GEN-END:variables
}
