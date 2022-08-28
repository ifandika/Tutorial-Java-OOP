package code;
/**
 * [ Interface ]
 * - Sebuah Class namun tidak memiliki Keyword Class
 * - Class Abstract dengan Method Abstract
 * - Sebuah Class bisa implements lebih dari 1 Interface
 */
 interface Gender {
	/* interface tidak memiliki Attribute */
 	
 	public void setGender(String genderInput);
 }
 
 interface Person {
	/* interface tidak memiliki Attribute */
	
	public void setName(String nameInput);
}

class Kipli implements Person, Gender {
	private String name;
	private String gender;
	
	public void setName(String nameInput) {
		this.name = nameInput;
	}
	
	public void setGender(String genderInput) {
		this.gender = genderInput;
	}
	
	public void display() {
		System.out.println(this.name);
		System.out.println(this.gender);
	}
}

public class InterfaceApp {
	
	public static void main(String[] args) {
		
		Kipli kipli1 = new Kipli();
		kipli1.setName("Kipliiii");
		kipli1.setGender("Male");
		
		kipli1.display();
	}
}