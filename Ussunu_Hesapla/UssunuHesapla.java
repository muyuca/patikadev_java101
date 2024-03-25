package Ussunu_Hesapla;
import java.util.Scanner;
public class UssunuHesapla {
    public static void main(String[] arg){
        Scanner kb = new Scanner(System.in);
        int k,b;
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        k = kb.nextInt();
        System.out.print("Üs olan sayıyı giriniz: ");
        b = kb.nextInt();
        int total = 1 ;
        for(int i = 1;i<=b;i++){
            total*=k;
        }
        System.out.println("Sonuç: "+total);
    }
}
