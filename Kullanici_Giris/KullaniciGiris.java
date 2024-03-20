package Kullanici_Giris;
import java.util.Scanner;
public class KullaniciGiris {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        String realpass= "12345";
        String realusername= "java";
        System.out.print("Kullanıcı adınızı girin:");
        String kullaniciadi= input.nextLine();
        System.out.print("Şifrenizi girin:");
        String sifre = input.nextLine();
        if (sifre.equals(realpass)&&kullaniciadi.equals(realusername)){
            System.out.println("BAŞARIYLA HESABINIZA GİRŞİ YAPTINIZ");
        }
        else if (sifre.equals(realpass) & !kullaniciadi.equals(realusername)){
            System.out.println("Kullanıcı adı hatalı tekrar deneyiniz");
        }
        else {
            System.out.println("ŞİFRENİZ YANLIŞ !!!");
            System.out.println("Şifrenizi yenilemek ister misiniz? (Y/N)");
            String answer = input.nextLine();
            if (answer.equals("Y")){
                System.out.println("Yeni şifrenizi girin");
                String newpass = input.next();
                if (!newpass.equals(realpass)) {
                    realpass = newpass;
                    System.out.println("Şifreniz başarıyla değiştirldi ");
                }
                else {
                    System.out.println("Eski şifrenizi yeni şifreniz olarak tanımlayamazsınız!");
                }
            }
            else {
                    System.out.println("Şifreniz değiştirilmedi");
                }





        }



    }
}
