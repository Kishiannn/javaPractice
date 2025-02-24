import java.util.Scanner;
    

public class MyGame {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose Gamemode "
                + "\n 1 Easy Mode"
                + "\n 2 Medium Mode"
                + "\n 3 Hard Mode"
                + "\n");
        int difficulty = 0;
        difficulty = scan.nextInt();
        
        
        if(difficulty < 4){
            switch (difficulty){
                case 1: 
                    System.out.println("Easy Mode");
                    break;
                case 2: 
                    System.out.println("Medium Mode");
                    break;
                case 3: 
                    System.out.println("Hard Mode");
                    break;
            }
        }else{
            System.out.println("The Game mode is not available");
        }
    }
    
}
