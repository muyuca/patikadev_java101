package Asal_mi;
import java.util.Scanner;
public class AsalHesapla {
    public static Scanner kb = new Scanner(System.in);
    public static boolean asalHesapla(int a){
        if(a<=1){
            return false;
        }
        boolean result=true;
        for(int i=2;i<a;i++){
            if(0 == (a % i)){
                result = false;
            }
        }
        return result;
    }
    public static void main(String[] arg){
        System.out.print("Sayı Giriniz : ");
        int a = kb.nextInt();
        if(asalHesapla(a)){
            System.out.println(a+" sayısı ASALDIR !");
        }
        else{
            System.out.println(a+" sayısı ASAL değildir !!");
        }
    }
}
