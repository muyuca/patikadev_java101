package Basamak_Sayisina_Yildiz;
import java.util.Scanner;
public class YildizUcgen {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] arg){
        System.out.print("Basamak sayısını giriniz:");
        int num = input.nextInt();

        for (int i=num;i>=0;i--){
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
