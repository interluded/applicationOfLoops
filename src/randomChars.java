public class randomChars {
    public static void main(String[]args){
        for (int x = 200; x >=1 ; x--) {
            char y = (char)(int)(26 * Math.random() + 65);
            System.out.print(y);
            if (x % 10 == 0){
                System.out.println("\t");
            }
        }
    }
}
