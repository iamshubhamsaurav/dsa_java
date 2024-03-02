public class LeftRotation {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        printArrayElements(arr);

        leftRotateArray(arr);

        printArrayElements(arr);
    }

    private static void printArrayElements(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void leftRotateArray(int arr[]) {
        int temp = arr[0];

        for(int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = temp;
    }
}
