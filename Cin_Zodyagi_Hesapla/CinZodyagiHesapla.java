package Cin_Zodyagi_Hesapla;
import java.util.Scanner;
public class CinZodyagiHesapla {
    public static void main(String[] arg){
        System.out.println("Çin Zodyağı Hesaplamaya Hoşgelidniz ");
        Scanner input = new Scanner(System.in);
        String cinZodyagi= "";
        int dogumYili;
        boolean isError= false;
        System.out.print("Lütfen doğum tarihinizi giriniz : ");
        dogumYili = input.nextInt();
        if ((dogumYili>=1900)&&(2024>=dogumYili)){
            if(dogumYili%12==0){
                cinZodyagi = "Maymun";
            }
            else if(dogumYili%12==1){
                cinZodyagi = "Horoz";
            }
            else if(dogumYili%12==2){
                cinZodyagi = "Köpek";
            }
            else if(dogumYili%12==3){
                cinZodyagi = "Domuz";
            }
            else if(dogumYili%12==4){
                cinZodyagi = "Fare";
            }
            else if(dogumYili%12==5){
                cinZodyagi = "Öküz";
            }
            else if(dogumYili%12==6){
                cinZodyagi = "Kaplan";
            }
            else if(dogumYili%12==7){
                cinZodyagi = "Tavşan";
            }
            else if(dogumYili%12==8){
                cinZodyagi = "Ejderha";
            }
            else if(dogumYili%12==9){
                cinZodyagi = "Yılan";
            }
            else if(dogumYili%12==10){
                cinZodyagi = "At";
            }
            else if(dogumYili%12==11){
                cinZodyagi = "Koyun";
            }
        }
        else{
            isError=true;
        }
        if (isError){
            System.out.println("Hatalı giriş yaptınız !!");
        }
        else{
            System.out.println("Çin zodyağı Burcunuz : "+cinZodyagi);
        }
    }
}
