public class reverseStringRecursion {

    public static void reverseString(String str, int len){
        if(len<0) return;

        System.out.print(str.charAt(len));
        reverseString(str, len-1);

    }
    public static void main(String[] args) {
        String str = "my name is abcd";
        reverseString(str, str.length()-1);

    }
}
