package consoleReader;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Reads and return users input . Created by IntelliJ IDEA. User: adio Date: 4/5/11 Time: 4:12 PM To change this
 * template use File | Settings | File Templates.
 */
public class ConsoleReader {
    //object Scanner , scans users input .
    private Scanner input = new Scanner(System.in);

    /**
     * Returns String values returned by Scanner object ;
     *
     * @return users String input;
     */
    public String readString() {
        return this.input.next();
    }

    /**
     * Returns integer values returned by Scanner object ;
     *
     * @return users int input;
     * @throws InputMismatchException
     */

    public int readInt() {
        return this.input.nextInt();

    }

    /**
     * Returns the first character from users input string
     *
     * @return users char input ;
     */
    public char readChar() {
        String inputString = this.input.next();
        return inputString.charAt(0);
    }

    /**
     * Returns float values returned by Scanner object ;
     * @return
     * @throws InputMismatchException
     */
    public float readFloat() {
        return this.input.nextFloat();
    }
}
