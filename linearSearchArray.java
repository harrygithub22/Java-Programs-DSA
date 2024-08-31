import java.util.*;
public class linearSearchArray {
    public static int linearSearch(int nums[],int key) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==key){
                return i;
            }
            
        }
        return -1;
        
    }
    public static int linearString(String menu[], String dish) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i]==dish){
                return i;
            }
            
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int nums[]={1,3,5,6,3,7,10,9,8};
        int key=10;

        int index=linearSearch(nums,key);

        String menu[]={"samosa","choley bhature","chai","patties","rajma chawal","coffee"};
        String dish="coffee";

        int indexS =linearString(menu,dish);



        
        

        if (indexS==-1) {
            System.out.println("Not Found");
            
        } else {
            System.out.println("Element found at index :"+indexS);
            
        }


    }
    
}
