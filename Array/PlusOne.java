public class PlusOne {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        
        int res=0;
        for(int i=0;i<arr.length;i++)
        {
            res=res*10+arr[i];
        }
        System.out.println(res+1);
    }
}
