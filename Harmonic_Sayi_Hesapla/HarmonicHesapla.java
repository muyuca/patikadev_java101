package Harmonic_Sayi_Hesapla;
import java.util.Scanner;
public class HarmonicHesapla {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        int n= input.nextInt();
        double total = 0 ;
        for(double i=1;i<=n;i++){
            total += 1/i;
        }
        System.out.println("Harmonic serinin sonucu: "+total);
    }
}
