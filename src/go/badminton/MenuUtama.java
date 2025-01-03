package go.badminton;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class MenuUtama extends javax.swing.JFrame {

    int xx, xy;
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

        jPanel1 = new javax.swing.JPanel();
        panelCustom2 = new go.Custom.PanelCustom();
        Masuk = new go.Custom.ButtonCustom();
        Keluar = new go.Custom.ButtonCustom();
        jLabel3 = new javax.swing.JLabel();
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
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCustom2.setRoundBottomLeft(50);
        panelCustom2.setRoundBottomRight(50);
        panelCustom2.setRoundTopLeft(50);
        panelCustom2.setRoundTopRight(50);
        panelCustom2.setTransparency(0.4F);
        panelCustom2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Masuk.setForeground(new java.awt.Color(255, 255, 255));
        Masuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Enter.png"))); // NOI18N
        Masuk.setText("Masuk");
        Masuk.setColor(new java.awt.Color(153, 255, 51));
        Masuk.setColorBorder(new java.awt.Color(51, 204, 0));
        Masuk.setColorClick(new java.awt.Color(0, 153, 0));
        Masuk.setColorOver(new java.awt.Color(0, 255, 0));
        Masuk.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Masuk.setRadius(20);
        Masuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasukActionPerformed(evt);
            }
        });
        panelCustom2.add(Masuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 160, 60));

        Keluar.setForeground(new java.awt.Color(255, 255, 255));
        Keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/keluar.png"))); // NOI18N
        Keluar.setText("Keluar");
        Keluar.setColor(new java.awt.Color(153, 255, 255));
        Keluar.setColorBorder(new java.awt.Color(51, 153, 255));
        Keluar.setColorClick(new java.awt.Color(0, 204, 204));
        Keluar.setColorOver(new java.awt.Color(153, 255, 255));
        Keluar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Keluar.setRadius(20);
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        panelCustom2.add(Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 160, 60));

        jPanel1.add(panelCustom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 600, 430));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 45)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GO BADMINTON");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 420, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/raket.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 940));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1560, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentResized

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
         xx = evt.getX();
         xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void MasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasukActionPerformed
    FrameLogin frameLogin = new FrameLogin();
    frameLogin.setVisible(true); 
    }//GEN-LAST:event_MasukActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
                                 
    JFrame frame = new JFrame("Exit");
    int response = JOptionPane.showConfirmDialog(frame, "Confirm jika anda ingin keluar", "Exit", JOptionPane.YES_NO_OPTION);
    
    if (response == JOptionPane.YES_OPTION) {
        System.exit(0);
    }
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
    private go.Custom.ButtonCustom Keluar;
    private go.Custom.ButtonCustom Masuk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private go.Custom.PanelCustom panelCustom2;
    // End of variables declaration//GEN-END:variables
}
