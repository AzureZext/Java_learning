public class recursion3 {

    public static void moveX(String str, int index, int count, String newString){
        if(index == str.length()) {
            for(int x=0; x<count; x++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        if(str.charAt(index) == 'x'){
            count++;
            moveX(str, index+1, count, newString);
            
        }
        else{
            newString += str.charAt(index);
            moveX(str, index+1, count, newString);
        }

        // System.out.print(str.charAt(index));
        

    }
    public static void main(String[] args) {
        String str = "xxdxaxbxxxxdxxxdxxx";
        moveX(str, 0, 0, "");


    }
}
