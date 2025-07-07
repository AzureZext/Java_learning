public class recursion7 {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
    public static int count = 0;
    public static void printCombination(String str, int index, String combination){

        if(index == str.length()){
            count++;
            System.out.println(combination);
            return;
        }

        char curChar = str.charAt(index);
        String mapping = keypad[curChar - '0'];

        for(int x=0; x<mapping.length(); x++){

            printCombination(str, index+1, combination+mapping.charAt(x));
        }
    }

    public static void main(String[] args) {
        String str = "123456789";
        printCombination(str, 0, "");
        System.out.println("Total combinations: " + count);
    }
}
