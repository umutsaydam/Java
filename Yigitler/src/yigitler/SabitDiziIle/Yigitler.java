package yigitler.SabitDiziIle;

import java.util.Scanner;

class stack {

    ogrenci[] ogr;
    int N, ust;

    public stack(int N) {
        this.N = N;
        ogr = new ogrenci[N];
        this.ust = -1;
    }

    boolean bosMu() {
        return ust == -1;
    }

    boolean doluMu() {
        return ust == N - 1;
    }

    void ekle(ogrenci eleman) {
        if (!doluMu()) {
            ust++;
            ogr[ust] = eleman;
        }
    }

    ogrenci cikar() {
        if (!bosMu()) {
            ust = ust - 1;
            return ogr[ust + 1];
        }
        return null;
    }

    ogrenci tepeDeger() {
        return ogr[ust];
    }

}

public class Yigitler {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        stack y1 = new stack(3);
        ogrenci o1 = new ogrenci("umut", 100);
        ogrenci o2=new ogrenci("emre", 20);

        y1.ekle(o1);
        y1.ekle(o2);

        System.out.println(y1.cikar().isim);
    }
}
