package Ogrenci_Not_Sistemi;

public class Main {
    public static void main(String[] arg){
        Teacher t1 = new Teacher("Mahmut hoca","TRH","0546123213");
        Teacher t2 = new Teacher("Graham Bell","FZK","021312312");
        Teacher t3 = new Teacher("Külyutmaz","BIO","1111");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji","103","BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("İnek şaban","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,78,50);
        s1.isPass();

        Student s2 = new Student("Düdük necmi","124","5",tarih,fizik,biyo);
        s2.addBulkExamNote(50,30,70);
        s2.isPass();

    }
}
