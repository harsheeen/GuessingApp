/** 
 * Guessing app - use case 1 : game initilaistion
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
    while(attempts<game.MAX_ATTEMPTS){
    System.out.print("enter the guess\t");
    attempts++;
    int guess=sc.nextInt();
    int valid= game.validateguess(guess,game.targetnumber);
    if(valid==1){
        break;
    }
    }
}
}