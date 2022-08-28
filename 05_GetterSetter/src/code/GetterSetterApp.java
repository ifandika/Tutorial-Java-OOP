package code;
/**
 * Getter -> getData(Untuk mengambil data)
 * Setter -> setData(Untuk meSet data)
 */
class Player {
	private String name = "Jupri"; // data aman hanya bisa di akses dari dalam
	public int height = 100; // bisa di akses dari luar kelas maka data tidak aman
	
	public void display() {
		System.out.println(this.name); // tidak di anjurkan
		System.out.println(this.height);
	}
	
	// getter
	public String getName() {
		return this.name;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	// setter
	public void setName(String data) {
		this.name = data;
	}
	
	public void setHeight(int data) {
		this.height = data;
	}
}

public class GetterSetterApp {
	
	public static void main(String[] args) {
		
		Player player1 = new Player();
		
		player1.display();
		
		// System.out.println(player1.name);
		player1.height = "Kipli"; // akses langsung ke data
		
		player1.getName();
		player1.getHeight();
		
		player1.setName("Jamet");
		player1.setHeight("Jamet");
		
		player1.display();
	}
}