public class SearchInStrings {
    public static void main(String[] args) {
        String name="Hardik";
        char t='x';
        System.out.println(search(name,t));
    }
    static boolean search(String str, char a){
        if (str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (a==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    
}
