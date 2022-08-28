package code;
/**
 * [ InnerClass | NestedClass ]
 * - Class yang di dalamnya ada Class juga
 */
 
class Vehicle {
	public String name;
	private String brand;
	protected double price;
	
	Vehicle(String name, String brand, double price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	/* AccessModifier class NameClass */
	public class Favorite {
		/* Bisa juga menambahkan Attribute dan Constructor dll */
		
		public void display() {
			System.out.println(name); // Access Attribute public
			System.out.println(brand); // Access Attribute private
			System.out.println(price); // Access Attribute protected
		}
	}
}

public class InnerClass {
	
	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Vehicle(
			"Lamborgini", "Lamborgini", 1_000_000_000
		);
		
		// Access Method display in Class Favorite
		// vehicle1.display(); // tidak bisa karena Method display() berada di Class Favorite
		
		// Cereate Object from Class Favorite
		Vehicle.Favorite favorite1 = vehicle1.new Favorite();
		favorite1.display();
		
	}
}