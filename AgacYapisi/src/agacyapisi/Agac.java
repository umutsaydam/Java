package agacyapisi;

public class Agac {

    Eleman kok;

    public Agac() {
        kok = null;
    }

    void elemanEkle(Eleman yeni) {
        if (kok == null) {
            kok = yeni;
        } else {
            Eleman tmp = kok;
            Eleman onceki = null;

            while (tmp != null) {
                onceki = tmp;
                if (yeni.icerik < tmp.icerik) {
                    tmp = tmp.sol;
                } else {
                    tmp = tmp.sag;
                }
            }

            if (yeni.icerik < onceki.icerik) {
                onceki.sol = yeni;
            } else {
                onceki.sag = yeni;
            }

        }
    }

    String elemanAra(int aranan) {
        Eleman tmp = kok;

        while (tmp != null) {
            if (aranan == tmp.icerik) {
                return "Bulundu";
            } else if (aranan < tmp.icerik) {
                tmp = tmp.sol;
            } else {
                tmp = tmp.sag;
            }
        }
        return "Bulunamadı";
    }

    int enKucuk() {
        Eleman tmp = kok;

        while (tmp.sol != null) {
            tmp = tmp.sol;
        }
        return tmp.icerik;
    }

    int enBuyuk() {
        Eleman tmp = kok;

        while (tmp.sag != null) {
            tmp = tmp.sag;
        }
        return tmp.icerik;
    }

    void preOrder(Eleman eleman) {
        if (eleman != null) {
            System.out.println(eleman.icerik);
            if (eleman.sol != null) {
                preOrder(eleman.sol);
            }
            if (eleman.sag != null) {
                preOrder(eleman.sag);
            }
        }
    }

    void inOrder(Eleman eleman) {
        if (eleman.sol != null) {
            inOrder(eleman.sol);
        }
        System.out.println(eleman.icerik);
        if (eleman.sag != null) {
            inOrder(eleman.sag);
        }
    }

    void postOrder(Eleman eleman) {
        if (eleman.sol != null) {
            postOrder(eleman.sol);
        }
        if (eleman.sag != null) {
            postOrder(eleman.sag);
        }
        System.out.println(eleman.icerik);
    }

}
