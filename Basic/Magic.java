import java.util.Scanner;
class Magic
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number:");
        int num=sc.nextInt();

        int sum;

        while(num>9)
        {
            sum=0;
            while(num!=0)
            {
                int temp=num%10;
                sum+=temp;
                num=num/10;
            }
            num=sum;
        }

        if(num==1)
        {
            System.out.println("Number is magic number");
        }
        else
        {
            System.out.println("Number is not magic number");
        }
    }
}