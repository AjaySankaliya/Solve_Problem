public class Insertion {
    public static void main(String[] args) {
        int arr[]={30,20,40,10,60,50};

        for(int i=1;i<arr.length;i++)
        {
            int index=arr[i];   
            int j=i-1;
            while(j>=0 && index<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=index;

        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}
