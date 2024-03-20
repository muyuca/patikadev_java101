package Vucut_Kitle_Endeksi;
import java.util.Scanner;
public class VucutKitleEndeksi {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz :");
        double boy = in.nextDouble();
        System.out.print("Lütfen kilonuzu girin :");
        double kilo = in.nextDouble();
        double indeks = kilo / (boy*boy);
        System.out.println("Vücüt kitle indeksiniz :"+indeks);
    }
}
