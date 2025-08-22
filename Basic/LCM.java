public class LCM {
    public static void main(String[] args) {
        int a=72;
        int b=50;

        int multiplication=a*b;
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        int gcd=a;
        int lcmNumber=multiplication/gcd;
        System.out.println("Lcm number is: "+lcmNumber);
    }
}
