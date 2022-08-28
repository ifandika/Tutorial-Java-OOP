package code;
/**
 * [ Encapsulation | Encapsulasi ]
 * - membatasi hak akses untuk sebuah data pada class
 * - Encapsulation erat kaitannya dengan Getter dan Setter
 */
class NoEncapsulation {
	public String name;
	
	
}

class WithEncapsulation {
	private String name;
	
	// merubah data attribute menggunakan Setter
	void setName(String name) {
		this.name = name;
	}
	
	// print data menggunakan Getter
	String getName() {
		return this.name;
	}
	
	
}

public class EncapsulationApp {
	
	public static void main(String[] args) {
		
		NoEncapsulation noEncap = new NoEncapsulation();
		noEncap.name = "Kipli"; // tidak dianjurkan, bukan Encapsulasi
		System.out.println(noEncap.name); // tidak dianjurkan
		
		WithEncapsulation withEncap = new WithEncapsulation();
		// withEncap.name = "jupri"; // tidak bisa karena data private, membatasi hak akses langsung attribute
		withEncap.setName("jupri");
		// System.out.println(withEncap.name; // tidak bisa
		System.out.println(withEncap.getName());
		
	}
	
	
}