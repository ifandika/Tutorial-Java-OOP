package code;

class Hero {
	private String name;
	private int health;
	
	Hero(String name, int health) {
		this.name = name;
		this.health = health;
	}
	
	public void allDisplay() {
		System.out.println(this.name);
		System.out.println(this.health);
	}
	
}

class Support extends Hero {
	public final String type;
	
	public Support(String name, int health) {
		super(name, health);
		this.type = "Support";
	}
	
	public void getType() {
		System.out.println(this.type);
	}
}

public class ObjectCastingApp {
	
	public static void main(String[] args) {
		
		Support hero1 = new Support("Vrindavan", 100);
		
		hero1.allDisplay();
		
		// casting ke atas
		Hero hero2 = (Hero)hero1; // hero1 akan di casting menjadi Hero
		
		hero2.allDisplay();
		// System.out.println(hero2.getType()); // tidak bisa karena class Hero tidak ada method getType()
		
		// casting ke bawah
		Hero hero3 = new Hero("Jamet", 200);
		hero3.allDisplay();
		
		// casting (Hero)hero3 -> (Support)hero4
		// Support hero4 = (Support)hero3; -> tidak bisa casting dari SuperClass -> SubClass
		// 								-> kecuali sebelumnya dari SubClass pernah Casting ke SuperClass
		
		// hero4.allDisplay();
		// hero4.getType();
		
		// casting kembali
		// casting (Hero)hero2 -> (Support)hero4 "Sebelumnya sudah pernah casting"
		Support hero4 = (Support)hero2; // -> bisa dilakukan
		
		hero4.allDisplay();
		hero4.getType();
		
	}
}