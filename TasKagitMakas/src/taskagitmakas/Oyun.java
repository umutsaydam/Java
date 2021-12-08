/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskagitmakas;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Umut
 */
public class Oyun extends javax.swing.JFrame {

    int OyuncuSkor = 0, PcSkor = 0, secim = 0;

    public void pcSec(String Oyuncu_sec) {
        Random r = new Random();
        secim = r.nextInt(3);
        String Pc_sec = "";
        if (secim == 0) {
            Pc_sec = "Makas";
        } else if (secim == 1) {
            Pc_sec = "Taş";
        } else {
            Pc_sec = "Kağıt";
        }
        lbl_PcSec.setText(Pc_sec);
        if (Pc_sec != "") {
            if (Pc_sec == Oyuncu_sec) {
                lbl_OyunSecimSirasi.setText("Bu El Berabere Geçti!");
            } else {
                if (Pc_sec == "Taş") {
                    if (Oyuncu_sec == "Kağıt") {
                        OyuncuSkor++;
                        lbl_OyuncuSkor.setText(String.valueOf(OyuncuSkor));
                        lbl_OyunSecimSirasi.setText("Oyuncu Kazandı!");
                    } else {
                        PcSkor++;
                        lbl_PcSonuc.setText(String.valueOf(PcSkor));
                        lbl_OyunSecimSirasi.setText("Bilgisayar Kazandı!");

                    }
                } else if (Pc_sec == "Kağıt") {
                    if (Oyuncu_sec == "Taş") {
                        PcSkor++;
                        lbl_PcSonuc.setText(String.valueOf(PcSkor));
                        lbl_OyunSecimSirasi.setText("Bilgisayar Kazandı!");
                    } else {
                        OyuncuSkor++;
                        lbl_OyuncuSkor.setText(String.valueOf(OyuncuSkor));
                        lbl_OyunSecimSirasi.setText("Oyuncu Kazandı!");
                    }
                } else if (Pc_sec == "Makas") {
                    if (Oyuncu_sec == "Taş") {
                        OyuncuSkor++;
                        lbl_OyuncuSkor.setText(String.valueOf(OyuncuSkor));
                        lbl_OyunSecimSirasi.setText("Oyuncu Kazandı!");
                    } else {
                        PcSkor++;
                        lbl_PcSonuc.setText(String.valueOf(PcSkor));
                        lbl_OyunSecimSirasi.setText("Bilgisayar Kazandı!");
                    }
                }
            }
        }
    }

    /**
     * Creates new form Oyun
     */
    public Oyun() {
        initComponents();
        lbl_OyuncuSkor.setText("0");
        lbl_PcSonuc.setText("0");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Kagit = new javax.swing.JButton();
        btn_Makas = new javax.swing.JButton();
        btn_Tas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_OyuncuSkor = new javax.swing.JLabel();
        lbl_PcSonuc = new javax.swing.JLabel();
        lbl_OyunSecimSirasi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_PcSec = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Kagit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taskagitmakas/Img/kagit_320x314.jpg"))); // NOI18N
        btn_Kagit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KagitActionPerformed(evt);
            }
        });

        btn_Makas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taskagitmakas/Img/makas_320x207.jpg"))); // NOI18N
        btn_Makas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MakasActionPerformed(evt);
            }
        });

        btn_Tas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taskagitmakas/Img/tas_320x213.jpg"))); // NOI18N
        btn_Tas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 42, 42));
        jLabel1.setText("Bilgisayar :");

        jLabel3.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 42, 42));
        jLabel3.setText("Oyuncu :");

        lbl_OyuncuSkor.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        lbl_OyuncuSkor.setForeground(new java.awt.Color(255, 42, 42));
        lbl_OyuncuSkor.setText("0");

        lbl_PcSonuc.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        lbl_PcSonuc.setForeground(new java.awt.Color(255, 42, 42));
        lbl_PcSonuc.setText("0");

        lbl_OyunSecimSirasi.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_OyunSecimSirasi.setText("Oyuncu Seçiyor");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(177, 102, 197));
        jLabel2.setText("Bilgisayarın Seçtiği :");

        lbl_PcSec.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_PcSec.setForeground(new java.awt.Color(212, 81, 81));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_OyuncuSkor)
                .addGap(373, 373, 373))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btn_Tas, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(btn_Kagit, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_PcSonuc)
                        .addGap(122, 122, 122)))
                .addComponent(btn_Makas, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_PcSec, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_OyunSecimSirasi, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_OyuncuSkor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Tas, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_Kagit, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Makas, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_PcSonuc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_PcSec, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(lbl_OyunSecimSirasi, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_KagitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KagitActionPerformed

        String Oyuncu_secim = "";
        lbl_OyunSecimSirasi.setText("Oyuncu Kağıdı Seçti");
        Oyuncu_secim = "Kağıt";
        pcSec(Oyuncu_secim);

    }//GEN-LAST:event_btn_KagitActionPerformed

    private void btn_TasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TasActionPerformed
        String Oyuncu_secim = "";
        lbl_OyunSecimSirasi.setText("Oyuncu Taşı Seçti");
        Oyuncu_secim = "Taş";
        pcSec(Oyuncu_secim);
    }//GEN-LAST:event_btn_TasActionPerformed

    private void btn_MakasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MakasActionPerformed
        String Oyuncu_secim = "";
        lbl_OyunSecimSirasi.setText("Oyuncu Makası Seçti");
        Oyuncu_secim = "Makas";
        pcSec(Oyuncu_secim);
    }//GEN-LAST:event_btn_MakasActionPerformed

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
            java.util.logging.Logger.getLogger(Oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Oyun().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Kagit;
    private javax.swing.JButton btn_Makas;
    private javax.swing.JButton btn_Tas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_OyunSecimSirasi;
    private javax.swing.JLabel lbl_OyuncuSkor;
    private javax.swing.JLabel lbl_PcSec;
    private javax.swing.JLabel lbl_PcSonuc;
    // End of variables declaration//GEN-END:variables
}
