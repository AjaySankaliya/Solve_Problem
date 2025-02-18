package Day_4;
// Check if a number is palindrome (121 → Yes, 123 → No).
public class palindrom {
    public static void main(String[] args) {
        int num=12321;

        int rev=0;
        int temp=num;
        while(temp!=0)
        {
            int num1=temp%10;
            rev=rev*10 + num1;
            temp=temp/10;
        }
        if(num==rev)
        {
            System.out.println(num + " is palindom number");
        }
        else
        {
            System.out.println(num + " is not palindom number");   
        }
    }
}
