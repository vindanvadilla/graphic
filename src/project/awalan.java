/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;



/**
 *
 * @author VINDANV
 */
public class awalan extends javax.swing.JFrame {
    /**
     * Creates new form awalan
     */
    public awalan() {
        initComponents();
        setNamaKasir();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        nama_kasir = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Panel_Navigation1 = new javax.swing.JPanel();
        menu_transaksi = new javax.swing.JLabel();
        menu_home = new javax.swing.JLabel();
        menu_isi_data = new javax.swing.JLabel();
        menu_konsumen = new javax.swing.JLabel();
        menu_tentang = new javax.swing.JLabel();
        menu_keluar = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        nama_kasir.setEditable(false);
        nama_kasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_kasirActionPerformed(evt);
            }
        });

        jLabel1.setText("Kasir :");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/BG.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/laundry-day.jpg"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Mistral", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Welcome !");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/exit.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        Panel_Navigation1.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Navigation1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel_Navigation1.setPreferredSize(new java.awt.Dimension(722, 99));

        menu_transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/icon-transaksi.png"))); // NOI18N
        menu_transaksi.setText("Transaksi");
        menu_transaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_transaksi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu_transaksi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menu_transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_transaksiMouseClicked(evt);
            }
        });

        menu_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/icon-home.png"))); // NOI18N
        menu_home.setText("Home");
        menu_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu_home.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menu_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_homeMouseClicked(evt);
            }
        });

        menu_isi_data.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/icon-form.png"))); // NOI18N
        menu_isi_data.setText("Form");
        menu_isi_data.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_isi_data.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu_isi_data.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menu_isi_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_isi_dataMouseClicked(evt);
            }
        });

        menu_konsumen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/icon-konsumen.png"))); // NOI18N
        menu_konsumen.setText("Konsumen");
        menu_konsumen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_konsumen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu_konsumen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menu_konsumen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_konsumenMouseClicked(evt);
            }
        });

        menu_tentang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/icon-about.png"))); // NOI18N
        menu_tentang.setText("Tentang");
        menu_tentang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_tentang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu_tentang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menu_tentang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_tentangMouseClicked(evt);
            }
        });

        menu_keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/icon-logout.png"))); // NOI18N
        menu_keluar.setText("Keluar");
        menu_keluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_keluar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu_keluar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menu_keluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_keluarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel_Navigation1Layout = new javax.swing.GroupLayout(Panel_Navigation1);
        Panel_Navigation1.setLayout(Panel_Navigation1Layout);
        Panel_Navigation1Layout.setHorizontalGroup(
            Panel_Navigation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Navigation1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(menu_home)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menu_isi_data)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menu_transaksi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menu_konsumen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menu_tentang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menu_keluar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_Navigation1Layout.setVerticalGroup(
            Panel_Navigation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Navigation1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(Panel_Navigation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_home)
                    .addComponent(menu_isi_data)
                    .addComponent(menu_transaksi)
                    .addComponent(menu_konsumen)
                    .addComponent(menu_tentang)
                    .addComponent(menu_keluar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nama_kasir, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Panel_Navigation1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Panel_Navigation1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nama_kasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(jLabel4))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        new login_operator().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void nama_kasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_kasirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_kasirActionPerformed

    private void menu_transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_transaksiMouseClicked
        new transaksi().setVisible(true);
        dispose();
    }//GEN-LAST:event_menu_transaksiMouseClicked

    private void menu_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_homeMouseClicked
        
    }//GEN-LAST:event_menu_homeMouseClicked

    private void menu_isi_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_isi_dataMouseClicked
        new isi_data().setVisible(true);
        dispose();
    }//GEN-LAST:event_menu_isi_dataMouseClicked

    private void menu_konsumenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_konsumenMouseClicked
        new konsumen().setVisible(true);dispose();
    }//GEN-LAST:event_menu_konsumenMouseClicked

    private void menu_tentangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_tentangMouseClicked
        new about().setVisible(true);
    }//GEN-LAST:event_menu_tentangMouseClicked

    private void menu_keluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_keluarMouseClicked
        // TODO add your handling code here:
        int pilih = JOptionPane.showConfirmDialog(this, "Yakin ingin Keluar Aplikasi?","Keluar",JOptionPane.YES_NO_OPTION);
        if(pilih == JOptionPane.YES_OPTION){
            new login_operator().setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_menu_keluarMouseClicked

    
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
            java.util.logging.Logger.getLogger(awalan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(awalan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(awalan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(awalan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new awalan().setVisible(true);
            }
        });
    }
    
    public void setNamaKasir(){
        Object[] op = login_operator.getKasir();
        nama_kasir.setText(""+op[1]);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Navigation1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel menu_home;
    private javax.swing.JLabel menu_isi_data;
    private javax.swing.JLabel menu_keluar;
    private javax.swing.JLabel menu_konsumen;
    private javax.swing.JLabel menu_tentang;
    private javax.swing.JLabel menu_transaksi;
    private javax.swing.JTextField nama_kasir;
    // End of variables declaration//GEN-END:variables
}