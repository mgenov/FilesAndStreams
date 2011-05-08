package dataserialization;

import java.io.*;

/**
 * Serializes object using java standard mechanism to serialize objects
 *
 * @author Adelin Ghanayem (Adio@evo.bg)
 */
public class DataClass {

    /**
     * Saves Objects to a specific output stream , using java standard serialization !
     *
     * @param outputStream an output stream to witch the object will be saved
     * @param object       the object to be saved (serialized )
     */
    public void saveObject(OutputStream outputStream, Object object) {


        try {
            //OutputStream must be wrapped by ObjectOutputStream
            ObjectOutputStream objectOutput = new ObjectOutputStream(outputStream);
            objectOutput.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();


        }

    }

    /**
     * Retrieves Objects from an input stream (deserializes objects )
     * @param inputStream the input from witch to read the object
     * @return the object been read
     * @throws  IOException , if an exception occurred when an I/O error occurs while reading stream header
     * @throws ClassNotFoundException , when the Class of a serialized object cannot be found
     */
    public Object getObject(InputStream inputStream) throws IOException,ClassNotFoundException {

        try {
            ObjectInputStream objectInput = new ObjectInputStream(inputStream);

            return objectInput.readObject();

        } catch (IOException ioException) {
            ioException.printStackTrace();
            throw new IOException() ;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new ClassNotFoundException();

        }


    }


}
