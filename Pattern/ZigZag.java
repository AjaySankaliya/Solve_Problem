public class ZigZag {
    public static void main(String[] args) {
        int rowLength[]={5,4,5,3,5};
        
        int num=1;

        for(int i=0;i<rowLength.length;i++)
        {
            if(i%2!=0)
            {
                System.out.print("  ");
            }
            for(int j=0;j<rowLength[i];j++)
            {
                System.out.printf("%-3d",num++);
            }
            System.out.println();
        }
    }
}
