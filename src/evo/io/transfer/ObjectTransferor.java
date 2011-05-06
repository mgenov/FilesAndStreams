package evo.io.transfer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Transfers Data ( n bytes ) from input stream to output stream . Created by IntelliJ IDEA. User: adio Date: 4/9/11
 * Time: 12:43 PM
 */
public class ObjectTransferor {

    /**
     * Transfers all bytes from input stream to output Stream passed as a parameter .
     *
     * @param inputStream, the input stream to read from .
     * @param outputStream, the output stream to write to .
     * @return The number of bytes actually read ,0 at Exception occurrence.
     */
    public int transfer(InputStream inputStream, OutputStream outputStream) {
        try {
            byte byteStream[] = new byte[inputStream.available()];
            int numberOfBytes = inputStream.read(byteStream);
            outputStream.write(byteStream);
            return numberOfBytes;
        } catch (IOException e) {
            e.printStackTrace();
            return 1;
        }

    }

    /**
     * Transfers n bytes from Input stream , to Output stream
     *
     * @param inputStream,   the input stream to read from
     * @param outputStream,  the output stream to write from
     * @param numberOfBytes, number of bytes to transfer  , -1 indicates all bytes transfer .
     * @param offset,        number of bytes skipped from the begging
     * @return the number of bytes been transferred , -1 otherwise to indicate an error occurrence
     */
    public int transfer(InputStream inputStream, OutputStream outputStream, int numberOfBytes, int offset) {

        try {
            byte byteStream[] = new byte[inputStream.available()];
            int numberOfBytesReturned = inputStream.read(byteStream, offset, numberOfBytes);
            outputStream.write(byteStream, offset, numberOfBytes);
            return numberOfBytesReturned;
        } catch (IOException e) {
            e.printStackTrace();
            return 1;

        }

    }

}
