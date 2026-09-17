import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks;
        System.out.println("Enter Your Marks");
        marks = input.nextInt();

        // if (marks >= 60) {
        if (marks == 60) {
            System.out.println("Congratulations, you passed");
            System.out.println("Come here");
        }
    }
}
