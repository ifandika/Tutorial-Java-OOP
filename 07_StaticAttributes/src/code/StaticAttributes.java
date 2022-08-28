package code;

class Hero {
    // static attributes : menempel pada class dan bisa dipanggil
    //                     langsung dari class
    static String type = "Hero";
    private String name;
    
    Hero(String name) {
        // Hero.name = name; // tidak bisa karena attribute tidak static
        this.name = name;
    }
    
    
  
    void setType(String typeInput) {
        // type = typeInput;
        // this.type = typeInput;
        Hero.type = typeInput; // karena attribute static maka bisa menggunakan nama class
    }
    
    void displayName() {
        System.out.println(this.name);
    }
    
}

public class StaticAttributes {
    
    public static void main(String[] args) {
        
        Hero hero1 = new Hero("Madang");
        Hero hero2 = new Hero("Jusep");
        
        hero1.displayName();
        hero2.displayName();
        
        // memanggil langsung attributes yang static
        System.out.println(Hero.type);
        
        // merubah
        Hero.type = "Heroes"; // tidak danjurkan
        System.out.println(Hero.type);
        System.out.println(hero1.type);
        System.out.println(hero2.type);
        
        hero1.setType("Hero Es");
        System.out.println(Hero.type);
        System.out.println(hero1.type);
        System.out.println(hero2.type);
        
    }
}