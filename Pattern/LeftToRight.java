class LeftToRight {
    public static void main(String[] args) {
        int n = 5;
        int sum = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= n; j++) {
                    System.out.printf("%-4d", sum);
                    sum++;
                }
            }
            else
            {
                int EndRow=sum+n-1;
                for(int k=EndRow;k>=sum;k--)
                {
                    System.out.printf("%-4d",k);
                }
                sum=EndRow+1;
            }
            System.out.println();
        }
    }
}