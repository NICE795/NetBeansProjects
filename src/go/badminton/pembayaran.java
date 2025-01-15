package go.badminton;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.NumberFormat;
import java.math.BigDecimal;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;


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
        pegawai = new javax.swing.JLabel();
        id_pelanggan = new javax.swing.JLabel();
        pilih_pembayaran = new javax.swing.JLabel();
        tanggal_dan_waktu_pembayaran1 = new javax.swing.JLabel();
        jumlah_uang = new javax.swing.JLabel();
        nama_lapangan = new javax.swing.JLabel();
        nama_pelanggan1 = new javax.swing.JLabel();
        uang_kembalian = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_Detail = new javax.swing.JTable();
        Jenis_Pelanggan = new javax.swing.JComboBox<>();
        Pegawai = new go.Custom.TextFieldCustom();
        Show_Detail = new go.Custom.ButtonCustom();
        Hitung_Pembayaran = new go.Custom.ButtonCustom();
        Save = new go.Custom.ButtonCustom();
        Konfirmasi_Pembayaran = new go.Custom.ButtonCustom();
        Kembali = new go.Custom.ButtonCustom();
        Hapus = new go.Custom.ButtonCustom();
        Nama_Pelanggan = new go.Custom.TextFieldCustom();
        Jumlah_Dibayarkan = new go.Custom.TextFieldCustom();
        Total_Transaksi = new go.Custom.TextFieldCustom();
        Kembalian = new go.Custom.TextFieldCustom();
        ID_Transaksi = new go.Custom.TextFieldCustom();
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
        Pembayaran.add(total_pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, -1));

        pegawai.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pegawai.setForeground(new java.awt.Color(255, 255, 255));
        pegawai.setText("Nama Pegawai                  : ");
        Pembayaran.add(pegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 190, -1));

        id_pelanggan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        id_pelanggan.setForeground(new java.awt.Color(255, 255, 255));
        id_pelanggan.setText("ID Pelanggan                   :");
        Pembayaran.add(id_pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        pilih_pembayaran.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pilih_pembayaran.setForeground(new java.awt.Color(255, 255, 255));
        pilih_pembayaran.setText("Pilih pembayaran            : ");
        Pembayaran.add(pilih_pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        tanggal_dan_waktu_pembayaran1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tanggal_dan_waktu_pembayaran1.setForeground(new java.awt.Color(255, 255, 255));
        tanggal_dan_waktu_pembayaran1.setText("Tanggal Bayar                    :");
        Pembayaran.add(tanggal_dan_waktu_pembayaran1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        jumlah_uang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jumlah_uang.setForeground(new java.awt.Color(255, 255, 255));
        jumlah_uang.setText("Total Pembayaran             :");
        Pembayaran.add(jumlah_uang, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, -1, -1));

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
        Pembayaran.add(uang_kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 190, 30));

        Tabel_Detail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "pegawai", "Pembayaran", "ID", "Nama Pelanggan", "Jenis Pelanggan ", "Lapangan", "Tanggal", "Total Pembayaran", "Uang Diberikan", "Kembalian"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabel_Detail.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Tabel_DetailAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(Tabel_Detail);

        Pembayaran.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 1510, 220));

        Jenis_Pelanggan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Member", "Reguler", " " }));
        Jenis_Pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jenis_PelangganActionPerformed(evt);
            }
        });
        Pembayaran.add(Jenis_Pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, 80, 20));

        Pegawai.setRadius(20);
        Pembayaran.add(Pegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 210, 40));

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
        Pembayaran.add(Show_Detail, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 360, 150, 40));

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
        Pembayaran.add(Hitung_Pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 310, 150, 40));

        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        Save.setText("Save");
        Save.setColor(new java.awt.Color(51, 153, 255));
        Save.setColorBorder(new java.awt.Color(0, 102, 255));
        Save.setColorClick(new java.awt.Color(51, 51, 255));
        Save.setColorOver(new java.awt.Color(51, 51, 255));
        Save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Save.setRadius(20);
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        Pembayaran.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 260, 100, -1));

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
        Pembayaran.add(Konfirmasi_Pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 410, 300, 40));

        Kembali.setForeground(new java.awt.Color(255, 255, 255));
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
        Pembayaran.add(Kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 310, 140, 40));

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
        Pembayaran.add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 360, 140, 40));

        Nama_Pelanggan.setRadius(20);
        Nama_Pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nama_PelangganActionPerformed(evt);
            }
        });
        Pembayaran.add(Nama_Pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 210, 40));

        Jumlah_Dibayarkan.setRadius(20);
        Jumlah_Dibayarkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jumlah_DibayarkanActionPerformed(evt);
            }
        });
        Pembayaran.add(Jumlah_Dibayarkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 210, 40));

        Total_Transaksi.setRadius(20);
        Total_Transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Total_TransaksiActionPerformed(evt);
            }
        });
        Pembayaran.add(Total_Transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 210, 40));

        Kembalian.setRadius(20);
        Kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembalianActionPerformed(evt);
            }
        });
        Pembayaran.add(Kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, 210, 40));

        ID_Transaksi.setRadius(20);
        Pembayaran.add(ID_Transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 210, 40));

        Tanggal.setRadius(20);
        Pembayaran.add(Tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 210, 40));

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
        panelCustom1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 20));

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

        Pembayaran.add(panelCustom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 160, 320, 210));

        bingkaicoklat1.setBorder(javax.swing.BorderFactory.createMatteBorder(12, 12, 12, 12, new java.awt.Color(153, 51, 0)));
        Pembayaran.add(bingkaicoklat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1530, 570));

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

    double uangDiberikan = Double.parseDouble(Jumlah_Dibayarkan.getText());

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
    model.setRowCount(0); // Membersihkan tabel sebelum menambah data baru

    String sql = "SELECT pegawai, pilih_transaksi, nama_customer, tipe_customer, tanggal, total_transaksi, jumlah_dibayarkan, kembalian, lapangan, id_transaksi FROM t_transaksi";

    try (Connection conn = DatabaseConnection.getConnection(); 
            PreparedStatement statement = conn.prepareStatement(sql); 
            ResultSet resultSet = statement.executeQuery()) {

        while (resultSet.next()) {
            String pegawai = resultSet.getString("pegawai");
            String pembayaran = resultSet.getString("pilih_transaksi");
            String jenisLapangan = resultSet.getString("lapangan");
            String namaPelanggan = resultSet.getString("nama_customer");
            String jenisPelanggan = resultSet.getString("tipe_customer");
            String idtransaksi = resultSet.getString("id_transaksi");
            String tanggal = resultSet.getString("tanggal");
            String totalTransaksi = resultSet.getString("total_transaksi");
            String jumlahDibayarkan = resultSet.getString("jumlah_dibayarkan");
            String kembalian = resultSet.getString("kembalian");
            
            

            model.addRow(new Object[]{pegawai, pembayaran, idtransaksi, namaPelanggan, jenisPelanggan, jenisLapangan, tanggal, totalTransaksi, jumlahDibayarkan, kembalian});
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Gagal mengambil data dari database.");
    }                                      
    }//GEN-LAST:event_Show_DetailActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        
    DefaultTableModel model = (DefaultTableModel) Tabel_Detail.getModel();

    // Mendapatkan baris yang dipilih
    int selectedRow = Tabel_Detail.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Pilih baris yang akan dihapus!");
        return;
    }

    // Mendapatkan ID transaksi dari baris yang dipilih
    String idTransaksi = model.getValueAt(selectedRow, 2).toString();

    // Konfirmasi penghapusan
    int confirm = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) {
        return;
    }

    // Perintah SQL untuk menghapus data berdasarkan ID transaksi
    String sqlDelete = "DELETE FROM t_transaksi WHERE id_transaksi = ?";

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement statement = conn.prepareStatement(sqlDelete)) {
        statement.setString(1, idTransaksi);

        // Eksekusi perintah SQL
        int rowsAffected = statement.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus.");
            model.removeRow(selectedRow); // Hapus baris dari tabel
        } else {
            JOptionPane.showMessageDialog(null, "Gagal menghapus data.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menghapus data dari database.");
    }
    }//GEN-LAST:event_HapusActionPerformed

    private void Total_TransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Total_TransaksiActionPerformed

    }//GEN-LAST:event_Total_TransaksiActionPerformed

    private void Jumlah_DibayarkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jumlah_DibayarkanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jumlah_DibayarkanActionPerformed

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

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        
    String pegawai = Pegawai.getText();
    String pembayaran = (String) Pilih_Pembayaran.getSelectedItem();
    String lapangan = (String) Jenis_Lapangan.getSelectedItem();
    String namaPelanggan = Nama_Pelanggan.getText();
    String jenisPelanggan = (String) Jenis_Pelanggan.getSelectedItem();
    String idTransaksi = ID_Transaksi.getText();
    String tanggalInput = Tanggal.getText();
    String totalTransaksi = Total_Transaksi.getText();
    String jumlahDibayarkan = Jumlah_Dibayarkan.getText();
    String kembalian = Kembalian.getText();
    

    if (pegawai.isEmpty() || pembayaran == null || namaPelanggan.isEmpty() || jenisPelanggan == null || tanggalInput.isEmpty() || totalTransaksi.isEmpty() || jumlahDibayarkan.isEmpty() || idTransaksi.isEmpty() || kembalian.isEmpty() || lapangan == null) {
        JOptionPane.showMessageDialog(null, "Semua field harus diisi.");
        return;
    }

    // Memastikan format tanggal benar
    String formattedTanggal = null;
    try {
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = inputFormat.parse(tanggalInput);
        formattedTanggal = new SimpleDateFormat("yyyy-MM-dd").format(date);
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(null, "Format tanggal tidak valid.");
        return;
    }

    // Memastikan panjang data tidak melebihi batas kolom database
    if (pembayaran.length() > 20) {
        pembayaran = pembayaran.substring(0, 20);
    }

    String sql = "INSERT INTO t_transaksi (id_transaksi, pegawai, pilih_transaksi, nama_customer, tipe_customer, tanggal, total_transaksi, jumlah_dibayarkan, kembalian, lapangan) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement statement = conn.prepareStatement(sql)) {
        
        statement.setString(2, pegawai);
        statement.setString(3, pembayaran);
        statement.setString(10, lapangan);
        statement.setString(4, namaPelanggan);
        statement.setString(5, jenisPelanggan);
        statement.setString(1, idTransaksi); // Mengambil ID dari input
        statement.setString(6, formattedTanggal);
        statement.setString(7, totalTransaksi);
        statement.setString(8, jumlahDibayarkan);
        statement.setString(9, kembalian);
        

        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan!");
        } else {
            JOptionPane.showMessageDialog(null, "Gagal menyimpan data.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Gagal menyimpan data: " + e.getMessage());
    }
    }//GEN-LAST:event_SaveActionPerformed

    private void Tabel_DetailAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Tabel_DetailAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_Tabel_DetailAncestorAdded

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
    private go.Custom.TextFieldCustom ID_Transaksi;
    private javax.swing.JComboBox<String> Jenis_Lapangan;
    private javax.swing.JComboBox<String> Jenis_Pelanggan;
    private go.Custom.TextFieldCustom Jumlah_Dibayarkan;
    private go.Custom.ButtonCustom Kembali;
    private go.Custom.TextFieldCustom Kembalian;
    private go.Custom.ButtonCustom Konfirmasi_Pembayaran;
    private go.Custom.TextFieldCustom Nama_Pelanggan;
    private go.Custom.TextFieldCustom Pegawai;
    private javax.swing.JPanel Pembayaran;
    private javax.swing.JComboBox<String> Pilih_Pembayaran;
    private go.Custom.ButtonCustom Save;
    private go.Custom.ButtonCustom Show_Detail;
    private javax.swing.JTable Tabel_Detail;
    private go.Custom.TextFieldCustom Tanggal;
    private go.Custom.TextFieldCustom Total_Transaksi;
    private javax.swing.JLabel bingkaicoklat1;
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
    private javax.swing.JLabel pegawai;
    private javax.swing.JLabel pilih_pembayaran;
    private javax.swing.JLabel tanggal_dan_waktu_pembayaran1;
    private javax.swing.JLabel total_pembayaran;
    private javax.swing.JLabel uang_kembalian;
    // End of variables declaration//GEN-END:variables
}
