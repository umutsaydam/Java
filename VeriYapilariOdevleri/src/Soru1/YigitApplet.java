package Soru1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;

public class YigitApplet extends JApplet {

    public void init() {
        resize(1000, 900);
        setLayout(null);
    }
    yigit stack = new yigit();
    Font f1 = new Font("Arial", Font.BOLD, 18);
    Label lbl_Ust = new Label("<- TOP");

    /* 
    sayi değişkeni girilen değeri tutuyor.
    sinir değişkeni dizinin boyutunu tutuyor (aşmamak için).
    x ve y değişkenleri girilen sayıyı atanması gereken kutunun konumlarını tutuyor.
    i değişkeni <- TOP adındaki label'ın konumunu tutuyor.
     */
    int sayi, sinir = stack.eleman.length - 1, x = 425, y = 880, i = 800;

    /*
     eleman ekleken durum=true çıkartırken durum=false
     bu şarta göre kutudaki elemana sayı ekleniyor veya siliniyor
     */
    boolean durum = true;

    public void start() {
        lbl_Ust.setBackground(Color.gray);
        lbl_Ust.setForeground(Color.black);
        lbl_Ust.setVisible(true);
        lbl_Ust.setFont(f1);
        lbl_Ust.setSize(100, 25);
        lbl_Ust.setLocation(x + 75, 865);
        this.add(lbl_Ust);

        TextField txt_Sayi = new TextField(11);
        txt_Sayi.setFont(f1);
        txt_Sayi.setSize(80, 40);
        txt_Sayi.setLocation(450, 250);
        this.add(txt_Sayi);

        Label lbl_Sayi = new Label("Sayı Girin: ");
        lbl_Sayi.setFont(f1);
        lbl_Sayi.setBackground(Color.LIGHT_GRAY);
        lbl_Sayi.setSize(100, 50);
        lbl_Sayi.setLocation(340, 245);
        this.add(lbl_Sayi);

        Button btn_yigitEkle = new Button("Ekle ()");
        btn_yigitEkle.setLocation(250, 50);
        btn_yigitEkle.setBackground(Color.GRAY);
        btn_yigitEkle.setFont(f1);
        btn_yigitEkle.setSize(150, 150);

        btn_yigitEkle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (sinir >= 0) {
                    sayi = Integer.parseInt(txt_Sayi.getText());
                    Eleman eleman = new Eleman(sayi);
                    stack.yigitElemanEkle(eleman);
                    txt_Sayi.setText("");
                    durum = true;
                    repaint();
                    y = y - 50;
                    sinir--;
                    setLblUst(i);
                    i = i - 50;
                } else {
                    txt_Sayi.setText("Dizi boyutuna ulaşıldı");
                    txt_Sayi.setEnabled(false);
                    btn_yigitEkle.setEnabled(false);
                }
            }
        });
        this.add(btn_yigitEkle);

        Button btn_yigitCikar = new Button("Çıkar ()");
        btn_yigitCikar.setLocation(400, 50);
        btn_yigitCikar.setBackground(Color.GRAY);
        btn_yigitCikar.setFont(f1);
        btn_yigitCikar.setSize(150, 150);
        btn_yigitCikar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                btn_yigitEkle.setEnabled(true);
                txt_Sayi.setEnabled(true);

                if (!stack.yigitBosMu()) {
                    durum = false;
                    sinir++;

                    txt_Sayi.setText(String.valueOf(stack.yigitElemanCikar().icerik));
                    y = y + 50;
                    i = i + 50;
                    setLblUst(i);
                    repaint();
                }
            }
        });
        this.add(btn_yigitCikar);

        Button btn_yigitGoster = new Button("Goster ()");
        btn_yigitGoster.setLocation(550, 50);
        btn_yigitGoster.setBackground(Color.GRAY);
        btn_yigitGoster.setFont(f1);
        btn_yigitGoster.setSize(150, 150);

        btn_yigitGoster.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                txt_Sayi.setText(String.valueOf(stack.yigitPop().icerik));
            }
        });
        this.add(btn_yigitGoster);
    }

    public void paint(Graphics g) {
        // Kutuların çizimi
        g.setFont(f1);
        g.setColor(Color.black);

        int counter = stack.eleman.length - 1;
        for (int i = 350; i <= 800; i = i + 50) {
            g.drawRect(400, i, 80, 50);
            g.drawString(String.valueOf(counter), 370, i + 30);
            counter--;
        }
        /*  Eğer durum=false ise eleman yazdırmayıp en üstteki değeri siliyor.
durum true ise eleman ekleme anlamına geldiğinden switch yapısı çalışıp
üst değişkenin değerine göre gerekli kutuya elemanı yazdırıyor.*/
        if (!durum) {
            g.fillRect(x, y - 75, 50, 35);
            g.clearRect(x, y - 75, 50, 35);
        }

        if (durum) {
            switch (stack.ust) {
                case 0:
                    g.drawString(String.valueOf(sayi), x, y);
                    break;
                case 1:
                    g.drawString(String.valueOf(sayi), x, y);
                    break;
                case 2:
                    g.drawString(String.valueOf(sayi), x, y);
                    break;
                case 3:
                    g.drawString(String.valueOf(sayi), x, y);
                    break;
                case 4:
                    g.drawString(String.valueOf(sayi), x, y);
                    break;
                case 5:
                    g.drawString(String.valueOf(sayi), x, y);
                    break;
                case 6:
                    g.drawString(String.valueOf(sayi), x, y);
                    break;
                case 7:
                    g.drawString(String.valueOf(sayi), x, y);
                    break;
                case 8:
                    g.drawString(String.valueOf(sayi), x, y);
                    break;
                case 9:
                    g.drawString(String.valueOf(sayi), x, y);
                    break;

                default:
                    break;
            }
        }
    }

    void setLblUst(int i) {
        /*durum=true olup olmama durumana göre "<- TOP" adındaki label yukarı ya da aşağıya hareket ediyor. */
        if (durum) {
            lbl_Ust.setBackground(Color.white);
            lbl_Ust.setForeground(Color.white);
            lbl_Ust.setVisible(true);
            lbl_Ust.setFont(f1);
            lbl_Ust.setSize(100, 50);
            lbl_Ust.setLocation(x + 75, i);

            lbl_Ust.setBackground(Color.gray);
            lbl_Ust.setForeground(Color.black);
            lbl_Ust.setVisible(true);
            lbl_Ust.setFont(f1);
            lbl_Ust.setSize(100, 50);
            lbl_Ust.setLocation(x + 75, i);

        } else {
            lbl_Ust.setBackground(Color.white);
            lbl_Ust.setForeground(Color.white);
            lbl_Ust.setVisible(true);
            lbl_Ust.setFont(f1);
            lbl_Ust.setSize(100, 50);
            lbl_Ust.setLocation(x + 75, i + 50);

            lbl_Ust.setBackground(Color.gray);
            lbl_Ust.setForeground(Color.black);
            lbl_Ust.setVisible(true);
            lbl_Ust.setFont(f1);
            lbl_Ust.setSize(100, 50);
            lbl_Ust.setLocation(x + 75, i + 50);
            lbl_Ust.setText("<- TOP");
        }
        this.add(lbl_Ust);
    }
}
