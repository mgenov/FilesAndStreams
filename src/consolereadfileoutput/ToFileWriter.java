package consolereadfileoutput;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Creates a text file , scans users input and writes(outputs) users input to the file . If file exists, opens the file
 * and writes users input to it
 * @author Adelin Ghanayem (Adio@evo.bg)
 */
public class ToFileWriter {

    private FileWriter writer = null;



    public ToFileWriter() {
    }

    /**
     * Writes users input provided by scanner to text file. writing stops when use enter a (dot) in new line !
     *
     * @param inputStream Scanner witch provides users input
     * @param fileName  the name of the file in witch the function will write
     * @throws IOException .
     */
    public void writeToFile(Scanner inputStream, String fileName) {

        try {


            this.writer = new FileWriter(fileName);
            while (!inputStream.hasNext(".") || inputStream.hasNext()) {
                writer.write(inputStream.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (this.writer != null) {
                try {
                    this.writer.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();

                }
            }
        }


    }


}
