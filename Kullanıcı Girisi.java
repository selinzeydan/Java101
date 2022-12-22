import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String username,password,passwordNew; 
        char a; boolean check = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hosgeldiniz");
        System.out.print("Lutfen kullanici adini giriniz :"); username = sc.nextLine();
        System.out.print("Lutfen sifrenizi giriniz :"); password = sc.nextLine();
        if(username.equals("username") && password.equals("pass123")){
            System.out.println("Basarili bir sekilde giris yaptiniz...");
        }
        else {
            System.out.println("Kullanici adiniz veya sifreniz yanlis.");
            while (check){
                System.out.print("Sifrenizi degistirmek ister misiniz? (y/n)"); a = sc.nextLine().charAt(0);
                switch (a){
                    case 'y' :
                        System.out.print("Lutfen yeni sifrenizi giriniz:"); passwordNew = sc.nextLine();
                        if (passwordNew.equals("pass123") || passwordNew.equals(password)){
                            System.out.println("Sifreniz eski sifreniz ile ayni olamaz. Ust menuye aktariliyorsunuz.");
                        }
                        else {
                            System.out.println("Yeni sifreniz basarili bir sekilde olusturuldu.");
                            System.out.println("Cikis yapiliyor...");
                            check = false;
                            break;
                        }
                        break;
                    case 'n':
                        System.out.println("Cıkıs yapiliyor..");
                        check = false;
                        break;
                    default:
                        System.out.println("Hatalı islem sectiniz. Ust menuye aktariliyorsunuz.");
                }
            }

        }



    }
}
