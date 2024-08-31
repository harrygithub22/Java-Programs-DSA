//In a program, input 3 numbers : a,b, and c. You have to output the average of three numbers

import java.util.*;

public class avgofthreenum {

  public static void main(String[] args) {
    //give the average of three numbers
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int avg = (a + b + c) / 3;
    System.out.println(avg);
  }
}
