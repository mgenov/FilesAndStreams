package stringfilelnverse;

import java.io.*;

/**
 * Reads the content of text file ,saves the content in the buffer , reverse the buffer content and saves the text file
 * back.
 *
 * @author Adelin Ghanayem (Adio@evo.bg)
 */
public class FileReverser {
    //private String fileName;
    //fileInfo object provides information about the read file
    private File fileInfo = null;
    //bufReader object reads chars saved in the buffer by FileWriter
    private BufferedReader bufReader = null;
    //bufWriter Writes to buffer ;
    private BufferedWriter bufWriter = null;

    public FileReverser() {
    }


    /**
     * Reverse a given array as a parameter and reverse it
     *
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
     *
     * @param fileName, the name of the file to be reversed
     * @return return 0 at success , -1 at IOException, 1  if the given file name doesn't exists
     */
    public int fileReverse(String fileName) throws IOException{
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
            }  finally {
                try {
                    this.bufReader.close();

                } finally {
                     this.bufWriter.close();
                }
            }

        } else {
            return 1;
        }

    }
}


