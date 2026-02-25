//function to generate hints if the hint counter is equal to 1 and 2

class HintGenerator{
public static String generatehint(int hintcounter,int target){
    //first hint tells if the number is odd or even
    if(hintcounter==1)
        return (target%2==0)?"Hint:even number":"Hint:odd number";
    //second hint is to define a number if its greater or less than 50
    else if(hintcounter==2)
        return (target>50)?"Hint: Number is greater than 50":"Hint:Number is less than 50";
    // no more hints if the hint counter is above 2
    return "No more hints available";
} 
}
