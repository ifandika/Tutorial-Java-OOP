package code;
/**
 * [ Enum ]
 * - sebuah tempat untuk menyimpan variabel konstanta
 * - biasanya menggunakan huruf UpperCase
 */
enum Level {
	EASY,
	MEDIUM,
	HARD
}

public class EnumApp {
	
	public static void main(String[] args) {
		
		// create object from enum
		Level player1 = new Level.MEDIUM;
		
		if(player1 == "EASY") {
			System.out.println("Your level is EASY");
		}
		else if(player1 == "MEDIUM") {
			System.out.println("Your level is MEDIUM");
		}
		else if(player1 == "HARD") {
			System.out.println("Your level is HARD");
		}
		
	}
}