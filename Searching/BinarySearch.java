// time complexity:
//     best case=O(1)
//     worst and average case=O(log n)

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int arr[]={5,10,15,20,25,30,35,40};
        
        System.out.println("Enter element for search");
        int element=sc.nextInt();

        int result=BinarySearchMethod(arr, element);

        if(result!=-1)
        {
            System.out.println("Element have found at index "+result);
        }
        else
        {
            System.out.println("Element have not found in array");
        }
    }
        

    public static int BinarySearchMethod(int arr[],int element)
    {
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {
            int mid=(start+end)/2;

            if(arr[mid]==element)
            {
                return mid;
            }
            else if(arr[mid]<element)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }
}
