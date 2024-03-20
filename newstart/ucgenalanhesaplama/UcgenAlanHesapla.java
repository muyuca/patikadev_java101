package newstart.ucgenalanhesaplama;
import java.util.Scanner;
public class UcgenAlanHesapla {
    public static void main(String[] arg){
        Scanner giris = new Scanner(System.in);
        System.out.print("Birinci kenarı girin");
        int kenar1= giris.nextInt();
        System.out.print("İkinci kenarı girin:");
        int kenar2= giris.nextInt();
        System.out.print("Üçüncü kenarı girin:");
        int kenar3= giris.nextInt();
        double ucgencevresi=kenar1+kenar2+kenar3;
        double u= ucgencevresi/2;
        double alancarpimi= u*(u-kenar1) * (u-kenar2)*(u-kenar3);
        double alan = Math.sqrt(alancarpimi);
        System.out.println("Üçgenin alanı="+alan);

    }
}
