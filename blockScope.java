public class blockScope {
    public static void main(String[] args) {
        int a=10;
        int b= 30;

        {
            // int a =78 already initalized outside the block in the same method, hence you cannot initialise it again 
            a=78; // reassign the orignal ref variable to some other value 
            System.out.println(a);

            int c=99; //values initialised in this block, will remain in block

        }
        //System.out.println(c); can't use outside the block
    }
    
}
