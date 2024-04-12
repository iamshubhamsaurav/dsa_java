public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = {1,4,5,2,3,8};
    System.out.println(arr);

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");

    }

    System.out.println();

    // Inserton Sort begins here
    // It would be better to keep this in a new function

    for (int i = 1; i < arr.length; i++) {
      int curr = arr[i];
      int j = i - 1;

      while(j >= 0 && curr < arr[j]) {
        arr[j+1] = arr[j];
        j--;
      }
      // placement
      arr[j+1] = curr;
    }
    // Insertion sort ends here
    
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i] + " ");
    }
    System.out.println();
    
  }

}
