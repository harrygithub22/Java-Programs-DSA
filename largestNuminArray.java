public class largestNuminArray {
    public static void main(String[] args) {
        int nums[]={1,3,4,2,5,6,2,10,8,9,3};
        // int max=nums[0];
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i]>max){
        //         max=nums[i];
        //     }
            
        // }

        System.out.println(maxArr(nums));

        // In Java's utility package we have
        // -infinity as Integer.MIN_VALUE
        // +infinity as Integer.MAX_VALUE

    }

    static int maxArr(int []arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
            
        }
        return max;
    }
    
}
