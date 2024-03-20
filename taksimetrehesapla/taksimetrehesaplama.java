package taksimetrehesapla;
import java.util.Scanner;
public class taksimetrehesaplama {
    public static void main(String[] arg){
        Scanner hesapla= new Scanner(System.in);
        System.out.print("Kaç kilometre gittiğinizi yazın=");
        double gidilen = hesapla.nextDouble();
        double artis = 2.20;
        int acilis = 10;
        double taksimetre=acilis+(gidilen*artis);
        taksimetre = (taksimetre<20) ? 20 : taksimetre;
        System.out.println("Toplam ödemeniz gereken tutar:"+ taksimetre);
    }
}
