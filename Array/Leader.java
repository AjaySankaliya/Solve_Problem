class Leader
{
    public static void main(String[] args) {
        int arr[]= {16, 17, 4, 3, 5, 2};

        int n=arr.length-1;

        int leaderElement=arr[n];
        System.out.println("Leader Element");
        System.out.print(leaderElement+" ");

        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>leaderElement)
            {
                leaderElement=arr[i];
                System.out.print(leaderElement+" ");
            }
        }
    }
}