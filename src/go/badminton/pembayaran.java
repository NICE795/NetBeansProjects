package go.badminton;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.NumberFormat;
import java.math.BigDecimal;


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
        id_pelanggan = new javax.swing.JLabel();
        tanggal_dan_waktu_pembayaran1 = new javax.swing.JLabel();
        jumlah_uang = new javax.swing.JLabel();
        nama_lapangan = new javax.swing.JLabel();
        nama_pelanggan1 = new javax.swing.JLabel();
        uang_kembalian = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_Detail = new javax.swing.JTable();
        Jenis_Pelanggan = new javax.swing.JComboBox<>();
        Show_Detail = new go.Custom.ButtonCustom();
        Konfirmasi_Pembayaran = new go.Custom.ButtonCustom();
        Hitung_Pembayaran = new go.Custom.ButtonCustom();
        Hapus = new go.Custom.ButtonCustom();
        Nama_Pelanggan = new go.Custom.TextFieldCustom();
        UangDiberikan = new go.Custom.TextFieldCustom();
        Bayar = new go.Custom.TextFieldCustom();
        Kembalian = new go.Custom.TextFieldCustom();
        ID_Pelanggan = new go.Custom.TextFieldCustom();
        Tanggal = new go.Custom.TextFieldCustom();
        panelCustom1 = new go.Custom.PanelCustom();
        bingkaicoklat1 = new javax.swing.JLabel();
        bingkaicoklat2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

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
        Pembayaran.add(total_pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        pilih_pembayaran.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pilih_pembayaran.setForeground(new java.awt.Color(255, 255, 255));
        pilih_pembayaran.setText("Pilih pembayaran            : ");
        Pembayaran.add(pilih_pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        id_pelanggan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        id_pelanggan.setForeground(new java.awt.Color(255, 255, 255));
        id_pelanggan.setText("ID Pelanggan                   :");
        Pembayaran.add(id_pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        tanggal_dan_waktu_pembayaran1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tanggal_dan_waktu_pembayaran1.setForeground(new java.awt.Color(255, 255, 255));
        tanggal_dan_waktu_pembayaran1.setText("Tanggal & Waktu Bayar :");
        Pembayaran.add(tanggal_dan_waktu_pembayaran1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        jumlah_uang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jumlah_uang.setForeground(new java.awt.Color(255, 255, 255));
        jumlah_uang.setText("Total Pembayaran           :");
        Pembayaran.add(jumlah_uang, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        nama_lapangan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nama_lapangan.setForeground(new java.awt.Color(255, 255, 255));
        nama_lapangan.setText("Nama Lapangan              : ");
        Pembayaran.add(nama_lapangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        nama_pelanggan1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nama_pelanggan1.setForeground(new java.awt.Color(255, 255, 255));
        nama_pelanggan1.setText("Nama Pelanggan             :");
        Pembayaran.add(nama_pelanggan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        uang_kembalian.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        uang_kembalian.setForeground(new java.awt.Color(255, 255, 255));
        uang_kembalian.setText("Kembalian                         :");
        Pembayaran.add(uang_kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 190, 30));

        Tabel_Detail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pembayaran", "Lapangan", "Pelanggan", "Jenis Pelanggan ", "ID", "Tanggal", "Total Pembayaran", "Uang Diberikan", "Kembalian"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabel_Detail);

        Pembayaran.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 150, 640, 540));

        Jenis_Pelanggan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Member", "Reguler", " " }));
        Jenis_Pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jenis_PelangganActionPerformed(evt);
            }
        });
        Pembayaran.add(Jenis_Pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 80, 20));

        Show_Detail.setText("Show Detail");
        Show_Detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show_DetailActionPerformed(evt);
            }
        });
        Pembayaran.add(Show_Detail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 150, 30));

        Konfirmasi_Pembayaran.setText("Konfirmasi Pembayaran");
        Konfirmasi_Pembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Konfirmasi_PembayaranActionPerformed(evt);
            }
        });
        Pembayaran.add(Konfirmasi_Pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 650, -1, 30));

        Hitung_Pembayaran.setText("Hitung Pembayaran");
        Hitung_Pembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hitung_PembayaranActionPerformed(evt);
            }
        });
        Pembayaran.add(Hitung_Pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 650, 150, 30));

        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        Pembayaran.add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 650, 90, 30));

        Nama_Pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nama_PelangganActionPerformed(evt);
            }
        });
        Pembayaran.add(Nama_Pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 210, 40));

        UangDiberikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UangDiberikanActionPerformed(evt);
            }
        });
        Pembayaran.add(UangDiberikan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 210, 40));

        Bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BayarActionPerformed(evt);
            }
        });
        Pembayaran.add(Bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 210, 40));

        Kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembalianActionPerformed(evt);
            }
        });
        Pembayaran.add(Kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 590, 210, 40));
        Pembayaran.add(ID_Pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 210, 40));
        Pembayaran.add(Tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 210, 40));
        Pembayaran.add(panelCustom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 250, 230));

        bingkaicoklat1.setBorder(javax.swing.BorderFactory.createMatteBorder(12, 12, 12, 12, new java.awt.Color(153, 51, 0)));
        Pembayaran.add(bingkaicoklat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 870, 570));

        bingkaicoklat2.setBorder(javax.swing.BorderFactory.createMatteBorder(12, 12, 12, 12, new java.awt.Color(153, 51, 0)));
        Pembayaran.add(bingkaicoklat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, 660, 560));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/raketK.png"))); // NOI18N
        Pembayaran.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 700));

        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(12, 12, 12, 12, new java.awt.Color(153, 51, 0)));
        Pembayaran.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 760, 570));

        jLabel4.setText("Pelanggan Member      : 320.000 / Bulan 8X 2 jam");
        Pembayaran.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 310, 30));

        jLabel7.setText("Benefit Member    :");
        Pembayaran.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 310, 20));

        jLabel9.setText("- Free Peminjaman 2 Raket");
        Pembayaran.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, -1, -1));

        jLabel10.setText("-Free 3 Shuttlecock ");
        Pembayaran.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 160, 10));

        jLabel11.setText("-Free 1 Aqua 1L");
        Pembayaran.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, -1, -1));

        jLabel12.setText("Pelanggan Reguler        : 50.000 / 1 jam");
        Pembayaran.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 210, -1));

        jLabel13.setText("Benefit Reguler     :");
        Pembayaran.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, -1, -1));

        jLabel14.setText("- Free 1 Aqua  350ml");
        Pembayaran.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 620, -1, -1));

        jLabel16.setText("- Free 1 Shuttlecock");
        Pembayaran.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 620, -1, -1));

        getContentPane().add(Pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1560, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Hitung_PembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hitung_PembayaranActionPerformed
                                                 
    try {
        // Ambil input dari combo box untuk jenis pelanggan
        String jenisPelanggan = Jenis_Pelanggan.getSelectedItem().toString();
        
        // Ambil input dari text field untuk uang yang diberikan
        String uangDiberikanInput = UangDiberikan.getText();
        double uangDiberikan = parseCurrency(uangDiberikanInput); // Panggil fungsi parseCurrency
        
        // Variabel harga berdasarkan jenis pelanggan
        double harga = 0;

        // Tentukan harga berdasarkan jenis pelanggan
        if (jenisPelanggan.equalsIgnoreCase("Member")) {
            harga = 320000; // Harga untuk Member
        } else if (jenisPelanggan.equalsIgnoreCase("Regular")) {
            harga = 50000; // Harga untuk Regular
        } else {
            // Jika jenis pelanggan tidak valid, tampilkan pesan di text field "Kembalian"
            Kembalian.setText("Jenis pelanggan tidak valid");
            return;
        }

        // Cek apakah uang mencukupi
        if (uangDiberikan < harga) {
            // Jika uang tidak mencukupi, tampilkan pesan di text field "Kembalian"
            Kembalian.setText("Uang tidak mencukupi");
        } else if (uangDiberikan == harga) {
            // Jika uang tepat, tampilkan pesan pembayaran tepat
            Kembalian.setText("Pembayaran Tepat");
        } else {
            // Hitung kembalian jika uang mencukupi dan tidak tepat
            double kembalian = uangDiberikan - harga;

            // Menampilkan hasil kembalian dalam format Rp (nominal tanpa desimal)
            String kembalianStr = String.format("Rp %.0f", kembalian); // Tanpa koma atau simbol lain
            Kembalian.setText(kembalianStr);
        }
    } catch (NumberFormatException | ParseException e) {
        // Jika input tidak valid, tampilkan pesan error
        Kembalian.setText("Input tidak valid");
    } catch (NullPointerException e) {
        // Jika combo box atau text field kosong
        Kembalian.setText("Harap lengkapi semua data");
    }
}

// Fungsi untuk mengubah input dengan pemisah ribuan ke angka
private double parseCurrency(String input) throws ParseException {
    // Menggunakan DecimalFormat untuk format yang lebih tepat
    DecimalFormat format = new DecimalFormat("#,##0.00");  // Format untuk angka dengan ribuan dan dua digit desimal
    format.setParseBigDecimal(true);  // Agar format bekerja dengan baik untuk angka besar atau desimal
    Number number = format.parse(input);
    return number.doubleValue();  // Mengonversi ke double

    }//GEN-LAST:event_Hitung_PembayaranActionPerformed

    private void Nama_PelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCustom1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCustom1ActionPerformed

    private void Total_PembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nama_Pelanggan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nama_Pelanggan1ActionPerformed

    private void Show_DetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show_DetailActionPerformed
        DefaultTableModel model = (DefaultTableModel) Tabel_Detail.getModel();
        model.addRow(new Object[]{Pilih_Pembayaran.getSelectedItem(), Jenis_Lapangan.getSelectedItem(), Nama_Pelanggan.getText(),Jenis_Pelanggan.getSelectedItem(), ID_Pelanggan.getText(), Tanggal.getText(),
            Bayar.getText(), UangDiberikan.getText(), Kembalian.getText(),});
               
    
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

    private void BayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BayarActionPerformed

    }//GEN-LAST:event_BayarActionPerformed

    private void UangDiberikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UangDiberikanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UangDiberikanActionPerformed

    private void KembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KembalianActionPerformed

    private void Jenis_PelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jenis_PelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jenis_PelangganActionPerformed

    private void Konfirmasi_PembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Konfirmasi_PembayaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Konfirmasi_PembayaranActionPerformed

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
    private go.Custom.TextFieldCustom Bayar;
    private go.Custom.ButtonCustom Hapus;
    private go.Custom.ButtonCustom Hitung_Pembayaran;
    private go.Custom.TextFieldCustom ID_Pelanggan;
    private javax.swing.JComboBox<String> Jenis_Lapangan;
    private javax.swing.JComboBox<String> Jenis_Pelanggan;
    private go.Custom.TextFieldCustom Kembalian;
    private go.Custom.ButtonCustom Konfirmasi_Pembayaran;
    private go.Custom.TextFieldCustom Nama_Pelanggan;
    private javax.swing.JPanel Pembayaran;
    private javax.swing.JComboBox<String> Pilih_Pembayaran;
    private go.Custom.ButtonCustom Show_Detail;
    private javax.swing.JTable Tabel_Detail;
    private go.Custom.TextFieldCustom Tanggal;
    private go.Custom.TextFieldCustom UangDiberikan;
    private javax.swing.JLabel bingkaicoklat1;
    private javax.swing.JLabel bingkaicoklat2;
    private javax.swing.JLabel id_pelanggan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jumlah_uang;
    private javax.swing.JLabel nama_lapangan;
    private javax.swing.JLabel nama_pelanggan1;
    private go.Custom.PanelCustom panelCustom1;
    private javax.swing.JLabel pilih_pembayaran;
    private javax.swing.JLabel tanggal_dan_waktu_pembayaran1;
    private javax.swing.JLabel total_pembayaran;
    private javax.swing.JLabel uang_kembalian;
    // End of variables declaration//GEN-END:variables
}
