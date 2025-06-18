class SumTarget {
    public static void main(String[] args) {
        int arr[] = { 3,4,-7,1,-2,6};
        int target = -3;

        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    flag = true;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}