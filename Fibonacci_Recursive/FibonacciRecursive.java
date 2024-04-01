package Fibonacci_Recursive;
import java.util.Scanner;
public class FibonacciRecursive {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] arg){
        System.out.print("Fibpnacci sayisini bulamak istediğiniz sayıyı girin: ");
        int a = input.nextInt();
        System.out.println("Fibonacci: "+FibonacciFind(a));

    }
    public static int FibonacciFind(int x){
        if(x ==1 || x==2){
            return 1;
        }
        return FibonacciFind(x-1)+FibonacciFind(x-2);
    }
}
