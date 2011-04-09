package consoleReadFileOutput;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA. User: adio Date: 4/4/11 Time: 2:53 AM To change this template use File | Settings | File
 * Templates.
 */
public class Main {
    public static void main(String args[]) {
        //scans the users input .
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file name:");

        //create new WriteToFile object ;
        WriteToFile writer = new WriteToFile(input.next());

        /**
         * call to writeToFile() function witch writes users
         * inout to the created file .
         */
        writer.writeToFile();
        //closeStream closes the stream to the output file ;
        writer.closeStream();
    }
}
