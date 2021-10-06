package tictactoe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String game_canva = scanner.nextLine();
       int j = 0; 
       System.out.println("---------");
       for(int i = 0; i < game_canva.length(); i++) {
           if(j == 3) {
               System.out.println("");
               j = 0;
            } else { 
                System.out.println("| "+ game_canva.charAt(i) + " "+ game_canva.charAt(i) + " "+game_canva.charAt(i) +" |");
            }
            j++;
       }
       System.out.println("---------");
    }class Implement {
    
}
