// class InsertAtPos
// {
//         public static void main(String[] args) {
//         int arr[]={10,20,30,40,50};
//         int newArr[]=new int[arr.length+1];
//         int element=25;
//         int position=2;
        
//         int j=0;
//         for(int i=0;i<newArr.length;i++)
//         {
//             if(i==position)
//             {
//                 newArr[i]=element;
//             }
//             else
//             {
//                 newArr[i]=arr[j];
//                 j++;
//             }
//         }

//         for(int i=0;i<newArr.length;i++)
//         {
//             System.out.print(newArr[i]+" ");
//         }
//     }
// }

//insert at position without take new array
import java.util.Scanner;
class InsertAtPos
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int n=5;

        System.out.println("Enter array element:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int element=25;
        int pos=2;

        for(int i=n;i>pos;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[pos]=element;
        n++;

        System.out.println("print array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}