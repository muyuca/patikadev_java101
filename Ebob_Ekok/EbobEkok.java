package Ebob_Ekok;
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int n2 = input.nextInt();
        int ebob=1,ekok=1,i=1,j;
        while(i<=(n1*n2)){
            if(i%n1==0&&i%n2==0){
                ekok = i;
                break;
            }
            i++;
        }
        if(n1<n2){
            j=n1;
            while(j>=1){
                if(n1%j==0 && n2%j==0){
                    ebob=j;
                    break;
                }
                j--;
            }
        }
        else if(n1>n2){
            j=n2;
            while(j>=1){
                if(n1%j==0 && n2%j==0){
                    ebob=j;
                    break;
                }
                j--;
            }
        }
        else{
            ebob=n1;

        }
        System.out.println("Girdiğiniz "+n1+" ve "+n2+" sayılarının eboku: "+ebob+" ekoku: "+ekok);

    }
}
