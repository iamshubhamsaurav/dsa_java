package arrays;

final class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {2,4,1,8,-3,9,0,78,-98,67,56,45,77};

        int largestIndex = getLargest(arr, arr.length);
        System.out.println("Largest Index: " + largestIndex);
        System.out.println("Largest Value: " + arr[largestIndex]);

        int secondLargestIndex = secondLargestInOneTraversal(arr);
        System.out.println("Second Largest Index: " + secondLargestIndex);
        System.out.println("Second Largest Value: " + arr[secondLargestIndex]);
    }

    static int secondLargestInOneTraversal(int arr[]) {
        int largest = 0;
        int secondLargest = 0;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[largest]) {
                largest = i;
            } else {
                if(arr[i] == arr[largest]) continue;
                else if(arr[i] > arr[secondLargest]) secondLargest = i;
            }
        }

        return secondLargest;
    }


    static int getSecondLargest(int arr[], int size) {
        int index = 0;
        int largestIndex = getLargest(arr, size);

        for(int i = 0; i < size; i++) {
            if(arr[i] > arr[index]) {
                if(arr[i] == arr[largestIndex]) continue;
                else index = i;
            }
        }

        return index;
    }

    static int getLargest(int arr[], int size) {
        int largestIndex = 0;

        for(int i = 1; i < size; i++) {
            if(arr[i] > arr[largestIndex]) {
                largestIndex = i;
            }
        }

        return largestIndex;
    }
}