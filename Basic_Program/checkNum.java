// Determine if a number is positive, negative, or zero.
import java.util.Scanner;

public class checkNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for check number is positive,negetive or zero");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("number is zero");
        } else if (num > 0) {
            System.out.println("number is positive");
        } else {
            System.out.println("number is negetive");
        }
    }

}
