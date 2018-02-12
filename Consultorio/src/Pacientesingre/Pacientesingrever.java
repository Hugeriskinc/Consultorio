/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacientesingre;

import Base_datos.Conectar_Mysql;
import java.sql.ResultSet;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author oscar_o31
 */
public class Pacientesingrever extends javax.swing.JFrame {

    /**
     * Creates new form Pacientesingrever
     */
    
    JDialog Viewer = new JDialog(new JFrame(), "Reporte", true);
    
    public Pacientesingrever() {
        initComponents();
        
        ResultSet rs = bd.Vertodo("select * from Pacientes_ingresados");
        DefaultTableModel model = new DefaultTableModel();
        jtTabla.setModel(model);
        model.setColumnIdentifiers(new Object[]{"Codigo del paciente ingresado","Nombre del paciente","Nombre del tratamiento", "Nombre del medico", "Causa", "Estado"});
        try{

            while(rs.next()){

                model.addRow(new Object[]{rs.getInt("Id_paciingre"), rs.getString("nombre_pa"), rs.getString("nombre_tra"), rs.getString("Nombre_me"), rs.getString("Causa"), rs.getString("Estado")});

            }

        } catch(Exception e){

        } finally{
            bd.close();
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jtxtBuscar = new javax.swing.JTextField();
        jbtBuscar = new javax.swing.JButton();
        jrbNombre = new javax.swing.JRadioButton();
        jrbCodigo = new javax.swing.JRadioButton();
        jbtMostrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Consultar Pacientes Ingresados");
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Consultar Pacientes Ingresados");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

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
        jScrollPane1.setViewportView(jtTabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 171, 940, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver 1.png"))); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 620, 140, 50));
        jPanel1.add(jtxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 30));

        jbtBuscar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbtBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jbtBuscar.setText("Buscar");
        jbtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 150, 50));

        jrbNombre.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jrbNombre.setText("Nombre Paciente");
        jrbNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNombreActionPerformed(evt);
            }
        });
        jPanel1.add(jrbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 60, 200, -1));

        jrbCodigo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jrbCodigo.setSelected(true);
        jrbCodigo.setText("Codigo Ingreso");
        jPanel1.add(jrbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 20, 200, -1));

        jbtMostrar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbtMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mostrar.png"))); // NOI18N
        jbtMostrar.setText("Mostrar Todo");
        jbtMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 230, 50));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imprimir.png"))); // NOI18N
        jButton2.setText("Reporte");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 150, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/textura.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscarActionPerformed

        String nombre = jtxtBuscar.getText();

        if(jrbNombre.isSelected() == false && jrbCodigo.isSelected() == false){
            JOptionPane.showMessageDialog(null, "No a elegino ningun tipo a buscar", "Sistema De Consultorio", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if(jrbNombre.isSelected() == true && jrbCodigo.isSelected() == true){
                JOptionPane.showMessageDialog(null, "Solo puede sellecionar una sola opcion", "Sistema De Consultorio", JOptionPane.INFORMATION_MESSAGE);
            } else if(jrbNombre.isSelected() == true){if(nombre.equals("")){
                JOptionPane.showMessageDialog(null, "No a escrito el codigo del paciente a buscar", "Sistema De Consultorio", JOptionPane.INFORMATION_MESSAGE);
            } else{
                char k = nombre.charAt(0);
                if(Character.isDigit(k)){
                    JOptionPane.showMessageDialog(null, "Solo Puede introducir Letras", "Sistema De Consultorio", JOptionPane.INFORMATION_MESSAGE);
                } else{
                    ResultSet rs = bd.Vertodo("select * from Pacientes_ingresados where Nombre_pa like'"+nombre+"%'");
                    DefaultTableModel model = new DefaultTableModel();
                    jtTabla.setModel(model);
                    model.setColumnIdentifiers(new Object[]{"Codigo del paciente ingresado","Nombre del paciente","Nombre del tratamiento", "Nombre del medico", "Causa", "Estado"});
                    try{

                        while(rs.next()){

                            model.addRow(new Object[]{rs.getInt("Id_paciingre"), rs.getString("nombre_pa"), rs.getString("nombre_tra"), rs.getString("Nombre_me"), rs.getString("Causa"), rs.getString("Estado")});

                        }

                    } catch(Exception e){

                    } finally{
                        bd.close();
                    }
                }
            }
        }else{
            if(nombre.equals("")){
                JOptionPane.showMessageDialog(null, "No a escrito el codigo de ingreso a buscar", "Sistema De Consultorio", JOptionPane.INFORMATION_MESSAGE);
            } else {
                try{
                    int ho = Integer.parseInt(nombre);
                    if(ho > 0){
                        ResultSet rs = bd.Vertodo("select * from Pacientes_ingresados where Id_paciingre = "+nombre+"");
                        DefaultTableModel model = new DefaultTableModel();
                        jtTabla.setModel(model);
                        model.setColumnIdentifiers(new Object[]{"Codigo del paciente ingresado","Nombre del paciente","Nombre del tratamiento", "Nombre del medico", "Causa", "Estado"});
        
                        while(rs.next()){

                            model.addRow(new Object[]{rs.getInt("Id_paciingre"), rs.getString("nombre_pa"), rs.getString("nombre_tra"), rs.getString("Nombre_me"), rs.getString("Causa"), rs.getString("Estado")});

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

    private void jbtMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtMostrarActionPerformed

        ResultSet rs = bd.Vertodo("select * from Pacientes_ingresados");
        DefaultTableModel model = new DefaultTableModel();
        jtTabla.setModel(model);
        model.setColumnIdentifiers(new Object[]{"Codigo del paciente ingresado","Nombre del paciente","Nombre del tratamiento", "Nombre del medico", "Causa", "Estado"});
        try{

            while(rs.next()){

                model.addRow(new Object[]{rs.getInt("Id_paciingre"), rs.getString("nombre_pa"), rs.getString("nombre_tra"), rs.getString("Nombre_me"), rs.getString("Causa"), rs.getString("Estado")});

            }

        } catch(Exception e){

        } finally{
            bd.close();
        }
    }//GEN-LAST:event_jbtMostrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try{

            String report = "src\\Pacientesingre\\Pacientesingre.jrxml";
            JasperReport reporte = JasperCompileManager.compileReport(report);
            JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, bd.connect());
            //JasperViewer jv;

            Viewer.setSize(1000, 700);
            Viewer.setLocationRelativeTo(null);
            JRViewer jrv = new JRViewer(jasperPrint);
            Viewer.getContentPane().add(jrv);
            Viewer.setVisible(true);

        } catch(Exception e){

            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jrbNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbNombreActionPerformed

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
            java.util.logging.Logger.getLogger(Pacientesingrever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pacientesingrever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pacientesingrever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pacientesingrever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pacientesingrever().setVisible(true);
            }
        });
    }
    
    Conectar_Mysql bd = new Conectar_Mysql();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtBuscar;
    private javax.swing.JButton jbtMostrar;
    private javax.swing.JRadioButton jrbCodigo;
    private javax.swing.JRadioButton jrbNombre;
    private javax.swing.JTable jtTabla;
    public static javax.swing.JTextField jtxtBuscar;
    // End of variables declaration//GEN-END:variables
}
