/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Citas;

import Base_datos.Conectar_Oracle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleResultSet;

/**
 *
 * @author oscar_o31
 */
public class Citas extends javax.swing.JFrame {

    /**
     * Creates new form Citas
     */
    
    int a=0, b=0, fila1, copa, come;
    
    public Citas() {
        initComponents();
        
        int a1=0;
        
        
        try{
            
            ResultSet rst = bd.Vertodo("select * from Pacientes");
            ResultSet rst2 = bd.Vertodo("select * from Medicos");
            DefaultTableModel model = new DefaultTableModel(), model1 = new DefaultTableModel();
            jtConsulta.setModel(model);
            jtTabla.setModel(model1);
            model.setColumnIdentifiers(new Object[]{"Codigo del Paciente", "Nombre", "Apellido", "Edad", "Sexo", "Cedula", "Telefono", "Fecha de nacimiento", "Seguro", "Fecha del regristro"});
            model1.setColumnIdentifiers(new Object[]{"Codigo del Medico", "Nombre", "Apellido", "Fecha del registro", "Telefono", "Contraseña", "Categoria"});
            ResultSet rs1 = bd.Vertodo("select * from Citas");
            
            while(rs1.next()){
            a1 = rs1.getInt("Id_citas");
                
            }
            
            while(rst.next()){

                model.addRow(new Object[]{rst.getInt("Id_pacientes"), rst.getString("Nombre"), rst.getString("Apellido"), rst.getString("Edad"), rst.getString("Sexo"), rst.getString("Cedula"), rst.getString("Telefono"), rst.getString("Fecha_nacimiento"), rst.getString("Seguro"), rst.getString("Fecha_registro")});

            }
            while(rst2.next()){

                model1.addRow(new Object[]{rst2.getInt("Id_medico"), rst2.getString("Nombre"), rst2.getString("Apellido"), rst2.getString("Fecha_registro"), rst2.getString("Telefono"), rst2.getString("Contrasena"), rst2.getString("Categoria")});

            }
            
            a = a1 + 1;
            
        } catch(Exception e){
            
        } finally{
            bd.close();
        }
        
        jLabel5.setText(String.valueOf(a));
        
    }
    
    public void Buscar(){
            
            int a1=0;

            
            
        try {
            ResultSet rs1;
                try {
                    rs1 = bd.Vertodo("select * from Citas");
                    
                    while(rs1.next()){
                        a1 = rs1.getInt("Id_citas");
                
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Citas.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        } catch (SQLException ex) {
        }
        
        a = a1 + 1;
        jLabel5.setText(String.valueOf(a));
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdPaciente = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jbtBuscar = new javax.swing.JButton();
        jrbNombre = new javax.swing.JRadioButton();
        jtxtBuscar = new javax.swing.JTextField();
        jrbCodigo = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsulta = new javax.swing.JTable();
        jbtMostrar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jdMedico = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jtxtBuscar1 = new javax.swing.JTextField();
        jbtBuscar1 = new javax.swing.JButton();
        jrbNombre1 = new javax.swing.JRadioButton();
        jrbCodigo1 = new javax.swing.JRadioButton();
        jbtMostrar1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();

        jdPaciente.setTitle("Consulta Pacientes");
        jdPaciente.setMaximumSize(new java.awt.Dimension(950, 690));
        jdPaciente.setMinimumSize(new java.awt.Dimension(950, 690));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver 1.png"))); // NOI18N
        jButton6.setText("Volver");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 612, 140, 50));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel11.setText("Consultar Pacientes");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jbtBuscar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbtBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jbtBuscar.setText("Buscar");
        jbtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 160, 50));

        jrbNombre.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jrbNombre.setText("Nombre");
        jPanel2.add(jrbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, -1, -1));
        jPanel2.add(jtxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 109, 210, -1));

        jrbCodigo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jrbCodigo.setSelected(true);
        jrbCodigo.setText("Codigo");
        jPanel2.add(jrbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, -1));

        jtConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtConsulta);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 819, -1));

        jbtMostrar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbtMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mostrar.png"))); // NOI18N
        jbtMostrar.setText("Mostrar Todo");
        jbtMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtMostrarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 240, 50));

        jButton3.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Confirmar.png"))); // NOI18N
        jButton3.setText("Seleccionar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 160, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/textura.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 690));

        javax.swing.GroupLayout jdPacienteLayout = new javax.swing.GroupLayout(jdPaciente.getContentPane());
        jdPaciente.getContentPane().setLayout(jdPacienteLayout);
        jdPacienteLayout.setHorizontalGroup(
            jdPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdPacienteLayout.setVerticalGroup(
            jdPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
        );

        jdMedico.setTitle("Consulta Medicos");
        jdMedico.setMaximumSize(new java.awt.Dimension(930, 690));
        jdMedico.setMinimumSize(new java.awt.Dimension(930, 690));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel13.setText("Consultar medicos");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtTabla);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 819, -1));

        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver 1.png"))); // NOI18N
        jButton7.setText("Volver");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 630, 140, 50));
        jPanel3.add(jtxtBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 210, -1));

        jbtBuscar1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbtBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jbtBuscar1.setText("Buscar");
        jbtBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscar1ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 150, 50));

        jrbNombre1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jrbNombre1.setText("Nombre");
        jPanel3.add(jrbNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, -1, -1));

        jrbCodigo1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jrbCodigo1.setSelected(true);
        jrbCodigo1.setText("Codigo");
        jPanel3.add(jrbCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, -1, -1));

        jbtMostrar1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbtMostrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mostrar.png"))); // NOI18N
        jbtMostrar1.setText("Mostrar Todo");
        jbtMostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtMostrar1ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtMostrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 240, 50));

        jButton8.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Confirmar.png"))); // NOI18N
        jButton8.setText("Seleccionar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(704, 109, 170, 50));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/textura.png"))); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 690));

        javax.swing.GroupLayout jdMedicoLayout = new javax.swing.GroupLayout(jdMedico.getContentPane());
        jdMedico.getContentPane().setLayout(jdMedicoLayout);
        jdMedicoLayout.setHorizontalGroup(
            jdMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdMedicoLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jdMedicoLayout.setVerticalGroup(
            jdMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdMedicoLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Registro de las citas");
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel1.setText("Registro de las citas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 41, -1, -1));

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel2.setText("Nombre del paciente:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 189, -1, -1));

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel3.setText("Nombre del medico:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel4.setText("No. Cita");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 116, -1, -1));

        jLabel5.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 107, 67, 40));

        jLabel6.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel6.setText("Fecha Cita:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jButton1.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 179, 130, -1));

        jButton2.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 253, 130, -1));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 173, 30));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 263, 173, 27));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 329, 160, 26));

        jButton4.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        jButton4.setText("Guardar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 424, -1, -1));

        jButton5.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar.png"))); // NOI18N
        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 424, -1, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 337, 180, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/textura.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 530));

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
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metodo par ala fecha
    public static String fecha(){
        
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
        
        return formato.format(fecha);
        
    }
    
    //Boton para volver atras
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        this.hide();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    //Boton para la consulta del paciente
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        jdPaciente.show();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    //boton para la consulta del medico
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        jdMedico.show();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    //Boton para volver atras
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        jdPaciente.hide();
    }//GEN-LAST:event_jButton6ActionPerformed

    //Boton para buscar pacientes
    private void jbtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscarActionPerformed

        String nombre = jtxtBuscar.getText();

        if(jrbNombre.isSelected() == false && jrbCodigo.isSelected() == false){
            JOptionPane.showMessageDialog(null, "No a elegino ningun tipo a buscar", "Sistema De Consultorio", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if(jrbNombre.isSelected() == true && jrbCodigo.isSelected() == true){
                JOptionPane.showMessageDialog(null, "Solo puede sellecionar una sola opcion", "Sistema De Consultorio", JOptionPane.INFORMATION_MESSAGE);
            } else if(jrbNombre.isSelected() == true){if(nombre.equals("")){
                JOptionPane.showMessageDialog(null, "No a escrito el nombre a buscar", "Sistema De Consultorio", JOptionPane.INFORMATION_MESSAGE);
            } else{
                char k = nombre.charAt(0);
                if(Character.isDigit(k)){
                    JOptionPane.showMessageDialog(null, "Solo Puede introducir Letras", "Sistema De Consultorio", JOptionPane.INFORMATION_MESSAGE);
                } else{
                    
                    try{
                        
                        ResultSet rs = bd.Vertodo("select * from Pacientes where Nombre like'"+nombre+"%'");
                        DefaultTableModel model = new DefaultTableModel();
                        jtConsulta.setModel(model);
                        model.setColumnIdentifiers(new Object[]{"Codigo del Paciente", "Nombre", "Apellido", "Edad", "Sexo", "Cedula", "Telefono", "Fecha de nacimiento", "Seguro", "Fecha del regristro"});
                    

                        while(rs.next()){

                            model.addRow(new Object[]{rs.getInt("Id_pacientes"), rs.getString("Nombre"), rs.getString("Apellido"), rs.getString("Edad"), rs.getString("Sexo"), rs.getString("Cedula"), rs.getString("Telefono"), rs.getString("Fecha_nacimiento"), rs.getString("Seguro"), rs.getString("Fecha_registro")});

                        }

                    } catch(Exception e){

                    } finally{
                        bd.close();
                    }
                }
            }
        }else{
            if(nombre.equals("")){
                JOptionPane.showMessageDialog(null, "No a escrito el codigo a buscar", "Sistema De Consultorio", JOptionPane.INFORMATION_MESSAGE);
            } else {
                try{
                    int ho = Integer.parseInt(nombre);
                    if(ho > 0){
                        ResultSet rs = bd.Vertodo("select * from Pacientes where Id_pacientes = "+nombre+"");
                        DefaultTableModel model = new DefaultTableModel();
                        jtConsulta.setModel(model);
                        model.setColumnIdentifiers(new Object[]{"Codigo del Paciente", "Nombre", "Apellido", "Edad", "Sexo", "Cedula", "Telefono", "Fecha de nacimiento", "Seguro", "Fecha del regristro"});
        
                        while(rs.next()){

                            model.addRow(new Object[]{rs.getInt("Id_pacientes"), rs.getString("Nombre"), rs.getString("Apellido"), rs.getString("Edad"), rs.getString("Sexo"), rs.getString("Cedula"), rs.getString("Telefono"), rs.getString("Fecha_nacimiento"), rs.getString("Seguro"), rs.getString("Fecha_registro")});

                        }
                    }

                } catch(Exception e){

                    JOptionPane.showMessageDialog(null, "Solo puede introducir numeros", "Sistema De Consultorio", JOptionPane.INFORMATION_MESSAGE);

                } finally{
                    bd.close();
                }
            }
        }
        }
    }//GEN-LAST:event_jbtBuscarActionPerformed

    //Boton para mostrar todos pacientes
    private void jbtMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtMostrarActionPerformed

        
        DefaultTableModel model = new DefaultTableModel();
        jtConsulta.setModel(model);
        model.setColumnIdentifiers(new Object[]{"Codigo del Paciente", "Nombre", "Apellido", "Edad", "Sexo", "Cedula", "Telefono", "Fecha de nacimiento", "Seguro", "Fecha del regristro"});
        try{
            ResultSet rs = bd.Vertodo("select * from Pacientes");

            while(rs.next()){

                model.addRow(new Object[]{rs.getInt("Id_pacientes"), rs.getString("Nombre"), rs.getString("Apellido"), rs.getString("Edad"), rs.getString("Sexo"), rs.getString("Cedula"), rs.getString("Telefono"), rs.getString("Fecha_nacimiento"), rs.getString("Seguro"), rs.getString("Fecha_registro")});

            }

        } catch(Exception e){

        } finally{
            bd.close();
        }
    }//GEN-LAST:event_jbtMostrarActionPerformed

    //Boton para volver atras
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        jdMedico.hide();
    }//GEN-LAST:event_jButton7ActionPerformed

    //Boton para buscar el medico
    private void jbtBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscar1ActionPerformed

        String nombre = jtxtBuscar.getText();

        if(jrbNombre.isSelected() == false && jrbCodigo.isSelected() == false){
            JOptionPane.showMessageDialog(null, "No a elegino ningun tipo a buscar", "Sistema De Consultorio", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if(jrbNombre.isSelected() == true && jrbCodigo.isSelected() == true){
                JOptionPane.showMessageDialog(null, "Solo puede sellecionar una sola opcion", "Sistema De Consultorio", JOptionPane.INFORMATION_MESSAGE);
            } else if(jrbNombre.isSelected() == true){if(nombre.equals("")){
                JOptionPane.showMessageDialog(null, "No a escrito el nombre a buscar", "Sistema De Consultorio", JOptionPane.INFORMATION_MESSAGE);
            } else{
                char k = nombre.charAt(0);
                if(Character.isDigit(k)){
                    JOptionPane.showMessageDialog(null, "Solo Puede introducir Letras", "Sistema De Consultorio", JOptionPane.INFORMATION_MESSAGE);
                } else{
                    
                    DefaultTableModel model = new DefaultTableModel();
                    jtTabla.setModel(model);
                    model.setColumnIdentifiers(new Object[]{"Codigo del Medico", "Nombre", "Apellido", "Fecha del registro", "Telefono", "Contraseña", "Categoria"});
                    try{
                        ResultSet rs = bd.Vertodo("select * from Medicos where Nombre like'"+nombre+"%'");

                        while(rs.next()){

                            model.addRow(new Object[]{rs.getInt("Id_medico"), rs.getString("Nombre"), rs.getString("Apellido"), rs.getString("Fecha_registro"), rs.getString("Telefono"), rs.getString("Contrasena"), rs.getString("Categoria")});

                        }

                    } catch(Exception e){

                    } finally{
                        bd.close();
                    }
                }
            }
        }else{
            if(nombre.equals("")){
                JOptionPane.showMessageDialog(null, "No a escrito el codigo a buscar", "Sistema De Consultorio", JOptionPane.INFORMATION_MESSAGE);
            } else {
                try{
                    int ho = Integer.parseInt(nombre);
                    if(ho > 0){
                        ResultSet rs = bd.Vertodo("select * from Medicos where Id_medico = "+nombre+"");
                        DefaultTableModel model = new DefaultTableModel();
                        jtTabla.setModel(model);
                        model.setColumnIdentifiers(new Object[]{"Codigo del Medico", "Nombre", "Apellido", "Fecha del registro", "Telefono", "Contraseña", "Categoria"});

                        while(rs.next()){

                            model.addRow(new Object[]{rs.getInt("Id_medico"), rs.getString("Nombre"), rs.getString("Apellido"), rs.getString("Fecha_registro"), rs.getString("Telefono"), rs.getString("Contrasena"), rs.getString("Categoria")});

                        }
                    }

                } catch(Exception e){

                    JOptionPane.showMessageDialog(null, "Solo puede introducir numeros", "Sistema De Consultorio", JOptionPane.INFORMATION_MESSAGE);

                } finally{
                    bd.close();
                }
            }
        }
        }
    }//GEN-LAST:event_jbtBuscar1ActionPerformed

    //Boton para mostrar todos los medicos
    private void jbtMostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtMostrar1ActionPerformed

        
        DefaultTableModel model = new DefaultTableModel();
        jtTabla.setModel(model);
        model.setColumnIdentifiers(new Object[]{"Codigo del Medico", "Nombre", "Apellido", "Fecha del registro", "Telefono", "Contraseña", "Categoria"});
        try{
            ResultSet rs = bd.Vertodo("select * from Medicos");

            while(rs.next()){

                model.addRow(new Object[]{rs.getInt("Id_medico"), rs.getString("Nombre"), rs.getString("Apellido"), rs.getString("Fecha_registro"), rs.getString("Telefono"), rs.getString("Contrasena"), rs.getString("Categoria")});

            }

        } catch(Exception e){

        } finally{
            bd.close();
        }
    }//GEN-LAST:event_jbtMostrar1ActionPerformed

    //Boton para seleccionar el medico
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        fila1 = jtTabla.getSelectedRow();
        String at = "", t = "";
        int a3 = 0, o = 0;
        
        try{
            if(fila1==-1){
                JOptionPane.showMessageDialog(null, "Debe de seleccionar un registro", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                 at = jtTabla.getValueAt(fila1, 1).toString();
                 jdMedico.hide();
                 this.come = Integer.parseInt(jtTabla.getValueAt(fila1, 0).toString());
                jLabel8.setText(at);
            }
            
            
        }catch (Exception ex) {

        }
        
        fila1 = 0;
        
    }//GEN-LAST:event_jButton8ActionPerformed

    //Boton para seleccionar el paciente
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        fila1 = jtConsulta.getSelectedRow();
        String at = "";
        
        try{
            if(fila1==-1){
                JOptionPane.showMessageDialog(null, "Debe de seleccionar un registro", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                 at = jtConsulta.getValueAt(fila1, 1).toString();
                 jdPaciente.hide();
                 this.copa = Integer.parseInt(jtConsulta.getValueAt(fila1, 0).toString());
                jLabel7.setText(at);
            }
            
            
        }catch (Exception ex) {

        }
        
        fila1 = 0;
        
    }//GEN-LAST:event_jButton3ActionPerformed

    //Boton para guardar el registro
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        try{
        
        String Codigo = String.valueOf(a);
        String nombrepa = String.valueOf(this.copa);
        String nombremed = String.valueOf(this.come);
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
        
        
        String fechana;
        fechana = formato.format(jDateChooser1.getDate());
        
        if(fechana.equals("")){
            JOptionPane.showMessageDialog(null, "Faltan datos por introducir!", "Sistema De Consultorio", JOptionPane.INFORMATION_MESSAGE);
        } else {
        
        if(nombrepa.equals("") || nombremed.equals("")){
        
            JOptionPane.showMessageDialog(null, "Faltan datos por introducir!", "Sistema De Consultorio", JOptionPane.INFORMATION_MESSAGE);
            
        }else{
                
                try{
                    bd.Insert("insert into Citas(Id_citas, id_pacientes, id_medico, Fecha)"
                            + "values ("+Codigo+", "+nombrepa+", "+nombremed+", '"+fechana+"')");
                    
                    this.copa = 0;
                    this.come = 0;
                    
                    jLabel7.setText("");
                    jLabel8.setText("");
                    Buscar();
                    
                     }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "No Se Agrego El Registro", "Sistema De Prestamo", JOptionPane.INFORMATION_MESSAGE);
                    } finally{
                        bd.close();
                    }
            }
        
            }
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Faltan datos por introducir! ", "Sistema De Consultorio", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Citas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtBuscar;
    private javax.swing.JButton jbtBuscar1;
    private javax.swing.JButton jbtMostrar;
    private javax.swing.JButton jbtMostrar1;
    private javax.swing.JDialog jdMedico;
    private javax.swing.JDialog jdPaciente;
    private javax.swing.JRadioButton jrbCodigo;
    private javax.swing.JRadioButton jrbCodigo1;
    private javax.swing.JRadioButton jrbNombre;
    private javax.swing.JRadioButton jrbNombre1;
    private javax.swing.JTable jtConsulta;
    private javax.swing.JTable jtTabla;
    public static javax.swing.JTextField jtxtBuscar;
    public static javax.swing.JTextField jtxtBuscar1;
    // End of variables declaration//GEN-END:variables

    Conectar_Oracle bd = new Conectar_Oracle();
    
}
