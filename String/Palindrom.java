public class Palindrom {
    public static void main(String[] args) {
        String str="racecar";
        
        //remove all space
        str=str.replaceAll(" ", "").toLowerCase();

        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            rev+=ch;
        }
        System.out.println(rev);
        if(str.equals(rev))
        {
            System.out.println("String is Palindrom");
        }
        else
        {
            System.out.println("String is not Palindrom");
        }
    }
}
