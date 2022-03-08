package sistemagestionnotas;

/**
 *
 * @author1 Daniel Arbeláez Álvarez
 * @author2 Sebastián Mejía Serna
 */
public class IframeEstudiante extends javax.swing.JInternalFrame 
{

    public IframeEstudiante() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblMate = new javax.swing.JLabel();
        lblDocen = new javax.swing.JLabel();
        lblPerio = new javax.swing.JLabel();
        lblGrupo = new javax.swing.JLabel();
        jComboBoxMate = new javax.swing.JComboBox();
        txtDocen = new javax.swing.JTextField();
        txtGrupo = new javax.swing.JTextField();
        jComboBoxPerio = new javax.swing.JComboBox();
        lblPromAc = new javax.swing.JLabel();
        lblPromFi = new javax.swing.JLabel();
        txtPromF = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtPromA = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Actividades", "Notas", "Nivel", "Porcentaje"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setRowHeight(18);
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        lblMate.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblMate.setText("Nombre de la Materia");

        lblDocen.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblDocen.setText("Nombre del Docente");

        lblPerio.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblPerio.setText("Número del Período");

        lblGrupo.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblGrupo.setText("Número del Grupo");

        jComboBoxMate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Artística", "Ciencias Naturales", "Español", "Ética", "Física", "Inglés", "Matemáticas", "Química", "Sociales", "Religión" }));

        jComboBoxPerio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Uno", "Dos", "Tres", "Cuatro" }));

        lblPromAc.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblPromAc.setText("Promedio Actual");

        lblPromFi.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblPromFi.setText("Promedio Final");

        txtPromF.setEditable(false);
        txtPromF.setBackground(new java.awt.Color(255, 255, 255));
        txtPromF.setBorder(null);

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar Notas");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtPromA.setEditable(false);
        txtPromA.setBackground(new java.awt.Color(255, 255, 255));
        txtPromA.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMate)
                            .addComponent(lblDocen))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDocen)
                            .addComponent(jComboBoxMate, 0, 183, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGrupo)
                            .addComponent(lblPerio))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGrupo)
                            .addComponent(jComboBoxPerio, 0, 183, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblPromAc)
                            .addGap(18, 18, 18)
                            .addComponent(txtPromA, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(112, 112, 112)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPromFi)
                            .addGap(18, 18, 18)
                            .addComponent(txtPromF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMate)
                    .addComponent(lblGrupo)
                    .addComponent(jComboBoxMate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocen)
                    .addComponent(txtDocen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPerio)
                    .addComponent(jComboBoxPerio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPromAc)
                            .addComponent(txtPromA, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPromF, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(lblPromFi))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox jComboBoxMate;
    private javax.swing.JComboBox jComboBoxPerio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDocen;
    private javax.swing.JLabel lblGrupo;
    private javax.swing.JLabel lblMate;
    private javax.swing.JLabel lblPerio;
    private javax.swing.JLabel lblPromAc;
    private javax.swing.JLabel lblPromFi;
    private javax.swing.JTextField txtDocen;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtPromA;
    private javax.swing.JTextField txtPromF;
    // End of variables declaration//GEN-END:variables
}
