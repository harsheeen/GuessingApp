/** 
 * Guessing app - use case 4 : game initilaistion + user input + hint + validateinput
 * application entry point
 * no user entry
 */

public class GuessingApp{
    public static void main(){
    Scanner sc=new Scanner(System.in);
    System.out.println("welcome to guessing game");
    GuessingApp game=new GuessingApp();
    game.showrules();
    int attempts=0;
    int hint=0;
    while(attempts<game.MAX_ATTEMPTS){
    System.out.print("enter the guess\t");
    attempts++;
    hint++;
    int guess=sc.nextInt();
    guess=ValidateInput.validainput(guess);
    int valid= game.validateguess(guess,game.targetnumber);
    if(valid==1){
        break;
    }
    System.out.println(game.generatehint(hint));
    }
}
}