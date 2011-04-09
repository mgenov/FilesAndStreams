package objectTransfer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

/**
 * Created by IntelliJ IDEA. User: adio Date: 4/9/11 Time: 12:43 PM To change this template use File | Settings | File
 * Templates.
 */
public class Main {

    public static void main(String arg[]) {
        Date d = new Date();
        TransferObject transferObject = new TransferObject();
        try {

            //long t1= d.getTime();
            //System.out.println(t1);
            FileInputStream inputStream = new FileInputStream("picture2.jpg");
            FileOutputStream outputStream = new FileOutputStream("pic/adio5.jpg");
            System.out.println(transferObject.transfer(inputStream, outputStream, 50, 100)+", bytes have transferred ");
            //long t2 = d.getTime();
            //System.out.println(t2);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
