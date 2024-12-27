package go.badminton;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class pembayaran extends javax.swing.JFrame {
    double totalPembayaran = 0;
    double uangDiberikan = 0;
    double kembalian = 0;

    public pembayaran() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pembayaran = new javax.swing.JPanel();
        Pilih_Pembayaran = new javax.swing.JComboBox<>();
        Jenis_Lapangan = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        total_pembayaran = new javax.swing.JLabel();
        pilih_pembayaran = new javax.swing.JLabel();
        nama_pelanggan = new javax.swing.JLabel();
        tanggal_dan_waktu_pembayaran1 = new javax.swing.JLabel();
        jumlah_uang = new javax.swing.JLabel();
        nama_lapangan = new javax.swing.JLabel();
        uang_kembalian = new javax.swing.JLabel();
        Nama_Pelanggan = new go.Custom.TextFieldCustom();
        Tanggal = new go.Custom.TextFieldCustom();
        Total_Pembayaran = new go.Custom.TextFieldCustom();
        Kembalian = new go.Custom.TextFieldCustom();
        Hitung_Pembayaran = new go.Custom.ButtonCustom();
        Hapus = new go.Custom.ButtonCustom();
        UangDiberikan = new go.Custom.TextFieldCustom();
        Show_Detail = new go.Custom.ButtonCustom();
        Konfirmasi_Pembayaran = new go.Custom.ButtonCustom();
        panel_harga = new go.Custom.PanelCustom();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_Detail = new javax.swing.JTable();
        M_R = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        total_pembayaran1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pembayaran.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pilih_Pembayaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CASH (Pembayaran Tunai)" }));
        Pembayaran.add(Pilih_Pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 210, -1));

        Jenis_Lapangan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Shuttle Zone", "Shuttle Heaven", "Shuttle Hell", " " }));
        Pembayaran.add(Jenis_Lapangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 210, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("                                          Pembayaran");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(12, 12, 12, 12, new java.awt.Color(153, 51, 0)));
        Pembayaran.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 140));

        total_pembayaran.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total_pembayaran.setForeground(new java.awt.Color(255, 255, 255));
        total_pembayaran.setText("Jumlah Uang Diberikan  :");
        Pembayaran.add(total_pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        pilih_pembayaran.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pilih_pembayaran.setForeground(new java.awt.Color(255, 255, 255));
        pilih_pembayaran.setText("Pilih pembayaran            : ");
        Pembayaran.add(pilih_pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        nama_pelanggan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nama_pelanggan.setForeground(new java.awt.Color(255, 255, 255));
        nama_pelanggan.setText("Nama Pelanggan             :");
        Pembayaran.add(nama_pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        tanggal_dan_waktu_pembayaran1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tanggal_dan_waktu_pembayaran1.setForeground(new java.awt.Color(255, 255, 255));
        tanggal_dan_waktu_pembayaran1.setText("Tanggal & Waktu Bayar :");
        Pembayaran.add(tanggal_dan_waktu_pembayaran1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jumlah_uang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jumlah_uang.setForeground(new java.awt.Color(255, 255, 255));
        jumlah_uang.setText("Total Pembayaran           :");
        Pembayaran.add(jumlah_uang, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        nama_lapangan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nama_lapangan.setForeground(new java.awt.Color(255, 255, 255));
        nama_lapangan.setText("Nama Lapangan              : ");
        Pembayaran.add(nama_lapangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        uang_kembalian.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        uang_kembalian.setForeground(new java.awt.Color(255, 255, 255));
        uang_kembalian.setText("Kembalian                         :");
        Pembayaran.add(uang_kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 556, 190, 30));
        Pembayaran.add(Nama_Pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 220, 40));
        Pembayaran.add(Tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 366, 220, 40));
        Pembayaran.add(Total_Pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 220, 40));
        Pembayaran.add(Kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 220, 40));

        Hitung_Pembayaran.setText("Hitung_Pembayaran");
        Hitung_Pembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hitung_PembayaranActionPerformed(evt);
            }
        });
        Pembayaran.add(Hitung_Pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 610, 160, 40));

        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        Pembayaran.add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 610, 140, 40));
        Pembayaran.add(UangDiberikan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 220, 40));

        Show_Detail.setText("Show Detail");
        Show_Detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show_DetailActionPerformed(evt);
            }
        });
        Pembayaran.add(Show_Detail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, 120, 40));

        Konfirmasi_Pembayaran.setText("Konfirmasi Pembayaran");
        Konfirmasi_Pembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Konfirmasi_PembayaranActionPerformed(evt);
            }
        });
        Pembayaran.add(Konfirmasi_Pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 610, 160, 40));

        panel_harga.setBackground(new java.awt.Color(255, 255, 51));
        panel_harga.setRoundBottomLeft(10);
        panel_harga.setRoundBottomRight(10);
        panel_harga.setRoundTopLeft(10);
        panel_harga.setRoundTopRight(20);
        panel_harga.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Pelanggan Member      : 320.000 / Bulan 8X 2 jam");
        panel_harga.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 30));

        jLabel7.setText("Benefit Member    :");
        panel_harga.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 310, 20));
        panel_harga.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 300, -1));

        jLabel9.setText("- Free Peminjaman 2 Raket");
        panel_harga.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel10.setText("-Free 3 Shuttlecock ");
        panel_harga.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, -1));

        jLabel11.setText("-Free 1 Aqua 1L");
        panel_harga.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel12.setText("Pelanggan Reguler        : 50.000 / 1 jam");
        panel_harga.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 210, -1));

        jLabel13.setText("Benefit Reguler     :");
        panel_harga.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel14.setText("- Free 1 Aqua  350ml");
        panel_harga.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel16.setText("- Free 1 Shuttlecock");
        panel_harga.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        Pembayaran.add(panel_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 350, 200));

        Tabel_Detail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pembayaran", "Lapangan", "Pelanggan", "Jenis Pelanggan ", "Tanggal", "Total Pembayaran", "Uang Diberikan", "Kembalian"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabel_Detail);

        Pembayaran.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 150, 640, 540));

        M_R.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Member", "Reguler", " " }));
        Pembayaran.add(M_R, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 80, 20));

        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(12, 12, 12, 12, new java.awt.Color(153, 51, 0)));
        Pembayaran.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 870, 570));

        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(12, 12, 12, 12, new java.awt.Color(153, 51, 0)));
        Pembayaran.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, 660, 560));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/raketK.png"))); // NOI18N
        Pembayaran.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 700));

        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(12, 12, 12, 12, new java.awt.Color(153, 51, 0)));
        Pembayaran.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 760, 570));

        total_pembayaran1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total_pembayaran1.setForeground(new java.awt.Color(255, 255, 255));
        total_pembayaran1.setText("Jumlah Uang Diberikan  :");
        Pembayaran.add(total_pembayaran1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        getContentPane().add(Pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1560, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Hitung_PembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hitung_PembayaranActionPerformed

               
    }//GEN-LAST:event_Hitung_PembayaranActionPerformed

    private void Konfirmasi_PembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Konfirmasi_PembayaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Konfirmasi_PembayaranActionPerformed

    private void Nama_PelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCustom1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCustom1ActionPerformed

    private void Total_PembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nama_Pelanggan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nama_Pelanggan1ActionPerformed

    private void Show_DetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show_DetailActionPerformed
        DefaultTableModel model = (DefaultTableModel) Tabel_Detail.getModel();
        model.addRow(new Object[]{Pilih_Pembayaran.getSelectedItem(), Jenis_Lapangan.getSelectedItem(), Nama_Pelanggan.getText(),M_R.getSelectedItem(), Tanggal.getText(),
            Total_Pembayaran.getText(), UangDiberikan.getText(), Kembalian.getText(),});
               
    
    }//GEN-LAST:event_Show_DetailActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        DefaultTableModel model = (DefaultTableModel) Tabel_Detail.getModel();

        if (Tabel_Detail.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Tidak ada data yang harus dihapus", "", JOptionPane.OK_OPTION);
        } else if (Tabel_Detail.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Pilih baris untuk dihapus", "", JOptionPane.OK_OPTION);
        } else {
            model.removeRow(Tabel_Detail.getSelectedRow());
        } 
    }//GEN-LAST:event_HapusActionPerformed

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
            java.util.logging.Logger.getLogger(pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pembayaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private go.Custom.ButtonCustom Hapus;
    private go.Custom.ButtonCustom Hitung_Pembayaran;
    private javax.swing.JComboBox<String> Jenis_Lapangan;
    private go.Custom.TextFieldCustom Kembalian;
    private go.Custom.ButtonCustom Konfirmasi_Pembayaran;
    private javax.swing.JComboBox<String> M_R;
    private go.Custom.TextFieldCustom Nama_Pelanggan;
    private javax.swing.JPanel Pembayaran;
    private javax.swing.JComboBox<String> Pilih_Pembayaran;
    private go.Custom.ButtonCustom Show_Detail;
    private javax.swing.JTable Tabel_Detail;
    private go.Custom.TextFieldCustom Tanggal;
    private go.Custom.TextFieldCustom Total_Pembayaran;
    private go.Custom.TextFieldCustom UangDiberikan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jumlah_uang;
    private javax.swing.JLabel nama_lapangan;
    private javax.swing.JLabel nama_pelanggan;
    private go.Custom.PanelCustom panel_harga;
    private javax.swing.JLabel pilih_pembayaran;
    private javax.swing.JLabel tanggal_dan_waktu_pembayaran1;
    private javax.swing.JLabel total_pembayaran;
    private javax.swing.JLabel total_pembayaran1;
    private javax.swing.JLabel uang_kembalian;
    // End of variables declaration//GEN-END:variables
}
