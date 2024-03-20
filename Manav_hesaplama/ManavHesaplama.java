package Manav_hesaplama;
import java.util.Scanner;
public class ManavHesaplama {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.print("Kaç kilo armut aldınız");
        int kilo_armut = in.nextInt();
        System.out.print("Kaç kilo elma aldınız");
        int kilo_elma = in.nextInt();
        System.out.print("Kaç kilo domates aldınız");
        int kilo_domates = in.nextInt();
        System.out.print("Kaç kilo muz aldınız");
        int kilo_muz = in.nextInt();
        System.out.print("Kaç kilo patlıcan aldınız");
        int kilo_patlican = in.nextInt();
        double kg_armut = 2.14;
        double kg_elma = 3.67;
        double kg_domates = 1.11;
        double kg_muz = 0.95;
        double kg_patlican = 5.0;
        double tutar_a=kg_armut*kilo_armut;
        double tutar_e=kg_elma*kilo_elma;
        double tutar_d=kg_domates*kilo_domates;
        double tutar_m=kg_muz*kilo_muz;
        double tutar_p=kg_patlican*kilo_patlican;
        double toplam =tutar_a+tutar_d+tutar_p+tutar_m+tutar_e;
        System.out.println("Toplam tutar: "+ toplam);


    }

}
