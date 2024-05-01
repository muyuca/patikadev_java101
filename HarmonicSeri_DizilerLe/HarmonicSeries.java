package HarmonicSeri_DizilerLe;
import java.util.Scanner;

public class HarmonicSeries {
    public static Scanner kb = new Scanner(System.in);
    public static void main(String[] arg){
        System.out.print("Hesaplamak istediğiniz harmoic sayısının n değerini giriniz : ");
        int n = kb.nextInt();
        double[] harmonic = new double[n];
        double sum = 0.0;
        for(int i = 0;i < harmonic.length;i++){
            harmonic[i] = 1.0/(i+1) ;
        }
        for(int j = 0; j < harmonic.length; j++){
            sum += harmonic[j];
        }
        System.out.println(sum);

    }
}
