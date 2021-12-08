package Soru4;

public class KuyrukBagliListe {

    Eleman bas, son;

    public KuyrukBagliListe() {
        bas = null;
        son = null;
    }

    boolean kuyrukBosMu() {
        if (bas == null) {
            return true;
        }
        return false;
    }

    void kuyrukElemanEkle(Eleman yeni) {
        if (bas == null) {
            bas = yeni;
        } else {
            son.next = yeni;
        }
        son = yeni;
    }

    Eleman kuyrukElemanCikar() {
        Eleman s = bas;
        if (!kuyrukBosMu()) {
            bas = bas.next;
            if (bas == null) {
                son = null;
            }
        }
        return s;
    }

    Eleman kuyrukGoster() {
        return bas;
    }

}
