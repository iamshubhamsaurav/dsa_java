public class LeftRotateByD {
    public static void main(String[] args) {
        int arr[] = {10,5,30,15};
        printArrayElements(arr);
        leftRotateByD(arr, 3);
        printArrayElements(arr);
    }

    private static void printArrayElements(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void leftRotateByD(int arr[], int d) {
        int temp[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            if((i - d) >= 0) {
                // System.out.println("i: " + i + " d: " + d +  " i-d: " + (i - d));;
                temp[i - d] = arr[i];
            } else {
                // i = 1 , d = 2, n = 5 (n is the last index)
                // (n+1) + (i  - d) = 6 + ( 1 - 2) = 6 - 1

                // i = 1, d = 3, n = 5
                // 6 + (1 - 3) = 6 - 2 = 4
                int position = (arr.length) + (i - d);
                temp[position] = arr[i];

            }
        }
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }
}
