import java.util.Arrays;

public class Consecutive {

    public static void main(String[] args) {
        int arr[] = {1, 94, 92, 93, 1000, 5, 92, 78};

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int count = 1;
        int maxCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                continue;
            }
            if (arr[i] == arr[i - 1] + 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            }
        }

        System.out.println("Max consecutive count: " + maxCount);
    }
}
