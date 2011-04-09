package directorBrowser;

import java.io.File;

/**
 * Check a given String whether its a file path or directory path Created by IntelliJ IDEA. User: adio Date: 4/6/11
 * Time: 3:26 PM To change this template use File | Settings | File Templates.
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
     * @param path
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
