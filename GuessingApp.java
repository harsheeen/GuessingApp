import java.util.Scanner;

/** 
 * Guessing app - use case 4 : game initilaistion + user input + hint + validateinput
 * application entry point
@author Harsheen
@version 4.0
 */

public class GuessingApp{
    public static void main(String[] args)throws ValidateInput {
        Scanner sc=new Scanner(System.in);
        int valid=0;
        System.out.println("welcome to guessing game");
        
        GameConfig game=new GameConfig();
        
        //display the rules
        game.showrules();
        
        int attempts=0;
        int hint=0;
        //loop for user input till it reaches max attempts or user guess the correct input 
        while(attempts<game.getMaxattempts()){
            System.out.print("enter the guess\t");
            
            attempts++; //increment the user attempts
            hint++; //increment the user hint 
            
 // take the user input
            
            int guess=ValidateInput.validainput(sc.nextLine()); //validate the user input 
             valid= GuessValidator.validateguess(guess,game.targetnumber); //valid the guess by displaying "go high" or "go low" or return 1 if the guess is right
            
            if(valid==1){ //user guess correct target
                break;
    }
    System.out.println(HintGenerator.generatehint(hint,game.getTargetNumber()));
    }
    StorageService.saveResult("Player", attempts,(valid==1)?true:false);
}
}
