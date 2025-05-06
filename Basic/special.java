public class special {
    public static void main(String[] args) {
        int num=145;
        int originNum=num;
        int sum=0;

        while(num!=0)
        {
            int digit=num%10;

            int fact=1;
            for(int i=1;i<=digit;i++)
            {
                fact=fact*i;
            }
            
            sum+=fact;
            num=num/10;
        }

        if(originNum==sum)
        {
            System.out.println(originNum+ " is special number");
        }
        else
        {
            System.out.println(originNum+ " is not special number");
        }
    }
}
