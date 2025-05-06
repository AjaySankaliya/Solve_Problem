public class Neon {
    public static void main(String[] args) {
        int num=10;
        int squere=num*num;
        int sum=0;

        while(squere!=0)
        {
            int digit=squere%10;
            sum=sum+digit;
            squere=squere/10;
        }

        if(num==sum)
        {
            System.out.println(num+ " num is neon number");
        }
        else
        {
            System.out.println(num+ " num is not neon number");
        }

    }
}
