public class MoveZeroToEnd {
    public static void main(String[] args) {
        
        int arr[] = {1,2,0,3,4,5,0,6};
        printArrayElements(arr);
        moveZeroToEnd(arr);
        printArrayElements(arr);
    }
    static void moveZeroToEnd(int arr[]) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                // Swap the i index with count index
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++;
            }
        }
    }
    
    private static void printArrayElements(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
