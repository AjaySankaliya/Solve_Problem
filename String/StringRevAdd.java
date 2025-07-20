
import java.util.Arrays;


public class StringRevAdd {
    public static void main(String[] args) {
        String str="3+2+1+2+1";

        String rev="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if(ch>='1' && ch<='9')
            {
                rev+=ch;
            }
        }

        char digit[]=rev.toCharArray();
        Arrays.sort(digit);
        System.out.println(new String(digit));
    
        String result="";
        int j=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if(ch>='1' && ch<='9')
            {
                result+=digit[j];
                j++;
            }
            else
            {
                result+=ch;
            }
        }

        System.out.println(result);
       
    }
}
