package _3ve4_bolunen_sayilar;
import java.util.Scanner;
public class BolunenSayilerinOrtalamasi {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int sayi,cnt=0,toplam=0;
        System.out.print("Bir sayi giriniz:");
        sayi = input.nextInt();
        System.out.print("0'dan "+sayi+"'ya kadar 3 ve 4'de tam bölünen sayılar : ");
        for (int i=0; i<=sayi ;i++){

            if(i!=0 && i%3==0 && i%4==0){
                cnt++;
                System.out.print(i+" ");
                toplam +=i;

            }

        }
        System.out.println();
        double ortalama = toplam / cnt;
        System.out.println("Ortalaması: "+ortalama);
    }
}
