
import java.util.Scanner;

public class NestingIf {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter The number to test");
        number = input.nextInt();
        if (number > 0) {
            if (number >= 0) {
                System.err.println("Positive Number");
                System.err.println("Even another Number");
            } else {
                System.err.println("Odd another Number");

            }
        } else {
            System.err.println("Negative Number");
        }

    }
}
