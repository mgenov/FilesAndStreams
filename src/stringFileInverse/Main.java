package stringFileInverse;

/**
 * Created by IntelliJ IDEA. User: adio Date: 4/5/11 Time: 5:13 PM To change this template use File | Settings | File
 * Templates.
 */
public class Main {
    public static void main(String args[]){

        FileReverser file = new FileReverser("Adio.txt") ;
        file.reverseText();
        file.closeStream();

    }
}
