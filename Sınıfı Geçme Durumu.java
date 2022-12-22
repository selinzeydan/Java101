import java.util.Scanner;
public class SinifiGecmeDurumu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int matematik, fizik, turkce, kimya, muzik;
		int toplam = 0;
		int sayi = 0;
		
		
		System.out.println("Matematik Notunuz: ");
		matematik = scan.nextInt();
		if(matematik > 0 && matematik <= 100) {
			toplam = toplam + matematik;
			sayi++;
		}
		
		System.out.print("Turkce Notunuz: ");
        turkce = scan.nextInt();
        if (turkce > 0 && turkce <= 100)
        {
            toplam = toplam + turkce;
            sayi++;

        }
        System.out.print("Fizik Notunuz: ");
        fizik = scan.nextInt();
        if (fizik > 0 && fizik <= 100)
        {
            toplam = toplam + fizik;
            sayi++;
        }
        System.out.print("Kimya Notunuz: ");
        kimya = scan.nextInt();
        if (kimya > 0 && kimya <= 100)
        {
            toplam = toplam + kimya;
            sayi++;
        }
        System.out.print("Muzik Notunuz: ");
        muzik = scan.nextInt();
        if (muzik > 0 && muzik <= 100)
        {
            toplam = toplam + muzik;
            sayi++;
        }
        double avarage = toplam/sayi;

        System.out.println("Ortalamaniz: "+avarage);
        if (avarage <= 55) {
            System.out.println("Sinifta kaldiniz, seneye tekrar gorusmek uzere!");

        }else{
            System.out.println("Tebrikler, sinifi gectiniz.");

        }
	}

}
