package Boks_Maci;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    Fighter(String name,int damage,int health,int weight,int dodge){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        this.dodge=dodge;
    }
    int hit (Fighter enemy){
        System.out.println(this.name + " Boksörü " + enemy.name+" Boksörüne "+this.damage+ " hasar vurdu .");
        double random = Math.random()*100;
        if (enemy.dodge > random ){
            System.out.println("---------------"+enemy.name +" Boksörü vuruşu dodgladı ! -------------");
            return enemy.health;
        }
        if(enemy.health-this.damage >= 0){
            return enemy.health-this.damage;

        }
        else {
            return 0;
        }

    }
}
