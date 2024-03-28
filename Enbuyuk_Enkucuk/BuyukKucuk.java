package Enbuyuk_Enkucuk;
import java.util.Scanner;
public class BuyukKucuk {
    public static void main(String[] arg){
        Scanner input=new Scanner(System.in);
        int big,small;
        System.out.print("Kaç tane sayı gireceksin: ");
        int kactane = input.nextInt();
        System.out.print("1.Sayıyı giriniz:");
        int girilen = input.nextInt();
        big = girilen;
        small = girilen;
        for (int i = 2;i <= kactane;i++){
            System.out.print(i+". sayıyı giriniz: ");
            girilen = input.nextInt();
            if(big <= girilen){
                big = girilen;
            }
            if(small >= girilen){
                small = girilen;
            }
        }
        System.out.println("Girilen en büyük sayı: "+big);
        System.out.println("Girilen en küçük sayı: "+small);
    }
}
