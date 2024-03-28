package Fibonacci_Serisi_Bul;
import java.util.Scanner;

public class FibonacciBul {
    public static Scanner input=new Scanner(System.in);
    public static void main(String[] arg){
        System.out.print("Kaç elemanlı fibonacci serisi oluşturmak istersiniz: ");
        int eleman= input.nextInt();
        int fibonacci=0;
        int a=1,oldFibonacci;
        System.out.print(fibonacci+" ");
        for (int i=1;i<=eleman;i++){
            oldFibonacci = fibonacci;
            fibonacci+=a;
            System.out.print(fibonacci+" ");
            a=oldFibonacci;

        }
    }
}
