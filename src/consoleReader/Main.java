package consolereader;

/** @author Adelin Ghanayem (Adio@evo.bg)  */
public class Main {
    public static void main(String args[]) {
        ConsoleReader reader = new ConsoleReader();
        System.out.printf("\nEnter String:");
        System.out.printf("\nString Entered:%s", reader.readString());
        System.out.printf("Enter Character");
        System.out.printf("character entered:%c", reader.readChar());
        System.out.printf("\nEnter integer value:");
        try {
            System.out.printf("\nInteger Entered:%s", reader.readInt());
        } catch (NumberFormatException e) {
            System.err.println("You must enter integer values only!");

        }
        try {
            System.out.printf("\nEnter float value:");
            System.out.println("\nFloat value entered:" + reader.readFloat());
        } catch (NumberFormatException e) {

            System.err.println("You must enter float values only ! ");

        }
    }
}
