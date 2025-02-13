package Day_2;
// Print the sum of the first N numbers.
import java.util.Scanner;
public class Sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("sum is: "+sum);
    }
}