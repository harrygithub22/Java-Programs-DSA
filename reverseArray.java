public class reverseArray {

    public static void reverse(int nums[]) {
        int first=0,last=nums.length-1;

        while(first<last){ //Why first<=last didn't matter because the middle element need not to be swaped
            //swap
            int temp=nums[last];
            nums[last]=nums[first];
            nums[first]=temp;

            first++;
            last--;

        }
        
    }
    public static void main(String[] args) {
           int  nums[]={1,4,6,5,3,7};
           
           reverse(nums);

           System.out.print("Reversed array is : [");
           for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
           }
           System.out.print("]");
    }
    
}
