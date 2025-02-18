package Day_4;
public class sum {
    public static void main(String[] args) {
        int num=234456;

        int sum=0;
        int temp=num;
        while(temp!=0)
        {
            int num1=temp%10;
            sum=sum+num1;
            temp=temp/10;
        }
        System.out.println(sum);
    }
}
