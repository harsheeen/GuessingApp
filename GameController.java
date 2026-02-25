import java.util.Scanner;

public class GameController {
    public static boolean GameRestarter(Scanner scanner){
        System.out.println("do you want to play again?");
        return scanner.nextLine().equalsIgnoreCase("yes");
    }
}
