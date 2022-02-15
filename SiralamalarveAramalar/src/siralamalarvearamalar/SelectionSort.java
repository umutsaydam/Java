package siralamalarvearamalar;

import java.util.Random;

public class SelectionSort {

    public static int[] selectionSort(int[] dizi) {
        boolean deneme = true;
        for (int i = 0; i < dizi.length - 1; i++) {
            int minimumIndis = i;
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[j] < dizi[minimumIndis]) {
                    minimumIndis = j;
                }
            }
            if (i != minimumIndis) {
                int ara = dizi[i];
                dizi[i] = dizi[minimumIndis];
                dizi[minimumIndis] = ara;
            }

            if (deneme && i == 2) {
                deneme = false;
                for (int j = 0; j < dizi.length; j++) {
                    System.out.print(dizi[j] + "  ");
                }
            }
        }

        return dizi;
    }

    public static void main(String[] args) {
        int dizi[] = {2, 8, 45, 3, 1, 7};

        dizi = selectionSort(dizi);
        System.out.println("****");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + "   ");
        }

    }
}
