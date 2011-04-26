package directorbrowser;

import java.io.File;

/**
 * Check a given String whether its a file path or directory path
 *
 * @author Adelin Ghanayem (Adio@evo.bg)
 */
public class DirectoryBrowser {

    File filepath = null;
    String path = null;

    public DirectoryBrowser() {
    }

    /**
     * check path whether it's file or directory , prints a message if path is file , prints directory content
     * otherwise
     *
     * @param path the path of the file or directory
     */

    public void listContent(String path) {
        //set the file or directory path ;
        this.path = path;
        //creates new FILE object .
        this.filepath = new File(this.path);
        //if path is file prints a message .
        System.out.println(this.path);
        if (filepath.isFile()) {
            System.out.println("This path refer to file ");
        }
        //if path is directory prints the content of the directory .
        if (filepath.isDirectory()) {
            String content[] = this.filepath.list();

            for (int i = 0; i < content.length; i++) {
                System.out.println(content[i]);
            }
        }

    }


}
