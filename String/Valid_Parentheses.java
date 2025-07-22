class Valid_Parentheses
{
    public static void main(String[] args) {
        String str="[((){})]";

        int start=0;
        int end=str.length()-1;

        boolean flag=true;
        while(start<end)
        {
            char ch1=str.charAt(start);
            char ch2=str.charAt(end);

            if((ch1=='[' && ch2==']') || (ch1=='{' && ch2=='}') || (ch1=='(' && ch2==')'))
            {
                start++;
                end--;
            }
            else if((start+1<=end) && ((ch1=='[' && str.charAt(start+1)==']') || (ch1=='{' && str.charAt(start+1)=='}') || (ch1=='(' && str.charAt(start+1)==')')))
            {
                start+=2;
            }
            else
            {
                flag=false;
                break;
            }
        }

        if(flag)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
}