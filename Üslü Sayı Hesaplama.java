import java.util.Scanner;
public class Uslusayihesaplama {
    public static void main(String[] args) {
        int k,n;
        Scanner inp=new Scanner(System.in);
        System.out.println("Üssü alınacak sayı: ");
        n=inp.nextInt();
        System.out.println("Üs olacak sayı: ");
        k=inp.nextInt();
        int total=1;
        int i=1;
        for (i=1;i<=k;i++){
            total *=n;
        }
        System.out.println("Cevap: " +total);
    }
}
