public class fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        for (int i = 0; i <= 10; i++) {
            int temp = a;
            a = a + b;
            b = temp;
            System.out.print(temp + "\t");
        }
    }
}