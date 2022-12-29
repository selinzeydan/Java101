import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
 
        int yas,yolculukTipi;
        double toplamUcret,mesafe,normalUcret,indirimli,indirimli2, cocukIndirim = 0.50,ortayasIndirim=0.10 , yasliIndirim= 0.30,gidisDonus=0.20;
        Scanner inp = new Scanner(System.in);


        System.out.print("Mesafe'yi Giriniz: ");
        mesafe = inp.nextInt();
        System.out.print("Yaşınızı Giriniz: ");
        yas = inp.nextInt();
        System.out.print("1 - Tek Yön\n2 - Gidiş Dönüş\nLütfen Yolculuk Tipini Seçiniz: ");
        yolculukTipi = inp.nextInt();
        normalUcret = mesafe * 0.10;


        if (yolculukTipi==1 && yas>=1 && mesafe>=1) {
            if (yas<12){
                indirimli = normalUcret*cocukIndirim;
                toplamUcret= normalUcret - indirimli;
                System.out.println("Ücretiniz: " + toplamUcret);
            } else if (yas>=12 && yas<=24) {
            indirimli = normalUcret*ortayasIndirim;
            toplamUcret=normalUcret - indirimli;
            System.out.println("Ücretiniz: " + toplamUcret);

            } else if (yas>=65) {
                indirimli = normalUcret*yasliIndirim;
                toplamUcret = normalUcret - indirimli;
                System.out.println("Ücretiniz: " + toplamUcret);
            }else {
                toplamUcret = normalUcret;
                System.out.println("Ücretiniz: " + toplamUcret);
            }

        } else if (yolculukTipi==2 && yas>1 && mesafe >=1) {
            if(yas<12){
                indirimli= normalUcret*cocukIndirim;
                toplamUcret= (normalUcret - indirimli)*2;
                indirimli2= toplamUcret - (toplamUcret * gidisDonus);
                System.out.println("Ücretiniz: " + indirimli2);
            }else if(yas>=12 && yas<=24){
                indirimli = normalUcret*ortayasIndirim;
                toplamUcret=(normalUcret - indirimli)*2;
                indirimli2= toplamUcret - (toplamUcret*gidisDonus);
                System.out.println("Ücretiniz: " + indirimli2);
            } else if (yas>=65) {
                indirimli = normalUcret*yasliIndirim;
                toplamUcret=(normalUcret - indirimli)*2;
                indirimli2= toplamUcret - (toplamUcret*gidisDonus);
                System.out.println("Ücretiniz: " + indirimli2);
            }
            else{
                toplamUcret = normalUcret*2;
                indirimli2 = toplamUcret - (toplamUcret*gidisDonus);
                System.out.println("Ücretiniz: " + indirimli2);
            }
        } else {
            System.out.println("Hatalı Giriş Yaptınız, Lütfen Tekrar Deneyiniz. ");
        }


    }

    }
