package Boks_Maci;

public class BoksMaciMain {
    public static void main(String[] arg){
        Fighter f1 = new Fighter("Ali",20,200,80,60);
        Fighter f2= new Fighter("mC T",30,200,80,35);
        Match match = new Match(f1,f2,70,90);
        match.run();


    }
}
