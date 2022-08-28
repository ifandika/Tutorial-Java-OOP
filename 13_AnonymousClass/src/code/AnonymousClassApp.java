package code;
/**
 * [ Anonymous ]
 * - Kelas tanpa nama
 * - Sebuah kelas yang dideklarasi saat pembuatan object
 */
interface Car {
	
	public void run();
}

class Race {
	public void start() {
		System.out.println("Starting....");
	}
}

public class AnonymousClassApp {
	
	public static void main(String[] args) {
		
		// daripada membuat class lalu implements mending membuat kelas anonymouse
		Car car1 = new Car() {
			@Override
			public void run() {
				System.out.println("Car is Running");
			}
		}
		
		car1.run();
		
		// membuat object dan membuat ulang method 
		Race race1 = new Race() {
			@Override
			public void start() { // method ini hanya berlaku untuk object race1
				System.out.println("Go Go Go Go Go");
			}
		};
		race1.start();
		
		Race race2 = new Race();
		race2.start();
		
	}
}