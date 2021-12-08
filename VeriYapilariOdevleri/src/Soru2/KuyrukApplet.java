package Soru2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;

public class KuyrukApplet extends JApplet {

    public void init() {
        resize(1000, 900);
        setLayout(null);
    }

    Font f1 = new Font("Calibri", Font.BOLD, 18);
    Font f2 = new Font("Calibri", Font.BOLD, 20);
    Kuyruk kuyruk = new Kuyruk();
    Label lbl_Rear = new Label("<---------- Rear");
    Label lbl_Front = new Label("<-- Front");
    int x = 425, y = 880, sayi, lbl_LocationRear = 800, lbl_LocationFront = 800;
    boolean durum = true;

    public void start() {
        lbl_Front.setBackground(Color.gray);
        lbl_Front.setForeground(Color.white);
        lbl_Front.setFont(f1);
        lbl_Front.setLocation(x + 100, lbl_LocationFront);
        lbl_Front.setSize(100, 50);
        this.add(lbl_Front);

        lbl_Rear.setBackground(Color.gray);
        lbl_Rear.setForeground(Color.white);
        lbl_Rear.setFont(f1);
        lbl_Rear.setLocation(x + 250, lbl_LocationRear);
        lbl_Rear.setSize(200, 50);
        this.add(lbl_Rear);

        Label lbl_SayiGir = new Label("Sayı Girin: ");
        lbl_SayiGir.setLocation(330, 270);
        lbl_SayiGir.setFont(f1);
        lbl_SayiGir.setSize(100, 35);
        this.add(lbl_SayiGir);

        TextField txt_Sayi = new TextField(5);
        txt_Sayi.setFont(f1);
        txt_Sayi.setSize(100, 35);
        txt_Sayi.setLocation(450, 270);
        this.add(txt_Sayi);

        Button btn_Ekle = new Button("EKLE()");
        btn_Ekle.setFont(f1);
        btn_Ekle.setForeground(Color.white);
        btn_Ekle.setBackground(Color.gray);
        btn_Ekle.setSize(150, 150);
        btn_Ekle.setLocation(250, 50);
        btn_Ekle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (!kuyruk.kuyrukDoluMu() && (kuyruk.son + 1) != kuyruk.bas) {
                    sayi = Integer.parseInt(txt_Sayi.getText());
                    durum = true;
                    eleman e = new eleman(sayi);
                    kuyruk.kuyrukElemanEkle(e);
                    y = y - 50;
                    repaint();
                    lbl_Durum();
                    txt_Sayi.setText("");
                } else {
                    txt_Sayi.setText("Boyut aşımı");
                    btn_Ekle.setEnabled(false);
                }
            }
        });
        this.add(btn_Ekle);

        Button btn_Cikar = new Button("Çıkar()");
        btn_Cikar.setFont(f1);
        btn_Cikar.setForeground(Color.white);
        btn_Cikar.setBackground(Color.gray);
        btn_Cikar.setSize(150, 150);
        btn_Cikar.setLocation(400, 50);
        btn_Cikar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (!kuyruk.kuyrukBosMu()) {
                    durum = false;
                    btn_Ekle.setEnabled(true);
                    txt_Sayi.setText(String.valueOf(kuyruk.kuyrukElemanSil().icerik));
                    lbl_Durum();
                    repaint();
                }
            }
        });
        this.add(btn_Cikar);

        Button btn_Goster = new Button("Goster()");
        btn_Goster.setFont(f1);
        btn_Goster.setForeground(Color.white);
        btn_Goster.setBackground(Color.gray);
        btn_Goster.setSize(150, 150);
        btn_Goster.setLocation(550, 50);
        btn_Goster.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                txt_Sayi.setText(String.valueOf(kuyruk.eleman[kuyruk.bas].icerik));
            }
        });
        this.add(btn_Goster);
    }

    public void paint(Graphics g) {
        g.setFont(f2);
        g.setColor(Color.black);

        int counter = kuyruk.N - 1;
        for (int i = 350; i <= 800; i = i + 50) {
            g.drawRect(400, i, 80, 50);
            g.drawString(String.valueOf(counter), 370, i + 30);
            counter--;
        }

        if (durum) {
            g.setColor(Color.black);
            switch (kuyruk.son) {
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
                    if (kuyruk.kuyrukBosMu()) {
                        kuyruk.bas = 0;
                        lbl_LocationFront = 800;
                    }
                    break;
            }

        } else {
            g.setColor(Color.white);
            g.fillRect(x - 20, lbl_LocationFront + 60, 70, 35);
        }

        if (kuyruk.son == 10) {
            kuyruk.son = 1;
            y = 830;

            lbl_Rear.setBackground(Color.white);
            lbl_Rear.setForeground(Color.white);
            lbl_Rear.setSize(200, 50);
            lbl_Rear.setLocation(675, lbl_LocationRear);
            this.add(lbl_Rear);

            lbl_Rear.setBackground(Color.gray);
            lbl_Rear.setForeground(Color.white);
            lbl_Rear.setSize(200, 50);
            lbl_LocationRear = 760;
            lbl_Rear.setLocation(675, lbl_LocationRear);
            g.drawString(String.valueOf(sayi), x, y);
            repaint();
        }

        if (kuyruk.bas == 9) {
            kuyruk.bas = 0;
            lbl_Front.setBackground(Color.white);
            lbl_Front.setForeground(Color.white);
            lbl_Front.setSize(100, 50);
            lbl_Front.setLocation(x + 100, lbl_LocationFront);
            this.add(lbl_Front);

            lbl_LocationFront = 800;

            lbl_Front.setBackground(Color.gray);
            lbl_Front.setForeground(Color.white);
            lbl_Front.setSize(100, 50);
            lbl_LocationFront = 800;
            lbl_Front.setLocation(x + 100, lbl_LocationFront);
            g.setColor(Color.white);
        }
    }

    void lbl_Durum() {
        if (durum) {
            if (kuyruk.kuyrukDoluMu()) {
                lbl_LocationRear = y - 80;
            } else {
                lbl_LocationRear -= 50;
            }

            lbl_Rear.setBackground(Color.white);
            lbl_Rear.setForeground(Color.white);
            lbl_Rear.setFont(f1);
            lbl_Rear.setSize(200, 50);
            lbl_Rear.setLocation(675, lbl_LocationRear);
            this.add(lbl_Rear);

            lbl_Rear.setBackground(Color.gray);
            lbl_Rear.setForeground(Color.white);
            lbl_Rear.setFont(f1);
            lbl_Rear.setSize(200, 50);
            lbl_Rear.setLocation(675, lbl_LocationRear);
            this.add(lbl_Rear);

        } else {
            if (kuyruk.kuyrukBosMu()) {
                lbl_LocationFront = y - 80;
            } else {
                lbl_LocationFront -= 50;
            }

            lbl_Front.setBackground(Color.white);
            lbl_Front.setForeground(Color.white);
            lbl_Front.setFont(f1);
            lbl_Front.setSize(100, 50);
            lbl_Front.setLocation(525, lbl_LocationFront);
            this.add(lbl_Front);

            lbl_Front.setBackground(Color.gray);
            lbl_Front.setForeground(Color.white);
            lbl_Front.setFont(f1);
            lbl_Front.setSize(100, 50);
            lbl_Front.setLocation(525, lbl_LocationFront);
            this.add(lbl_Front);
        }
    }
}
