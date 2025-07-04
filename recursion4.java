public class recursion4 {

    public static void removeDuplicates(String str, int index, boolean[] map, String newString){
        if(index == str.length()){
            System.out.println(newString);
            return;
        }

        int charMapIndex = str.charAt(index) - 'a';
        if(map[charMapIndex] == false){
            newString += str.charAt(index);
            map[charMapIndex] = true;
        }

        removeDuplicates(str, index+1, map, newString);
    }
    public static void main(String[] args) {
        String str = "abbccdee";
        boolean charMap[] = new boolean[26];

        removeDuplicates(str, 0, charMap, "");

    }
}
