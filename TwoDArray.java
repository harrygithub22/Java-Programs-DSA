import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        // Two D Array's in Java

        Scanner sc = new Scanner(System.in);

        int [][] arr=new int [3][3];
        System.out.println(arr.length);//Print the no.of rows only

        // input in 2D array    
        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]=sc.nextInt();
                
            }
        }
        System.out.println();
        //Output
        for ( int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
                
            }
            System.out.println();            
        }
        //Output Using String function
        for ( int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));          
        }

        //Output using enhanced for loop 
        // here every row in 2d arrray is array itself
        // for string array     for( string a :arr){syso(a);}
        for(int [] a: arr){
            System.out.println(Arrays.toString(a));
        }

     }
}
