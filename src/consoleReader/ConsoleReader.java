package consolereader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

/** Reads and return users input . Created by IntelliJ IDEA. User: adio Date: 4/5/11 Time: 4:12 PM */
public class ConsoleReader {

    private BufferedReader bufReader = null;

    public ConsoleReader() {
        //Reads the users input from the console.
        this.bufReader = new BufferedReader(new InputStreamReader(System.in));
    }


    /**
     * Returns String values returned by Scanner object ;
     *
     * @return users String input;
     */
    public String readString() {

        try {
            return this.bufReader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
            //indicates Error occurrence .
            return "IOError";
        }


    }

    /**
     * Returns integer values returned by Scanner object ;
     *
     * @return users int input;
     * @throws InputMismatchException
     */

    public int readInt() {
        String userInput = null;
        int returnedInteger = 0;
        try {
            userInput = bufReader.readLine();
            returnedInteger = Integer.parseInt(userInput);
            return returnedInteger;
        } catch (IOException e) {
            e.printStackTrace();
            //indicates error occurrence .
            return 0;
        }
    }

    /**
     * Returns the first character from users input string
     *
     * @return users char input ;
     */
    public char readChar() {
        String userInput = null;
        try {
            userInput = this.bufReader.readLine();
            char returnedChar = userInput.charAt(0);
            return returnedChar;
        } catch (IOException e) {
            e.printStackTrace();
            //returns null value at Exception occurrence .
            return userInput.charAt(0);

        }

    }

    /**
     * Returns float values returned by Scanner object ;
     *
     * @return
     * @throws InputMismatchException
     */
    public float readFloat() {
        String userInput;
        float returnedFloat = 0;
        try {
            userInput = this.bufReader.readLine();
            returnedFloat = Float.parseFloat(userInput);
            return returnedFloat;
        } catch (IOException e) {
            e.printStackTrace();
            return returnedFloat;
        }

    }
}
