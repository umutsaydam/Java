package matriscarpimi;

public class MatrisCarpimi {

    public static void main(String[] args) {
        int matris1[][] = {{2, 4, 1}, {6, 8, 2}, {2, 3, 4}, {1, 1, 1}};
        int matris2[][] = {{1, 3}, {5, 7}, {1, 1}};
        int matris3[][] = new int[matris1.length][matris2[0].length];
        int i = 0, j = 0, k = 0;
        if (matris1[0].length == matris2.length) {
            int toplam = 0;

            for (i = 0; i < matris1.length; i++) {
                for (j = 0; j < matris2[0].length; j++) {

                    for (k = 0; k < matris2.length; k++) {
                        System.out.println(matris1[i][k] + "*" + matris2[k][j]);
                        toplam += matris1[i][k] * matris2[k][j];
                    }
                    matris3[i][j] = toplam;
                    toplam = 0;
                }

            }

            for (int l = 0; l < matris3.length; l++) {
                for (int x = 0; x < matris3[0].length; x++) {
                    System.out.print(matris3[l][x] + " ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("1. Matrisin sütun sayısı 2. Matrisin satır sayısıne eşit olmalı");
        }

    }

}
