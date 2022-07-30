import java.util.Scanner;

public class DemoTranslation {
    public static void main(String[] args) {
        int x, y, z;
        System.out.println("Enter the side of the square hill");
        x = STDIN_SCANNER.nextInt();
        System.out.println("Enter the side of the square table placed for display");
        y = STDIN_SCANNER.nextInt();
        z = x * x - y * y;
        System.out.print("Area to be decorated is " + z);
     }
     public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}