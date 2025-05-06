public class armstrong {
    public static void main(String[] args) {
        int num = 153;
        int originNum = num;

        int count = 0;
        int temp = num;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        int armNumber = 0;
        while (num != 0) {
            int digit = num % 10;
            armNumber = (int) (armNumber + Math.pow(digit, count));
            num = num / 10;
        }

        // if math function have not used
        // while (num != 0) {
        //     int digit = num % 10;

            
        //     int power = 1;
        //     for (int i = 0; i < count; i++) {
        //         power *= digit;
        //     }

        //     armnumber += power;
        //     num = num / 10;
        // }

        if (originNum == armNumber) {
            System.out.println(originNum + " is armstrong number");
        } else {
            System.out.println(originNum + " is not armstrong number");
        }
    }
}
