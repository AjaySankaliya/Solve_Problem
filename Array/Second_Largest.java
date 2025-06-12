class Second_Largest
{
    public static void main(String[] args) {
        int arr[]={5,6,4,3,9,8,2,9,1};

        int largest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println("Largest element have: "+largest);


        int second_largest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>second_largest && arr[i]!=largest)
            {
                second_largest=arr[i];
            }
        }

        System.out.println("Second Largest element: "+second_largest);

        int smallest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                smallest=arr[i];
            }
        }
        System.out.println("Smallest element have: "+smallest);


        int second_smallest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<second_largest && arr[i]!=smallest)
            {
                second_smallest=arr[i];
            }
        }
        System.out.println("Second Smallest element have: "+second_smallest);

        int ans=second_largest-second_smallest;
        System.out.println("Different of second largest and second smallest is :"+ans);
    }
}