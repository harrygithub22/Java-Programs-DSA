public class AdvancedPattern {

  public static void hollow_rectangle(int totRows, int totCols) {
    //*****
    //*   *
    //*   *
    //*****

    //outer loop
    for (int i = 1; i <= totRows; i++) {
      //inner loop-cols
      for (int j = 1; j <= totCols; j++) {
        // cell -(i,j)
        if (i == 1 || i == totRows || j == 1 || j == totCols) {
          //boundary cells
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void inverted_rotated_hpyramid(int n) {
    //    *
    //   **
    //  ***
    // ****

    for (int i = 1; i <= n; i++) {
      //spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      //stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void inverted_hpyramid_nums(int n) {
    // 12345
    // 1234
    // 123
    // 12
    // 1

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  public static void floyds_tri(int n) {
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15
    int counter = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(counter + " ");
        counter++;
      }
      System.out.println();
    }
  }

  public static void tri101(int n) {
    // 1
    // 01
    // 101
    // 0101
    // 10101
    // Hint: Assume it into a matrix and you'll find that in each cell row+col is even for 1 and odd for 0
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print("1");
        } else {
          System.out.print("0");
        }
      }
      System.out.println();
    }
  }

  public static void butterfly(int n) {
    // Most Important 

    // *      *
    // **    **
    // ***  ***
    // ********  if you can do it till this part the 2nd half is mirror copy
    // ********
    // ***  ***
    // **    **
    // *      *

    // 1st half
    for (int i = 1; i <= n; i++) {
      // Stars i
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      // Spaces 2(n-i)
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }
      // Stars i
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    // 2nd half
    for (int i = n; i >= 1; i--) {
      // Stars i
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      // Spaces 2(n-i)
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }
      // Stars i
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void solid_rhombus(int n) {
    //     *****
    //    *****
    //   *****
    //  *****
    // *****

    for (int i = 1; i <= n; i++) {
      // Spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // Stars
      for (int j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void hollow_rhombus(int n) {
    // Most Important

    //     *****
    //    *   *
    //   *   *
    //  *   *
    // *****
    // Hint: Look for Hollow Rectangle

    for (int i = 1; i <= n; i++) {
      // spaces
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      // hollow rectangle -stars
      for (int j = 1; j <= n; j++) {
        if (i == 1 || i == n || j == 1 || j == n) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
  public static void diamond(int n) {
    //    *
    //   ***
    //  *****
    // *******
    // *******
    //  *****
    //   ***
    //    *

    // 1st half
    for (int i = 1; i <= n; i++) {
      // spaces
      for (int j = 1; j <= (n-i); j++) {
        System.out.print(" ");
      }
      // stars
      for (int j = 1; j <= (2*i)-1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    // 2nd half
    for (int i = n; i >=1 ; i--) {
      // spaces
      for (int j = 1; j <= (n-i); j++) {
        System.out.print(" ");
      }
      // stars
      for (int j = 1; j <= (2*i)-1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    
  }

  public static void main(String[] args) {
    // hollow_rectangle(4, 5);
    // inverted_rotated_hpyramid(5);
    // inverted_hpyramid_nums(5);
    // floyds_tri(5);
    // tri101(5);
    // butterfly(84);
    // solid_rhombus(10);
    // hollow_rhombus(10);
    diamond(10);
  }
}
