package Tek_Sayilari_Topla;
import java.util.Scanner;
public class TekSayilariTopla {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int num,sum=0;
        do{
            System.out.print("Lütfen bir sayı giriniz");
            num = input.nextInt();
            if (num%4==0){
                sum +=num;
            }
        }while(num%2==0);
        System.out.println("4 e tam bölünen sayıların toplamı : "+sum);
    }
}
