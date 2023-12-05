import java.util.Scanner;

public class NumVowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vowel_count = 0;
        System.out.println("Enter a string");
        String a_string = scan.nextLine();

        for (int x = 0; x < a_string.length(); x++) {
            char currentChar = Character.toLowerCase(a_string.charAt(x));
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowel_count++;
            }
        }

        System.out.println(vowel_count);
    }
}
