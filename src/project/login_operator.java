/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;


        
/**
 *
 * @author VINDANV
 */
public class login_operator extends javax.swing.JFrame {
//Connection con = koneksi.getConnection();
    Statement stt;
    ResultSet rss;
    public static Object[] id_op = new Object[3];
    Connection con = koneksi.getConnection();

    public login_operator() {
        initComponents();
        
    }
    public static Object[] getKasir(){
        return id_op;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        tombollogin = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        tomboldaftar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tombollogin.setText("Masuk");
        tombollogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolloginActionPerformed(evt);
            }
        });
        tombollogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tombolloginKeyPressed(evt);
            }
        });

        username.setOpaque(false);
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameKeyPressed(evt);
            }
        });

        tomboldaftar.setText("Daftar");
        tomboldaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomboldaftarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/login-symbol.jpg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/username.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/pwd.png"))); // NOI18N

        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("LOGIN, PLEASE!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(tomboldaftar)
                        .addGap(46, 46, 46)
                        .addComponent(tombollogin))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                .addComponent(password))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel4)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tomboldaftar)
                    .addComponent(tombollogin))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tombolloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolloginActionPerformed
       Proses_Login();
    }//GEN-LAST:event_tombolloginActionPerformed

    private void tomboldaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomboldaftarActionPerformed
        // TODO add your handling code here
        daftar n= new daftar();
        n.setVisible(true);
        dispose();
    }//GEN-LAST:event_tomboldaftarActionPerformed

    private void usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            password.requestFocus();
        }
    }//GEN-LAST:event_usernameKeyPressed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            tombollogin.requestFocus();
        }
        
    }//GEN-LAST:event_passwordKeyPressed

    private void tombolloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tombolloginKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER){
            Proses_Login();
        }
    }//GEN-LAST:event_tombolloginKeyPressed
//    public void getUsername(String unm, String username){
//        unm = username;
//    }
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
            java.util.logging.Logger.getLogger(login_operator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_operator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_operator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_operator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try{
            com.jtattoo.plaf.mcwin.McWinLookAndFeel.setTheme("Large-Font", "Java Swing", "");
                UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
//            com.jtattoo.plaf.bernstein.BernsteinLookAndFeel.setTheme("Large-Font", "Java Swing", "");
//            UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
//            com.jtattoo.plaf.aero.AeroLookAndFeel.setTheme("Large-Font", "Java Swing", "");
//            UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_operator().setVisible(true);
            }
        });
    }
    private void Proses_Login(){
         
        try{
            
            Statement statement = (Statement)koneksi.getConnection().createStatement();
            ResultSet result=statement.executeQuery
            ("select * from operator where username='"+username.getText()+"'" );
            
            if(result.next()){
                if(password.getText().equals(result.getString("password"))){
                    id_op[0] = result.getString("id_operator");
                    id_op[1] = result.getString("fullname");
                    int level =Integer.parseInt(result.getString("level"));
                    if(level==1){
                        new data_barang_layanan().setVisible(true);
                        dispose();
                    }else if(level==2){
                        awalan awal = new awalan();
                        awal.setVisible(true);
                        dispose();  
                    }
                    id_op[2] = result.getString("level");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Password Salah");
                    password.setText("");
                    password.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "User tidak ditemukan");
                username.setText("");
                password.setText("");
                username.requestFocus();
            }

        } catch (SQLException ex) {
            Logger.getLogger(login_operator.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Gagal Login!");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton tomboldaftar;
    private javax.swing.JButton tombollogin;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
