package code;

import java.util.ArrayList;

class Player {
    // static method : method yang bisa dipanggil tampa harus membuat object dari
    //                 class itu sendiri
    public String name;
    static int totalPlayer;
    private static ArrayList<String> nameList = new ArrayList<String>();
    
    Player(String name) {
        this.name = name;
        nameList.add(this.name);
        Player.totalPlayer++;
    }
    
    static void showTotalPlayer() {
        System.out.println(Player.totalPlayer);
    }
    
    static ArrayList<String> displayAllName() {
        return Player.nameList;
    }
    
    
}

public class StaticMethod {
    
    public static void main(String[] args) {
        
        Player player1 = new Player("Iron Man");
        Player player2 = new Player("Thor");
        
        Player.showTotalPlayer(); // bisa karena method static
        
        System.out.println(Player.displayAllName()); // disarankan
        System.out.println(player1.disarankan()); // tidak disarankan namun bisa dilakukan
        
    }
    
    
}