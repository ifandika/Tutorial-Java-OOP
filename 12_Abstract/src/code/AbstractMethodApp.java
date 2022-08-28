package code;

abstract class Hero {
	private String name;
	private int level;
	
	Hero(String name) {
		this.name = name;
		this.level = level;
	}
	
	public void display() {
		System.out.println(this.name);
		System.out.println(this.level);
	}
	
	// method abstract | harus di implementasikan pada SubClass nya
	public abstract void levelUp();
	
	public void setAddLevel(int value) {
		this.level += value;
	}
}

class Maksman extends Hero {
	
	Maksman(String name) {
		super(name);
	}
	
	// implementasi method abstract
	public void levelUp() {
		this.setAddLevel(1);
	}
}

public class AbstractMethodApp {
	
	public static void main(String[] args) {
		
		Maksman hero1 = new Maksman("Moskow");
		
		hero1.display();
		
		hero1.levelUp();
		hero1.levelUp();
		
		hero1.display();
		
	}
}