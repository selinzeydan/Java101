import java.util.Scanner;
public class ManavKasa {
	public static void main(String[] args) {
		double armut, elma, domates, muz, patlican, toplam;
		Scanner i = new Scanner(System.in);
		
		System.out.println("Armut kac kilo? :");
		armut = i.nextDouble();
		armut *= 2.14;
		
		System.out.println("Elma kac kilo? :");
		elma = i.nextDouble();
		elma *= 3.67;
		
		System.out.println("Domates kac kilo? :");
		domates = i.nextDouble();
		domates *= 1.11;
		
		System.out.println("Muz kac kilo? :");
		muz = i.nextDouble();
		muz *= 0.95;
		
		System.out.println("Patlican kac kilo? :");
		patlican = i.nextDouble();
		patlican *= 5.00;
		
		toplam = armut + elma + domates + muz + patlican;
		System.out.println("Toplam tutar: " + toplam);
	}
}
