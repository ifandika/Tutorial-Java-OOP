package code;

class Food {
	// jika ingin menambah data member/attribute maka kita menambahkannya pada SuperClass
	String name;
	int price;
	
	// constructor kosong
	Food() {
	}
	
	Food(String name) {
		this.name = name;
	}
	
	// constructor bisa lebih dari satu
	Food(String nameInput, int priceInput) {
		this.name = nameInput;
		this.price = priceInput;
	}
}

class NasiGoyeng extends Food {
	// tidak perlu deklarasi attribute karena sudah extends Food
	
	// constructor in SubClass
	NasiGoyeng() {
		// constructor kosong
	}
	
	NasiGoyeng(String name) {
		super(name);
	}
	
	NasiGoyeng(String nameInput, int priceInput) {
		// argument/parameter pada method super bisa lebih dari satu
		super(nameInput, priceInput);
	}
	
	void showAll() {
		System.out.println(this.name);
		System.out.println(this.price);
	}
}

public class ConstructorApp {
	
	public static void main(String[] args) {
		
		Food food1 = new Food("Makanan", 0);
		NasiGoyeng nasiGoyeng1 = new NasiGoyeng("Nasi Goyenggg", 12000);
		
		nasiGoyeng1.showAll();
		
	}
}