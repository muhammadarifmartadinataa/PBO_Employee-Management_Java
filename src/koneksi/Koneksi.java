/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author M ARIF MARTADINATA
 */
public class Koneksi {
    public static Connection con;
    public static Statement st;
    public static void koneksi(){
        try {
            con = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/db_deva_company_pbo","root","");
            st = (Statement) con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Koneksi gagal"+ e);
        } //catch
    } //koneksi
    
}
