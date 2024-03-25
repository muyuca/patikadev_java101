package GirilenSayinin_Katsayisi;
import java.util.Scanner;

public class KatSayiHesapla {
    public static void main(String[] arg){
        Scanner kb = new Scanner(System.in);
        System.out.print("Sınır sayıyı giriniz: ");
        int n = kb.nextInt();
        System.out.print("4 ün kuvvetler : ");
        for(int i = 1;i<=n;i*=4){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("5'in kuvvetleri :");
        for(int j = 1;j<=n;j*=5){
            System.out.print(j+" ");
        }
    }

}
