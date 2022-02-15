package heapguı;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        liste l[] = new liste[3];
        l[0] = new liste();
        l[0].siraliEkle(new eleman(1));

        l[1] = new liste();
        l[1].siraliEkle(new eleman(2));
        l[1].siraliEkle(new eleman(3));

        l[2] = new liste();
        l[2].siraliEkle(new eleman(4));

        heap s = new heap(9);
        int k = 0;
        eleman tmp = l[k].bas;

        while (k < 3) {
            if (tmp == null) {
                k++;
                if (k < 3) {
                    tmp = l[k].bas;
                }
            } else {
                System.out.println(tmp.icerik);
                tmp = tmp.ileri;
            }
        }

    }
}
