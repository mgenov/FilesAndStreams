package objectTransfer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Transfers Data ( n bytes ) from input stream to output stream . Created by IntelliJ IDEA. User: adio Date: 4/9/11
 * Time: 12:43 PM To change this template use File | Settings | File Templates.
 */
public class TransferObject {
    /**
     * Transfers n bytes from Input stream , to Output stream
     *
     * @param inStream,      the input stream to read from
     * @param outStream,     the out put stream write from
     * @param numberOfBytes, number of bytes to transfer
     * @param Offset,        number of bytes skipped from the begging
     * @return the number of bytes been transferred , -1 otherwise to indicate an error occurrence
     */
    int transfer(InputStream inStream, OutputStream outStream, int numberOfBytes, int Offset) {

        int byteHandler; //hold the total number of bytes read into the buffer , -1 if there is no more data to read

        int counter = 0; //counts the number of iterations of while (the number of bytes copied );

        // numberOfBytes = -1 (reads all bytes)
        if (numberOfBytes == -1) {
            try {

                while (((byteHandler = inStream.read()) != -1)) {

                    outStream.write(byteHandler);
                    counter++;
                }

                return counter;

            } catch (IOException e) {
                e.printStackTrace();
                return -1;

            }


        } else {

            byte byteArray[] = new byte[(numberOfBytes + Offset)]; //an array holds bytes to of stream
            try {
                while ((byteHandler = inStream.read(byteArray, Offset, numberOfBytes - Offset)) != -1) {
                    outStream.write(byteHandler);
                    counter++;
                }
                return counter++;
            } catch (IOException e) {
                e.printStackTrace();
                return -1;

            }

        }
    }

}
