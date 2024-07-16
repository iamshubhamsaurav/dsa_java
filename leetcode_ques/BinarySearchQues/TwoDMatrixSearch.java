package leetcode_ques.BinarySearchQues;

public class TwoDMatrixSearch {
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5,6,7,8,9,10};
        // int res = binarySearch(arr, 9);
        // System.out.println(res);

        int arr[][] = {{1,2,3}, {4,5,6}, {7, 8, 9}};
        int row = searchPotentialArrays(arr, 9);
        System.out.println("Row: " + row);
        int res = binarySearch(arr[row], 12);
        System.out.println("Index: "+ row + " " + res);

    }

    static int searchPotentialArrays(int matrix[][], int target) {
        int start = 0;
        int end = matrix.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if(matrix[mid][0] <= target && target <= matrix[mid][matrix[mid].length - 1]) {
                return mid;
            } else if(matrix[mid][0] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(arr[mid] == target) {
                return mid;
            } else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

}
