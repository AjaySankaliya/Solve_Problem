package Day_4;
// Find the reverse of a number (e.g., 123 → 321).
public class reverse {
    public static void main(String[] args) {
        int num=1234;

        int rev=0;
        int temp=num;
        while(temp!=0)
        {
            int num1=temp%10;
            rev=rev*10 + num1;
            temp=temp/10;
        }
        System.out.println(rev);
    }
}
