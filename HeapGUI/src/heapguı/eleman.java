package heapguı;

public class eleman {

    int icerik;
    eleman ileri;

    public eleman(int icerik) {
        this.icerik = icerik;
        eleman ileri = null;
    }
}

class liste {

    eleman bas;
    eleman son;

    public liste() {
        bas = null;
        son = null;
    }

    void siraliEkle(eleman yeni) {
        if (bas == null) {
            bas = yeni;
            son = yeni;
        } else {
            if (bas.icerik < yeni.icerik) {
                eleman tmp = bas;
                eleman onceki = null;
                while (tmp != null && tmp.icerik < yeni.icerik) {
                    onceki = tmp;
                    tmp = tmp.ileri;
                }
                onceki.ileri = yeni;
                if (tmp == null) {
                    son = yeni;
                }
            } else {
                yeni.ileri = bas;
                bas = yeni;
            }
        }
    }

    void goster() {
        eleman tmp = bas;
        while (tmp != null) {
            System.out.println(tmp.icerik);
            tmp = tmp.ileri;
        }
    }

}
