/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recetas;

import Base_datos.Conectar_Mysql;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Oscar Ortiz
 */
public class ReceInd extends javax.swing.JFrame {

    /**
     * Creates new form ReceInd
     */
    
    JDialog Viewer = new JDialog(new JFrame(), "Reporte", true);
    
    public ReceInd() {
        initComponents();
        
        jcBuscar.removeAllItems();
        jcBuscar.insertItemAt("Codigo", 0);
        jcBuscar.insertItemAt("Nombre", 1);
        
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcBuscar = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 120, 50));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Reporte de las recetas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Tipo de busqueda:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jcBuscar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jcBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jcBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 90, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 90, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver 1.png"))); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 120, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/textura.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String bus = "",nombre = jTextField1.getText();
        
        if(jcBuscar.getSelectedIndex() < 0){
            JOptionPane.showMessageDialog(null, "No a seleccionado ninguna opcion", "Sistema De Consultorio", JOptionPane.INFORMATION_MESSAGE);
        }else{
                if(jcBuscar.getSelectedIndex() == 0){
                    if(nombre.equals("")){
                        JOptionPane.showMessageDialog(null, "No a escrito lo que desea buscar", "Sistema De Consultorio", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                    char k = nombre.charAt(0);
                        if(Character.isLetter(k)){
                            JOptionPane.showMessageDialog(null, "Solo Puede introducir Numeros", "Sistema De Consultorio", JOptionPane.INFORMATION_MESSAGE);
                        } else{
                    bus = "Codigo";

                    try{

                    String report = "src\\Recetas\\id.jrxml";
                    Map parametro = new HashMap();
                    parametro.put(bus, Integer.parseInt(jTextField1.getText()));
                    JasperReport reporte = JasperCompileManager.compileReport(report);
                    JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, parametro, bd.connect());
                    //JasperViewer jv;

                    Viewer.setSize(1000, 700);
                    Viewer.setLocationRelativeTo(null);
                    JRViewer jrv = new JRViewer(jasperPrint);
                    Viewer.getContentPane().add(jrv);
                    Viewer.setVisible(true);


                } catch(Exception e){

                    JOptionPane.showMessageDialog(null, e);

                }}}

                }else if(jcBuscar.getSelectedIndex() == 1){
                    if(nombre.equals("")){
                        JOptionPane.showMessageDialog(null, "No a escrito lo que desea buscar", "Sistema De Consultorio", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                    char k = nombre.charAt(0);
                        if(Character.isDigit(k)){
                            JOptionPane.showMessageDialog(null, "Solo Puede introducir letras", "Sistema De Consultorio", JOptionPane.INFORMATION_MESSAGE);
                        } else{
                    bus = "Nombre";

                    try{

                    String report = "src\\Recetas\\Nombre.jrxml";
                    Map parametro = new HashMap();
                    parametro.put(bus, jTextField1.getText());
                    JasperReport reporte = JasperCompileManager.compileReport(report);
                    JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, parametro, bd.connect());
                    //JasperViewer jv;

                    Viewer.setSize(1000, 700);
                    Viewer.setLocationRelativeTo(null);
                    JRViewer jrv = new JRViewer(jasperPrint);
                    Viewer.getContentPane().add(jrv);
                    Viewer.setVisible(true);

                } catch(Exception e){

                    JOptionPane.showMessageDialog(null, e);

                }
                } 
                }}
        
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        this.hide();
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ReceInd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceInd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceInd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceInd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceInd().setVisible(true);
            }
        });
    }
    
    Conectar_Mysql bd = new Conectar_Mysql();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> jcBuscar;
    // End of variables declaration//GEN-END:variables
}
