package code;

// create class and object
// default class/public
class Hero {
    // create object in class
    String name;
    int health;
}

public class ClassObject {
    
    public static void main(String[] args) {
        
        // create object from class
        Hero assasin = new Hero();
        // 
        assasin.name = "Assasin";
        assasin.health = 100;
        
        // result
        System.out.printf("Name  : %s\n", assasin.name);
        System.out.printf("Health: %s\n", assasin.health);
        
        // create another object from class Hero
        Hero fighter = new Hero();
        // 
        fighter.name = "Fighter";
        fighter.health = 250;
        
        // result
        System.out.printf("Name  : %s\n", fighter.name);
        System.out.printf("Health: %s\n", fighter.health);
        
    }
}