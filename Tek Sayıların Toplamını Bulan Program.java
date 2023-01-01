import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0, k;

        do {
            System.out.print("Sayi giriniz: ");
            k = input.nextInt();

            if (k % 4 == 0) {
                total = total + k;
            }

        } while (k % 2 != 1);

        System.out.print("4'ün katlarının toplamı: " + total);
    }
}
