public class BubbleSort {

  public static void bubblesort(int arr[]) {
    //Time Complexity O(n2)
    for (int turn = 0; turn < arr.length - 1; turn++) {
      for (int j = 0; j < arr.length - 1 - turn; j++) {
        if (arr[j] > arr[j + 1]) {
          //swap
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
  
  public static void modifiedBS(int arr[]) {
    for (int turn = 0; turn < arr.length - 1; turn++) {
        int swaps=0;
      for (int j = 0; j < arr.length - 1 - turn; j++) {
        if (arr[j] > arr[j + 1]) {
          //swap
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swaps++;
        }
        if (swaps==0){
            System.out.println("array sorted ");
        }
      }
    }

    
  }
  public static void printArr(int arr[]) {
    for (int i=0;i<arr.length;i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int nums[] = { 5, 4, 3, 2, 1};
    bubblesort(nums);
    printArr(nums);
  }
}
