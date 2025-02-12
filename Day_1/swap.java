// Swap two numbers without using a third variable.
public class swap {
    public static void main(String[] args) {
        int num1=5;
        int num2=7;

        System.out.println("Before Swapping");
        System.out.println(num1);
        System.out.println(num2);

        // int c=num1;
        // num1=num2;
        // num2=c;
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After swapping");
        System.out.println(num1);
        System.out.println(num2);

    }
}
