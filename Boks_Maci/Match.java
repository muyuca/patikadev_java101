package Boks_Maci;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    double randomf1 = Math.random()*100;
    double randomf2 = Math.random()*100;
    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }
    void run(){
        if (isCheck()){
            while (this.f1.health>0 && this.f2.health>0){
                if(this.randomf1 >= this.randomf2){
                    System.out.println("======== YENİ ROUND ===========");

                    this.f2.health=f1.hit(f2);

                    this.f1.health=f2.hit(f1);
                    if(isWin()){
                        break;
                    }
                    printScore();

                }
                else{
                    System.out.println("======== YENİ ROUND ===========");


                    this.f1.health=f2.hit(f1);

                    this.f2.health=f1.hit(f2);
                    if(isWin()){
                        break;
                    }
                    printScore();

                }

            }
        }
        else{
            System.out.println("Sporcuların sikletleri uyuşmuyor !!");
        }

    }
    boolean isCheck(){
        return ((this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight) && (this.f2.weight>=this.minWeight && this.f2.weight <= this.maxWeight));
    }
    boolean isWin(){
        if (this.f1.health == 0 ){
            System.out.println("Maçı kazanan: "+ this.f2.name);
            return true;
        }
        if (this.f2.health==0){
            System.out.println("Maçı kazanan: "+ this.f1.name);
            return true;
        }
        return false;
    }
    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}
