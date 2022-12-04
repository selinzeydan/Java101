import java.util.Scanner;
public class DaireAlanÇevre {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		
		System.out.println("Lutfen dairenin yari capini giriniz: ");
		double r = i.nextDouble();
		double pi = 3.14;
		
		double alan = pi * r * r;
		System.out.println("Dairenin Alani = " + alan);
		
		double cevre = 2 * pi * r;
		System.out.println("Dairenin Cevresi = " + cevre);
		
    
		
		int aci = 360;
		double alan2 = (pi * (r * r)* aci)/360;
		System.out.println("Dairenin Alani = " + alan2);
	}
}
