import java.util.Scanner;
public class HavaSicakligi {
	public static void main(String[] args) {
		int sicaklik;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Sicaklik Giriniz: ");
		sicaklik = scan.nextInt();
		
		if (sicaklik <5) {
			System.out.println("Kayak yapabilirsiniz.");
		} else if (sicaklik >5 && sicaklik<15) {
			System.out.println("Sinemaya gidebilirsiniz.");
		} else if (sicaklik>15 && sicaklik<25) {
			System.out.println("Piknik yapmaya gidebilirsiniz.");
		} else if(sicaklik >25){
			System.out.println("Yuzmeye gidebilirsiniz.");
			
		}
	}
}
