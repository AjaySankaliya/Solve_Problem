package Day_4;
public class perfect {
    public static void main(String[] args) {
        int num=496;
        int sum=0; 
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                System.out.println(i);
                sum=sum+i;
            }
        }
        System.out.println("sum of number is: "+sum);

        if(num==sum)
        {
            System.out.println(num+" num is perfect number");
        }
        else
        {
            System.out.println(num+" num is not perfect number");
        }

    }
}
    