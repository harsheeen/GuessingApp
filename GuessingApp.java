import java.util.Scanner;

/** 
 * Guessing app - use case 6 : game initilaistion + user input + hint + validateinput + save result in txt + restart 
 * application entry point
@author Harsheen
@version 6.0
 */

public class GuessingApp{

    public static void main(String[] args)throws ValidateInput {
        Scanner sc=new Scanner(System.in);
        boolean restart;
        do{  //loop runs until user enters anything rather than yes
            System.out.println("enter the player name");
            
            String player=sc.nextLine();
        int valid=0;
         System.out.println("**************************");
        System.out.println("* WELCOME TO GUESSING GAME *");
        System.out.println("**************************");
        
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
    restart = GameController.GameRestarter(sc);
}while(restart);
}
}
