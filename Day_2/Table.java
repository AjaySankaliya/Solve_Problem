package Day_2;
// Print the multiplication table of a given number.
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for print table");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num + "x" + i + "=" +num*i);
        }

    }
}
