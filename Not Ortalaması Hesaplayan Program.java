import java.util.Scanner;

public class NotOrtalaması {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		
		int matematik, fizik, kimya, cografya, muzik, turkce;
		
		System.out.println("Matematik notunu girin: ");
		matematik = i.nextInt();
		
		System.out.println("Fizik notunu girin: ");
		fizik = i.nextInt();
		
		System.out.println("Kimya notunu giriniz: ");
		kimya = i.nextInt();
		
		System.out.println("Cografya notunu girin: ");
		cografya = i.nextInt();
		
		System.out.println("Muzik notunu girin: ");
		muzik = i.nextInt();
		
		System.out.println("Turkce notunu girin: ");
		turkce = i.nextInt();
		
		int toplam = (matematik + fizik + kimya + cografya + muzik + turkce);
		
		double ortalama = toplam / 6;
		
		boolean gecti = ortalama > 60;
		
		String gect = gecti ? "Gecti" : "Kaldi";
		System.out.println("Ortalamaniz: " + ortalama + gect);
	}

}
