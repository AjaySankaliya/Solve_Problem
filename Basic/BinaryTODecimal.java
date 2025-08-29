public class BinaryTODecimal {
    public static void main(String[] args) {
       int num=1011111101;

       int position=0;
       int decimal=0;

       while(num!=0)
       {
            int mod=num%10;
            decimal+=(mod*(Math.pow(2, position)));
            num=num/10;
            position++;
       }

       System.out.println("decimal number is: "+decimal); 
    }
}
