// Count the number of digits in a given number.
import java.util.Scanner;

public class numCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for count number");
        int num = sc.nextInt();
        int count = 0;
        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                num = num / 10;
                count++;
            }
        }
        System.out.println("count: " + count);

    }
}
