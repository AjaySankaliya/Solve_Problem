import java.util.Scanner;
public class Diagonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=4;
        int n=4;
        int arr[][]=new int[m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter array element at index ["+i+"]["+j+"]: ");
                arr[i][j]=sc.nextInt();
            }
        }

        int Principal=0;
        int Secondary=0;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    Principal+=arr[i][j];
                }
                if(i+j==3)
                {
                    Secondary+=arr[i][j];
                }
            }
        }
        System.out.println("Principal Diagonal element sum is: "+Principal);
        System.out.println("Secondary Diagonal element sum is: "+Secondary);
    }
}
