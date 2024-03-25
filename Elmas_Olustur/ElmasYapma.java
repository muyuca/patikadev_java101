package Elmas_Olustur;
import java.util.Scanner;
public class ElmasYapma {
    public static void main(String[] arg){
        Scanner kb= new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int n = kb.nextInt();
        int yildizSayisi=1;
        for(int i=1;i<=n;i++){
            for(int k =1 ; k<=(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=yildizSayisi;j++){
                System.out.print("*");
            }
            yildizSayisi+=2;
            System.out.println();
        }
        yildizSayisi-=2;
        for (int x = 1; x<=n-1; x++){
            for(int y= 1;y<=x;y++){
                System.out.print(" ");
            }
            yildizSayisi-=2;
            for(int z=1;z<=yildizSayisi;z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
