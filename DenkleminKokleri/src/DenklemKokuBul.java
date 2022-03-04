import java.util.Scanner;

public class DenklemKokuBul {

	public static void kokBul(int xKare, int xKatSayi, int sabit) {
		int delta = xKatSayi * xKatSayi - (4 * xKare * sabit);

		if (delta > 0) {
			int kok1 = (-xKatSayi + (int) Math.sqrt((double) delta)) / 2 * xKare;
			int kok2 = (-xKatSayi - (int) Math.sqrt((double) delta)) / 2 * xKare;

			System.out.println(kok1 + "   " + kok2);
		} else if (delta == 0) {
			int kok = (-xKatSayi + (int) Math.sqrt((double) delta)) / 2 * xKare;
			System.out.println("�ak���k iki k�k mevcut." + kok);
		} else {
			System.out.println("Reel olarak k�k yoktur.");
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Denklemin x^2'li katsay�s�n� girin: ");
		int xKare = scan.nextInt();

		System.out.println("Denklemin x'li katsay�s�n� girin: ");
		int xKatSayi = scan.nextInt();

		System.out.println("Denklemin c sabitini girin: ");
		int sabit = scan.nextInt();

		kokBul(xKare, xKatSayi, sabit);

		scan.close();
	}
}
