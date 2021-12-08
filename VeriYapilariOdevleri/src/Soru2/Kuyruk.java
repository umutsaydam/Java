package Soru2;

public class Kuyruk {

    eleman eleman[] = new eleman[10];
    int N = eleman.length;
    int bas, son;

    public Kuyruk() {
        bas = 0;
        son = 0;
    }

    boolean kuyrukBosMu() {
        return bas == son;
    }

    boolean kuyrukDoluMu() {
        if (bas == (son + 1) % N) {
            return true;
        } else {
            return false;
        }
    }

    void kuyrukElemanEkle(eleman yeni) {
        if (!kuyrukDoluMu()) {
            eleman[son] = yeni;
            son = son + 1;
        }
    }

    eleman kuyrukElemanSil() {
        eleman silinen = eleman[bas];
        if (!kuyrukBosMu()) {
            bas = (bas + 1) % N;
            return silinen;
        }
        return null;
    }

    eleman kuyrukElemanGoster() {
        if (!kuyrukBosMu()) {
            return eleman[son];
        }
        return null;
    }

}
