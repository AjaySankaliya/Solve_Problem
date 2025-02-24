public class pattern {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) 
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=5;i>=1;i--) 
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=0;i<5;i++)
        {
            for(int j=4;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }        


        for(int i=0;i<5;i++)
        {
             for(int j=0;j<i;j++)
             {
                 System.out.print(" ");
             }
             for(int k=5;k>i;k--)
             {
                 System.out.print("* ");
             }
             System.out.println();
        }


    for(int i=1;i<=6;i++)
    {
        for(int j=1;j<=6;j++)
        {
           if(i==1 || i==6  || j==1 || j==6 )
           {
            System.out.print("*");
           }
           else{
            System.out.print(" ");
           }
        }
        System.out.println();
    }
     
    for(int i=1;i<=6;i++)
    {
        for(int j=1;j<=i;j++)
        {
            if(i==j || i==1  || j==1 || i==6)
            {
                System.out.print("*");
               }
           else{
                System.out.print(" ");
           }
        }
        System.out.println();
    }
 
    


    }
}
