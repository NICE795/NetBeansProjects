/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package go.badminton;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FrameLogin extends javax.swing.JFrame {

    int xx, xy;
    public FrameLogin() {
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

        jPanel1 = new javax.swing.JPanel();
        panelCustom1 = new go.Custom.PanelCustom();
        password = new javax.swing.JLabel();
        silahkan_login = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        Password = new go.Custom.TextFieldCustom();
        Login = new go.Custom.ButtonCustom();
        Username = new go.Custom.TextFieldCustom();
        Keluar = new go.Custom.ButtonCustom();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCustom1.setBackground(new java.awt.Color(84, 58, 20));
        panelCustom1.setRoundBottomLeft(30);
        panelCustom1.setRoundBottomRight(30);
        panelCustom1.setRoundTopLeft(30);
        panelCustom1.setRoundTopRight(30);
        panelCustom1.setTransparency(0.5F);
        panelCustom1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password         :");
        panelCustom1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 150, 30));

        silahkan_login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        silahkan_login.setForeground(new java.awt.Color(255, 255, 255));
        silahkan_login.setText("LOGIN ADMIN");
        panelCustom1.add(silahkan_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 140, 50));

        username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("Username        :");
        panelCustom1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 170, 30));

        Password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Password.setRadius(20);
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        panelCustom1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 280, 40));

        Login.setBackground(new java.awt.Color(60, 85, 45));
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("LOGIN");
        Login.setColor(new java.awt.Color(60, 85, 45));
        Login.setColorBorder(new java.awt.Color(60, 85, 45));
        Login.setColorClick(new java.awt.Color(0, 51, 0));
        Login.setColorOver(new java.awt.Color(60, 85, 45));
        Login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Login.setRadius(30);
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        panelCustom1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 150, 50));

        Username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Username.setRadius(20);
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        panelCustom1.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 280, 40));

        Keluar.setForeground(new java.awt.Color(255, 255, 255));
        Keluar.setText("Keluar");
        Keluar.setColor(new java.awt.Color(255, 0, 0));
        Keluar.setColorBorder(new java.awt.Color(255, 0, 0));
        Keluar.setColorClick(new java.awt.Color(153, 0, 0));
        Keluar.setColorOver(new java.awt.Color(204, 0, 0));
        Keluar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Keluar.setRadius(30);
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        panelCustom1.add(Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 150, 50));

        jPanel1.add(panelCustom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 590, 410));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/raket.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
                                    
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    
    }//GEN-LAST:event_formMouseDragged

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
                                                
    if (Username.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Username harus diisi", "Warning", JOptionPane.WARNING_MESSAGE);
    } else {
        // TODO add your handling code here:
    }


    }//GEN-LAST:event_UsernameActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
                                       
    if (Password.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Password harus diisi", "Warning", JOptionPane.WARNING_MESSAGE);
    } else {
        String inputPassword = Password.getText().trim();
        String correctPassword = "yourCorrectPassword"; // Ganti dengan password yang benar

        if (!inputPassword.equals(correctPassword)) {
            JOptionPane.showMessageDialog(this, "Password salah", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // TODO add your handling code here jika password benar
        }
    }


    }//GEN-LAST:event_PasswordActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
                                    
    String username = Username.getText().trim();
    String password = new String(Password.getText()).trim();
    
    if (username.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Username harus diisi", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    if (password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Password harus diisi", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourDatabase", "username", "password");
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, username);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();
        
        if (rs.next()) {
            // Login berhasil, buka halaman Rental.java
            JOptionPane.showMessageDialog(this, "Login berhasil!");
            Rental rentalPage = new Rental();
            rentalPage.setVisible(true);
            this.dispose(); // Menutup halaman login saat ini
        } else {
            // Login gagal
            JOptionPane.showMessageDialog(this, "Username atau password salah", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menghubungi database", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_LoginActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
    MenuUtama menuUtama = new MenuUtama();
    menuUtama.setVisible(true);


    }//GEN-LAST:event_KeluarActionPerformed

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
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private go.Custom.ButtonCustom Keluar;
    private go.Custom.ButtonCustom Login;
    private go.Custom.TextFieldCustom Password;
    private go.Custom.TextFieldCustom Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private go.Custom.PanelCustom panelCustom1;
    private javax.swing.JLabel password;
    private javax.swing.JLabel silahkan_login;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
