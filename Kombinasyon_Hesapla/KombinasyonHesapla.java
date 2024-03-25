package Kombinasyon_Hesapla;
import java.util.Scanner;

public class KombinasyonHesapla {
    public static void main(String[] arg){
        Scanner kb = new Scanner(System.in);
        System.out.println("KOMBİNASYON HESAPLAMAYA HOŞGELDİNİZ");
        System.out.print("N değerini giriniz: ");
        int n = kb.nextInt();
        int n_faktoriel=1;
        System.out.print("R değerini giriniz: ");
        int r = kb.nextInt();
        int r_faktoriel=1;
        int n_r=n-r;
        int n_r_faktoriel=1;
        int combinasyon;
        for (int i = 1;i<=n;i++){
            n_faktoriel*=i;
        }
        for(int j = 1;j<=r;j++){
            r_faktoriel*=j;
        }
        for(int z = 1;z<=n_r;z++){
            n_r_faktoriel*=z;
        }
        combinasyon=n_faktoriel/(r_faktoriel*(n_r_faktoriel));
        System.out.println("C("+n+","+r+") combinasyon = "+ combinasyon);
    }
}
