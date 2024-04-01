package Ogrenci_Not_Sistemi;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note=0;
    }
    void addTeacher(Teacher teacher){
        if(teacher.branc.equals(this.prefix)){
            this.teacher=teacher;


        }
        else{
            System.out.println("Öğretmen ve ders seçimleri uyuşmuyor ! ");
        }
    }
    void printTeacher(){
        this.teacher.print();
    }

}
