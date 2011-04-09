package consoleReadFileOutput;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Creates a text file , scans users input and writes(outputs) users input to the file . If file exists, opens the file
 * and writes users input to it . existing file name Created by IntelliJ IDEA. User: adio Date: 4/4/11 Time: 3:03 AM To
 * change this template use File | Settings | File
 */
public class WriteToFile {

    //FileWriter creates or open file and writes to the file ;
    private FileWriter writer;

    /**
     * Creates e new FileWriter object
     *
     * @param fileName the file name to open if exists or create otherwise
     */
    public WriteToFile(String fileName) {

        try {
            writer = new FileWriter(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Creates new Scanner object , Scans users input and writes the input to the file created by the constructor.
     *
     * @throws IOException .
     */
    public void writeToFile() {
        Scanner userInput = new Scanner(System.in);
        while (!userInput.hasNext(".")) {
            try {
                writer.write(userInput.next());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    /**
     * Check the output stream and closes it if still open .
     *
     * @throws IOException .
     */
    public void closeStream() {

        if (writer != null) {
            try {
                writer.close();

            } catch (IOException e) {

                e.printStackTrace();


            }


        }
    }

}
