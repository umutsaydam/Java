package Soru1;

public class yigit {

    Eleman[] eleman = new Eleman[10];
    int ust;

    public yigit() {
        ust = -1;
    }

    boolean yigitBosMu() {
        return ust == -1;
    }

    boolean yigitDoluMu() {
        return ust == eleman.length - 1;
    }

    void yigitElemanEkle(Eleman yeni) {
        if (!yigitDoluMu()) {
            ust++;
            eleman[ust] = yeni;
        }
    }

    Eleman yigitPop() {
        return eleman[ust];
    }

    Eleman yigitElemanCikar() {
        if (!yigitBosMu()) {
            ust--;
            return eleman[ust + 1];
        }
        return null;
    }
}
