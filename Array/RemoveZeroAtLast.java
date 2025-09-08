import java.util.Arrays;

public class RemoveZeroAtLast {
    public static void main(String[] args) {
        int arr[]={1, 2, 0, 4, 3, 0, 5, 0};

        int num=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[num]=arr[i];
                num++;
            }
        }
        while(num<arr.length)
        {
            arr[num]=0;
            num++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
