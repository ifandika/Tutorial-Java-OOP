package code;

class Motorcycle {
	String name;
	
	Motorcycle(String nameInput) {
		name = nameInput;
	}
	
	
}

class Car {
	// inisialisasi constructor
	// constructor no argument/parameter
	Car() {
		System.out.println("this class car");
	}
	
	
}

public class Constructor {
	
	public static void main(String[] args) {
		
		// create object
		Car car1 = new Car(); // to call constructor
		
		Motorcycle motorcycle1 = new Motorcycle("Kawasaki H2R");
		// print data class Motorcycle
		System.out.println(motorcycle1.name);
		
	}
	
	
}