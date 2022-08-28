package code;
/**
 * [ Abstract Class ] Abstract: sebuah ide yang belum ada bentuk fisiknya
 * - Class tidak dapat dibuat menjadi object
 * 
 */
abstract class Hero {
	// Super Class umumnya tidak dibuat object
	// dan hanya sebagai deklarasi dari attribute,method dll.
	// umumnya SubClass lah yang dibuat sebagai object
	private String name;
	
	public Hero(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("name hero: "+this.name);
	}
}

class Mage extends Hero {
	
	public Mage(String name) {
		super(name);
	}
	
}

public class AbstractClassApp {
	
	public static void main(String[] args) {
		
		// Hero hero1 = new Hero("Kipli"); -> tidak bisa karena class hero adalah class abstract
		Mage hero2 = new Mage("Julianto");
		
		hero2.display();
		
	}
}