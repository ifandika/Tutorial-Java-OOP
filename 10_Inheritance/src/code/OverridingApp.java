package code;
/**
 * [ Overriding | Override ]
 * - Mendahulukan Sebuah Method Untuk Di Panggil
 * - Kebanyakan Menggunakan Anotasi @Override
 */
class Language {
	String name;
	
	Language(String nameInput) {
		name = nameInput;
	}
	
	void display() {
		System.out.println("Class Language");
		System.out.println(this.name);
	}
}

class Jowo extends Language {
	
	Jowo(String nameInput) {
		super(nameInput);
	}
	
	@Override // Anotasi | Optional | Namun Disarankan | Me Overriding Method Display Pada Class Language
	void display() {
		System.out.println("Class Jowo");
		System.out.println(this.name);
	}
}

class Jepun extends Language {
	
	Jepun(String nameInput) {
		super(nameInput);
	}
	
	// tidak ada method display, maka akan mengambil method display di Super Class
}

public class OverridingApp {
	
	public static void main(String[] args) {
		
		Language language1 = new Language("Internasional");
		Jowo language2 = new Jowo("Jowonese");
		Jepun language3 = new Jepun("Jepun");
		
		language1.display(); // akan mengambil pada classnya sendiri
		language2.display(); // akan mengambil pada classnya sendiri
		language3.display(); // akan mengambil pada Super Class
		
	}
}