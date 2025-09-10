import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        RotateArrayPosition(arr,2);
        System.out.println(Arrays.toString(arr));
    }
    public static void RotateArrayPosition(int arr[],int k)
    {
        int n=arr.length;
        for(int i=0;i<k;i++)
        {
            int first=arr[0];
            for(int j=0;j<n-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[n-1]=first;
        }
    }
}
