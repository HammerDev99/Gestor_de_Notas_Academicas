package sistemagestionnotas;

/**
 * @author1 Daniel Arbeláez Álvarez
 * @author2 Sebastián Mejía Serna
 */
public class DialogInformaciónColegio extends javax.swing.JDialog 
{
    
    public DialogInformaciónColegio(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        srcollInformacion = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxtInformacion = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Información Institucional");

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        btnSalir.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        atxtInformacion.setColumns(20);
        atxtInformacion.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        atxtInformacion.setRows(5);
        atxtInformacion.setText("                                                                  Datos Institucionales\n\n\nMisión:\nEs una Institución Educativa que ofrece un servicio eduativo humano cristiano de calidad en los niveles de Prescolar, Básica y Media Académica,  con la perspectiva de \nformar la niñez y la juventud, apoyados en la familia, y asi aportarle a la sociedad bachilleres con autonomía intelectual, social y ética.\n\nVisión:\nPara el año 2015 el Colegio Parroquial Nuestra Señor de Chiquinquirá continurá siendo reconocido por la comunidad como una Institución que lidera la formación humana, \ncristiana, académica, técnica y axiológica de sus educandos; favoreciendo el ingreso a la educación superior para que se proyecten de forma integral en los difrentes \námbitos a nivel personal, familiar, eclesial y social.\n\nValores:\n    1. Amor: Vivo afecto o inclinación hacia una persona o cosa.\n \n    2. Ciencia: Conjunto coherente de conocimientos relativos a categorías de hechos, objetos y fenómenos, Fortaleciendo el cuidado y la conservación del medioambiente.\n \n    3. Convivencia: situación en la que dos personas o más viven en mutua compañía, compartiendo un mismo espacio y tiempo.\n \n    4. Espirtualidad: Cualidad que tiene como objeto la vida espiritual.\n \n    5. Justicia: Virtud que nos hace dar a cada cual lo que le corresponde.\n \n    6. Sentido de Pertenencia: Es amar, respetar y cuidar las cosas como si fueran las  propias, es amar lo que somos y hacemos.\n \n    7. Solidaridad: Sentimiento que impulsa a los hombres a prestarse una ayuda mutua.\n \n    8. Toleracia: Respeto y consideración hacia las maneras de actuar, pensar y sentir de  los demás.\n \n    9. Vida: Don personal más preciado como regalo de Dios que es, se debe defender y compartir con los otros. Valor fundamental.\n \n  10. Virtud: Consiste en mostrarse veraz en los propios actos y en decir verdad en sus palabras evitando la duplicidad. ");
        jScrollPane1.setViewportView(atxtInformacion);

        srcollInformacion.setViewportView(jScrollPane1);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Colegio Parroquial ");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nuestra Señora de Chiquinquirá");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(srcollInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(117, 117, 117)))
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(srcollInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnSalir)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(DialogInformaciónColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogInformaciónColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogInformaciónColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogInformaciónColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogInformaciónColegio dialog = new DialogInformaciónColegio(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxtInformacion;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane srcollInformacion;
    // End of variables declaration//GEN-END:variables
}
