package code;
/**
 * - Keyword
 * Public  | attribute/method dengan keyword public diwariskan, namun tidak boleh mengurangi visibility nya
 * Private | attribute/method dengan keyword private diwariskan namun tidak dapat diakses oleh SubClass
 * Final   | attribute/method dengan keyword final diwariskan namun tidak bisa di override. namun bisa di overload di dalam class
 * 
 */
class Hero {
	final String type;
	public String name;
	private int health;
	
	Hero(String nameInput, int healthInput, String typeInput) {
		this.name = nameInput;
		this.health = healthInput;
		this.type = typeInput;
	}
	
	// tidak bisa karena attribute final
	// public void setType(String type) {
	//     this.type = type;
	// }
	
	// @final | method sudah final, maka tidak bisa di override
	final void setName(String newName) {
		this.name = newName;
	}
	
	// Overload | Overloading Final Method
	final void setName() {
		System.out.println("ini me overload method final");
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public void display() {
		System.out.println("type: "+this.type);
		System.out.println(this.name + " mempunyai health: " + this.health);
	}
	
}

class Mage extends Hero {
	
	Mage(String nameInput, int healthInput, String typeInput) {
		super(nameInput, healthInput, typeInput);
	}
	
	// tidak bisa override karena method final
	// final void setName(String newName) {
	//     this.name = newName;
	// }
	
	@Override
	// void display() { -> error karena pada Super Class Method public
	public void display() { // -> harus menggunakan keyword public
		// @this.health | tidak bisa dipanggil karena private
		// System.out.println(this.name + " mempunyai health: " + this.health);
		System.out.println("type: "+this.type);
		System.out.println(this.name + " mempunyai health: " + super.getHealth());
	}
}

public class KeywordApp {
	
	public static void main(String[] args) {
		
		Hero hero1 = new Hero("Kipli", 100, "Super Class");
		Mage hero2 = new Mage("Kagura", 50, "Sub Class");
		
		hero1.display();
		hero2.display();
		
		hero1.setName("Jamet");
		hero2.setName("Tehyung");
		
		hero1.display();
		hero2.display();
		
		hero1.setName();
		
		// hero1.setType("empty"); -> tidak bisa dilakukan karena attribute final
		
	}
}