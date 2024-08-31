import java.util.*;

public class Subarrays {

  public static void printSubarrays(int nums[]) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = i; j < nums.length; j++) {
        for (int k = i; k <= j; k++) {
          System.out.print(nums[k] + " "); //print subarray
          sum += nums[k]; //printing sums of subarrays
        }
        System.out.println("Sum=" + sum);
        sum = 0;
        System.out.println();
      }
      System.out.println();
    }
  }

  //Brute Force Technique
  public static void maxSubarraysSum(int arr[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        currSum = 0;
        for (int k = i; k <= j; k++) {
          //print Subarray's sum
          currSum += arr[k];
        }
        System.out.println(currSum);
        if (maxSum < currSum) {
          maxSum = currSum;
        }
      }
    }
    System.out.println("Max Sum =" + maxSum);
  }

  //Prefix Sum
  public static void maxSubPrefixSum(int arr[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[arr.length];

    prefix[0] = arr[0];
    //caluculate prefix array
    for (int i = 1; i < arr.length; i++) {
      prefix[i] = prefix[i - 1] + arr[i];
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1]; //main formula
        if (maxSum < currSum) {
          maxSum = currSum;
        }
      }
    }
    System.out.println("Max Sum=" + maxSum);
  }
  
  //Kadane's Algorithm 

  public static void kadanes(int arr[]) {
    int ms = Integer.MIN_VALUE;
    int cs = 0;

    for (int i = 0; i < arr.length; i++) {
      cs = cs + arr[i];
      if (cs < 0) {//The only drawback here is that if an array of -ve numbers will give ms=0
        cs = 0; 
      }
      ms = Math.max(ms, cs); //math max() function to comopare and find maximum
    }
    System.out.println("Max Kadane's Sum =" + ms);
  }

  public static void main(String[] args) {
    int nums[] = { 2, 4, 6, 8, 10 };
    int arr[] = { 1, -2, 6, -1, 3 };
    printSubarrays(nums);
    maxSubarraysSum(arr);
    maxSubPrefixSum(arr);
    kadanes(arr);
  }
}
