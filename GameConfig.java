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
public int getTargetNumber(){
    return targetnumber;
}
public int getMaxattempts(){
    return MAX_ATTEMPTS;
}

public int getMaxhints(){
    return MAX_HINTS;
}
public void showrules(){
    System.out.println("guess a number between " +MIN+ "and"+MAX);
    System.out.println("You have"+MAX_ATTEMPTS+"attempts");
    System.out.println("Hints will be provided after wrong answers");

}
}

