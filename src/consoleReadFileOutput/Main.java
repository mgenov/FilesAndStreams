package consolereadfileoutput;

import java.io.IOException;
import java.util.Scanner;

/** Created by  Adelin Ghanayem (Adio@evo.bg) */
public class Main {
    public static void main(String args[]) {
        //scans the users input .
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file name:");
        //create new ToFileWriter
        ToFileWriter writer = new ToFileWriter();
       // String fileName = input.next();
        System.out.println("[ To terminate the program void (.) ]\nEnter you text:");
        try{
        writer.writeToFile(input,"Adio.txt");
        }
        catch (IOException e){
            e.printStackTrace();

        }


    }
}
