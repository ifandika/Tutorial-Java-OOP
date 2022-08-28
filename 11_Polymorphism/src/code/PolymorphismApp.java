package code;
/**
 * [ Polymorphism | Banyak Bentuk ]
 * - Object banyak bentunya
 */
class Hero {
	String type = "Hero";
	String name;
	
	Hero(String name) {
		this.name = name;
	}
	
	void attack(Hero enemy /*, typeAttack */) {
		// Contoh dari polymorphism adalah typeAttack dari berbagai hero, karena polymorphism adalah Banyak Bentuk
		// maka typeAttack bisa berbagai macam. Contoh attack dmg, intem, skill dll. dan itulah fungsi dari polymorphism
		// dapat menerima berbagai bentuk data dan seperti itulah mekanisme Hero pada Game
		System.out.println("Menyerang "+enemy);
	}
	
	void display() {
		System.out.println("name  : "+this.name);
		System.out.println("type  : "+this.type);
	}
}

class Fighter extends Hero {
	
	Fighter(String name) {
		super(name);
		this.type = "Fighter";
	}
}

class Mage extends Hero {
	
	Mage(String name) {
		super(name);
		this.type = "Mage";
	}
	
	// method ini hanya bisa dipanggil dari Class Mage Saja
	void message() {
		System.out.println("Hallo Saya Hero Type Mage");
	}
}

public class PolymorphismApp {
	
	public static void main(String[] args) {
		
		Hero hero1 = new Hero("Jupri");
		Fighter hero2 = new Fighter("Kipli");
		
		// Polymorphic
		// @Hero = Type
		// @HeroFighter = Object
		// Bisa dilakukan karena Fighter bertype Hero
		Hero hero3 = new Fighter("Garok");
		// Tidak bisa dilakukan karena Hero tidak bertype Mage
		// Mage hero4 = new Hero("Ora Iso"); tidak bisa
		// Fighter hero5 = new Mage("Ora Iso"); tidak bisa
		Mage hero4 = new Mage("Edora");
		
		hero1.display();
		hero2.display();
		hero3.display();
		hero4.display();
		hero4.message();
		
		// Membuat Arrays List
		Hero[] grubHero = new Hero[4];
		grubHero[0] = hero1; 
		grubHero[1] = hero2; // casting : dari Type Fighter -> Type Hero
		grubHero[2] = hero3;
		grubHero[3] = hero4; // berganti menjadi Type Hero
		
		grubHero[0].display();
		grubHero[1].display();
		grubHero[2].display();
		// grubHero[3].message(); -> tidak bisa karena sudah berganti menjadi Type Hero, 
		//							 dan Type Hero tidak memiliki Method Message()
		
	}
}