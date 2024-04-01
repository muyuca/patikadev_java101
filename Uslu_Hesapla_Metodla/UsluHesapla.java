package Uslu_Hesapla_Metodla;
import java.util.Scanner;
public class UsluHesapla {
    public static Scanner input = new Scanner(System.in);
    public static int usHesapla(int a,int b){
        if(b==0){
            return 1;
        }
        int result = 1;
        for(int i=1;i<=b;i++){
            result *= a;
        }
        return result;
    }
    public static void main(String[] arg){
        System.out.println("ÜSLÜ SAYI HESAPALAMA HOŞGELDİNİZ ");
        System.out.print("İlk sayıyı giriniz: ");
        int ilk = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int iki = input.nextInt();
        System.out.println("Üslü işlemin sonucu : "+usHesapla(ilk,iki));
    }
}
