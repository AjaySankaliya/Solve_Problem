public class harshad {
    public static void main(String[] args) {
        int num = 18; 
        int temp = num;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }

        if (num % sum == 0) {
            System.out.println(num + " is a Harshad (Niven) Number.");
        } else {
            System.out.println(num + " is not a Harshad (Niven) Number.");
        }
    }
}
