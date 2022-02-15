package kelimaavi;

import java.util.Random;
import java.util.Scanner;

public class KelimaAvi {// kalem , kulaklık , ayakkabı , köpek , büyüteç

    public static String answer(int question) {
        String answr;
        switch (question) {
            case 1:
                answr = "kalem";
                break;
            case 2:
                answr = "kulaklık";
                break;
            case 3:
                answr = "ayakkabı";
                break;
            case 4:
                answr = "köpek";
                break;
            case 5:
                answr = "büyüteç";
                break;
            default:
                answr = "hata !";
                break;
        }
        return answr;
    }

    public static String questions() {
        Random random = new Random();
        int question = random.nextInt(6);
        String answr;
        switch (question) {
            case 1:
                System.out.println("Yazı yazmaya yarayan alet.");
                break;
            case 2:
                System.out.println("Kulağımıza taktığımızda müzik vs. dinlediğimiz alet.");
                break;
            case 3:
                System.out.println("Bizi yağmurdan çamurdan koruyan giyilen bir şey.");
                break;
            case 4:
                System.out.println("En sadık evcil hayvan.");
                break;
            case 5:
                System.out.println("Dedektif aleti.");
                break;
        }
        answr = answer(question);
        return answr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-9");
        StringBuilder strBuild = new StringBuilder();
        String answr = questions();
        String prediction = "";
        int falseCounter = 0;
        int k = 0;

        for (int i = 0; i < answr.length(); i++) {
            strBuild.append("*");
        }
        System.out.print(strBuild);

        while (strBuild.toString().contains("*")) {
            System.out.print("Harf giriniz: ");
            prediction = scan.next();

            if (strBuild.toString().contains("*") && answr.contains(String.valueOf(prediction.charAt(0)))) {
                for (int i = 0; i < answr.length(); i++) {
                    if (answr.charAt(i) == prediction.charAt(0)) {
                        strBuild.setCharAt(i, prediction.charAt(0));
                    }
                }
                System.out.println(strBuild);
            }else {
                falseCounter++;
            }
        }

        if (!strBuild.toString().contains("*")) {
            System.out.println("Tebrikler Bildiniz yanlış bilinen harf sayısı : " + falseCounter);
        }
    }

}
