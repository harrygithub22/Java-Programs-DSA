public class BinarySearchOA {
    public static void main(String[] args) {
        // Order Agnostic Binary Search is a binary search algorithm that works on any order of data.
        int arr[] ={99,45,33,22,20,18,2};
        int target=20;
        System.out.println(bsOA(arr, target));
    }

    static int bsOA(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if (target < arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if (target > arr[mid]){
                    end=mid-1;
            }
            else{
                start=mid-1;
            }

        }
    }
    return -1;
    }
}