//function to validate the user guess
class GuessValidator{
public static int validateguess(int guess, int target){
    if(target==guess){ //return 1 if the user input is same as target
        System.out.println("Correct Guess");
        return 1;
    }
    else if(target>guess){ //return string go high if the user input is less than target
        System.out.println(" GO HIGH");
        return 0;
    }
    else if(target<guess){ ////return string go low if the user input is more than target
        System.out.println("GO LOW");
        return 0;
    }
return 0;
}
}
