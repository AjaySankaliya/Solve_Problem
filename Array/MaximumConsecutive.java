public class MaximumConsecutive {
    public static void main(String[] args) {
        int arr[] = {1,0,0,1,1,0,0,0,0,0};
        int max = 1;
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 1;
            }
        }
        System.out.println(max);
    }
}
