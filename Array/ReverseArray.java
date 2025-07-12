
import java.util.Arrays;


class ReverseArray
{
    public static void main(String[] args) {
        int arr[]={6,5,4,3,2,1};

        int start=0;
        int end=arr.length-1;


        System.out.println("Before Swapping: "+Arrays.toString(arr));
        
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }

        System.out.println("After Swapping: "+Arrays.toString(arr));


    }
}