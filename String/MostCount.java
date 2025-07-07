class MostCount
{
    public static void main(String[] args) {
        String str="aabbbcccccddddddd";
        int charCount=0;
        int count=0;
        char character=' ';
        for(int i=0;i<str.length();i++)
        {
            count=0;
            char ch=str.charAt(i);
            for(int j=0;j<str.length();j++)
            {
                if(ch==str.charAt(j))
                {
                    count++;
                }
            }
            if(count>charCount)
            {
                charCount=count;
                character=str.charAt(i);
            }
        }

        System.out.println("Mostly repeted character is " + character + " and it repeat conunt is " + charCount +" times");
    }
}