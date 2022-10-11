import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String yanit,username,password;

        Scanner input=new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        username=input.nextLine();

        System.out.print("Şifreniz: ");
        password=input.nextLine();

        if (username.equals("enes") && password.equals("enes1252")) {
            System.out.println("Giriş Yaptınız !");
        }else {
            System.out.println("Giriş Bilgileriniz Yanlış");
            System.out.print("Şifrenizi sıfırlamak ister misiniz?(evet/hayır)");
            yanit= input.nextLine();
            if (yanit.equals("evet")){
                System.out.print("Yeni şifrenizi giriniz: ");
                password=input.nextLine();
                if (password.equals("enes1252")){
                    System.out.println("Şifreniz eski şifrenizle aynı olamaz, Lütfen yeni bir şifre giriniz.");
                }else {
                    System.out.println("Şifre oluşturuldu");
                }
            }
        }

    }
}