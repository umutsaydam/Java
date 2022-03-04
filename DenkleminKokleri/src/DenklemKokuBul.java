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
			System.out.println("Çakýþýk iki kök mevcut." + kok);
		} else {
			System.out.println("Reel olarak kök yoktur.");
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Denklemin x^2'li katsayýsýný girin: ");
		int xKare = scan.nextInt();

		System.out.println("Denklemin x'li katsayýsýný girin: ");
		int xKatSayi = scan.nextInt();

		System.out.println("Denklemin c sabitini girin: ");
		int sabit = scan.nextInt();

		kokBul(xKare, xKatSayi, sabit);

		scan.close();
	}
}
