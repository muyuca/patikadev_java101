package Hesap_Makinesi;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] arg){
        int secenek;
        double n1,n2,sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("İLK SAYI GİRİNİZ: ");
        n1 = input.nextDouble();
        System.out.print("İKİNCİ SAYI GİRİNİZ: ");
        n2 = input.nextDouble();
        System.out.println("1-Toplama \n2-Çıkarma \n3-Çarpma \n4-Bölme");
        System.out.print("Seçiminizi yapın");
        secenek = input.nextInt();
        switch (secenek){
            case 1:
                sonuc = n1+n2;
                System.out.println("İşlem sonucunuz = "+ sonuc);
                break;
            case 2:
                sonuc = n1 - n2;
                System.out.println("İşlem sonucunuz = "+ sonuc);
                break;
            case 3:
                sonuc = n1*n2;
                System.out.println("İşlem sonucunuz = "+ sonuc);
                break;
            case 4:
                sonuc = n1 / n2;
                System.out.println("İşlem sonucunuz = "+ sonuc);
                break;
            default:
                System.out.println("1-4 ARASINDA BİR SAYI SEÇMEDİNİZ İŞLEM YAPAMIYORUZ");
        }


    }

}
