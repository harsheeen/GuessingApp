/** 
 * Guessing app - use case 1 : game initilaistion
 * application entry point
 * no user entry
 @author Harsheen
 @version 1.0
 */

public class GuessingApp{
    public static void main(String[] args) {
    System.out.println("welcome to guessing game");
    GameConfig gameconfig =new GameConfig();
    gameconfig.showrules();
    }
}
