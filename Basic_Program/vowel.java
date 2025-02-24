// Check if a character is a vowel or consonant.
import java.util.Scanner;
public class vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter character for check vowel or consonant");
        char ch=sc.next().charAt(0);

        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println(ch+" character is vowel");
        }
        else
        {
            System.out.println(ch+ " character is consonant");
        }
    }
}
