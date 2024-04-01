package Hesap_Makinesi_Metodlarla;
import java.util.Scanner;
public class HesapMakinesi {
    public static Scanner input = new Scanner(System.in);

    public static int sum(int a,int b){
        int result=a+b;
        System.out.println("Toplama işlemi sonucu: "+result);
        return result;
    }
    public static int minus(int a,int b){
        int result=a-b;
        System.out.println("Çıkartma işlemi sonucu:"+result);
        return result;
    }
    public static int times(int a,int b){
        int result = a*b;
        System.out.println("Çarpma sonucu: "+result);
        return result;
    }
    public static int divided(int a,int b){
        if (b==0){
            System.out.println("İkinci sayıyı 0'dan farklı olmalı.");
            return 0;
        }
        int result = a/b;
        System.out.println("Bölme işlemi sonucu : "+result);
        return result;
    }
    public static int power(int a,int b){
        int result = 1;
        for(int i=1;i<=b;i++){
            result *=a;
        }
        System.out.println("Üslü işlem sonuuc: "+result);
        return result;
    }
    public static int mod(int a,int b){
        int result = a%10;
        System.out.println("Mod alma sonucu; "+result);
        return result;
    }
    public static int calc(int a,int b){
        System.out.println("Çevresi :" +(2*(a+b)));
        System.out.println("Alanı: "+(a*b));
        return a*b;
    }
    public static void main(String[] arg){
        int select;
        String menu =  "1-Toplama İşlemi\n"+
                "2- Çıkartma işlemi\n"+
                "3- Çarpma İşlemi\n"+
                "4- Bölme İşlemi"+
                "5- Üslü sayı Hesaplama\n"+
                "6- Mod Alma\n"+
                "7- Dikdörtgen Alan ve Çevre Hesaplama\n"+
                "0- Çıkış yap";
        System.out.println(menu);
        while(true){
            System.out.print("Bir İşlem seçiniz : ");
            select=input.nextInt();
            if(select==0){
                System.out.println("Güle Güle ");
                break;
            }
            System.out.print("İlk sayı : ");
            int a = input.nextInt();
            System.out.print("İkinci sayı : ");
            int b = input.nextInt();
            switch(select){
                case(1):
                    sum(a,b);
                    break;
                case(2):
                    minus(a,b);
                    break;
                case(3):
                    times(a,b);
                    break;
                case(4):
                    divided(a,b);
                    break;
                case(5):
                    power(a,b);
                    break;
                case(6):
                    mod(a,b);
                    break;
                case(7):
                    calc(a,b);
                    break;
                default:
                    System.out.println("Hatalı bir işlem seçtiniz !");
            }

        }
    }
}
