package evo.io.transfer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String arg[]) {


        ObjectTransferor transferObject = new ObjectTransferor();
        try {



            FileInputStream inputStream = new FileInputStream("picture2.jpg");
            FileOutputStream outputStream = new FileOutputStream("pic/adio5.jpg");
            System.out.println(transferObject.transfer(inputStream, outputStream,200000,100)+", bytes have transferred ");
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

}
