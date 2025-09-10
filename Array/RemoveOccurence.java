import java.util.Arrays;

public class RemoveOccurence {
    public static void main(String[] args) {
        int arr[]={3, 2, 2, 3};
        int k=2;
        int ans=countAllOccurence(arr, k);
        for(int i=0;i<ans;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static int countAllOccurence(int arr[],int k)
    {
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=k)
            {
                arr[count]=arr[i];
                count++;
            }
        }
        return count;
    }
}
