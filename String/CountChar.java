import java.util.Scanner;
class CountChar
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String:");
        String str=sc.next();

        System.out.println("Enter character for count the occurrence");
        char character=sc.next().charAt(0);

        int count=0;

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==character)
            {
                count++;
            }
        }

        System.out.println("Count of character is: "+count);

    }
}