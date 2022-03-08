package sistemagestionnotas;

/**
 *
 * @author Sebastián
 */

import javax.swing.JOptionPane;

public class IframeSecretario extends javax.swing.JInternalFrame 
{

    public IframeSecretario() 
    {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegistrar = new javax.swing.JPanel();
        lblBienvenido1 = new javax.swing.JLabel();
        btnEditarPersona = new javax.swing.JButton();
        btnGenerarN = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setTitle("Bienvenido Secretario");

        panelRegistrar.setBackground(new java.awt.Color(0, 204, 255));

        lblBienvenido1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblBienvenido1.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenido1.setText("Seleccione una Opción");

        btnEditarPersona.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnEditarPersona.setText("Editar Persona");
        btnEditarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPersonaActionPerformed(evt);
            }
        });

        btnGenerarN.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnGenerarN.setText("Generar Notas");
        btnGenerarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarNActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRegistrarLayout = new javax.swing.GroupLayout(panelRegistrar);
        panelRegistrar.setLayout(panelRegistrarLayout);
        panelRegistrarLayout.setHorizontalGroup(
            panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarLayout.createSequentialGroup()
                .addGroup(panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistrarLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelRegistrarLayout.createSequentialGroup()
                                .addComponent(btnEditarPersona)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGenerarN))
                            .addComponent(lblBienvenido1)))
                    .addGroup(panelRegistrarLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        panelRegistrarLayout.setVerticalGroup(
            panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblBienvenido1)
                .addGap(44, 44, 44)
                .addGroup(panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarPersona)
                    .addComponent(btnGenerarN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPersonaActionPerformed

    }//GEN-LAST:event_btnEditarPersonaActionPerformed

    private void btnGenerarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarNActionPerformed
        JOptionPane.showMessageDialog(null,"Método en Construcción","ERROR",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnGenerarNActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarPersona;
    private javax.swing.JButton btnGenerarN;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblBienvenido1;
    private javax.swing.JPanel panelRegistrar;
    // End of variables declaration//GEN-END:variables
}
