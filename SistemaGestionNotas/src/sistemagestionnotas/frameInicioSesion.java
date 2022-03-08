package sistemagestionnotas;

/**
 * @author1 Daniel Arbeláez Álvarez
 * @author2 Sebastián Mejía Serna
 */

import javax.swing.JOptionPane;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

public class frameInicioSesion extends javax.swing.JFrame 
{

    public frameInicioSesion() 
    {
        initComponents();
        //Dimension Dimen = getToolkit().getScreenSize(); //Obtiene el Tamaño de la Pantala
        //           Ancho        Altura
        //resize(Dimen.width, Dimen.height);
        setLocationRelativeTo(null);
        setResizable(false); 
        lblError.setForeground(new Color(0,204,255));
        lblError.setText(" ");
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        lblContraseña = new javax.swing.JLabel();
        lblNomUsua = new javax.swing.JLabel();
        txtNomUsu = new javax.swing.JTextField();
        lblTipoUsua = new javax.swing.JLabel();
        lblNomColeg = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtNomColeg = new javax.swing.JTextField();
        jPanelInicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnInformación = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestión de Notas Académicas");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanelPrincipal.setBackground(new java.awt.Color(0, 204, 255));
        jPanelPrincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanelPrincipalKeyPressed(evt);
            }
        });

        lblContraseña.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("Contraseña");

        lblNomUsua.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblNomUsua.setForeground(new java.awt.Color(255, 255, 255));
        lblNomUsua.setText("Nombre de Usuario");

        txtNomUsu.setBackground(new java.awt.Color(240, 240, 240));
        txtNomUsu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomUsu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNomUsuMouseClicked(evt);
            }
        });
        txtNomUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomUsuActionPerformed(evt);
            }
        });

        lblTipoUsua.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTipoUsua.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoUsua.setText("Tipo de Usuario");

        lblNomColeg.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblNomColeg.setForeground(new java.awt.Color(255, 255, 255));
        lblNomColeg.setText("Nombre del Colegio");

        btnIngresar.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtNomColeg.setEditable(false);
        txtNomColeg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomColeg.setText("Nuestra Señora de Chiquinquirá");
        txtNomColeg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNomColegMouseClicked(evt);
            }
        });

        jPanelInicio.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("Iniciar Sesión");

        javax.swing.GroupLayout jPanelInicioLayout = new javax.swing.GroupLayout(jPanelInicio);
        jPanelInicio.setLayout(jPanelInicioLayout);
        jPanelInicioLayout.setHorizontalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(428, 428, 428))
        );
        jPanelInicioLayout.setVerticalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        txtContraseña.setBackground(new java.awt.Color(240, 240, 240));
        txtContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraseñaMouseClicked(evt);
            }
        });

        btnInformación.setBackground(new java.awt.Color(255, 255, 255));
        btnInformación.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemagestionnotas/imagenes/escudo.png"))); // NOI18N
        btnInformación.setToolTipText("Datos Institucionales");
        btnInformación.setBorder(null);
        btnInformación.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnInformación.setPreferredSize(new java.awt.Dimension(0, 0));
        btnInformación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformaciónActionPerformed(evt);
            }
        });

        lblError.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblError.setForeground(new java.awt.Color(0, 204, 255));

        combo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Coordinador Académico", "Docente", "Estudiante", "Secretario Académico" }));

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGap(338, 338, 338)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblContraseña)
                                        .addComponent(lblTipoUsua)))
                                .addGap(60, 60, 60)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNomUsua)
                                    .addComponent(lblNomColeg))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomColeg, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 231, Short.MAX_VALUE)
                        .addComponent(btnInformación, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnInformación, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addComponent(jPanelInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomColeg)
                    .addComponent(txtNomColeg, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomUsua)
                    .addComponent(txtNomUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(lblTipoUsua)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContraseña)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomUsuActionPerformed

    }//GEN-LAST:event_txtNomUsuActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        boolean resp;
        ValidacionUsuario x = new ValidacionUsuario();
        char pass[] = txtContraseña.getPassword();
        String passw = new String(pass);
        x.setUsuario(txtNomUsu.getText());
        x.setTipo(combo.getSelectedIndex());
        x.setContraseña(passw);

        resp = x.login();        
        
        if(resp == true)
        {
            SistemaGNotas SGN = new SistemaGNotas();
            SGN.setIngresar(combo.getSelectedIndex());
            SGN.pintarSaludo();
            dispose();            
            SGN.setVisible(true);
        }
        else
        {
            txtNomUsu.setText("");
            combo.setSelectedIndex(0);
            txtContraseña.setText("");            
            lblError.setForeground(Color.red);
            lblError.setText("¡ERROR! Datos Incorrectos");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int salir = JOptionPane.showConfirmDialog(null,"Seguro que Desea Salir de la Aplicación","Confirmar",JOptionPane.YES_NO_OPTION);
        if(JOptionPane.YES_OPTION == salir)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnInformaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformaciónActionPerformed
        lblError.setForeground(new Color(0,204,255));
        lblError.setText(" ");
        DialogInformaciónColegio x = new DialogInformaciónColegio(this,true);
        x.setVisible(true);
    }//GEN-LAST:event_btnInformaciónActionPerformed

    private void txtNomUsuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomUsuMouseClicked
        lblError.setForeground(new Color(0,204,255));
        lblError.setText(" ");
    }//GEN-LAST:event_txtNomUsuMouseClicked

    private void txtContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMouseClicked
        lblError.setForeground(new Color(0,204,255));
        lblError.setText(" ");
    }//GEN-LAST:event_txtContraseñaMouseClicked

    private void txtNomColegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomColegMouseClicked
        lblError.setForeground(new Color(0,204,255));
        lblError.setText(" ");
    }//GEN-LAST:event_txtNomColegMouseClicked

    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
     
    }//GEN-LAST:event_formKeyPressed

    private void jPanelPrincipalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanelPrincipalKeyPressed
        
    }//GEN-LAST:event_jPanelPrincipalKeyPressed
    
    
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
            java.util.logging.Logger.getLogger(frameInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameInicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInformación;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblNomColeg;
    private javax.swing.JLabel lblNomUsua;
    private javax.swing.JLabel lblTipoUsua;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtNomColeg;
    private javax.swing.JTextField txtNomUsu;
    // End of variables declaration//GEN-END:variables
}
