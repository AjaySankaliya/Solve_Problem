public class ButterFly {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int s=1;s<=n-i;s++)
            {
                System.out.print("  ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }

        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int s=1;s<=n-i;s++)
            {
                System.out.print("  ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
