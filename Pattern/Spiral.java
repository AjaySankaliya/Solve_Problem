
class Spiral {

    public static void main(String[] args) {
        int n = 5;
        int arr[][] = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        int num = 1;

        while (top <= bottom && left <= right) {
            //left to right
            for (int i = left; i <= right; i++) {
                arr[top][i] = num++;
            }
            top++;

            //top to bottom
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = num++;
            }
            right--;

            //right to left
            for (int i = right; i >= left; i--) {
                arr[bottom][i] = num++;
            }
            bottom--;

            //bottom to top
            for (int i = bottom; i >= top; i--) {
                arr[i][left] = num++;
            }
            left++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}

