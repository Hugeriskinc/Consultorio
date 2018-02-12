/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;
import oracle.jdbc.OracleStatement;

/**
 *
 * @author Oscar Ortiz
 */
public class Conectar_Oracle {
    
    //creamos la variable coneccion
    static Connection cn = null;
    
    //ruta de la base de datos la cual crearemos
    String BaseDeDatos = "jdbc:oracle:thin:@localhost:1521:XE";
        
    //creamos la clase conexion    
    public Connection connect() throws ClassNotFoundException{
        
        try {
            
            //Class.forName("org.sqlite.JDBC");
            this.cn = DriverManager.getConnection(BaseDeDatos,"ADM","Administrador");
            if (this.cn!=null) {
                JOptionPane.showMessageDialog(null, "Se conecto correctamente", "Connecion a la base de datos", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }catch(SQLException ex){
            
            JOptionPane.showMessageDialog(null, "Error al conectarse!", "Coneccion a la base de datos", JOptionPane.ERROR_MESSAGE);
            
        }
        
        return this.cn;
        
    }
    
    public void Insert(String sql) throws ClassNotFoundException {

        this.cn = connect();
        try {

            PreparedStatement pst = this.cn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Se agrego el registro", "Registro de sistema", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + " No se agrego el registro", "Registro de sistema", JOptionPane.ERROR_MESSAGE);
        }

    }

    public ResultSet Vertodo(String sql) throws ClassNotFoundException {

        this.cn = connect();
        OracleStatement st;
        OracleResultSet rs = null;
        try {

            st = (OracleStatement) this.cn.createStatement();
            rs = (OracleResultSet) st.executeQuery(sql);

        } catch (Exception e) {
            Logger.getLogger(Conectar_Oracle.class.getName()).log(Level.SEVERE, null, e);
        }

        return rs;

    }

    public ResultSet seleccionar(String Sql) {

        
        OraclePreparedStatement pst;
        OracleResultSet rs = null;

        try {

            this.cn = connect();
            pst = (OraclePreparedStatement) this.cn.prepareStatement(Sql);
            rs = (OracleResultSet) pst.executeQuery();

        } catch (Exception e) {

        }

        return rs;

    }
    
    public void close(){
        
        try {
            
            this.cn.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al conectarse " +ex, "Connecion a la base de datos", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
}
