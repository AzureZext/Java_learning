public class exercise12 {
    public static void main(String[] args) {
        String original = "the quick brown fox jumps over the fence in our farm house";
        String result = "";

        for(int x=0; x<original.length(); x++){
            if(original.charAt(x) == 'e'){
                result += "i";
            }
            else{
                result += original.charAt(x);
            }
        }

        System.out.printf("Original string: %s\nResult string: %s", original, result);
    }
}
