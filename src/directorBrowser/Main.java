package directorbrowser;

/**
 * @author Adelin Ghanayem (Adio@evo.bg)
 */
public class Main {
    public static void main(String args[]) {
        DirectoryBrowser dir = new DirectoryBrowser();
        dir.listContent("E:\\Projects\\JAVA\\FilesAndStreams\\Adio.txt");
        dir.listContent("E:\\Projects\\JAVA\\FilesAndStreams");

    }
}
