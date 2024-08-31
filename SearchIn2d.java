import java.util.Arrays;

public class SearchIn2d {

  public static void main(String[] args) {
    int[][] arr = { { 23, 4, 65 }, { 24, 65, 67, 2 }, { 43, 72, 3, 6, 8 } };
    int a = 43;
    int[] ans=search(arr, a);// format of return value {row,col}
    System.out.println(Arrays.toString(ans));
  }

  static int[] search(int[][] arr, int target) {
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        if (target == arr[row][col]) {
          return new int[] { row, col };
        }
      }
    }
    return new int[] { -1, -1 };
  }
}
