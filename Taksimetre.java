import java.util.Scanner;

public class Taksimetre {
	public static void main(String[] args) {
		double kilometre, perKm=2.20, taksimetre;
		int acilisUcreti = 10;
		
		Scanner i = new Scanner(System.in);
		System.out.println("Mesafe giriniz (km): ");
		
		kilometre = i.nextDouble();
		taksimetre = kilometre*perKm;
		taksimetre += acilisUcreti;
		
		taksimetre = (taksimetre<20) ? 20 : taksimetre;
		System.out.println("Toplam tutar: " + taksimetre);
		
	}
}
