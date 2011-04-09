package consoleReader;

import java.util.InputMismatchException;

/**
 * Created by IntelliJ IDEA. User: adio Date: 4/5/11 Time: 4:11 PM To change this template use File | Settings | File
 * Templates.
 */
public class Main {
    public static void main(String args[]) {

        ConsoleReader read = new ConsoleReader();
        System.out.println("Enter String:");
        System.out.println("String Entered:" + read.readString());
        //user may enter string,float or char instead of integer value.
        try {
            System.out.println("Enter Integer:");
            System.out.println("Integer Entered:" + read.readInt());

        } catch (InputMismatchException wrongInput) {
            System.err.println("Enter Integers only!");
            wrongInput.printStackTrace();
        }

        System.out.println("Enter Character:");
        System.out.println("Char Entered:" + read.readChar());
        try {
            System.out.println("Enter Float:");
            System.out.println("Float Entered:" + read.readFloat());

        } catch (InputMismatchException wrongInput) {
            System.err.println("Enter Float values only!");
            wrongInput.printStackTrace();

        }


    }
}
