public class DecimalToBinary {
    public static void main(String[] args) {
        int num=33;

        String binary="";

        while(num!=0)
        {
            int mod=num%2;
            binary=mod+binary;
            num=num/2;
        }
        System.out.print("Binary: "+binary);
    }
}
