package Fabrika_Calisanlari;

public class Employee {
    private String name;
    private int salary;
    private int workHours;
    private int hireYear;

    public Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    public double tax(){
        if(this.salary<1000){
            return 0;
        }
        else{
            return this.salary*0.03;
        }
    }
    public int bonus(){
        if(this.workHours>40){
            return (this.workHours-40)*30;
        }
        else{
            return 0;
        }
    }
    public double raiseSalary(){
        if(2021-this.hireYear<10){
            return (this.salary)*0.05;
        }
        else if((2021-this.hireYear)>=10 && (2021-this.hireYear<20)){
            return this.salary*0.1;
        }
        else{
            return this.salary*0.15;
        }
    }
    public String toString(){
        return "Adı :" + this.name +
                "\nMaaşı :" +this.salary +
                "\nÇalışma saati :"+ this.workHours+
                "\nBaşlangıç yılı :" +this.hireYear+
                "\nVergi :"+tax()+
                "\nVergi ve Bonuslar ile beraber maaş:"+(this.salary+bonus()-tax())+
                "\nToplam maaş : "+(this.salary+bonus()+raiseSalary()-tax());
    }
}
