public class MergeArray_Zero {
    public static void main(String[] args) {
        int arr1[]={7,2,5,9};
        int arr2[]={5,9,3,7,8};

        int newArr[]=new int[arr1.length+arr2.length];

        int index=0;
        for(int i=0;i<arr1.length;i++)
        {
            newArr[i]=arr1[i];
        }
        
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    arr2[j]=0;
                }
                newArr[arr1.length+j]=arr2[j];
            }
        }
        
        
        for(int i=0;i<newArr.length;i++)
        {
            System.out.print(newArr[i]+"\t");
        }
    }
}
