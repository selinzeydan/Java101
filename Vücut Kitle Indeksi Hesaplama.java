import java.util.Scanner;
public class VucutKitleIndeksiHesaplama {
	public static void main(String[] args) {
		
		double boy, kilo, vki;
		Scanner i = new Scanner(System.in);
		
		System.out.println("Lutfen boyunuzu metre cinsinden giriniz: ");
		boy = i.nextDouble();
		
		System.out.println("Lutfen kilonuzu kilogram cinsinden giriniz: ");
		kilo = i.nextDouble();
		
		vki = kilo/(boy*boy);
		System.out.println("Vucut Kitle Indeksiniz: " + vki);
	}
}
