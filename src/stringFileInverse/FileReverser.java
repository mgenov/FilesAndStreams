package stringFileInverse;

import java.io.*;

/**
 * Reads the content of text file ,saves the content in the buffer , reverse the buffer content and saves the text file
 * back. Created by IntelliJ IDEA. User: adio Date: 4/5/11 Time: 5:14 PM To change this template use File | Settings |
 * File Templates.
 */
public class FileReverser {
    private String fileName;
    //fileInfo object provides information about the read file
    private File fileInfo = null;
    //fileReader object reads characters from file
    private FileReader filereader = null;
    //fileWriter Writes characters to file
    private FileWriter filewriter = null;
    //bufReader object reads chars saved in the buffer by FileWriter
    private BufferedReader bufReader = null;
    //bufWriter Writes to buffer ;
    private BufferedWriter bufWriter = null;

    /**
     * Creates new File , FileReader , FileWriter , BufferReade and BufferWriter object and intialize them with specific
     * variables
     *
     * @param fileName the file witch we will read from and write to .
     * @throws IOException
     */
    public FileReverser(String fileName) {
        this.fileName = fileName;
        try {
            fileInfo = new File(this.fileName);
            filereader = new FileReader(this.fileName);
            bufReader = new BufferedReader(this.filereader);
        } catch (IOException inOut) {

            inOut.printStackTrace();

        }
    }

    /**
     * Reverses the content given file name as parameter
     *
     * @return 0 at success , -1 at error occurrence
     */
    public int reverseText() {
        //charArray keeps file content of chars be reverse .
        char charArray[] = new char[(int) fileInfo.length()];

        try {
            //reads chars from buffer and appends to charArray.
            bufReader.read(charArray);
            //creates new FileWriter object to write to
            this.filewriter = new FileWriter(this.fileName);
            //creates new buffered stream .
           this.bufWriter = new BufferedWriter(this.filewriter);
            //reverse the array of chars .
            for (int i = charArray.length - 1; i >= 0; i--) {

                System.out.print(charArray[i]);
                this.bufWriter.write(charArray[i]);
            }

            //indicates a successful revers
            return 0;
        } catch (IOException e) {
            e.printStackTrace();
            //indicates an error occurrence
            return -1;
        }


    }


    public void closeStream() {
        //close the BufferReader stream
        if (this.bufReader != null) {
            try {
                this.bufReader.close();
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
        //close the BufferWriter stream
        if (this.bufWriter != null) {
            try {
                this.bufWriter.flush();
                //this.bufWriter.close();
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
        //close the FilerReader stream
        if (this.filereader != null) {
            try {
                this.filereader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //close the FileWriter stream
        if (this.filewriter != null) {
            try {
               this.filewriter.close();
            } catch (IOException e) {
                e.printStackTrace();

            }


        }



    }
}

