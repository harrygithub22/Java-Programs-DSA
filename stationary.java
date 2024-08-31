// Enter cost of 3 items from the user(usingfloatdatatype)-a pencil,a pen and an eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

import java.util.*;

public class stationary {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the cost of pencil");
    float pencil = sc.nextInt();
    System.out.println("Enter the cost of pen");
    float pen = sc.nextInt();
    System.out.println("Enter the cost of eraser");
    float eraser = sc.nextInt();
    
    float net = pencil + pen + eraser;
    System.out.println("Net :"+ net);

    float gst = (float)0.18 * net;
    System.out.println("GST :"+gst);

    float total = net + gst;
    System.out.println("Total Bill:"+total);
  }
}
