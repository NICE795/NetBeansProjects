package go.badminton;

import javax.swing.*;
import java.awt.*;

public class FrameLogin extends JFrame {

    private boolean isPasswordVisible = false; // Untuk melacak status visibilitas password
    private JTextField jTextField1;
    private JPasswordField jPasswordField1;
    private JButton jButtonEye;

    public FrameLogin() {
        initComponents();
        setLocationRelativeTo(null); // Pusatkan frame di layar
    }

    private void initComponents() {
        JPanel jPanel1 = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabelLogo = new JLabel();
        JLabel jLabelBadmintonLogo = new JLabel(); // Label untuk logo bulutangkis
        JLabel jLabelOrLoginWith = new JLabel(); // Label untuk "atau login dengan"
        JButton jButton1 = new JButton();
        JButton jButtonGoogle = new JButton();
        JButton jButtonFacebook = new JButton();
        JButton jButtonForgotPassword = new JButton(); // Tombol Forgot Password

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Panel pengaturan
        jPanel1.setBackground(new Color(255, 255, 0)); // Background kuning terang
        jPanel1.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Logo bulutangkis di atas
        jLabelBadmintonLogo.setIcon(new ImageIcon("C:\\Users\\bayuw\\OneDrive\\Documents\\NetBeansProjects\\go badminton\\src\\img\\Googlelogo.png")); // Ganti path sesuai file Anda
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        jPanel1.add(jLabelBadmintonLogo, gbc);

        // Teks "LOGIN" di bawah logo
        jLabelLogo.setText("LOGIN");
        jLabelLogo.setForeground(Color.DARK_GRAY); // Ganti warna teks menjadi gelap
        jLabelLogo.setFont(new Font("Arial", Font.BOLD, 24)); // Atur font dan ukuran teks
        gbc.gridy = 1;
        jPanel1.add(jLabelLogo, gbc);

        // Username label
        jLabel1.setForeground(new Color(0, 0, 0)); // Hitam
        jLabel1.setText("Username");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        jPanel1.add(jLabel1, gbc);

        // Username field
        jTextField1 = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        jPanel1.add(jTextField1, gbc);

        // Password label
        jLabel2.setForeground(new Color(0, 0, 0)); // Hitam
        jLabel2.setText("Password");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        jPanel1.add(jLabel2, gbc);

        // Password field dengan ikon mata
        JPanel passwordPanel = new JPanel(new BorderLayout());
        jPasswordField1 = new JPasswordField(15);
        jPasswordField1.setEchoChar('*');

        // Tombol mata
        jButtonEye = new JButton(new ImageIcon("C:\\Users\\bayuw\\OneDrive\\Documents\\NetBeansProjects\\go badminton\\src\\img\\Eyelogoblack.png")); // Ganti path sesuai file Anda
        jButtonEye.setPreferredSize(new Dimension(35, 25));
        jButtonEye.setBorderPainted(false);
        jButtonEye.setContentAreaFilled(false);
        jButtonEye.setFocusPainted(false);
        jButtonEye.addActionListener(e -> togglePasswordVisibility());

        passwordPanel.add(jPasswordField1, BorderLayout.CENTER);
        passwordPanel.add(jButtonEye, BorderLayout.EAST);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        jPanel1.add(passwordPanel, gbc);

        // Tombol Forgot Password
        jButtonForgotPassword.setText("Forgot Password?");
        jButtonForgotPassword.setForeground(Color.BLACK);
        jButtonForgotPassword.setBorderPainted(false);
        jButtonForgotPassword.setContentAreaFilled(false);
        jButtonForgotPassword.setHorizontalAlignment(SwingConstants.RIGHT);
        jButtonForgotPassword.addActionListener(evt -> forgotPassword());
        gbc.gridx = 1;
        gbc.gridy = 4; // Letakkan di bawah password field
        gbc.anchor = GridBagConstraints.SOUTHEAST; // Posisi kanan bawah
        jPanel1.add(jButtonForgotPassword, gbc);

        // Login button
        jButton1.setText("Login");
        jButton1.addActionListener(evt -> validateLogin());
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        jPanel1.add(jButton1, gbc);

        // Label "atau login dengan"
        jLabelOrLoginWith.setText("atau login dengan");
        jLabelOrLoginWith.setForeground(Color.DARK_GRAY); // Ganti warna teks menjadi gelap
        jLabelOrLoginWith.setFont(new Font("Arial", Font.PLAIN, 16)); // Atur font dan ukuran teks
        gbc.gridy = 6;
        jPanel1.add(jLabelOrLoginWith, gbc);

        // Panel untuk menampung tombol Google dan Facebook
        JPanel socialPanel = new JPanel();
        socialPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbcSocial = new GridBagConstraints();
        gbcSocial.insets = new Insets(5, 5, 5, 5);

        // Google button hanya dengan ikon
        jButtonGoogle.setIcon(new ImageIcon("C:\\Users\\bayuw\\OneDrive\\Documents\\NetBeansProjects\\go badminton\\src\\img\\Googlelogo.png")); // Ganti dengan path ke ikon Google
        jButtonGoogle.setBorderPainted(false);
        jButtonGoogle.setContentAreaFilled(true);  // Isi area konten tombol
        jButtonGoogle.setOpaque(true); // Pastikan tombol tidak transparan
        jButtonGoogle.setBackground(Color.YELLOW); // Set background warna kuning
        jButtonGoogle.setFocusPainted(false);
        jButtonGoogle.setPreferredSize(new Dimension(50, 50));
        jButtonGoogle.addActionListener(evt -> JOptionPane.showMessageDialog(this, "Login dengan Google"));
        gbcSocial.gridx = 0;
        gbcSocial.gridy = 0;
        socialPanel.add(jButtonGoogle, gbcSocial);

        // Facebook button hanya dengan ikon
        jButtonFacebook.setIcon(new ImageIcon("C:\\Users\\bayuw\\OneDrive\\Documents\\NetBeansProjects\\go badminton\\src\\img\\Facebooklogo.png")); // Ganti dengan path ke ikon Facebook
        jButtonFacebook.setBorderPainted(false);
        jButtonFacebook.setContentAreaFilled(true);  // Isi area konten tombol
        jButtonFacebook.setOpaque(true); // Pastikan tombol tidak transparan
        jButtonFacebook.setBackground(Color.YELLOW); // Set background warna kuning
        jButtonFacebook.setFocusPainted(false);
        jButtonFacebook.setPreferredSize(new Dimension(50, 50));
        jButtonFacebook.addActionListener(evt -> JOptionPane.showMessageDialog(this, "Login dengan Facebook"));
        gbcSocial.gridx = 1;
        gbcSocial.gridy = 0;
        socialPanel.add(jButtonFacebook, gbcSocial);

        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        jPanel1.add(socialPanel, gbc);

        // Tambahkan panel ke frame
        getContentPane().add(jPanel1);
        pack();
    }

    private void togglePasswordVisibility() {
        if (isPasswordVisible) {
            jPasswordField1.setEchoChar('*');
            jButtonEye.setIcon(new ImageIcon("C:\\Users\\bayuw\\OneDrive\\Documents\\NetBeansProjects\\go badminton\\src\\img\\Eyelogoblack.png")); // Ganti path sesuai file Anda
            isPasswordVisible = false;
        } else {
            jPasswordField1.setEchoChar((char) 0);
            jButtonEye.setIcon(new ImageIcon("C:\\Users\\bayuw\\OneDrive\\Documents\\NetBeansProjects\\go badminton\\src\\img\\Eyelogowhite.png")); // Ganti path sesuai file Anda
            isPasswordVisible = true;
        }
    }

    private void validateLogin() {
        String username = jTextField1.getText();
        String password = new String(jPasswordField1.getPassword());

        if ("admin".equals(username) && "admin".equals(password)) {
            JOptionPane.showMessageDialog(this, "Login berhasil");
        } else {
            JOptionPane.showMessageDialog(this, "Nama Pengguna atau Kata Sandi Tidak Valid");
        }
    }

    private void forgotPassword() {
        String email = JOptionPane.showInputDialog(this, "Masukkan email Anda:", "Forgot Password", JOptionPane.INFORMATION_MESSAGE);
        if (email != null && !email.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tautan reset password telah dikirim ke email Anda.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Email tidak boleh kosong.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new FrameLogin().setVisible(true));
    }
}