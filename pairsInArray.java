public class pairsInArray {

  public static void pairsArray(int nums[]) {
    int counter = 0;
    for (int i = 0; i < nums.length; i++) {
      int curr = nums[i];
      for (int j = i + 1; j < nums.length; j++) {
        System.out.print("(" + curr + "," + nums[j] + ")");
        counter++;
      }
      System.out.println();
    }
    System.out.println("Total pairs ="+counter);
    // Formula of total pairs Tp=n(n-1)/2 if n elements
  }


  public static void main(String[] args) {
    int nums[] = { 1, 3, 5, 7, 9 };

    pairsArray(nums);
  }
}
