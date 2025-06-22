class SpecialReverse
{
    public static void main(String[] args) {
        String str=" a!!!b.c.d,e'f,ghi";

        String rev="";

        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
            {
                rev+=ch;
            }
        }
        String result="";
        int j=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
            {
                result+=rev.charAt(j);
                j++;
            }
            else
            {
                result+=ch;
            }
        }
        System.out.println("Reverse String without Special Character: "+result);
    }
}