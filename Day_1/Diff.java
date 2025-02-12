// Find the absolute difference between two numbers.
import java.util.Scanner;
public class Diff{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first real number");
        int num1=sc.nextInt();
        System.out.println("Enter second real number");
        int num2=sc.nextInt();
        int num3=Math.abs(num1-num2);
        System.out.println(num3);   
    }
}