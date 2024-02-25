

final public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        
        for (int i : arr) {
            System.out.print(i + " ");
        }

        reverse(arr);
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void reverse(int arr[]) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }
}
