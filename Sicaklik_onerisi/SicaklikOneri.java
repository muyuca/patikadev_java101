package Sicaklik_onerisi;
import java.util.Scanner;
public class SicaklikOneri {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık değerini giriniz:");
        int heat = input.nextInt();
        if (heat<5){
            System.out.println("Kayak yapmaya gidebilirsiniz");
        }
        else if (heat <= 25){
            if (heat <= 15){
                System.out.println("Sinemaya gidebilirsiniz");
            }
            if (heat >= 10) {
                System.out.println("Pikniğe gidebilirsiniz");
            }
        else {
                System.out.println("Yüzmeye gidebilirsiniz");
            }
        }


    }

}
