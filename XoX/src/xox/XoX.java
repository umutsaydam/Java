package xox;

import java.util.Scanner;

public class XoX {

    public static String alanNumarasi[][] = new String[3][3], sira = "X", oyuncu = "1.Oyuncu";

    public static void main(String[] args) {
        XoX a = new XoX();
        int sayac = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                alanNumarasi[i][j] = String.valueOf(sayac++);
            }
        }

        XoX.secimYap();

    }

    public XoX() {
    }

    public static void secimYap() {
        boolean durum = true;
        oyunAlani();
        while (durum) {
            Scanner klavye = new Scanner(System.in);
            System.out.println("Sıra:" + oyuncu);
            int secim = klavye.nextInt();

            if (secim <= 9 || secim >= 1) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (alanNumarasi[i][j].equals(String.valueOf(secim))) {
                            alanNumarasi[i][j] = sira;
                        }
                    }
                }
                oyunAlani();
                durumKontrol();
                oyuncuDegisikligi();
            } else {
                System.out.println("Lütfen belirlenmiş alanları seçiniz.");
            }

        }
    }

    public static void oyunAlani() {
        System.out.println("\t\t\t\t******************** X-O-X OYUNU ********************");
        System.out.println();
        System.out.println("\t\t\t\t\t\t     1.OYUNCU : X");
        System.out.println("\t\t\t\t\t\t     2.OYUNCU : O");
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println("\t\t\t\t\t\t    =============");
            System.out.print("\t\t\t\t\t\t    | ");
            for (int j = 0; j < 3; j++) {
                System.out.print(alanNumarasi[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("\t\t\t\t\t\t    =============");
        System.out.println();
        System.out.println("\t\t\t\t******************** X-O-X OYUNU ********************");
    }

    public static void oyuncuDegisikligi() {
        if (oyuncu.equals("1.Oyuncu")) {
            oyuncu = "2.Oyuncu";
            sira = "O";
        } else {
            oyuncu = "1.Oyuncu";
            sira = "X";
        }
    }

    public static void durumKontrol() {
        // Yatay İlk Satır
        if (alanNumarasi[0][0] == alanNumarasi[0][1] && alanNumarasi[0][0] == alanNumarasi[0][2] && alanNumarasi[0][1] == alanNumarasi[0][2]) {
            System.out.println("Oyunu: " + oyuncu + " Kazandı!");
            System.exit(0);
        }
        //Çapraz İlk Satır
        if (alanNumarasi[0][0] == alanNumarasi[1][1] && alanNumarasi[0][0] == alanNumarasi[2][2] && alanNumarasi[1][1] == alanNumarasi[2][2]) {
            System.out.println("Oyunu: " + oyuncu + " Kazandı!");
            System.exit(0);
        }
        // İkinci Yatay Satır
        if (alanNumarasi[1][0] == alanNumarasi[1][1] && alanNumarasi[1][0] == alanNumarasi[1][2] && alanNumarasi[1][1] == alanNumarasi[1][2]) {
            System.out.println("Oyunu: " + oyuncu + " Kazandı!");
            System.exit(0);
        }
        // Üçüncü Yatay Satır
        if (alanNumarasi[2][0] == alanNumarasi[2][1] && alanNumarasi[2][0] == alanNumarasi[2][2] && alanNumarasi[2][1] == alanNumarasi[2][2]) {
            System.out.println("Oyunu: " + oyuncu + " Kazandı!");
            System.exit(0);
        }
        //Çapraz üçüncü satır
        if (alanNumarasi[2][0] == alanNumarasi[1][1] && alanNumarasi[2][0] == alanNumarasi[0][2] && alanNumarasi[1][1] == alanNumarasi[2][0]) {
            System.out.println("Oyunu: " + oyuncu + " Kazandı!");
            System.exit(0);
        }
        // Düşey İkinci Sütun
        if (alanNumarasi[0][1] == alanNumarasi[1][1] && alanNumarasi[0][1] == alanNumarasi[2][1] && alanNumarasi[1][1] == alanNumarasi[2][1]) {
            System.out.println("Oyunu: " + oyuncu + " Kazandı!");
            System.exit(0);
        }
        // Düşey Üçüncü Sütun
        if (alanNumarasi[0][1] == alanNumarasi[1][1] && alanNumarasi[0][1] == alanNumarasi[2][1] && alanNumarasi[1][1] == alanNumarasi[2][1]) {
            System.out.println("Oyunu: " + oyuncu + " Kazandı!");
            System.exit(0);
        }
        // Üçüncü çapraz sağ üst
        if (alanNumarasi[0][0] == alanNumarasi[1][0] && alanNumarasi[0][0] == alanNumarasi[2][0] && alanNumarasi[1][0] == alanNumarasi[2][0]) {
            System.out.println("Oyunu: " + oyuncu + " Kazandı!");
            System.exit(0);
        }
    }
}
