package heapguı;

public class HeapGui extends javax.swing.JFrame {

    public HeapGui() {
        initComponents();
        btn_DigerListeGec.setEnabled(false);
        btn_ListEkle.setEnabled(false);
        btn_butunListeyiBirlestir.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_Sayi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_Ekle = new javax.swing.JButton();
        btn_Sil = new javax.swing.JButton();
        lbl_Sonuc = new javax.swing.JLabel();
        lbl_Kapasite = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Sonuc = new javax.swing.JTextArea();
        btn_MinMax = new javax.swing.JButton();
        btn_MinMi = new javax.swing.JButton();
        btn_ListEkle = new javax.swing.JButton();
        txt_Liste = new javax.swing.JTextField();
        btn_ListeOlustur = new javax.swing.JButton();
        btn_DigerListeGec = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_butunListeyiBirlestir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(77, 77, 77));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Sayı:");

        txt_Sayi.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txt_Sayi.setFocusCycleRoot(true);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("Min Heap eklemek/silmek istediğiniz sayıyı yazınız.");

        btn_Ekle.setBackground(new java.awt.Color(203, 146, 255));
        btn_Ekle.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn_Ekle.setForeground(new java.awt.Color(255, 255, 255));
        btn_Ekle.setText("Ekleme");
        btn_Ekle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EkleActionPerformed(evt);
            }
        });

        btn_Sil.setBackground(new java.awt.Color(255, 122, 122));
        btn_Sil.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn_Sil.setForeground(new java.awt.Color(255, 255, 255));
        btn_Sil.setText("Silme");
        btn_Sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SilActionPerformed(evt);
            }
        });

        lbl_Sonuc.setBackground(new java.awt.Color(65, 165, 29));
        lbl_Sonuc.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbl_Sonuc.setText("Durum:");

        lbl_Kapasite.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbl_Kapasite.setText("Eklenebilir alan: 0/7");

        txt_Sonuc.setColumns(20);
        txt_Sonuc.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        txt_Sonuc.setRows(5);
        jScrollPane1.setViewportView(txt_Sonuc);

        btn_MinMax.setBackground(new java.awt.Color(187, 137, 93));
        btn_MinMax.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn_MinMax.setForeground(new java.awt.Color(255, 255, 255));
        btn_MinMax.setText("Min => Max");
        btn_MinMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MinMaxActionPerformed(evt);
            }
        });

        btn_MinMi.setBackground(new java.awt.Color(106, 99, 138));
        btn_MinMi.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btn_MinMi.setForeground(new java.awt.Color(255, 255, 255));
        btn_MinMi.setText("Heap Minimum Mu");
        btn_MinMi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MinMiActionPerformed(evt);
            }
        });

        btn_ListEkle.setBackground(new java.awt.Color(220, 182, 103));
        btn_ListEkle.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn_ListEkle.setText("Listeye Ekle");
        btn_ListEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListEkleActionPerformed(evt);
            }
        });

        txt_Liste.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        btn_ListeOlustur.setBackground(new java.awt.Color(132, 255, 146));
        btn_ListeOlustur.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn_ListeOlustur.setText("Liste Oluştur");
        btn_ListeOlustur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListeOlusturActionPerformed(evt);
            }
        });

        btn_DigerListeGec.setBackground(new java.awt.Color(255, 176, 77));
        btn_DigerListeGec.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn_DigerListeGec.setForeground(new java.awt.Color(255, 255, 255));
        btn_DigerListeGec.setText("Diğer Listeye Geç");
        btn_DigerListeGec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DigerListeGecActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(107, 107, 107));
        jLabel3.setText("1. Listeye eklenecek");

        btn_butunListeyiBirlestir.setBackground(new java.awt.Color(215, 191, 191));
        btn_butunListeyiBirlestir.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btn_butunListeyiBirlestir.setText("Bütün Listeyi Birleştir");
        btn_butunListeyiBirlestir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_butunListeyiBirlestirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(txt_Sayi, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(lbl_Kapasite, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Ekle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Sil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_MinMax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_MinMi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txt_Liste, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btn_butunListeyiBirlestir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(btn_ListEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_ListeOlustur, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_DigerListeGec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lbl_Sonuc, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_Ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Liste, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Sil, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_MinMax, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(btn_MinMi, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_Sayi)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lbl_Kapasite)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)))
                        .addGap(433, 433, 433))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btn_ListeOlustur, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ListEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_DigerListeGec, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_butunListeyiBirlestir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Sonuc, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    heap hp = new heap(7);
    heap hp2;
    int i = 0, j = 0, k = 0, sayac = 0;
    int listeBoyutu = -1;
    liste[] list;
    public int sayi;
    private void btn_EkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EkleActionPerformed
        try {
            if (hp.tane < hp.N) {
                sayi = Integer.parseInt(txt_Sayi.getText());
                hp.heapMinEkle(sayi);
                btn_Sil.setEnabled(true);
                lbl_Kapasite.setText("Eklenebilir alan:" + hp.tane + "/7");
                txt_Sayi.setText("");
                goster(hp);
            } else {
                btn_Ekle.setEnabled(false);
            }
        } catch (Exception e) {
            txt_Sonuc.setText("Lütfen mantıklı bir şekilde sayı girin.");
        }
    }//GEN-LAST:event_btn_EkleActionPerformed

    private void btn_SilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SilActionPerformed
        try {
            if (hp.tane >= 0) {
                txt_Sonuc.setText(String.valueOf(hp.heapAsgariDondur(0)) + "\t");
                lbl_Kapasite.setText("Eklenebilir alan:" + hp.tane + "/7");
                btn_Ekle.setEnabled(true);
                goster(hp);
            } else {
                txt_Sonuc.setText("Dizi Boş!");
            }
        } catch (Exception e) {
            txt_Sonuc.setText("Heap Boş !");
            btn_Sil.setEnabled(false);
        }
    }//GEN-LAST:event_btn_SilActionPerformed

    private void btn_MinMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MinMaxActionPerformed
        hp = hp.convertFromMinToMax(hp);
        goster(hp);
    }//GEN-LAST:event_btn_MinMaxActionPerformed

    private void btn_MinMiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MinMiActionPerformed
        boolean heapTuru = hp.heapMinMi(hp);
        if (heapTuru == true) {
            txt_Sonuc.setText("Heap minimumdur.");
        } else {
            txt_Sonuc.setText("Heap minimum değildir.");
        }
    }//GEN-LAST:event_btn_MinMiActionPerformed

    private void btn_ListEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListEkleActionPerformed
        try {
            list[k].siraliEkle(new eleman(Integer.parseInt(txt_Liste.getText())));
            sayac++;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_ListEkleActionPerformed

    private void btn_DigerListeGecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DigerListeGecActionPerformed
        if (k <= hp.N) {
            k++;
            jLabel3.setText((k + 1) + ". Listeye Eklenecek");
        }
    }//GEN-LAST:event_btn_DigerListeGecActionPerformed

    private void btn_ListeOlusturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListeOlusturActionPerformed
        try {
            listeBoyutu = Integer.parseInt(txt_Liste.getText());
            hp2 = new heap(7);
            list = new liste[listeBoyutu];
            btn_DigerListeGec.setEnabled(true);
            btn_ListEkle.setEnabled(true);
            btn_butunListeyiBirlestir.setEnabled(true);
            btn_ListeOlustur.setEnabled(false);
            txt_Liste.setText("");
            for (int l = 0; l < listeBoyutu; l++) {
                list[l] = new liste();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_ListeOlusturActionPerformed

    private void btn_butunListeyiBirlestirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_butunListeyiBirlestirActionPerformed
        hp2 = hp2.listeleriBirlestir(list, sayac, listeBoyutu, 0);
        goster(hp2);
    }//GEN-LAST:event_btn_butunListeyiBirlestirActionPerformed

    void goster(heap h) {
        String s = "";
        for (int i = 0; i < h.tane; i++) {
            for (int j = 0; j < h.tane - i; j++) {
                s += "    ";
            }
            if (i == 0) {
                s += String.valueOf("          " + h.dizi[i]);
            } else {
                s += " " + String.valueOf(h.dizi[i]);
            }
            if (i == 0 || i == 2 || i == 6) {
                s += "\n";
            }
            s += "     ";
        }
        txt_Sonuc.setText(s);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HeapGui().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_DigerListeGec;
    private javax.swing.JButton btn_Ekle;
    private javax.swing.JButton btn_ListEkle;
    private javax.swing.JButton btn_ListeOlustur;
    private javax.swing.JButton btn_MinMax;
    private javax.swing.JButton btn_MinMi;
    private javax.swing.JButton btn_Sil;
    private javax.swing.JButton btn_butunListeyiBirlestir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Kapasite;
    private javax.swing.JLabel lbl_Sonuc;
    private javax.swing.JTextField txt_Liste;
    private javax.swing.JTextField txt_Sayi;
    private javax.swing.JTextArea txt_Sonuc;
    // End of variables declaration//GEN-END:variables
}
