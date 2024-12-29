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
    private double hargaMember = 320000;
    private double hargaRegular = 50000;

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
        Hitung_Pembayaran = new go.Custom.ButtonCustom();
        Konfirmasi_Pembayaran = new go.Custom.ButtonCustom();
        Kembali = new go.Custom.ButtonCustom();
        Hapus = new go.Custom.ButtonCustom();
        Nama_Pelanggan = new go.Custom.TextFieldCustom();
        UangDiberikan = new go.Custom.TextFieldCustom();
        Bayar = new go.Custom.TextFieldCustom();
        Kembalian = new go.Custom.TextFieldCustom();
        ID_Pelanggan = new go.Custom.TextFieldCustom();
        Tanggal = new go.Custom.TextFieldCustom();
        panelCustom1 = new go.Custom.PanelCustom();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bingkaicoklat1 = new javax.swing.JLabel();
        bingkaicoklat2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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
        total_pembayaran.setText("Jumlah Uang Diberikan    :");
        Pembayaran.add(total_pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

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
        tanggal_dan_waktu_pembayaran1.setText("Tanggal & Waktu Bayar   :");
        Pembayaran.add(tanggal_dan_waktu_pembayaran1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jumlah_uang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jumlah_uang.setForeground(new java.awt.Color(255, 255, 255));
        jumlah_uang.setText("Total Pembayaran             :");
        Pembayaran.add(jumlah_uang, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

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
        uang_kembalian.setText("Kembalian                           :");
        Pembayaran.add(uang_kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 190, 30));

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

        Show_Detail.setForeground(new java.awt.Color(255, 255, 255));
        Show_Detail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/detail.png"))); // NOI18N
        Show_Detail.setText("Show Detail");
        Show_Detail.setColor(new java.awt.Color(170, 179, 150));
        Show_Detail.setColorBorder(new java.awt.Color(102, 102, 102));
        Show_Detail.setColorClick(new java.awt.Color(102, 102, 102));
        Show_Detail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Show_Detail.setRadius(20);
        Show_Detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show_DetailActionPerformed(evt);
            }
        });
        Pembayaran.add(Show_Detail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 150, 40));

        Hitung_Pembayaran.setForeground(new java.awt.Color(255, 255, 255));
        Hitung_Pembayaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kalkulator.png"))); // NOI18N
        Hitung_Pembayaran.setText("hitung");
        Hitung_Pembayaran.setColor(new java.awt.Color(204, 204, 204));
        Hitung_Pembayaran.setColorBorder(new java.awt.Color(153, 153, 153));
        Hitung_Pembayaran.setColorClick(new java.awt.Color(102, 102, 102));
        Hitung_Pembayaran.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Hitung_Pembayaran.setRadius(20);
        Hitung_Pembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hitung_PembayaranActionPerformed(evt);
            }
        });
        Pembayaran.add(Hitung_Pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 640, 150, 40));

        Konfirmasi_Pembayaran.setForeground(new java.awt.Color(255, 255, 255));
        Konfirmasi_Pembayaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/centang.png"))); // NOI18N
        Konfirmasi_Pembayaran.setText("Konfirmasi Pembayaran");
        Konfirmasi_Pembayaran.setColor(new java.awt.Color(92, 179, 56));
        Konfirmasi_Pembayaran.setColorBorder(new java.awt.Color(0, 102, 0));
        Konfirmasi_Pembayaran.setColorClick(new java.awt.Color(0, 102, 0));
        Konfirmasi_Pembayaran.setColorOver(new java.awt.Color(92, 179, 56));
        Konfirmasi_Pembayaran.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Konfirmasi_Pembayaran.setRadius(20);
        Konfirmasi_Pembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Konfirmasi_PembayaranActionPerformed(evt);
            }
        });
        Pembayaran.add(Konfirmasi_Pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 640, -1, 40));

        Kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/keluar.png"))); // NOI18N
        Kembali.setText("Kembali");
        Kembali.setColor(new java.awt.Color(153, 255, 255));
        Kembali.setColorBorder(new java.awt.Color(51, 204, 255));
        Kembali.setColorClick(new java.awt.Color(0, 204, 204));
        Kembali.setColorOver(new java.awt.Color(153, 255, 255));
        Kembali.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Kembali.setRadius(20);
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });
        Pembayaran.add(Kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 640, 140, 40));

        Hapus.setForeground(new java.awt.Color(255, 255, 255));
        Hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hapus.png"))); // NOI18N
        Hapus.setText("Hapus");
        Hapus.setColor(new java.awt.Color(255, 0, 0));
        Hapus.setColorBorder(new java.awt.Color(204, 0, 0));
        Hapus.setColorClick(new java.awt.Color(153, 0, 0));
        Hapus.setColorOver(new java.awt.Color(255, 0, 0));
        Hapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Hapus.setRadius(20);
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        Pembayaran.add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 640, 120, 40));

        Nama_Pelanggan.setRadius(20);
        Nama_Pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nama_PelangganActionPerformed(evt);
            }
        });
        Pembayaran.add(Nama_Pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 210, 40));

        UangDiberikan.setRadius(20);
        UangDiberikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UangDiberikanActionPerformed(evt);
            }
        });
        Pembayaran.add(UangDiberikan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 210, 40));

        Bayar.setRadius(20);
        Bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BayarActionPerformed(evt);
            }
        });
        Pembayaran.add(Bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 210, 40));

        Kembalian.setRadius(20);
        Kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembalianActionPerformed(evt);
            }
        });
        Pembayaran.add(Kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, 210, 40));

        ID_Pelanggan.setRadius(20);
        Pembayaran.add(ID_Pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 210, 40));

        Tanggal.setRadius(20);
        Pembayaran.add(Tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 210, 40));

        panelCustom1.setBackground(new java.awt.Color(255, 240, 220));
        panelCustom1.setRoundBottomLeft(20);
        panelCustom1.setRoundBottomRight(20);
        panelCustom1.setRoundTopLeft(20);
        panelCustom1.setRoundTopRight(20);
        panelCustom1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("- Free 3 Shuttlecock ");
        panelCustom1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 370, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Benefit Member    :");
        panelCustom1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 300, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("- Free 1 Aqua 1L");
        panelCustom1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("- Free Peminjaman 2 Raket");
        panelCustom1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 170, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Pelanggan Reguler        : 50.000 / 1 jam");
        panelCustom1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 240, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Benefit Reguler     :");
        panelCustom1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Pelanggan Member      : 320.000 / Bulan 8X 2 jam");
        panelCustom1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("- Free 1 Aqua 350ml");
        panelCustom1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 130, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("- Free 1 Shuttlecock");
        panelCustom1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        Pembayaran.add(panelCustom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 390, 210));

        bingkaicoklat1.setBorder(javax.swing.BorderFactory.createMatteBorder(12, 12, 12, 12, new java.awt.Color(153, 51, 0)));
        Pembayaran.add(bingkaicoklat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 870, 570));

        bingkaicoklat2.setBorder(javax.swing.BorderFactory.createMatteBorder(12, 12, 12, 12, new java.awt.Color(153, 51, 0)));
        Pembayaran.add(bingkaicoklat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, 660, 560));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/raketK.png"))); // NOI18N
        Pembayaran.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 700));

        getContentPane().add(Pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1560, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Hitung_PembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hitung_PembayaranActionPerformed
                                                    
    // Logika untuk menghitung total pembayaran dan kembalian
    double harga;
    if(Jenis_Pelanggan.getSelectedItem().toString().equals("Member")) {
        harga = hargaMember;
    } else {
        harga = hargaRegular;
    }

    double uangDiberikan = Double.parseDouble(UangDiberikan.getText());

    if(uangDiberikan < harga) {
        Kembalian.setText("Uang tidak mencukupi");
    } else {
        double kembalian = uangDiberikan - harga;
        Kembalian.setText(String.format("%.0f", kembalian));
    }

    
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

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
                                               
    Rental rentalPage = new Rental();
    rentalPage.setVisible(true);
    this.dispose(); // Menutup halaman saat ini
    }//GEN-LAST:event_KembaliActionPerformed

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
    private go.Custom.ButtonCustom Kembali;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
