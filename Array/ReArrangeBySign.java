import java.util.Arrays;

public class ReArrangeBySign {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, -4, -1, 4};
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;

        for(int i=left;i<right;i++)
        {
            System.out.println(arr[right]);
            System.out.println(arr[left]);
            left++;
            right--;
        }
    }
}
