final public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 4, 4};
        removeDuplicates(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    static int removeDuplicates(int arr[]) {
        
        int temp[] = new int[arr.length];
        int size = 1;
        temp[size - 1] = arr[size - 1];// temp[0] = arr[0]

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != temp[size -1]) {
                temp[size] = arr[i];
                size++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        
        return size;
    }
}
