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
     * @return an instance of Employee object, new Integer(1) object if an error occurred  during opening stream or read from stream
     * new Integer(-1) if class not found
     */
    public Object getObject(InputStream inputStream)  {

        try {
            ObjectInputStream objectInput = new ObjectInputStream(inputStream);
            return (Employee) objectInput.readObject();
        } catch (IOException ioException) {
            ioException.printStackTrace();
            return new Integer(1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return new Integer(-1);
        }


    }


}
