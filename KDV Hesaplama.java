import java.util.Scanner;

public class KDVHesaplama {
	public static void main(String[] args) {
		double tutar, kdvTutar, kdvliTutar, kdvOrani1=1.8, kdvOrani2=0.8;
		
		Scanner i = new Scanner(System.in);
		System.out.println("Ucret tutarini giriniz: ");
		tutar = i.nextDouble();
		
		kdvTutar = tutar < 100 ? kdvOrani1 * tutar: kdvOrani2 * tutar;
		
		kdvliTutar = kdvTutar + tutar;
		
		System.out.println("KDV'siz tutar: "+ tutar);
		System.out.println("KDV Tutari: " + kdvTutar);
		System.out.println("KDV'li Tutar: " + kdvliTutar);
		
	}
}
