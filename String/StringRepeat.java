public class StringRepeat {
    public static void main(String[] args) {
        String str = "4x3y2z4a";

        String result="";
        int count=1;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if(ch>='0' && ch<='9')
            {
                count=ch-'0';
            }
            else if(ch>='a' && ch<='z')
            {
                for(int j=0;j<count;j++)
                {
                    result+=ch;
                }
                count=1;
            }
        }

        System.out.println(result);
    }
}
