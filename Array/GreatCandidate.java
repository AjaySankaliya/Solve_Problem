import java.util.Arrays;
public class GreatCandidate {
    public static void main(String[] args) {
        int arr[]={1, -4, 3, -6, 7, 0};
        int max=MaximumProduct(arr);
        System.out.println("Maximum three product: "+max);
}
    public static int MaximumProduct(int arr[])
    {
        int n=arr.length;
        Arrays.sort(arr);
        return Math.max(arr[0]*arr[1]*arr[n-1], arr[n-1]*arr[n-2]*arr[n-3]);
    }
}
