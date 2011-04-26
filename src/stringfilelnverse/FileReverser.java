package stringfilelnverse;

import java.io.*;

/**
 * Reads the content of text file ,saves the content in the buffer , reverse the buffer content and saves the text file
 * back. Created by IntelliJ IDEA. User: adio Date: 4/5/11 Time: 5:14 PM .
 */
public class FileReverser {
    //private String fileName;
    //fileInfo object provides information about the read file
    private File fileInfo = null;
    //bufReader object reads chars saved in the buffer by FileWriter
    private BufferedReader bufReader = null;
    //bufWriter Writes to buffer ;
    private BufferedWriter bufWriter = null;

    /**
     * Creates new FileReverser by providing path to the source file from witch data will be loaded  .
     *
     * @throws IOException
     */
    public FileReverser() {

    }


    /**
     * Reverse a given array as a parameter
     * @param charsArray the array to be reversed
     */
    private void inverseArray(char[] charsArray) {

        int i = 0;
        int j = charsArray.length - 1;
        char temp;
        while (i < j) {
            temp = charsArray[i];
            charsArray[i] = charsArray[j];
            charsArray[j] = temp;
            i++;
            j--;
        }
    }

    /**
     * Reverse the content of file containing chars provided by it's name
     * @param fileName, the name of the file to be reversed
     * @return return 0 at success , -1 at IOException, 1  if the given file name doesn't exists
     */
    public int fileReverse(String fileName) {
        this.fileInfo = new File(fileName);
        if (this.fileInfo.exists()) {
            char charArray[] = new char[(int) this.fileInfo.length()];
            try {
                this.bufReader = new BufferedReader(new FileReader(fileName));
                this.bufReader.read(charArray);
                this.inverseArray(charArray);
                System.out.print(charArray);
                this.bufWriter = new BufferedWriter(new FileWriter(fileName));
                this.bufWriter.write(charArray);
                return 0;
            } catch (IOException e) {
                e.printStackTrace();
                return -1;
            } finally {
                try {
                    this.bufReader.close();
                    this.bufWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();

                }
            }

        } else {
            return 1;
        }

    }
}


