package siralamalarvearamalar;

public class dijisktraAlgoritmasi {

    int dugum_say = 9;

    int minMesafe(int[] mes, boolean[] ziyaret) {
        int min = Integer.MAX_VALUE;
        int min_indis = 1;

        for (int v = 0; v < dugum_say; v++) {
            if (ziyaret[v] == false && mes[v] <= min) {// !!!!
                min = mes[v];
                min_indis = v;
            }
        }
        return min_indis;
    }

    void djikstraAlg(int graf[][], int bas) {
        boolean ziyaret[] = new boolean[dugum_say];
        int[] mes = new int[dugum_say];

        for (int i = 0; i < dugum_say; i++) {
            mes[i] = Integer.MAX_VALUE;
            ziyaret[i] = false;
        }

        mes[bas] = 0;

        for (int count = 0; count < dugum_say - 1; count++) {
            int u = minMesafe(mes, ziyaret);
            ziyaret[u] = true;

         /*   for (int v = 0; v < dugum_say; v++) {
                if (!ziyaret[v] && graf[u][v] != 0 && mes[u] !=Integer.MAX_VALUE && mes[u]+ graf[u][v] <) {

                }
            }*/
        }
    }

    public static void main(String[] args) {

    }
}
