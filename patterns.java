public class patterns {

  public static void main(String[] args) {
    p30(5);
  }

  static void p1(int n) {
    for (int row = 1; row <= n; row++) {
      //for every row run the col
      for (int col = 1; col <= n; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void p2(int n) {
    for (int row = 1; row <= n; row++) {
      //for every row run the col
      for (int col = 1; col <= row; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void p3(int n) {
    for (int row = 1; row <= n; row++) {
      //for every row run the col
      for (int col = 1; col <= n - row + 1; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void p4(int n) {
    for (int row = 1; row <= n; row++) {
      //for every row run the col
      for (int col = 1; col <= row; col++) {
        System.out.print(col);
      }
      System.out.println();
    }
  }

  static void p28(int n) {
    for (int row = 0; row < 2 * n; row++) {
      int totalColsInRow = row > n ? 2 * n - row : row;
      for (int col = 0; col < totalColsInRow; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void p30(int n) {
    for (int row = 1; row <= n; row++) {
      for (int space = 0; space < n - row; space++) {
        System.out.print(" ");
      }
      for (int col = row; col >= 1; col--) {
        System.out.print(col + " ");
      }
      for (int col = 2; col <= row; col++) {
        System.out.print(col + " ");
      }
      System.out.println();
    }
  }
  static void p31(int n) {
    for (int row = 0; row < 2*n-1; row++) {
      for (int col = 0; col < 2*n-1; col++) {
        int atEveryIndex=4567;
        System.out.println(atEveryIndex);
        
      }
      System.out.println();
      
    }
  }
}
