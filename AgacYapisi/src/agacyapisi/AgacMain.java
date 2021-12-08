package agacyapisi;

public class AgacMain {

    public static void main(String[] args) {
        Agac a = new Agac();

        a.elemanEkle(new Eleman(12));
        a.elemanEkle(new Eleman(15));
        a.elemanEkle(new Eleman(2));
        a.elemanEkle(new Eleman(3));

        a.postOrder(a.kok);
    }
}
