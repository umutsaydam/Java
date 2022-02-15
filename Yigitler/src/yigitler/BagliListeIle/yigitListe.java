package yigitler.BagliListeIle;

class yigit {

    Eleman ust;

    public yigit() {
        ust = null;
    }

    boolean bosMu() {
        return ust == null;
    }

    void elemanEkle(int sayi) {
        Eleman eleman = new Eleman(sayi);

        eleman.next = ust;
        ust = eleman;

    }

    int elemanSil() {
        Eleman e = ust;
        if (!bosMu()) {
            ust = ust.next;
        }
        return e.icerik;
    }

    void elemanSirala(yigit y1) {
        yigit tmp = new yigit();

        while (!y1.bosMu()) {
            int sayi = y1.elemanSil();

            while ((!tmp.bosMu()) && tmp.ust.icerik < sayi) {
                y1.elemanEkle(tmp.elemanSil());
            }
            tmp.elemanEkle(sayi);

        }
        tmp.elemanGoster();
    }

    void elemanCiftSirala(yigit y1) {
        yigit tmp = new yigit();

        while (!y1.bosMu()) {
            int sayi = y1.elemanSil();
            if (sayi % 2 == 0) {
                tmp.elemanEkle(sayi);
            }

        }

        while (!tmp.bosMu()) {
            y1.elemanEkle(tmp.elemanSil());
        }
        y1.elemanGoster();

    }

    void elemanGoster() {
        Eleman tmp = ust;

        while (tmp != null) {
            System.out.print(tmp.icerik + "->");
            tmp = tmp.next;
        }

    }

}

public class yigitListe {

    public static void main(String[] args) {
        yigit y1 = new yigit();
        y1.elemanSil();
    }
}
