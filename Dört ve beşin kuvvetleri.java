import java.util.Scanner;
public class dortvebesinkuvvetleri {
    public static void main(String[] args) {
        int nb;
        Scanner inp=new Scanner(System.in);
        System.out.println("Please enter a number:");
        nb=inp.nextInt();
        System.out.println("4'ün kuvvetleri:");
        for (int i=1;i<=nb;i=i*4){
            System.out.print(i+",");
        }
        System.out.println();
        System.out.println("5'in kuvvetleri:");
        for (int j=1 ;j<=nb;j=j*5){
            System.out.print(j+",");
        }

    }
}
