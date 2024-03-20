package Sinifi_Gecme;
import java.util.Scanner;
public class SinifiGecme {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik;
        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();
        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();
        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();
        System.out.print("Muzik notunuz : ");
        muzik = input.nextInt();
        double avg = (mat+turkce+kimya+fizik+muzik)/5 ;
        if (avg <= 55){
            System.out.println("Sınıfta kaldınız !!");
            System.out.println("Ortalamanız:"+ avg);
        }
        else {
            System.out.println("Tebrikler sınıfı geçtiniz!!");
            System.out.println("Ortalamanız:"+avg);
        }

    }

}
