import java.util.Scanner;

public class UcgeninAlanı {
	public static void main(String[] args) {
		
		double a, b, c, u, alan;
		Scanner i = new Scanner(System.in);
		
		System.out.println("1. Kenari Giriniz: ");
		a = i.nextDouble();
		
		System.out.println("2. Kenari Giriniz: ");
		b = i.nextDouble();
		
		System.out.println("3. Kenari Giriniz: ");
		c = i.nextDouble();
		
		u = (a+b+c)/2;
		
		alan = Math.sqrt(u*(u-a)*(u-b)*(u*c));
		
		System.out.println("Ucgenin Alani: " + alan);
	}
}
