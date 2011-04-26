package dataserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**Writes a Random Object to specific path and the reads it !
 * Created by IntelliJ IDEA. User: adio
 */
public class Main {

    public static void main(String args[]) {
        Employee emplyee1 = new Employee();
        DataClass objectSerialize = new DataClass();
        try {
            //create new OutputStream object
            FileOutputStream fileOutput = new FileOutputStream("Employee.ser");
            objectSerialize.saveObject(fileOutput, emplyee1);
            FileInputStream fileInput = new FileInputStream("Employee.ser");
            //casting the returned object by getObject to Employee object
            Employee employee = (Employee) objectSerialize.getObject(fileInput);
            //prints the first name of Employee !
            System.out.println(employee.getFirstName());
        } catch (IOException ioException) {
            ioException.printStackTrace();

        }


    }
}
