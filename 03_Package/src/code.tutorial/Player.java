package code.tutorial;

public class Player {
	String name;
	
	Player(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	void display() {
		System.out.println("Player name : "+this.name);
	}
	
	
}