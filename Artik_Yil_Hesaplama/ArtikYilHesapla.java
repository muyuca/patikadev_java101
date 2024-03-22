package Artik_Yil_Hesaplama;
import java.util.Scanner;
public class ArtikYilHesapla {
    public static void main(String[] arg){
        Scanner input= new Scanner(System.in);
        int yil;
        System.out.println("Artık yıl hesaplamaya hoşgeldiniz");
        System.out.print("Hesaplamak istediğiniz yılı giriinz:");
        yil = input.nextInt();
        if (yil%100==0){
            if(yil%400==0){
                System.out.println(yil + " Bir artık yıldır !");
            }
            else{
                System.out.println(yil + " Bir artık yıl değldir !");
            }
        }
        else if (yil%4==0){
            System.out.println(yil+" Bir artık yıldır !");
        }
        else {
            System.out.println(yil+" Bir artık yıl değildir!");
        }
    }
}
