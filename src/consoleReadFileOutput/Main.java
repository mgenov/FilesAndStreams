package consolereadfileoutput;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA. User: adio Date: 4/4/11 Time: 2:53 AM
 */
public class Main {
    public static void main(String args[]) {
        //scans the users input .
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file name:");

        //create new ToFileWriter
        ToFileWriter writer = new ToFileWriter(input.next());

        /**
         * call to writeToFile() function witch writes users
         * inout to the created file .
         */
        writer.writeToFile();


    }
}
