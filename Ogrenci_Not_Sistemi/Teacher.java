package Ogrenci_Not_Sistemi;

public class Teacher {
    String name;
    String mpno;
    String branc;

    Teacher(String name,String branc,String mpno){
        this.name =name;
        this.mpno=mpno;
        this.branc=branc;
    }
    public void print(){
        System.out.println("Adı: " + this.name);
        System.out.println("Bölümü: "+this.branc);
        System.out.println("Telefonu: "+ this.mpno);
    }
}
