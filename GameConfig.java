/** Gameconfig function
print the details of the game such as limit and number of hints 
**/


import java.util.Random;

class GameConfig{
private final int MIN=1;
private final int MAX=100;
private final int MAX_ATTEMPTS=7;
private final int MAX_HINTS=3;
int targetnumber;
public GameConfig() {
    Random random=new Random();
    this.targetnumber=random.nextInt(MAX-MIN+1)+MIN;
	
}
//displays the target
public int getTargetNumber(){
    return targetnumber;
}
//display the max attempt sof the user 
public int getMaxattempts(){
    return MAX_ATTEMPTS;
}
//display the max hint sthe user have
public int getMaxhints(){
    return MAX_HINTS;
}
//display the rules of the game
public void showrules(){
    System.out.println("guess a number between " +MIN+ "&"+MAX);
    System.out.println("You have"+MAX_ATTEMPTS+"attempts");
    System.out.println("Hints will be provided after wrong answers");

}
}
