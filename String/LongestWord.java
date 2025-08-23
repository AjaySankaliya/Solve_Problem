public class LongestWord {
    public static void main(String[] args) {
        String str="Java programming is fun";

        String arr[]=str.split(" ");

        int length=0;
        int maxLength=0;
        String longestWord="";
        for(int i=0;i<arr.length;i++)
        {
            length=arr[i].length();
            if(maxLength<length)
            {
                maxLength=length;
                longestWord=arr[i];
            }
        }
        System.out.println("Maxlength string word is: "+longestWord);
        System.out.println("Maxlength of string word is: "+maxLength);
    }
}
