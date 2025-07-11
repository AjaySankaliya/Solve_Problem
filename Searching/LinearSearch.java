// time complexity:
//     best case=O(1)
//     worst and average case=O(n)

import java.util.Scanner;
class LinearSearch
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={5,10,31,43,23,12,50};
        
        System.out.println("Enter element for search");
        int element=sc.nextInt();

        int result=LinearSearchMethod(arr, element);

        if(result!=-1)
        {
            System.out.println("Element have found at index "+result);
        }
        else
        {
            System.out.println("Element have not found in array");
        }
    }

    public static int LinearSearchMethod(int arr[],int element)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==element)
            {
                return i;
            }
        }
        return -1;
    }
}