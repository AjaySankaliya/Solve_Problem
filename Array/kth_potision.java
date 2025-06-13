// Given two sorted arrays of sizes m and n respectively, the task is to find the element
// that would be at the k-th position in the final sorted array formed by merging these
// two arrays.
// Input: a[] = [2, 3, 6, 7, 9], b[] = [1, 4, 8, 10], k = 5
// Output: 6
// Explanation: The final sorted array is [1, 2, 3, 4, 6, 7, 8, 9, 10]
// The 5th element is 6.
// Input: a[] = [100, 112, 256, 349, 770],
//  b[] = [72, 86, 113, 119, 265, 445, 892], k = 7
// Output: 256
// Explanation: The final sorted array is
// [72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892].
// The 7th element is 256.

import java.util.Scanner;

public class kth_position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        int arr1[] = { 100, 112, 256, 349, 770 };

        int arr2[] = { 72, 86, 113, 119, 265, 445, 892 };

        int newArr[] = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length + i] = arr2[i];
        }

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr.length - i - 1; j++) {
                if (newArr[j] > newArr[j + 1]) {
                    int temp = newArr[j];
                    newArr[j] = newArr[j + 1];
                    newArr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

        System.out.println("Enter k_th position for find element: ");
        int k = sc.nextInt();

        if (k <= 0 || k > newArr.length) {
            System.out.println("Invalid k value.");
        } else {
            System.out.println("The element at position " + k + " is: " + newArr[k - 1]);
        }

        //middle of array
        if (newArr.length % 2 == 0) {
            int mid = newArr[newArr.length / 2 - 1];
            System.out.println("Middle elements: " + mid);
        } else {
            int mid = newArr[newArr.length / 2];
            System.out.println("Middle element: " + mid);
        }

    }
}
