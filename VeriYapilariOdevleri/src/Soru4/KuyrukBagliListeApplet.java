package Soru4;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;

public class KuyrukBagliListeApplet extends JApplet {

    public void init() {
        resize(1100, 900);
        setLayout(null);
    }
    Font f1 = new Font("Calibri", Font.BOLD, 18);
    Font f2 = new Font("Calibri", Font.BOLD, 20);
    Font f3 = new Font("Calibri", Font.BOLD, 17);
    KuyrukBagliListe kuyruk = new KuyrukBagliListe();
    Label lbl_Rear = new Label("Rear");
    Label lbl_Head = new Label("Head");
    // x,y ile sayıların yazılacak konumlarını tuttuk,
    int x = 1070, y = 680, lbl_HeadLocationX = 920, lbl_HeadLocationY = 785, lbl_RearLocationX = 830, lbl_RearLocationY = 682;
    int firstBoxesX = 830, secondBoxesX = 930, sayi, border = -1, counter = 0;
    // durum true ise eleman eklendi, false ise eleman çıkarıldı demektir.
    boolean durum;

    public void start() {
        lbl_Rear.setBackground(Color.white);
        lbl_Rear.setForeground(Color.black);
        lbl_Rear.setFont(f3);
        lbl_Rear.setSize(40, 30);
        lbl_Rear.setLocation(lbl_RearLocationX, lbl_RearLocationY);
        this.add(lbl_Rear);

        lbl_Head.setBackground(Color.white);
        lbl_Head.setForeground(Color.black);
        lbl_Head.setFont(f3);
        lbl_Head.setSize(40, 30);
        lbl_Head.setLocation(lbl_HeadLocationX, lbl_HeadLocationY);
        this.add(lbl_Head);

        Label lbl_SayiGir = new Label("Sayı Girin: ");
        lbl_SayiGir.setLocation(330, 270);
        lbl_SayiGir.setFont(f1);
        lbl_SayiGir.setSize(100, 35);
        this.add(lbl_SayiGir);

        TextField txt_Sayi = new TextField();
        txt_Sayi.setFont(f1);
        txt_Sayi.setSize(100, 35);
        txt_Sayi.setLocation(450, 270);
        this.add(txt_Sayi);

        Button btn_Ekle = new Button("Ekle()");
        btn_Ekle.setBackground(Color.gray);
        btn_Ekle.setForeground(Color.white);
        btn_Ekle.setFont(f1);
        btn_Ekle.setSize(150, 150);
        btn_Ekle.setLocation(250, 50);
        btn_Ekle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (border < 12) {
                    durum = true;
                    sayi = Integer.parseInt(txt_Sayi.getText());
                    Eleman e = new Eleman(sayi);
                    kuyruk.kuyrukElemanEkle(e);
                    border++;
                    if (border < 6) {
                        x -= 150;
                    } else {
                        x -= 140;
                    }
                    if (border > 5) {
                        secondBoxesX -= 130;
                    }
                    firstBoxesX -= 130;
                    lbl_Rear();
                    repaint();
                    txt_Sayi.setText("");
                }
            }
        });
        this.add(btn_Ekle);

        Button btn_Cikar = new Button("Çıkar()");
        btn_Cikar.setBackground(Color.gray);
        btn_Cikar.setForeground(Color.white);
        btn_Cikar.setFont(f1);
        btn_Cikar.setSize(150, 150);
        btn_Cikar.setLocation(400, 50);
        btn_Cikar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (!kuyruk.kuyrukBosMu()) {
                    durum = false;
                    txt_Sayi.setText(String.valueOf(kuyruk.kuyrukElemanCikar().icerik));
                    lbl_Head();
                    repaint();
                    counter++;
                } else {
                    txt_Sayi.setText("Kuyruk Boş");
                    x = 1070;
                    y = 680;
                    lbl_HeadLocationX = 920;
                    lbl_HeadLocationY = 785;
                    lbl_RearLocationX = 830;
                    lbl_RearLocationY = 682;
                }
            }
        });
        this.add(btn_Cikar);

        Button btn_Goster = new Button("Göster()");
        btn_Goster.setBackground(Color.gray);
        btn_Goster.setForeground(Color.white);
        btn_Goster.setFont(f1);
        btn_Goster.setSize(150, 150);
        btn_Goster.setLocation(550, 50);
        btn_Goster.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (!kuyruk.kuyrukBosMu()) {
                    txt_Sayi.setText(String.valueOf(kuyruk.kuyrukGoster().icerik));
                }else{
                    txt_Sayi.setText("KuyrukBoş");
                }
            }
        });
        this.add(btn_Goster);

    }

    public void paint(Graphics g) {
        int control = 0;
        if (border >= 6 && border < 13 && durum == true) {
            g.clearRect(60, 650, 40, 40);
            for (int i = 900; i > secondBoxesX; i -= 140) {
                if (control + 7 > counter || counter <= 6) {
                    g.setFont(f2);
                    g.drawRect(i + 80, 500, 60, 50);
                    if (border > 6) {
                        g.drawString("→", i + 50, 530);
                    }
                }
                control++;
            }
            if ((counter < 6)) {
                //          x1   y1    x2   y2
                g.drawLine(1040, 524, 1070, 524);
                g.drawLine(1070, 524, 1070, 640);
                g.drawLine(100, 640, 1070, 640);
                g.drawLine(100, 640, 100, 673);
                g.drawLine(100, 674, 130, 674);
            }
        }
        control = 0;
        if (border >= 0 && border < 6 && durum == true) {
            for (int j = 850; j > firstBoxesX; j -= 150) {
                if (control >= counter) {
                    g.drawRect(j + 50, 650, 60, 50);
                    g.setFont(f2);
                    g.drawString("→", j + 25, 680);
                }
                control++;
            }
        }

        g.setColor(Color.black);

        if (border < 6) {
            g.drawLine(lbl_RearLocationX - 21, lbl_RearLocationY - 9, lbl_RearLocationX + 45, lbl_RearLocationY - 9);
        } else {
            g.drawLine(lbl_RearLocationX - 10, lbl_RearLocationY - 9, lbl_RearLocationX + 40, lbl_RearLocationY - 9);
        }

        if (durum == false) {
            g.clearRect(lbl_HeadLocationX + 15, lbl_HeadLocationY - 30, lbl_HeadLocationX + 5, lbl_HeadLocationY - 18);
        }
        if (durum == false && counter > 5) {
            g.clearRect(lbl_HeadLocationX - 950, lbl_HeadLocationY + 25, lbl_HeadLocationX + 5, lbl_HeadLocationY + 25);
            g.clearRect(lbl_HeadLocationX + 43, lbl_HeadLocationY - 92, lbl_HeadLocationX + 40, lbl_HeadLocationY - 30);
        }
        g.drawLine(lbl_HeadLocationX + 15, lbl_HeadLocationY - 30, lbl_HeadLocationX + 5, lbl_HeadLocationY - 18);
        g.drawLine(lbl_HeadLocationX + 15, lbl_HeadLocationY - 30, lbl_HeadLocationX + 25, lbl_HeadLocationY - 18);
        g.drawLine(lbl_HeadLocationX + 15, lbl_HeadLocationY, lbl_HeadLocationX + 15, lbl_HeadLocationY - 25);

        xAyarla();

        if (durum == true) {
            switch (border) {
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
                case 10:
                    g.drawString(String.valueOf(sayi), x, y);
                    break;
                case 11:
                    g.drawString(String.valueOf(sayi), x, y);
                    break;
                case 12:
                    g.drawString(String.valueOf(sayi), x, y);
                    break;
                default:
                    break;
            }

            if (border == 6) {
                g.setColor(Color.white);
                g.fillRect(245, 750, 60, 60);
            }

        }
        if (durum == false && border > 0) {
            if (counter <= 5 && counter >= 0) {
                g.setColor(Color.white);
                g.fillRect(lbl_HeadLocationX + 42, lbl_HeadLocationY - 135, 150, 60);
            } else if (counter == 6) {
                g.setColor(Color.white);
                g.fillRect(140, 650, 100, 60);
            } else {
                g.setColor(Color.white);
                g.fillRect(lbl_HeadLocationX + 42, lbl_HeadLocationY - 100, 150, 70);
            }
        }

    }

    void lbl_Rear() {
        if (border <= 5) {
            if (border > 0) {
                lbl_RearLocationX -= 150;
            }
        } else if (border == 6) {
            lbl_RearLocationX = 910;
            lbl_RearLocationY = 532;
        } else {
            lbl_RearLocationX -= 140;
        }

        lbl_Rear.setBackground(Color.white);
        lbl_Rear.setForeground(Color.white);
        lbl_Rear.setFont(f3);
        lbl_Rear.setSize(40, 30);
        lbl_Rear.setLocation(lbl_RearLocationX, lbl_RearLocationY);
        this.add(lbl_Rear);

        lbl_Rear.setBackground(Color.white);
        lbl_Rear.setForeground(Color.black);
        lbl_Rear.setFont(f3);
        lbl_Rear.setSize(40, 30);
        lbl_Rear.setLocation(lbl_RearLocationX, lbl_RearLocationY);
        this.add(lbl_Rear);
    }

    void lbl_Head() {
        if (counter < 5) {
            lbl_HeadLocationX -= 150;
        } else if (counter == 4) {
            lbl_HeadLocationX = 170;
            lbl_HeadLocationY = 785;
        } else if (counter == 5) {
            lbl_HeadLocationX = 1000;
            lbl_HeadLocationY = 600;
        } else {
            lbl_HeadLocationX -= 140;
        }

        lbl_Head.setBackground(Color.white);
        lbl_Head.setForeground(Color.white);
        lbl_Head.setFont(f3);
        lbl_Head.setSize(40, 30);
        lbl_Head.setLocation(lbl_HeadLocationX, lbl_HeadLocationY);
        this.add(lbl_Head);

        lbl_Head.setBackground(Color.white);
        lbl_Head.setForeground(Color.black);
        lbl_Head.setFont(f3);
        lbl_Head.setSize(40, 30);
        lbl_Head.setLocation(lbl_HeadLocationX, lbl_HeadLocationY);
        this.add(lbl_Head);

    }

    void xAyarla() {
        if (border == 6) {
            x = 1000;
            y = 530;
        } else if (border == 5) {
            x = 170;
            y = 680;
        }
    }
}
