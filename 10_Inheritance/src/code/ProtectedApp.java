package code;

abstract class Hero {
	// protected bisa untuk Attribute dan Method
	protected String name; // bisa di akses langsung oleh SubClass saja
	private int level;
	
	Hero(String name) {
		this.name = name;
		this.level = 1;
	}
	
	protected int getLevel() {
		return this.level;
	}
	
	// method protected bisa di Override
	protected void display() {
		System.out.println(this.name);
		System.out.println(this.level);
	}
	
	public void setAddLevel(int value) {
		this.level += value;
	}
	
	protected abstract void levelUp();
	
}

class Assasin extends Hero {
	
	public Assasin(String name) {
		super(name);
	}
	
	@Override
	public void display() {
		System.out.println("name : "+this.name); // mengakses Attribute protected
		System.out.println("level: "+this.getLevel()); // mengakses Attribute protected
	}
	
	public void levelUp() {
		this.setAddLevel(1);
	}
	
}

public class ProtectedApp {
	
	public static void main(String[] args) {
		
		Assasin hero1 = new Assasin("Lancelot");
		
		// call protected attribute or method
		// hero1.name; // attribute protected tidak bisa dipanggil
		System.out.println(hero1.getLevel()); // method protected bisa dipanggil
		
		hero1.display();
		
		hero1.levelUp();
		hero1.levelUp();
		hero1.levelUp();
		
		hero1.display();
		
	}
}