public class recursion8 {

    public static void printPerm(String str, String permutation){

        if(str.length()==0){
            System.out.println(permutation);
            return;
        }

        for(int x=0; x<str.length();x++){
            char currChar = str.charAt(x);
            String newStr = str.substring(0, x) + str.substring(x+1);

            printPerm(newStr, permutation+currChar);
        }
    }
    public static void main(String[] args) {
        String str = "xy";
        printPerm(str, "");
    }
}
