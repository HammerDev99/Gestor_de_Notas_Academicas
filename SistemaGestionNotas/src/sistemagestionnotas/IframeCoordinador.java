package sistemagestionnotas;

/**
 * @author1 Daniel Arbeláez Álvarez
 * @author2 Sebastián Mejía Serna
 */

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class IframeCoordinador extends javax.swing.JInternalFrame 
{

    DefaultTableModel modelo;
    DB_NotesMSA tareasBaseDatos;
    
    public IframeCoordinador() 
    {
        tareasBaseDatos = new DB_NotesMSA();
        tareasBaseDatos.Conectar();
        initComponents();        
        
        modelo = (DefaultTableModel)(tableCronograma.getModel());
        tareasBaseDatos.listar("select * from Cronograma order by Número_Actividad",modelo);
        setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCoordinacion = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCronograma = new javax.swing.JTable();
        lblNumActividad = new javax.swing.JLabel();
        txtNumActividad = new javax.swing.JTextField();
        lblActividad = new javax.swing.JLabel();
        txtActividad = new javax.swing.JTextField();
        lblDuracion = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        lblFechaInicio = new javax.swing.JLabel();
        txtFechaInicio = new javax.swing.JTextField();
        lblFechaFin = new javax.swing.JLabel();
        txtFechaFin = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setTitle("Bienvenido Coordinador");

        panelCoordinacion.setBackground(new java.awt.Color(0, 204, 255));

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 0));

        tableCronograma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tile 1", "Title 2", "Title 3", "Title 4", "ttttt"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCronograma);

        jScrollPane2.setViewportView(jScrollPane1);

        lblNumActividad.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblNumActividad.setForeground(new java.awt.Color(255, 255, 255));
        lblNumActividad.setText("Número de Actividad");

        lblActividad.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblActividad.setForeground(new java.awt.Color(255, 255, 255));
        lblActividad.setText("Actividad");

        lblDuracion.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblDuracion.setForeground(new java.awt.Color(255, 255, 255));
        lblDuracion.setText("Duración");

        lblFechaInicio.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblFechaInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaInicio.setText("Fecha de Inicio");

        lblFechaFin.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblFechaFin.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaFin.setText("Fecha de Fin");

        btnConsultar.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnModificar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
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

        javax.swing.GroupLayout panelCoordinacionLayout = new javax.swing.GroupLayout(panelCoordinacion);
        panelCoordinacion.setLayout(panelCoordinacionLayout);
        panelCoordinacionLayout.setHorizontalGroup(
            panelCoordinacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCoordinacionLayout.createSequentialGroup()
                .addGroup(panelCoordinacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCoordinacionLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(panelCoordinacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCoordinacionLayout.createSequentialGroup()
                                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btnModificar)
                                .addGap(44, 44, 44)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelCoordinacionLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(panelCoordinacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelCoordinacionLayout.createSequentialGroup()
                                .addComponent(lblFechaFin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCoordinacionLayout.createSequentialGroup()
                                .addComponent(lblFechaInicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCoordinacionLayout.createSequentialGroup()
                                .addComponent(lblDuracion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCoordinacionLayout.createSequentialGroup()
                                .addComponent(lblActividad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCoordinacionLayout.createSequentialGroup()
                                .addComponent(lblNumActividad)
                                .addGap(29, 29, 29)
                                .addComponent(txtNumActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panelCoordinacionLayout.setVerticalGroup(
            panelCoordinacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCoordinacionLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelCoordinacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumActividad)
                    .addComponent(txtNumActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCoordinacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblActividad)
                    .addComponent(txtActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCoordinacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDuracion)
                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCoordinacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaInicio)
                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCoordinacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaFin)
                    .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelCoordinacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnConsultar)
                    .addComponent(btnSalir)
                    .addComponent(btnEliminar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCoordinacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCoordinacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        limpiar();
        int numActi= Integer.parseInt(JOptionPane.showInputDialog(this,"Ingrese el Número de la Actividad"));

        Cronograma cron = new Cronograma();
        cron.setNumeroActi(numActi);
        if(tareasBaseDatos.consultarActividad(cron))
        {
            txtNumActividad.setText("" + cron.getNumeroActi());
            txtActividad.setText(cron.getActividad());
            txtDuracion.setText(cron.getDuracion());
            txtFechaInicio.setText(cron.getFechaInicio());
            txtFechaFin.setText(cron.getFechaFin());
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Datos no encontrados");
            limpiar();
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        limpiar();
        int eliminar=JOptionPane.showConfirmDialog(this,"¿Esta seguro que desea BORRAR?",
            "Atencion",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

        if(eliminar == 0)
        {
            int numAct= Integer.parseInt(JOptionPane.showInputDialog(this,"Ingrese el Número de Actividad a Eliminar"));

            Cronograma crono=new Cronograma();
            crono.setNumeroActi(numAct);
            if(tareasBaseDatos.eliminarActividad(crono))
            {
                JOptionPane.showMessageDialog(this,"Datos Eliminados");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Error al eliminar");
            }

        }
        tareasBaseDatos.listar("select * from Cronograma",modelo);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(txtNumActividad.getText().equals("") && txtActividad.getText().equals("") && txtDuracion.getText().equals("") && txtFechaInicio.getText().equals("") && txtFechaFin.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Debe Ingresar los Datos","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            Cronograma crono=new Cronograma();
            crono.setNumeroActi(Integer.parseInt(txtNumActividad.getText()));
            crono.setActividad(txtActividad.getText());
            crono.setDuracion(txtDuracion.getText());
            crono.setFechaInicio(txtFechaInicio.getText());
            crono.setFechaFin(txtFechaFin.getText());

            if(tareasBaseDatos.guardarActividad(crono))
            {
                JOptionPane.showMessageDialog(this,"Datos Guardados") ;
                tareasBaseDatos.listar("select * from Cronograma",modelo);
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Error al guardar datos");
            }
            limpiar();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        System.out.println(btnModificar.getLabel());
        if(btnModificar.getText().equals("Modificar"))
        {
            limpiar();
            int numActi= Integer.parseInt(JOptionPane.showInputDialog(this,"Ingrese el Número de Actividad a Modificar"));
            Cronograma crono=new Cronograma();
            crono.setNumeroActi(numActi);

            if(tareasBaseDatos.consultarActividad(crono))
            {
                txtNumActividad.setText(""+crono.getNumeroActi());
                txtNumActividad.setEditable(false);
                txtActividad.setText(crono.getActividad());
                txtDuracion.setText(crono.getDuracion());
                txtFechaInicio.setText(crono.getFechaInicio());
                txtFechaFin.setText(crono.getFechaFin());
                
                btnModificar.setText("Guardar");
                btnConsultar.setEnabled(false);
                btnEliminar.setEnabled(false);
                btnGuardar.setEnabled(false);
                btnSalir.setEnabled(false);
            }
            else
            {
                JOptionPane.showMessageDialog(this,"El Código no Existe");
                limpiar();
            }
        }
        else
        {
            Cronograma crono=new Cronograma();
            crono.setActividad(txtActividad.getText());
            crono.setDuracion(txtDuracion.getText());
            crono.setFechaInicio(txtFechaInicio.getText());
            crono.setFechaFin(txtFechaFin.getText());
            crono.setNumeroActi(Integer.parseInt(txtNumActividad.getText()));

            if(tareasBaseDatos.modificarActividad(crono))
            {
                JOptionPane.showMessageDialog(this,"Datos Modificados");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Error al modificar");
            }
            limpiar();
            tareasBaseDatos.listar("select * from Cronograma",modelo);
            
            btnModificar.setText("Modificar");
            btnConsultar.setEnabled(true);
            btnEliminar.setEnabled(true);
            btnGuardar.setEnabled(true);
            btnSalir.setEnabled(true);
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    public void limpiar()
    {
        txtNumActividad.setText("");
        txtActividad.setText("");
        txtDuracion.setText("");
        txtFechaInicio.setText("");
        txtFechaFin.setText("");
    }
    
    /*
    int salir = JOptionPane.showConfirmDialog(null,"Seguro que Desea Cerrar Sesión","Confirmar",JOptionPane.YES_NO_OPTION);
        if(JOptionPane.YES_OPTION == salir)
        {
            dispose();
            frameInicioSesion X = new frameInicioSesion();
            X.setVisible(true);
        }
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblActividad;
    private javax.swing.JLabel lblDuracion;
    private javax.swing.JLabel lblFechaFin;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JLabel lblNumActividad;
    private javax.swing.JPanel panelCoordinacion;
    private javax.swing.JTable tableCronograma;
    private javax.swing.JTextField txtActividad;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtNumActividad;
    // End of variables declaration//GEN-END:variables
}
