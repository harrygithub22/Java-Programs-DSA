public class binarySearchArray {

  // Works Only with Sorted Array
  public static int binarySearch(int nums[], int key) {
    int start = 0, end = nums.length - 1;

    while (start <= end) {
      // int mid = (start + end) / 2; might be possible that the index get out of range
      int mid = start + (end - start) / 2;

      if (key < nums[mid]) {
        end = mid - 1;
      } else if (key > nums[mid]) {
        start = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int nums[] = { 2, 4, 6, 8, 10, 12, 14 };
    int key = 10;

    System.out.println("Key is at index :" + binarySearch(nums, key));
  }
}
