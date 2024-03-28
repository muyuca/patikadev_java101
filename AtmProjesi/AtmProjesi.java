package AtmProjesi;
import java.util.Scanner;
public class AtmProjesi {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullancıı adınızı giriniz: ");
            userName=input.next();
            System.out.print("Şifrenizi giriniz: ");
            password=input.next();
            if (userName.equals("Yusuf")  && password.equals("Amed2121")) {
                System.out.println("Merhaba, Kodluyoruz bankasına hoşgeldiniz!");
                System.out.println("1-Para yatırma\n"+
                "2-Para çekme\n"+
                "3-Bakiye sorgulama\n"+
                "4-Çıkış yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                select=input.nextInt();
                switch (select){
                    case 1:{
                        System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                        int add= input.nextInt();
                        balance +=add;
                        System.out.println("Bakiyeniz eklenmiştir.");
                        break;
                    }
                    case 2:{
                        System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                        int dec = input.nextInt();
                        if(dec<=balance){
                            balance-=dec;
                            System.out.println("Paranız başarıyla çekildi, Lütfen paranızı alın.");
                        }else{
                            System.out.println("Yetersiz bakiye!!");
                        }
                        break;
                    }
                    case 3:{
                        System.out.println("Bakiyeniz: "+balance);
                        break;

                    } case 4:{
                        System.out.println("İyi günler");
                        break;

                    }
                    default:{
                        System.out.println("Hatalı giriş !!");
                    }

                }
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz.");
                if (right < 1) {
                    System.out.println("Hesabınız blokelenmiştir lütfen bankanızla görüşün");
                } else {
                    System.out.println("Kalan hakkınız: "+right);
                }
            }
        }
    }
}
