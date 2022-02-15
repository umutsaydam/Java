package siralamalarvearamalar;

import java.util.Random;

public class BubbleSort {

    public static int[] bubbleSort(int[] dizi) {
        boolean durum = true;
        while (durum) {
            durum = false;

            for (int i = 0; i < dizi.length - 1; i++) {
                if (dizi[i] > dizi[i + 1]) {
                    int ara = dizi[i];
                    dizi[i] = dizi[i + 1];
                    dizi[i + 1] = ara;
                    durum = true;
                }
            }
        }
        return dizi;
    }

    public static void main(String[] args) {
        int dizi[] = {2, 99, 3, 54, 4, 1, 12};

        dizi = bubbleSort(dizi);

        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + "  ");
        }
    }
}
