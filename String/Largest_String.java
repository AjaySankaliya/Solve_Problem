import java.util.Arrays;

class Largest_String
{
    public static void main(String[] args) {
        int arr[]={3,30,34,5,9};
        String str="";
        for(int i=0;i<arr.length;i++)
        {
            str+=arr[i];
        }
        char ch[]=str.toCharArray();

        Arrays.sort(ch);

        for(int i=ch.length-1;i>=0;i--)
        {
            System.out.print(ch[i]);
        }
    }   
}