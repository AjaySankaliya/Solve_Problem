class Circle_Number
{
    public static void main(String[] args) {
        int n=7;
        int num=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1 || j==1 || i==n || j==n)
                {
                    System.out.print(num+" ");
                }
                else
                {
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}