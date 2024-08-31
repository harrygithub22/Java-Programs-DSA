// Q1 Star Pattern
// *
// **
// ***
// ****

import java.util.*;

public class patternsbasic {

  //   public static void main(String[] args) {
  //     for (int i = 0; i <= 4; i++) {
  //         //One Line
  //         for (int j = 1; j <= i; j++) {
  //             System.out.print("*");
  //       }
  //       System.out.println();

  //     }
  //   }


  // Q2 Inverted Star Pattern
  // ****
  // ***
  // **
  // *


//   public static void main(String[] args) {
//     int n=5;
//     for (int i = 1; i <= n; i++) {
//         //Doubt In Inner loop Dry run
//           for (int j = 1; j <=(n-i+1); j++) {
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }

// Q3 Half Pyramid Pattern
// 1
// 12
// 123
// 1234

    // public static void main(String[] args) {
    //     int n=5;
    //     for (int i = 0; i <= n; i++) {
    //       //One Line
    //       for (int j = 1; j <= i; j++) {
    //           System.out.print(j);
    //     }
    //     System.out.println();

    //   }
        
    // }

// Q4 Character Pattern
// A
// BC
// DEF
// GHIJ
    public static void main(String[] args) {
      int n=5;
      char ch='A';
      for (int i=0;i<=n;i++){ 
        for(int j=1;j<i;j++){
          System.out.print(ch);
          ch++;
        }
        System.out.println();
      }
    }
}
