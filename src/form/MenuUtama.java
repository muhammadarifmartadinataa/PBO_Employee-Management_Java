/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package form;

import laporan.MainLaporan;


/**
 *
 * @author M ARIF MARTADINATA
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu1 = new javax.swing.JMenu();
        MasterPengguna = new javax.swing.JMenuItem();
        MasterPegawai = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        MenuAbsensiPegawai = new javax.swing.JMenuItem();
        editMenu1 = new javax.swing.JMenu();
        LaporanAbsensi = new javax.swing.JMenuItem();
        LaporanPengguna = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        MenuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/LOGO.png"))); // NOI18N
        desktopPane.add(jLabel2);
        jLabel2.setBounds(460, 20, 530, 510);

        fileMenu1.setMnemonic('f');
        fileMenu1.setText("Master");

        MasterPengguna.setMnemonic('o');
        MasterPengguna.setText("Pengguna");
        MasterPengguna.setEnabled(false);
        MasterPengguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasterPenggunaActionPerformed(evt);
            }
        });
        fileMenu1.add(MasterPengguna);

        MasterPegawai.setMnemonic('s');
        MasterPegawai.setText("Pegawai");
        MasterPegawai.setEnabled(false);
        MasterPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasterPegawaiActionPerformed(evt);
            }
        });
        fileMenu1.add(MasterPegawai);

        menuBar.add(fileMenu1);

        editMenu.setMnemonic('e');
        editMenu.setText("Absensi");

        MenuAbsensiPegawai.setMnemonic('t');
        MenuAbsensiPegawai.setText("Pegawai");
        MenuAbsensiPegawai.setEnabled(false);
        MenuAbsensiPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAbsensiPegawaiActionPerformed(evt);
            }
        });
        editMenu.add(MenuAbsensiPegawai);

        menuBar.add(editMenu);

        editMenu1.setMnemonic('e');
        editMenu1.setText("Laporan");

        LaporanAbsensi.setMnemonic('t');
        LaporanAbsensi.setText("Absensi");
        LaporanAbsensi.setEnabled(false);
        LaporanAbsensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanAbsensiActionPerformed(evt);
            }
        });
        editMenu1.add(LaporanAbsensi);

        LaporanPengguna.setMnemonic('t');
        LaporanPengguna.setText("Pengguna");
        LaporanPengguna.setEnabled(false);
        LaporanPengguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanPenggunaActionPerformed(evt);
            }
        });
        editMenu1.add(LaporanPengguna);

        menuBar.add(editMenu1);

        helpMenu.setMnemonic('h');
        helpMenu.setText("About");

        MenuAbout.setMnemonic('a');
        MenuAbout.setText("About");
        MenuAbout.setEnabled(false);
        MenuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAboutActionPerformed(evt);
            }
        });
        helpMenu.add(MenuAbout);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1347, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1367, 689));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuAbsensiPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAbsensiPegawaiActionPerformed
        // TODO add your handling code here:
        AbsensiPegawai absen = new AbsensiPegawai(this, rootPaneCheckingEnabled);
        absen.setVisible(true);
    }//GEN-LAST:event_MenuAbsensiPegawaiActionPerformed

    private void MasterPenggunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasterPenggunaActionPerformed
        // TODO add your handling code here:
        Pengguna pengguna = new Pengguna(this, rootPaneCheckingEnabled);
        pengguna.setVisible(true);
    }//GEN-LAST:event_MasterPenggunaActionPerformed

    private void MasterPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasterPegawaiActionPerformed
        // TODO add your handling code here:
        Pegawai pegawai = new Pegawai(this, rootPaneCheckingEnabled);
        pegawai.setVisible(true);
    }//GEN-LAST:event_MasterPegawaiActionPerformed

    private void LaporanPenggunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanPenggunaActionPerformed
        // TODO add your handling code here:
        MainLaporan laporan = new MainLaporan();
        laporan.namaLaporan="report1_pengguna";
        laporan.cetakLaporanMaster();
    }//GEN-LAST:event_LaporanPenggunaActionPerformed

    private void LaporanAbsensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanAbsensiActionPerformed
        // TODO add your handling code here:
        MainLaporan laporan = new MainLaporan();
        laporan.namaLaporan="report_absensi";
        laporan.cetakLaporanMaster();
    }//GEN-LAST:event_LaporanAbsensiActionPerformed

    private void MenuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAboutActionPerformed
        // TODO add your handling code here:
        kembaliKeHalamanLogin();
    }//GEN-LAST:event_MenuAboutActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenuItem LaporanAbsensi;
    public static javax.swing.JMenuItem LaporanPengguna;
    public static javax.swing.JMenuItem MasterPegawai;
    public static javax.swing.JMenuItem MasterPengguna;
    public static javax.swing.JMenuItem MenuAbout;
    public static javax.swing.JMenuItem MenuAbsensiPegawai;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu editMenu1;
    private javax.swing.JMenu fileMenu1;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
    private void kembaliKeHalamanLogin() {
    // Anda perlu mengganti "NamaFrameLogin" dengan nama frame atau kelas yang menangani halaman login
        this.setVisible(false);
        Login lgn = new Login(this, rootPaneCheckingEnabled);
        lgn.setVisible(true);
    }
}
