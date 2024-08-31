// In a program input the side of square and output the area

import java.util.*;
public class areaofsq {

  public static void main(String[] args) {
    //find area of square
    Scanner sc = new Scanner(System.in);
    int side = sc.nextInt();
    int area = side * side;
    System.out.println(area);
  }
}
