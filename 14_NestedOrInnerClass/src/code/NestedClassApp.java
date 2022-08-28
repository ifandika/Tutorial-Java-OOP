package code;
/**
 * - Nested Class -> Static Class in Class
 */
 
 import java.util.Arrays;
 
/* -> NestedClass biasanya digunakan pada Class Utama
class Car {
	private String[] available = {
		"Galardo", "Ferari", "Audi"
	};
	private static String[] soldOut = {
		"BMV", "Mustang", "Corvet"
	};
	
	public static class Stock {
		public void seeAll() {
			// System.out.println(this.soldOut); // error
			System.out.println(available); // error -> cannot access non-static
			
			System.out.println(soldOut);
		}
	}
}
*/
public class NestedClassApp {
	// Attribute private dapat di akses
	private String[] available = {
		"Galardo", "Ferari", "Audi"
	};
	private static String[] soldOut = {
		"BMV", "Mustang", "Corvet"
	};
	
	public static class Stock {
		public void seeAll(NestedClassApp data) {
			// System.out.println(this.soldOut); // error
			// System.out.println(available); // error -> cannot access non-static
			// System.out.println(NestedClassApp.available);
			System.out.println(Arrays.toString(data.available)) ;
			System.out.println(Arrays.toString(soldOut));
		}
	}
	
	public static void main(String[] args) {
		
		// tidak perlu membuat object dari Class Car
		Stock stock1 = new Stock();
		
		// membuat object NestedClassApp sebagai perantara akses Attribute static
		NestedClassApp bridge = new NestedClassApp();
		stock1.seeAll(bridge);
		
	}
}