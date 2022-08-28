package code;

class Vehicle {
	String name = "Kendaraan";
	
	String getName() {
		return this.name;
	}
}

class Bus extends Vehicle {
	String name = "Sinar Jaya";
	
	// Super | memanggil method/attribute/dll. pada SuperClass
	
	@Override
	String getName() {
		return this.name;
	}
	
	void display() {
		System.out.println(this.name);
		System.out.println(super.name);
	}
	
	void showName() {
		System.out.println("this  = "+getName());
		System.out.println("super = "+super.getName());
	}
}

public class SuperApp {
	
	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Vehicle();
		Bus bus1 = new Bus();
		
		bus1.display();
		bus1.showName();
		
	}
}