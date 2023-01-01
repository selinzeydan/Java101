import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int k, toplam = 0, sayac = 0;
        double ort;

        System.out.print("Sayiyi giriniz: ");
        k = input.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i % 12 == 0) {
                System.out.println(i);
                toplam = toplam + i;
                sayac++;
            }
        }
        System.out.println("Toplam: " + toplam);
        ort = toplam / sayac;

        System.out.print("Ortalama: " + ort);
    }
}
