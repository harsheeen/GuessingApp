/** 
 * Guessing app - use case 4 : game initilaistion + user input + hint + validateinput
 * application entry point
@author Harsheen
@version 4.0
 */

public class GuessingApp{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to guessing game");
        
        GuessingApp game=new GuessingApp();
        
        //display the rules
        GameConfig.showrules();
        
        int attempts=0;
        int hint=0;
        //loop for user input till it reaches max attempts or user guess the correct input 
        while(attempts<game.MAX_ATTEMPTS){
            System.out.print("enter the guess\t");
            
            attempts++; //increment the user attempts
            hint++; //increment the user hint 
            
            int guess=sc.nextInt(); // take the user input
            
            guess=ValidateInput.validainput(guess); //validate the user input 
            int valid= GuessValidator.validateguess(guess,game.targetnumber); //valid the guess by displaying "go high" or "go low" or return 1 if the guess is right
            
            if(valid==1){ //user guess correct target
                break;
    }
    System.out.println(HintGenerator.generatehint(hint));
    }
}
}
