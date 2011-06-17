package stringfilelnverse;

import java.io.IOException;

/**
 *
 */
public class Main {
  public static void main(String args[]) {

    FileReverser file = new FileReverser();
    try {
      file.fileReverse("Adio.txt");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
