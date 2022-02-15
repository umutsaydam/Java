package heapguı;

public class heap {

    int[] dizi;
    int N;
    int tane;

    public heap(int N) {
        this.N = N;
        dizi = new int[N];
        tane = 0;
    }

    boolean heapBosMu() {
        return tane == 0;
    }

    boolean heapMinMi(heap h) {
        int no = h.tane - 1;
        int ustDal = (no - 1) / 2;

        while (ustDal > 0) {
            if (h.dizi[ustDal] < h.dizi[no]) {
                no = ustDal;
                ustDal = (no - 1) / 2;
            } else {
                return false;
            }
        }
        return true;
    }

    void yerDegis(int no, int ustDal) {
        int ara = dizi[ustDal];
        dizi[ustDal] = dizi[no];
        dizi[no] = ara;

        no = ustDal;
        ustDal = (no - 1) / 2;
    }

    void minYukariCik(int no) {
        int ustDal = (no - 1) / 2;
        while (ustDal >= 0 && dizi[ustDal] > dizi[no]) {
            yerDegis(no, ustDal);

            no = ustDal;
            ustDal = (no - 1) / 2;
        }
    }

    void maxYukariCik(int no) {
        int ustDal = (no - 1) / 2;
        while (ustDal >= 0 && dizi[no] > dizi[ustDal]) {
            yerDegis(no, ustDal);
            no = ustDal;
            ustDal = (no - 1) / 2;
        }
    }

    void minAsagiyaIn(int no) {
        int sol = 2 * no + 1;
        int sag = 2 * no + 2;
        while ((sag < tane && dizi[sag] < dizi[no]) || (sol < tane && dizi[sol] < dizi[no])) {
            if (sag >= tane || dizi[sag] < dizi[sol]) {
                int ara = dizi[sag];
                dizi[sag] = dizi[no];
                dizi[no] = ara;
                no = sag;
            } else {
                int ara = dizi[sol];
                dizi[sol] = dizi[no];
                dizi[no] = ara;
                no = sol;
            }
            sol = 2 * no + 1;
            sag = 2 * no + 2;
        }
    }

    heap convertFromMinToMax(heap gelenHeap) {
        heap yeniHeap = new heap(gelenHeap.N);
        for (int i = 0; i < gelenHeap.N; i++) {
            yeniHeap.heapMaxEkle(gelenHeap.dizi[i]);
        }
        return yeniHeap;
    }

    heap listeleriBirlestir(liste[] list, int sayac, int listeBoyutu, int k) {
        heap yeniHeap = new heap(7);

        for (int i = 0; i < listeBoyutu; i++) {
            eleman tmp = list[i].bas;

            while (tmp != null) {
                yeniHeap.heapMinEkle(tmp.icerik);
                tmp = tmp.ileri;
            }
        }

        return yeniHeap;
    }

    void heapMinEkle(int sayi) {
        tane++;
        dizi[tane - 1] = sayi;
        minYukariCik(tane - 1);
    }

    void heapMaxEkle(int sayi) {
        tane++;
        dizi[tane - 1] = sayi;
        maxYukariCik(tane - 1);
    }

    int heapAsgariDondur(int no) {
        int tmp = dizi[no];
        dizi[no] = dizi[tane - 1];
        tane--;
        minAsagiyaIn(0);
        return tmp;
    }
}
