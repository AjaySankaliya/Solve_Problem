public class Remove_duplicate
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,3,2,1,6,7};


        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[j]=0;
                }
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                System.out.println(arr[i]);
            }
        }

    }
}