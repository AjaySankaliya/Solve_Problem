import java.util.Scanner;

public class RotateArrayPosition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = { 10, 20, 30, 40, 50, 60, 70 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        
        System.out.println("\nEnter position to rotate array");
        int pos = sc.nextInt();

        int newArr[]=new int[arr.length];
        int index=0;

        for(int i=pos;i<arr.length;i++)
        {
            newArr[index++]=arr[i];
        }

        for(int i=0;i<pos;i++)
        {
            newArr[index++]=arr[i];
        }

        for(int i=0;i<newArr.length;i++)
        {
            System.out.println(newArr[i]);
        }
    }
}
