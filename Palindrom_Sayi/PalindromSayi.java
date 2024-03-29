package Palindrom_Sayi;
import java.util.Scanner;
public class PalindromSayi {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] arg){
        System.out.println("Palindrom hesaplamaya hoşgeldiniz !!!");
        System.out.print("Hesaplamak istediğinix sayıyı giriniz: ");
        int x= input.nextInt();
        if(isPalindrom(x)){
            System.out.println("Girdiğiniz "+x+" palindrom bir sayıdır.");
        }
        else{
            System.out.println("Girdiğiniz "+x+" palindrom bir sayı değildir.");

        }
    }
    public static boolean isPalindrom(int x){
        int temp=x,reverseNum=0,lastNumber;
        while(temp!=0){
            lastNumber=temp%10;
            reverseNum=(reverseNum*10)+lastNumber;
            temp /=10;

        }
        if (reverseNum==x){
            return true;
        }
        else{
            return false;
        }
    }
}
