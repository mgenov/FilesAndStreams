package directorBrowser;

/**
 * Created by IntelliJ IDEA. User: adio Date: 4/6/11 Time: 3:25 PM To change this template use File | Settings | File
 * Templates.
 */
public class Main {
    public static void main(String args[]) {
        DirectoryBrowser dir = new DirectoryBrowser();
        dir.listContent("E:\\Projects\\JAVA\\FilesAndStreams\\Adio.txt");
        dir.listContent("E:\\Projects\\JAVA\\FilesAndStreams");

    }
}
