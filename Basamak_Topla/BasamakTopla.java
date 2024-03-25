package Basamak_Topla;
import java.util.Scanner;
public class BasamakTopla {
    public static void main(String[] arg){
        Scanner kb = new Scanner(System.in);
        int total=0;
        System.out.print("Basamaklarını toplamak isteğiniz sayıyı giriniz: ");
        int input= kb.nextInt();
        while (input>0){
            total += input%10;
            input /=10;

        }
        System.out.println("Basamak toplamları : " + total);
    }
}
