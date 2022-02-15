package siralamalarvearamalar;

public class IkiliAramaAgaci {

    public static boolean siraliMi(int[] dizi) {
        for (int i = 0; i < dizi.length - 1; i++) {
            if (dizi[i] > dizi[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int ikiliAra(int[] dizi, int aranan) {

        if (siraliMi(dizi)) {
            int bas = 0, son = dizi.length - 1, adim = 0;

            while (bas <= son) {
                int orta = (bas + son) / 2;

                if (dizi[orta] == aranan) {
                    adim++;
                    System.out.println(adim);
                    return orta;
                } else if (dizi[orta] > aranan) {
                    son = orta - 1;
                } else {
                    bas = orta + 1;
                }
                adim++;

            }

        } else {
            System.out.println("Sırasız dizide ikili aranmaz!");
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(ikiliAra(dizi, 7));
    }
}
