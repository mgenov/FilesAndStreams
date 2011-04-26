package directorbrowser;

/**
 * Created by IntelliJ IDEA. User: adio Date: 4/6/11 Time: 3:25 PM
 */
public class Main {
    public static void main(String args[]) {
        DirectoryBrowser dir = new DirectoryBrowser();
        dir.listContent("E:\\Projects\\JAVA\\FilesAndStreams\\Adio.txt");
        dir.listContent("E:\\Projects\\JAVA\\FilesAndStreams");

    }
}
