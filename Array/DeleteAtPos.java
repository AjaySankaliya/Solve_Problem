import java.util.Scanner;
class DeleteAtPos
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[10];
        System.out.println("Enter array element size:");
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int pos=2;

        for(int i=pos;i<n;i++)
        {
            arr[i-1]=arr[i];
        }

        n--;

        System.out.println("array element is");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
}