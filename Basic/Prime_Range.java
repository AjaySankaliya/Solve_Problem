import java.util.Scanner;

public class Prime_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start number:");
        int n1 = sc.nextInt();
        System.out.println("Enter end number:");
        int n2 = sc.nextInt();

        System.out.println("Prime numbers between " + n1 + " and " + n2 + " are:");

        for (int i = n1; i <= n2; i++) 
        {
            boolean isprime = true;

            for (int j = 2; j < i; j++) 
            {
                if (i % j == 0) 
                {
                    isprime = false;
                    break;
                }
            }

            if (isprime) 
            {
                System.out.print(i + " "); 
            }
        }

        sc.close();
    }
}
