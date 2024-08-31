import java.util.*;


public class array {
    public static void update(int marks1[]) {
        for (int i = 0; i < marks1.length; i++) {
            marks1[i]=marks1[i]+1;
            
        }
        
    }
    public static void main(String[] args) {
        int marks[]=new int[100];

        Scanner sc= new Scanner(System.in);
        // int phy;
        // phy= ssc.nextInt();

        // input array
        marks[0]=sc.nextInt(); //phy
        marks[1]=sc.nextInt(); //chem
        marks[2]=sc.nextInt(); //math

        // display array
        System.out.println("phy  :" +marks[0]);
        System.out.println("chem :" +marks[1]);
        System.out.println("math :" +marks[2]);
        
        // updating an array 
        marks[2]=marks[2] +2;
        System.out.println("math :" +marks[2]);

        int percentage =(marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage :"+percentage +"%");
        
        // To find length of any array
        System.out.println("Length of array"+ marks.length);

        // Passing array as an argument 
        int marks1[]={97,98,99};

        update(marks1);

        // print our marks1[] array
        for (int i = 0; i < marks1.length; i++) {
            System.out.print(marks1[i]+" ");
            
        }
        System.out.println();

        
        
    }
    
}
