import java.util.Scanner;

public class LongStrings {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
while (x.length() < 10){
    System.out.println("reenter a diff string");
    x = scan.nextLine();

}
System.out.println("done");
    }
}
