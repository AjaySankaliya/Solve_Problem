
public class Pyramid_Increase {

    public static void main(String[] args) {
        int n = 5;

        int num = 1;
        for (int i = 1; i <= n; i++) {

            for(int s=1;s<=n-i;s++)
            {
                System.out.print("  ");
            }
            
            num=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }

            num = (i * 2)-2;
            for (int j = 1; j < i; j++) {
                System.out.print(num + " ");
                num--;
            }
            System.out.println();
        }
    }
}
