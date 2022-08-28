package code;
/**
 * [ Inheritance | Turunan ]
 * - Menurunkan Data ke Class Yang Menginherit
 * - Is_A
 * - Jika SuperClass bukanlah SubClass
 * - Jika SubClass adalah SuperClass karena SubClass merupakan turunan dari SuperClass
 * - Karena Type SuperClass tidak sama dengan SubClass
 * - Jika SubClass Type dari SuperClass
 * - SubClass Is_A SuperClass
 * [ Type Inheritance ]
 * - Single Inheritance
 * - Multilevel Inheritance
 * - Hierarchical Inheritance
 * - Multiple Inheritance
 * - Hybrid Inheritance
 */
 
 // SuperClass | ParentClass | BaseClass
 class Animal {
 	String name = "Animal";
 	
 	void display() {
 		System.out.println("Ini Super Class");
 		System.out.println(this.name);
 	}
 	
 	void getName() {
 		System.out.println(this.name);
 	}
 }
 
 // SubClass | ChildClass | DerivedClass
 // @extends | keyword untuk inheritance
 class Predator extends Animal {
 	String name = "Predator";
 	
 	void showName() {
 		System.out.println(this.name);
 	}
 }
 
 public class InheritanceApp {
 	
 	public static void main(String[] args) {
 		
 		Animal animal1 = new Animal();
 		animal1.display();
 		
 		Predator predator1 = new Predator();
 		predator1.display(); // Walaupun di Class Predator tidak ada Method display() tetap bisa menggunakan Method display()
 							 // karena Method sudah di turunkan ke Sub Class
 		predator1.getName();
 		predator1.showName();
 		
 	}
 }