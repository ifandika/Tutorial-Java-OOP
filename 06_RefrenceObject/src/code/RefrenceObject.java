package code;

class Fruit {
    String name;
    String color;
    
    Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }
    
    void displayAllData() {
        System.out.println(this.name);
        System.out.println(this.color);
    }
    
}

public class RefrenceObject {
    
    public static void main(String[] args) {
        
        Fruit fruit1 = new Fruit("Gedang", "Kuneng");
        
        System.out.println("| fruit1");
        fruit1.displayAllData();
        
        // copy object
        //  akan mengirim address, sehingga object fruit2 akan menunjuk address 
        //  dari object fruit1. jika data fruit1 diubah maka data pada fruit2 ikut berubah dan sebaliknya
        Fruit fruit2 = fruit1;
        
        System.out.println("| fruit2");
        fruit2.displayAllData();
        
        // ubah data fruit1
        fruit1.name = "Timun";
        fruit1.color = "Hijjau";
        
        System.out.println("| fruit1");
        fruit1.displayAllData();
        System.out.println("| fruit2");
        fruit2.displayAllData(); // data fruit2 ikut berubah
        
    }
    
    
}