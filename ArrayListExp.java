import java.util.*;
public class ArrayListExp {
    public static void main(String[] args) {
        //Array list is the dynamic array in java ~to <vectors> in C++
        // It is used when you don't know the size of the array
        
        // What happens internally in array list ?
        // 1) Size is actually fixed
        // 2) Let say arraylist is filled by some amt
        // => It will create a new array list of let say double the size, old elements are copied in the new list
        

        // Syntax
        ArrayList <Integer> list= new ArrayList<>(5);

        list.add(23);        
        list.add(231);        
        list.add(3);        
        list.add(33);              
        list.add(435);        
        list.add(35);        
        list.add(43);        

        System.out.println(list);
        System.out.println(list.contains(23));//true
        list.set(0,99);//update the element at index 0 
        list.remove(2);//remove the element at index 2

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));//pass index here, list[index] syntax will not work here
            
        }
    }
    
}
