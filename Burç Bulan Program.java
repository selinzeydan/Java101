import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
       int mounth, day;

        Scanner input = new Scanner(System.in);

        System.out.print("Dogdugunuz Ay :");
        mounth = input.nextInt();

        System.out.print("Dogdugunuz Gun :");
        day = input.nextInt();

        if ((mounth == 12) && (day >= 22) || ((mounth == 1) && (day <= 21))) {
            System.out.println("Burcunuz: Oglak Burcu");
        } else if ((mounth == 1) && (day >= 22) || ((mounth == 2) && (day <= 19))) {
            System.out.println("Burcunuz: Kova Burcu");
        } else if ((mounth == 2) && (day >= 20) || ((mounth == 3) && (day <= 20))) {
            System.out.println("Burcunuz: Balik Burcu");
        } else if ((mounth == 3) && (day >= 21) || ((mounth == 4) && (day <= 20))) {
            System.out.println("Burcunuz: Koc Burcu");
        } else if ((mounth == 4) && (day >= 21) || ((mounth == 5) && (day <= 21))) {
            System.out.println("Burcunuz: Boga Burcu");
        } else if ((mounth == 5) && (day >= 22) || ((mounth == 6) && (day <= 22))) {
            System.out.println("Burcunuz: Ikizler Burcu");
        } else if ((mounth == 6) && (day >= 23) || ((mounth == 7) && (day <= 22))) {
            System.out.println("Burcunuz: Yengec Burcu");
        } else if ((mounth == 7) && (day >= 23) || ((mounth == 8) && (day <= 22))) {
            System.out.println("Burcunuz: Aslan Burcu");
        } else if ((mounth == 8) && (day >= 23) || ((mounth == 9) && (day <= 22))) {
            System.out.println("Burcunuz: Basak Burcu");
        } else if ((mounth == 9) && (day >= 23) || ((mounth == 10) && (day <= 22))) {
            System.out.println("Burcunuz: Terazi Burcu");
        } else if ((mounth == 10) && (day >= 23) || ((mounth == 11) && (day <= 21))) {
            System.out.println("Burcunuz: Akrep Burcu");
        } else if ((mounth == 11) && (day >= 22) || ((mounth == 12) && (day <= 21))) {
            System.out.println("Burcunuz: Yay Burcu");
        } else if ((mounth == 12) && (day >= 22) || ((mounth == 1) && (day <= 21))) {
            System.out.println("Burcunuz: Oglak Burcu");
      
