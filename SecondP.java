// Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
import java.util.*;
public class SecondP {
    public static void main(String[] args){
        //find the area of circle
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle :");
        int radius = sc.nextInt();
        // System.out.println(radius);
        double area = 3.14*radius*radius;
        System.out.print("Area of circle : ");
        System.out.println(area);
    }
}
