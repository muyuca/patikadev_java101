package Ucak_Bileti;
import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int mesafe,yas,yolculukTipi;
        double tutar,indirim;
        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı  giriniz : ");
        yas = input.nextInt();
        System.out.print("Yolcukuk tipinizi giriniz (1 => Tek yön , 2 => Gidiş Dönüş) : ");
        yolculukTipi= input.nextInt();
        tutar = mesafe * 0.10;
        Boolean isError = false;
        if(mesafe<=0){
            isError=true;
        }
        if (yas > 0 && yas < 100){
            if (yas < 12){
                indirim =  tutar * 0.50;
                tutar = tutar - indirim;
            }
            else if (yas >=12 && yas <= 24){
                indirim = tutar * 0.10;
                tutar -= indirim;
            }
            else if (yas >=65){
                indirim = tutar * 0.30;
                tutar -= indirim;
            }
        }
        else {
            isError = true;
        }
        if(yolculukTipi==2 || yolculukTipi== 1){
            if(yolculukTipi==2) {
                indirim = tutar * 0.20;
                tutar = (tutar - indirim) * 2;
            }

        }
        else{
            isError = true;
        }
        if (isError){
            System.out.println("Hatalı bir giriş yaptınız! Tekrar deneyiniz.");
        }
        else {
            System.out.println("Toplam tutar : "+ tutar);
        }



    }
}
