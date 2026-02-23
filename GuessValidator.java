class GuessValidator{
public int validateguess(int guess, int target){
    if(target==guess){
        System.out.println("correct");
        return 1;
    }
    else if(target>guess){
        System.out.println("HIGH");
        return 0;
    }
    else if(target<guess){
        System.out.println("LOW");
        return 0;
    }
return 0;
}
}