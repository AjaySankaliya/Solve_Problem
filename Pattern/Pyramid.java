//          1 
//         1 2
//        1 2 3
//       1 2 3 4
//      1 2 3 4 5 
//     1 2 3 4 5 6
//    1 2 3 4 5 6 7
//   1 2 3 4 5 6 7 8
//  1 2 3 4 5 6 7 8 9
// 1 2 3 4 5 6 7 8 9 10

public class Pyramid {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            for(int k=9;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // for(int i=1;i<=5;i++)
        // {
        //     for(int k=4;k>=i;k--)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    }
}
