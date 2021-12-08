package Soru3;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JLabel;

public class BagliListeYigitApplet extends JApplet {

    public void init() {
        resize(1000, 900);
        setLayout(null);
    }
    Font f1 = new Font("Calibri", Font.BOLD, 18);
    Font f2 = new Font("Calibri", Font.BOLD, 20);
    Font f3 = new Font("Calibri", Font.BOLD, 17);
    BagliListeYigit bagliYigit = new BagliListeYigit();
    Label lbl_Top = new Label("TOP");
    /* x ve y sayının yazılması gereken koordinatları tutuyor
    border ise ekranda taşma yapmaması için oluşturulmuş bir sınır*/
    int x = 750, y = 680, lbl_TopLocationX = 743, lbl_TopLocationY = 780, sayi, border = -1;
    // firstBoxesX,secondBoxesX sırasıyla alt ve üst kutuları oluşturuyor
    int firstBoxesX = 680, secondBoxesX = 700;
    int counter = 1;
    boolean durum;

    public void start() {
        lbl_Top.setBackground(Color.white);
        lbl_Top.setForeground(Color.black);
        lbl_Top.setFont(f3);
        lbl_Top.setSize(35, 30);
        lbl_Top.setLocation(lbl_TopLocationX, lbl_TopLocationY);
        this.add(lbl_Top);

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
                    bagliYigit.yigitElemanEkle(e);
                    border++;
                    x -= 83;
                    if (border > 5) {
                        secondBoxesX -= 83;
                    }
                    firstBoxesX -= 83;
                    txt_Sayi.setText("");
                    labelTop();
                    repaint();
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
                if (!bagliYigit.yigitBosMu()) {
                    durum = false;
                    txt_Sayi.setText(String.valueOf(bagliYigit.yigitElemanSil().icerik));
                    border--;
                    x += 83;
                    if (border > 5) {
                        secondBoxesX += 83;
                    }
                    firstBoxesX += 83;
                    labelTop();
                    repaint();
                } else {
                    txt_Sayi.setText("Liste Boş");
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
                if (!bagliYigit.yigitBosMu()) {
                    txt_Sayi.setText(String.valueOf(bagliYigit.yigitGoster().icerik));
                } else {
                    txt_Sayi.setText("Null");
                }
            }
        });
        this.add(btn_Goster);

    }

    public void paint(Graphics g) {
        if (border >= 6 && border < 13 && durum == true) {

            for (int i = 700; i > secondBoxesX; i -= 83) {
                g.setFont(f2);
                g.drawRect(i, 500, 60, 50);
                if (border > 6) {
                    g.drawString("→", i + 63, 530);
                }
            }
            //          x1   y1    x2   y2
            g.drawLine(765, 524, 793, 524);
            g.drawLine(793, 524, 793, 640);
            g.drawLine(200, 640, 793, 640);
            g.drawLine(200, 640, 200, 673);
            g.drawLine(200, 673, 215, 673);

        }

        if (border >= 0 && border < 6 && durum == true) {
            for (int j = 650; j > firstBoxesX; j -= 83) {
                g.drawRect(j, 650, 60, 50);
                g.setFont(f2);
                g.drawString("→", j - 20, 680);
            }
        }

        if (durum == false && border >= -1) {
            g.setColor(Color.white);
            g.fillRect(lbl_TopLocationX - 83, lbl_TopLocationY - 30, 40, 40);
        }

        g.setColor(Color.black);
        g.drawLine(lbl_TopLocationX + 15, lbl_TopLocationY - 30, lbl_TopLocationX + 5, lbl_TopLocationY - 18);
        g.drawLine(lbl_TopLocationX + 15, lbl_TopLocationY - 30, lbl_TopLocationX + 25, lbl_TopLocationY - 18);
        g.drawLine(lbl_TopLocationX + 15, lbl_TopLocationY, lbl_TopLocationX + 15, lbl_TopLocationY - 25);

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
        } else if (durum == false) {
            if (border <= 5 && border >= 0) {
                g.setColor(Color.white);
                g.fillRect(lbl_TopLocationX - 115, lbl_TopLocationY - 130, 101, 60);
                if (border == 5) {
                    g.setColor(Color.white);
                    g.fillRect(700, 500, 101, 100);

                    secondBoxesX += 83;
                    g.drawLine(765, 524, 793, 524);
                    g.drawLine(793, 524, 793, 640);
                    g.clearRect(200, 640, 593, 3);
                    g.drawLine(200, 640, 793, 640);
                    g.drawLine(200, 640, 200, 673);
                    g.drawLine(200, 673, 215, 673);
                }
            } else if (border > 5 && border < 13) {
                g.setColor(Color.white);
                g.fillRect(lbl_TopLocationX - 115, lbl_TopLocationY - 100, 101, 60);
            }

            if (border == -1) {
                g.setColor(Color.white);
                g.fillRect(lbl_TopLocationX - 115, lbl_TopLocationY - 130, 101, 60);
            }
        }

        if (border <= 5) {
            g.setColor(Color.white);
            g.fillRect(lbl_TopLocationX + 83, lbl_TopLocationY - 32, 40, 40);
        } else if (border == 6) {
            g.setColor(Color.white);
            g.fillRect(250, 740, 40, 40);
        } else if (border > 5) {
            g.setColor(Color.white);
            g.fillRect(lbl_TopLocationX + 83, lbl_TopLocationY - 32, 40, 40);
        }
    }

    void labelTop() {
        // ekleme ya da çıkarma durumuna göre konum ayarı yapılmaktadır.
        if (durum == true) {
            if (border <= 5) {
                lbl_TopLocationX -= 83;
            } else if (border == 6) {
                lbl_TopLocationX = 710;
                lbl_TopLocationY = 600;
            } else {
                lbl_TopLocationX -= 83;
            }
        } else {
            if (border < 5) {
                lbl_TopLocationX += 83;
            } else if (border == 5) {
                lbl_TopLocationX = 245;
                lbl_TopLocationY = 780;
            } else {
                lbl_TopLocationX += 83;
            }
        }

        lbl_Top.setBackground(Color.white);
        lbl_Top.setForeground(Color.white);
        lbl_Top.setFont(f3);
        lbl_Top.setSize(35, 30);
        lbl_Top.setLocation(lbl_TopLocationX, lbl_TopLocationY);
        this.add(lbl_Top);

        lbl_Top.setBackground(Color.white);
        lbl_Top.setForeground(Color.black);
        lbl_Top.setFont(f3);
        lbl_Top.setSize(35, 30);
        lbl_Top.setLocation(lbl_TopLocationX, lbl_TopLocationY);
        this.add(lbl_Top);
    }

    void xAyarla() {
        // ekleme ve çıkarma durumuna göre sayıları üst kutuya ya da alt kutuya yazıyor.
        if (border == 6) {
            x = 713;
            y = 530;
        } else if (border == 5) {
            x = 250;
            y = 680;
        }
    }
}
