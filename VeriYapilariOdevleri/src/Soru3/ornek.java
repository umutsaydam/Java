package Soru3;

class eleman {

    int icerik;
    eleman next;

    public eleman(int icerik) {
        this.icerik = icerik;

        eleman next = null;
    }
}

class bagliYigit {

    eleman bas;

    public bagliYigit() {
        bas = null;
    }

    boolean yigitBosMu() {
        if (bas == null) {
            return true;
        } else {
            return false;
        }
    }

    void yigitElemanEkle(eleman yeni) {
        yeni.next = bas;
        bas = yeni;
    }

    eleman yigitElemanCikar() {
        if (!yigitBosMu()) {
            eleman e = bas;
            bas=bas.next;
            return e;
        }
        return null;
    }

    eleman yigitElemanGoster() {
        return bas;
    }

}

public class ornek {

    public static void main(String[] args) {
        bagliYigit yigit = new bagliYigit();
        eleman e;

        for (int i = 0; i < 4; i++) {
            e = new eleman(i);
            yigit.yigitElemanEkle(e);
        }

        while(!yigit.yigitBosMu()){
            System.out.print(yigit.yigitElemanCikar().icerik+"->");
        }

    }
}
