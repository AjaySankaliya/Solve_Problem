class NextGreater
{
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};

        int Greater=0;
        for(int i=0;i<arr.length;i++)
        {
            Greater=-1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
                {
                    Greater=arr[j];
                    break;
                }
            }
            System.out.println(Greater);
        }
    }
}