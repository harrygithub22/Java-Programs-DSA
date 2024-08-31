// Print total sub arrays of an array 
public class printSubArrays {
    public static void printSubarrays(int nums[]) {
        int Ts=0;
        for (int i = 0; i < nums.length; i++) {
            int start=i;
            for (int j = i; j < nums.length; j++) {
                int end=j;
                for (int k = start; k <= end; k++) {
                    System.out.print(nums[k] + " ");
                    // Ts++;
                    
                }
                Ts++; 
                
                System.out.println();
            }
            System.out.println();            
        }
        System.out.println("Total no. of subarrays :"+Ts);

        
    }
    public static void main(String[] args) {
        int nums[]={1,3,4,5,6};
        printSubarrays(nums);

    }
    
}
