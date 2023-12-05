import java.util.Scanner;

public class backwards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String a_string = scan.nextLine();

        for (int x = a_string.length() - 1; x >= 0; x--) {
            char currentChar = a_string.charAt(x);
            System.out.print(currentChar);
        }
    }
}
