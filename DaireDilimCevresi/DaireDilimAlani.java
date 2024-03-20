package DaireDilimCevresi;
import java.util.Scanner;
public class DaireDilimAlani {
    public static void main(String[] arg){
        Scanner giris = new Scanner(System.in);
        System.out.print("Lütfen daire yarıçapını girin: ");
        int yaricap = giris.nextInt();
        double pi = 3.14;
        System.out.print("Lütfen merkez açısını girin");
        int merkezaci = giris.nextInt();
        double alan = (pi*(yaricap*yaricap)*merkezaci) / 360;
        System.out.println("Yarıçapı "+yaricap+", merkez açısının ölçüsü "+ merkezaci+" olan daire diliminin alanı: "+alan);


    }

}
