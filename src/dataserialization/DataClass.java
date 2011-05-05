package dataserialization;

import java.io.*;

/**
 * Serializes object
 *
 * @author Adelin Ghanayem (Adio@evo.bg)
 */
public class DataClass {

    /**
     * Saves Objects to a specific output stream , using java standard serialization !
     *
     * @param outputStream an output stream to witch saves the objects
     * @param object       the object to be saved
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
     * @return the object been read, -1 at IOException , 1 at ClassNotFoundException ( when the application can't find the specified class ) .
     */
    public Object getObject(InputStream inputStream) {

        try {
            ObjectInputStream objectInput = new ObjectInputStream(inputStream);
            return objectInput.readObject();

        } catch (IOException ioException) {
            ioException.printStackTrace();
            return -1;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return 1;

        }


    }


}
