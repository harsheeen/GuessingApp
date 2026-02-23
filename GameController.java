import java.util.Scanner;

public class GameController {
    public static boolean GameRestarter(Scanner scanner){
        System.out.println("do you want to start again?");
        return scanner.nextLine().equalsIgnoreCase("yes");
    }
}
