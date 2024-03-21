package Sayilari_sirala;
import java.util.Scanner;
public class SayilariSirala {
    public static void main(String[] arg) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin");
        a = input.nextInt();
        System.out.print("ikinci sayıyı girin");
        b = input.nextInt();
        System.out.print("üçüncü sayıyı girin");
        c = input.nextInt();
        if (a > b && a > c) {
            if (b > c) {
                System.out.println("Sayıların büyükten küçüğe doğru sıralanışı: " + a + ">" + b + ">" + c);
            }
            else {
                System.out.println("Sayıların büyükten küçüğe doğru sıralanışı: " + a + ">" + c + ">" + a);
            }
        }
        else if (b > c && b > a) {
            if (a > c) {
                System.out.println("Sayıların büyükten küçüğe doğru sıralanışı: " + b + ">" + a + ">" + c);
            }
            else {
                System.out.println("Sayıların büyükten küçüğe doğru sıralanışı: " + b + ">" + c + ">" + a);
            }
        }
        else if (c > a && c > b) {
            if (b > a) {
                System.out.println("Sayıların büyükten küçüğe doğru sıralanışı: " + c + ">" + b + ">" + a);
            }
            else {
                System.out.println("Sayıların büyükten küçüğe doğru sıralanışı: " + c + ">" + a + ">" + b);
            }
        }
        else {
            System.out.println("Girdiğiniz: "+a + " " + b + " " + c + " Sayıları içinde eşitlik mevcut.Sıralama yapamıyoruz.");
        }


    }
}
