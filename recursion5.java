public class recursion5 {
    public static void subsequence(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char curChar = str.charAt(idx);
        subsequence(str, idx+1, newString + curChar);
        subsequence(str, idx+1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";

        subsequence(str, 0, "");
    }
}
