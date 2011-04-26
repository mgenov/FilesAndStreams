package dataserialization;

import java.io.*;

/**
 * Serializes object . Created by IntelliJ IDEA. User: adio Date: 4/6/11 Time: 6:53 PM .
 */
public class DataClass {

    /**
     * Saves Objects to a specific output stream
     *
     * @param outputStream an output stream to witch saves the objects
     * @param object       the object to be saved
     * @return
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

    public Object getObject(InputStream inputStream) {

        try {
            ObjectInputStream objectInput = new ObjectInputStream(inputStream);
            return objectInput.readObject();

        } catch (IOException ioException) {
            ioException.printStackTrace();
            return -1;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return -1;

        }


    }


}
