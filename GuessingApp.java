/** 
 * Guessing app - use case 2 : game initilaistion and the user input 
 * application entry point
 @author Harsheen
 @version 2.0
 */

public class GuessingApp{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("welcome to guessing game");
        GuessingApp game=new GuessingApp();
        GameConfig.showrules();
        
        int attempts=0;
        //loop for user input until he reaches max attempts
        while(attempts<GameConfig.MAX_ATTEMPTS){
            System.out.print("enter the guess\t");
            attempts++;
            int guess=sc.nextInt();
            //validate if the user guess is between 1 and 100
            int valid= game.validateguess(guess,game.targetnumber);
            //exit the loop if the user entry is right
            if(valid==1){
                break;
    }
    }
}
}
