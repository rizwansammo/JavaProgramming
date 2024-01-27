import java.util.Scanner;

public class TestProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        // Read the user's name as a String
        String name = scan.next(); // or scan.nextLine() if the name can have spaces

        System.out.println("Greetings " + name + "!");

        // Close the scanner to avoid resource leakage
        scan.close();
    }
}
