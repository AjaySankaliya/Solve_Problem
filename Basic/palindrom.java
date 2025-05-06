import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int num = sc.nextInt();
        int originNum = num;
        int revNum = 0;

        while (num != 0) {
            int digit = num % 10;
            revNum = (revNum * 10) + digit;
            num = num / 10;
        }

        if (originNum == revNum) {
            System.out.println(originNum + " is palindrom number");
        } else {
            System.out.println(originNum + " not palindrom number");
        }

    }
}
