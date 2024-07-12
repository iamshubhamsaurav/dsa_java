package leetcode_ques.BinarySearchQues;

public class BinarySearch {

    static int search(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (start + (end- start)) / 2;
            if(arr[mid] == key) {
                return mid;
            } else if(arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int res = search(arr, 2);
        System.out.println(res);
    }
}
