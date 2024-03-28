package Mukemmel_Sayi;
import java.util.Scanner;
public class MukemmelSayi {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] arg){
        System.out.print("Bir sayı giriniz:");
        int num = input.nextInt();
        int sum=0;
        for (int i = 1 ; i<num;i++){
            if(num%i==0){
                sum +=i;
            }
        }
        if (sum == 0 || sum!=num){
            System.out.println(num+" Mükemmel sayı değildir.");
        }
        else{
            System.out.println(num+" Mükemmel sayıdır.");
        }

    }
}
