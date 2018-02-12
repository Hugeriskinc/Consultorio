/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tratamiento;

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
 * @author Oscar Ortiz
 */
public class Tratamientover extends javax.swing.JFrame {

    /**
     * Creates new form Tratamientover
     */
    
    JDialog Viewer = new JDialog(new JFrame(), "Reporte", true);
    
    public Tratamientover() {
        initComponents();
        
        try{
        ResultSet rst3 = bd.Vertodo("select * from Tratamiento");
        DefaultTableModel model = new DefaultTableModel();
        jtConsulta.setModel(model);
        model.setColumnIdentifiers(new Object[]{"Codigo del Tratamieno", "Nombre", "Medicameto", "Ciclo", "Dosis"});
        
        while(rst3.next()){

                model.addRow(new Object[]{rst3.getInt("Id_Tratamiento"), rst3.getString("Nombre_tra"), rst3.getString("Medicamento"), rst3.getString("Ciclo"), rst3.getString("Dosis")});

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

        jPanel4 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jbtBuscar2 = new javax.swing.JButton();
        jrbNombre = new javax.swing.JRadioButton();
        jtxtBuscar = new javax.swing.JTextField();
        jrbCodigo = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtConsulta = new javax.swing.JTable();
        jbtMostrar2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver 1.png"))); // NOI18N
        jButton10.setText("Volver");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 612, 140, 50));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel17.setText("Consultar Tratamiento");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jbtBuscar2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbtBuscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jbtBuscar2.setText("Buscar");
        jbtBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscar2ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 160, 50));

        jrbNombre.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jrbNombre.setText("Nombre");
        jPanel4.add(jrbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, -1, -1));
        jPanel4.add(jtxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 109, 210, 30));

        jrbCodigo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jrbCodigo.setSelected(true);
        jrbCodigo.setText("Codigo");
        jPanel4.add(jrbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, -1));

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
        jScrollPane3.setViewportView(jtConsulta);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 819, -1));

        jbtMostrar2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbtMostrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mostrar.png"))); // NOI18N
        jbtMostrar2.setText("Mostrar Todo");
        jbtMostrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtMostrar2ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtMostrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 240, 50));

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imprimir.png"))); // NOI18N
        jButton6.setText("Reporte");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 150, 50));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/textura.png"))); // NOI18N
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.hide();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jbtBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscar2ActionPerformed

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

                        ResultSet rs = bd.Vertodo("select * from tratamiento where Nombre_tra like'"+nombre+"%'");
                        DefaultTableModel model = new DefaultTableModel();
                        jtConsulta.setModel(model);
                        model.setColumnIdentifiers(new Object[]{"Codigo del Tratamieno", "Nombre", "Medicameto", "Ciclo", "Dosis"});
        
                        while(rs.next()){

                            model.addRow(new Object[]{rs.getInt("Id_Tratamiento"), rs.getString("Nombre_tra"), rs.getString("Medicamento"), rs.getString("Ciclo"), rs.getString("Dosis")});

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
                        ResultSet rs = bd.Vertodo("select * from tratamiento where Id_tratamiento = "+nombre+"");
                        DefaultTableModel model = new DefaultTableModel();
                        jtConsulta.setModel(model);
                        model.setColumnIdentifiers(new Object[]{"Codigo del Tratamieno", "Nombre", "Medicameto", "Ciclo", "Dosis"});
        
                        while(rs.next()){

                            model.addRow(new Object[]{rs.getInt("Id_Tratamiento"), rs.getString("Nombre_tra"), rs.getString("Medicamento"), rs.getString("Ciclo"), rs.getString("Dosis")});

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

    }//GEN-LAST:event_jbtBuscar2ActionPerformed

    private void jbtMostrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtMostrar2ActionPerformed

        DefaultTableModel model = new DefaultTableModel();
        jtConsulta.setModel(model);
        model.setColumnIdentifiers(new Object[]{"Codigo del Tratamieno", "Nombre", "Medicameto", "Ciclo", "Dosis"});
        try{
            ResultSet rs = bd.Vertodo("select * from Tratamiento");

            while(rs.next()){

                model.addRow(new Object[]{rs.getInt("Id_Tratamiento"), rs.getString("Nombre_tra"), rs.getString("Medicamento"), rs.getString("Ciclo"), rs.getString("Dosis")});

            }

        } catch(Exception e){

        } finally{
            bd.close();
        }

    }//GEN-LAST:event_jbtMostrar2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        try{

            String report = "src\\Tratamiento\\Tratamieto.jrxml";
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
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Tratamientover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tratamientover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tratamientover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tratamientover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tratamientover().setVisible(true);
            }
        });
    }
    
    Conectar_Mysql bd = new Conectar_Mysql();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbtBuscar2;
    private javax.swing.JButton jbtMostrar2;
    private javax.swing.JRadioButton jrbCodigo;
    private javax.swing.JRadioButton jrbNombre;
    private javax.swing.JTable jtConsulta;
    public static javax.swing.JTextField jtxtBuscar;
    // End of variables declaration//GEN-END:variables
}