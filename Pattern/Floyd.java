// 1 
// 2 3
// 4 5 6
// 7 8 9 10       
// 11 12 13 14 15

public class Floyd {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                sum = sum + 1;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
