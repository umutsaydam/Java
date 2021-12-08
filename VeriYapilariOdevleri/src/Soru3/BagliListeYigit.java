package Soru3;

public class BagliListeYigit {

    Eleman bas;

    public BagliListeYigit() {
        bas = null;
    }

    boolean yigitBosMu() {
        if (bas == null) {
            return true;
        } else {
            return false;
        }
    }

    void yigitElemanEkle(Eleman yeni) {
        yeni.next = bas;
        bas = yeni;
    }

    Eleman yigitElemanSil() {
        if (!yigitBosMu()) {
            Eleman e = bas;
            bas = bas.next;
            return e;
        }
        return null;
    }

    Eleman yigitGoster() {
        return bas;
    }
}
