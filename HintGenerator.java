class HintGenerator{
public String generatehint(int hintcounter){
    if(hintcounter==1)
        return (target%2==0)?"Hint:even number":"Hint:odd number";
    else if(hintcounter==2)
        return (target>50)?"Hint: Number is greater than 50":"Hint:Number is less than 50";
    return "No more hints";
} 
}