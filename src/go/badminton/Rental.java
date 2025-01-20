package go.badminton;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;



public class Rental extends javax.swing.JFrame {

    public Rental() {
        initComponents();
        setTitle("Halaman Utama Rental");
        setSize(1705, 999);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private JFrame frame;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Pelanggan_Biasa = new javax.swing.JCheckBox();
        Pelanggan_Member = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Harga = new go.Custom.TextFieldCustom();
        ID_Pelanggan = new go.Custom.TextFieldCustom();
        Nama_Pelanggan = new go.Custom.TextFieldCustom();
        Nomor_Hp = new go.Custom.TextFieldCustom();
        Alamat = new go.Custom.TextFieldCustom();
        Durasi_Sewa = new go.Custom.TextFieldCustom();
        jenis_lapangan = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Lapangan = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        harga = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        durasi_sewa1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Save = new go.Custom.ButtonCustom();
        Update = new go.Custom.ButtonCustom();
        Reset = new go.Custom.ButtonCustom();
        Clear = new go.Custom.ButtonCustom();
        Bayar = new go.Custom.ButtonCustom();
        Konfirmasi_Sewa = new go.Custom.ButtonCustom();
        Show_Detail = new go.Custom.ButtonCustom();
        Exit = new go.Custom.ButtonCustom();
        Delete = new go.Custom.ButtonCustom();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Data_Pemesanan = new javax.swing.JTable();
        BG_hitam = new javax.swing.JLabel();

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(12, 12, 12, 12, new java.awt.Color(51, 204, 255)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Sylfaen", 1, 50)); // NOI18N
        jLabel8.setText("Go Badminton");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 330, 70));

        jLabel9.setText("jLabel2");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, 180));

        jLabel12.setText("Sewa Lapangan Badminton");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 180, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                formMouseWheelMoved(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(12, 12, 12, 12, new java.awt.Color(51, 204, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Identitas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 210, -1));

        jLabel11.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Data Pemesan");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 310, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/raket.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1520, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 220));

        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(12, 12, 12, 12, new java.awt.Color(51, 204, 255)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Tipe Pelanggan");
        jLabel13.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 204, 255)));
        jLabel13.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabel13ComponentAdded(evt);
            }
        });
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 130, 38));

        Pelanggan_Biasa.setForeground(new java.awt.Color(255, 255, 255));
        Pelanggan_Biasa.setText("Pelanggan Reguler");
        jPanel5.add(Pelanggan_Biasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        Pelanggan_Member.setForeground(new java.awt.Color(255, 255, 255));
        Pelanggan_Member.setText("Pelanggan Member");
        Pelanggan_Member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pelanggan_MemberActionPerformed(evt);
            }
        });
        jPanel5.add(Pelanggan_Member, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setOpaque(true);
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 220));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 290, 240));

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(12, 12, 12, 12, new java.awt.Color(51, 204, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Harga.setRadius(20);
        Harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HargaActionPerformed(evt);
            }
        });
        jPanel2.add(Harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 170, 30));

        ID_Pelanggan.setRadius(20);
        jPanel2.add(ID_Pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 180, 30));

        Nama_Pelanggan.setRadius(20);
        jPanel2.add(Nama_Pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 180, 30));

        Nomor_Hp.setRadius(20);
        jPanel2.add(Nomor_Hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 180, 30));

        Alamat.setRadius(20);
        jPanel2.add(Alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 176, 180, 30));

        Durasi_Sewa.setRadius(20);
        jPanel2.add(Durasi_Sewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 170, 30));

        jenis_lapangan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jenis_lapangan.setForeground(new java.awt.Color(255, 255, 255));
        jenis_lapangan.setText("Pilih Lapangan   :");
        jPanel2.add(jenis_lapangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 130, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID Pelanggan        :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 150, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nama Pelanggan  :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 140, 40));

        Lapangan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Shuttle Zone", "Shuttle Heaven", "Shuttle Hell", " " }));
        Lapangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LapanganActionPerformed(evt);
            }
        });
        Lapangan.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                LapanganPropertyChange(evt);
            }
        });
        jPanel2.add(Lapangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 160, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("No HP                     :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 140, 20));

        harga.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        harga.setForeground(new java.awt.Color(255, 255, 255));
        harga.setText("Total harga         :");
        jPanel2.add(harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Alamat                    :");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        durasi_sewa1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        durasi_sewa1.setForeground(new java.awt.Color(255, 255, 255));
        durasi_sewa1.setText("Durasi Sewa       :");
        jPanel2.add(durasi_sewa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 770, 220));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 790, 240));

        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(12, 12, 12, 12, new java.awt.Color(51, 204, 255)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        Save.setText("Save");
        Save.setColor(new java.awt.Color(51, 204, 255));
        Save.setColorBorder(new java.awt.Color(0, 51, 255));
        Save.setColorClick(new java.awt.Color(0, 0, 153));
        Save.setColorOver(new java.awt.Color(51, 204, 255));
        Save.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Save.setRadius(20);
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel4.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 30));

        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/panah atas.png"))); // NOI18N
        Update.setText("Update");
        Update.setColor(new java.awt.Color(102, 153, 255));
        Update.setColorBorder(new java.awt.Color(51, 51, 255));
        Update.setColorClick(new java.awt.Color(0, 0, 255));
        Update.setColorOver(new java.awt.Color(102, 102, 255));
        Update.setRadius(20);
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel4.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 30));

        Reset.setForeground(new java.awt.Color(255, 255, 255));
        Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reset.png"))); // NOI18N
        Reset.setText("Reset");
        Reset.setColor(new java.awt.Color(255, 0, 0));
        Reset.setColorBorder(new java.awt.Color(204, 0, 0));
        Reset.setColorClick(new java.awt.Color(204, 0, 0));
        Reset.setColorOver(new java.awt.Color(255, 0, 0));
        Reset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Reset.setRadius(20);
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel4.add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, 30));

        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sapu.png"))); // NOI18N
        Clear.setText("Clear");
        Clear.setColor(new java.awt.Color(255, 178, 0));
        Clear.setColorClick(new java.awt.Color(204, 102, 0));
        Clear.setColorOver(new java.awt.Color(255, 178, 0));
        Clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Clear.setRadius(20);
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel4.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, 30));

        Bayar.setForeground(new java.awt.Color(255, 255, 255));
        Bayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uang.png"))); // NOI18N
        Bayar.setText("Bayar");
        Bayar.setColor(new java.awt.Color(0, 204, 0));
        Bayar.setColorBorder(new java.awt.Color(0, 102, 51));
        Bayar.setColorClick(new java.awt.Color(0, 51, 51));
        Bayar.setColorOver(new java.awt.Color(0, 204, 0));
        Bayar.setRadius(20);
        Bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BayarActionPerformed(evt);
            }
        });
        jPanel4.add(Bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, 30));

        Konfirmasi_Sewa.setForeground(new java.awt.Color(255, 255, 255));
        Konfirmasi_Sewa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/centang.png"))); // NOI18N
        Konfirmasi_Sewa.setText("Konfirmasi ");
        Konfirmasi_Sewa.setColor(new java.awt.Color(102, 255, 102));
        Konfirmasi_Sewa.setColorBorder(new java.awt.Color(0, 153, 0));
        Konfirmasi_Sewa.setColorClick(new java.awt.Color(0, 102, 0));
        Konfirmasi_Sewa.setColorOver(new java.awt.Color(102, 255, 102));
        Konfirmasi_Sewa.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Konfirmasi_Sewa.setRadius(20);
        Konfirmasi_Sewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Konfirmasi_SewaActionPerformed(evt);
            }
        });
        jPanel4.add(Konfirmasi_Sewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 140, 40));

        Show_Detail.setForeground(new java.awt.Color(255, 255, 255));
        Show_Detail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/detail.png"))); // NOI18N
        Show_Detail.setText("Show Detail");
        Show_Detail.setColor(new java.awt.Color(123, 211, 234));
        Show_Detail.setColorBorder(new java.awt.Color(0, 153, 255));
        Show_Detail.setColorClick(new java.awt.Color(51, 204, 255));
        Show_Detail.setColorOver(new java.awt.Color(123, 211, 234));
        Show_Detail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Show_Detail.setRadius(20);
        Show_Detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show_DetailActionPerformed(evt);
            }
        });
        jPanel4.add(Show_Detail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 140, 40));

        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        Exit.setText("Exit");
        Exit.setColor(new java.awt.Color(255, 0, 0));
        Exit.setColorBorder(new java.awt.Color(204, 0, 51));
        Exit.setColorClick(new java.awt.Color(204, 0, 0));
        Exit.setColorOver(new java.awt.Color(255, 0, 0));
        Exit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Exit.setRadius(20);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel4.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 140, 40));

        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hapus.png"))); // NOI18N
        Delete.setText("Delete");
        Delete.setColor(new java.awt.Color(255, 0, 0));
        Delete.setColorBorder(new java.awt.Color(255, 0, 0));
        Delete.setColorClick(new java.awt.Color(153, 0, 0));
        Delete.setColorOver(new java.awt.Color(255, 0, 0));
        Delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Delete.setRadius(20);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel4.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 140, 40));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setOpaque(true);
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 220));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setOpaque(true);
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 220));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 230, 300, 240));

        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(12, 12, 12, 12, new java.awt.Color(51, 204, 255)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Data_Pemesanan.setBackground(java.awt.SystemColor.controlShadow);
        Data_Pemesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "tipe Pelanggan", "ID*", "Nama Pelanggan", "Nomor Hp", "Alamat", "Durasi Sewa", "Lapangan", "Total Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Data_Pemesanan);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1520, 200));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 1540, 220));

        BG_hitam.setBackground(new java.awt.Color(0, 0, 0));
        BG_hitam.setOpaque(true);
        getContentPane().add(BG_hitam, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 2300, 1010));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel13ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel13ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13ComponentAdded

    private void LapanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LapanganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LapanganActionPerformed

    private void LapanganPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_LapanganPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_LapanganPropertyChange

    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseWheelMoved

    private void Pelanggan_MemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pelanggan_MemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pelanggan_MemberActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
                                            
    try (Connection conn = DatabaseConnection.getConnection()) {
        if (conn != null) {
            String sql = "INSERT INTO t_customer (id_customer, tipe_customer, nama_customer, no_tlp, alamat, tipe_lapangan, waktu_sewa, total_harga) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Mengambil data dari form input
            int idCustomer = Integer.parseInt(ID_Pelanggan.getText()); // Mengambil ID dari input
            String tipeCustomer = "";
            if (Pelanggan_Member.isSelected()) {
                tipeCustomer = "Member";
            } else if (Pelanggan_Biasa.isSelected()) {
                tipeCustomer = "Biasa";
            }
            String namaCustomer = Nama_Pelanggan.getText();
            String noTlp = Nomor_Hp.getText();
            String alamat = Alamat.getText();
            String tipeLapangan = Lapangan.getSelectedItem().toString();
            String waktuSewa = Durasi_Sewa.getText(); // Format waktu '08.00-09.00' atau '09.00-10.00'
            long totalHarga = Long.parseLong(Harga.getText());

            // Mengatur parameter untuk statement
            stmt.setInt(1, idCustomer);
            stmt.setString(2, tipeCustomer);
            stmt.setString(3, namaCustomer);
            stmt.setString(4, noTlp);
            stmt.setString(5, alamat);
            stmt.setString(6, tipeLapangan);
            stmt.setString(7, waktuSewa);
            stmt.setLong(8, totalHarga);

            // Menjalankan statement
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Koneksi ke database gagal!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_SaveActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
                                                 
        DefaultTableModel model = (DefaultTableModel) Data_Pemesanan.getModel();
        model.setRowCount(0);
        
        Pelanggan_Biasa.setSelected(false);
        Pelanggan_Member.setSelected(false);
                
        ID_Pelanggan.setText("");
        Nama_Pelanggan.setText("");
        Nomor_Hp.setText("");
        Alamat.setText("");
        Durasi_Sewa.setText("");
        Lapangan.setSelectedItem("");
        Harga.setText("");
        
    
    }//GEN-LAST:event_ResetActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
                                                 
        Pelanggan_Member.setSelected(false);
        Pelanggan_Biasa.setSelected(false);
        ID_Pelanggan.setText("");
        Nama_Pelanggan.setText("");
        Nomor_Hp.setText("");
        Alamat.setText("");
        Durasi_Sewa.setText("");
        Lapangan.setSelectedItem("");
        Harga.setText("");

    }//GEN-LAST:event_ClearActionPerformed

    private void Show_DetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show_DetailActionPerformed
                                                    
    DefaultTableModel model = (DefaultTableModel) Data_Pemesanan.getModel();
    model.setRowCount(0); // Membersihkan tabel sebelum menambah data baru

    String sql = "SELECT id_customer, tipe_customer, nama_customer, no_tlp, alamat, tipe_lapangan, waktu_sewa, total_harga FROM t_customer";

    try (Connection conn = DatabaseConnection.getConnection(); 
            PreparedStatement statement = conn.prepareStatement(sql); 
            ResultSet resultSet = statement.executeQuery()) {

        while (resultSet.next()) {
            int idCustomer = resultSet.getInt("id_customer");
            String tipeCustomer = resultSet.getString("tipe_customer");
            String namaCustomer = resultSet.getString("nama_customer");
            String noTlp = resultSet.getString("no_tlp");
            String alamat = resultSet.getString("alamat");
            String tipeLapangan = resultSet.getString("tipe_lapangan");
            String waktuSewa = resultSet.getString("waktu_sewa").toString();
            long totalHarga = resultSet.getLong("total_harga");

            model.addRow(new Object[]{idCustomer, tipeCustomer, namaCustomer, noTlp, alamat, tipeLapangan, waktuSewa, totalHarga});
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Gagal mengambil data dari database.");
    }
    }//GEN-LAST:event_Show_DetailActionPerformed

    private void BayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BayarActionPerformed
                                              
    pembayaran pembayaranPage = new pembayaran();
    pembayaranPage.setVisible(true);
    this.dispose(); // Menutup halaman saat ini jika diperlukan

    }//GEN-LAST:event_BayarActionPerformed

    private void Konfirmasi_SewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Konfirmasi_SewaActionPerformed

        JOptionPane.showMessageDialog(null, "Sewa Berhasil Di Komfrimasi", "", JOptionPane.OK_OPTION);

        DefaultTableModel model = (DefaultTableModel) Data_Pemesanan.getModel();
        model.addRow(new Object[]{Pelanggan_Member.isSelected(), Pelanggan_Biasa.isSelected(),
            ID_Pelanggan.getText(), Nama_Pelanggan.getText(),
            Nomor_Hp.getText(), Alamat.getText(), Harga.getText(), Lapangan.getSelectedItem(), Harga.getText(),toString(),});

    }//GEN-LAST:event_Konfirmasi_SewaActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
                                                 
       frame = new JFrame ("Exit");
       if (JOptionPane.showConfirmDialog(frame, "Confirm jika anda ingin keluar", "",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
       System.exit(0);
       }
    
    }//GEN-LAST:event_ExitActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
                                                  
        DefaultTableModel model = (DefaultTableModel) Data_Pemesanan.getModel();

        if (Data_Pemesanan.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Tidak ada data yang harus dihapus", "", JOptionPane.OK_OPTION);
        } else if (Data_Pemesanan.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Pilih baris untuk dihapus", "", JOptionPane.OK_OPTION);
        } else {
            model.removeRow(Data_Pemesanan.getSelectedRow());
        }
      
    }//GEN-LAST:event_DeleteActionPerformed

    private void HargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HargaActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
                                                  
       DefaultTableModel model = (DefaultTableModel) Data_Pemesanan.getModel();
       if (Data_Pemesanan.getRowCount() == 0) {
        JOptionPane.showMessageDialog(null, "Tidak ada data dalam sistem sewa", "", JOptionPane.WARNING_MESSAGE);
        } else if (Data_Pemesanan.getSelectedRow() == -1) {
        JOptionPane.showMessageDialog(null, "Silakan pilih baris untuk diperbarui", "", JOptionPane.WARNING_MESSAGE);
        } else {
         JOptionPane.showMessageDialog(null, "Sistem sewa berhasil diupdate", "", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_UpdateActionPerformed

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
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rental().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private go.Custom.TextFieldCustom Alamat;
    private javax.swing.JLabel BG_hitam;
    private go.Custom.ButtonCustom Bayar;
    private go.Custom.ButtonCustom Clear;
    private javax.swing.JTable Data_Pemesanan;
    private go.Custom.ButtonCustom Delete;
    private go.Custom.TextFieldCustom Durasi_Sewa;
    private go.Custom.ButtonCustom Exit;
    private go.Custom.TextFieldCustom Harga;
    private go.Custom.TextFieldCustom ID_Pelanggan;
    private go.Custom.ButtonCustom Konfirmasi_Sewa;
    private javax.swing.JComboBox<String> Lapangan;
    private go.Custom.TextFieldCustom Nama_Pelanggan;
    private go.Custom.TextFieldCustom Nomor_Hp;
    private javax.swing.JCheckBox Pelanggan_Biasa;
    private javax.swing.JCheckBox Pelanggan_Member;
    private go.Custom.ButtonCustom Reset;
    private go.Custom.ButtonCustom Save;
    private go.Custom.ButtonCustom Show_Detail;
    private go.Custom.ButtonCustom Update;
    private javax.swing.JLabel durasi_sewa1;
    private javax.swing.JLabel harga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jenis_lapangan;
    // End of variables declaration//GEN-END:variables
}
