// function to create a text file and store the results

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class StorageService{

public static void saveResult(String player, int attempts, boolean WIN){
try(
    BufferedWriter writer= new BufferedWriter(new FileWriter("game_results.txt"))){
    writer.write("player:"  + player + ",\t attempts"+attempts+ "\t results"+(WIN?"Win" :"lose"));
    writer.newLine();


    }
catch(IOException e){
    System.out.println("unable to the print game result");
}

}

}