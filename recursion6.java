import java.util.HashSet;

public class recursion6 {
    public static void uSubsequences(String str, int index, String newString, HashSet<String> set){
        if(index == str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;

            }
            
        }

        char currChar = str.charAt(index);
        uSubsequences(str, index+1, newString+currChar, set);       
        uSubsequences(str, index+1, newString, set);
    }
    public static void main(String[] args) {
        String str = "aaa";

        HashSet<String> set = new HashSet<>();
        uSubsequences(str, 0, "", set);
    }
}
