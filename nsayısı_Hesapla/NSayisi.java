package nsayısı_Hesapla;
import java.util.Scanner;

public class NSayisi {
    public static Scanner kb = new Scanner(System.in);
    public static void nHesapla(int n){
        nHesaplaY(n,n);
    }
    public static void nHesaplaY(int n,int a){
        if(a>0){
            System.out.print(a+" ");
            a -=5;
            nHesaplaY(n,a);
        }
        else{
            nHesaplaA(n,a);
        }
    }
    public static void nHesaplaA(int n,int a){
        if(a<=n){
            System.out.print(a+" ");
            a +=5;
            nHesaplaA(n,a);
        }
    }
    public static void main(String[] arg){
        System.out.print("N sayısı : ");
        int n = kb.nextInt();
        nHesapla(n);

    }
}
