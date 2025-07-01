import java.util.Scanner;
class Delete_Element
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];

        int n=7;

        System.out.println("Enter array element");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter element for delete");
        int element=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==element)
            {
                for(int j=i;j<n-1;j++)
                {
                    arr[j]=arr[j+1];
                }
                flag=true;
                n--;
                break;
            }
        }
        if(!flag)
        {
            System.out.println("Element have not found");
        }

        System.out.println("after delete element");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"  ");
        }

    }
}