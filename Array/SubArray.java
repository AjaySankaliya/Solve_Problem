public class SubArray {
    public static void main(String[] args) {
        int arr[]={2, 3, -8, 7, -1, 2, 3};

        int sum=0;

        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];

            if(sum<0)
            {
                sum=0;
            }
        }
        System.out.println("sum is: "+sum);
    }
}
