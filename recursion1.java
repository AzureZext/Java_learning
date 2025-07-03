public class recursion1 {

    public static void firstLastOccur(String str, char element, int idx, int first, int last ){
        if(idx <0){
            System.out.printf("First occurance of %c at %d\nLast occurance of %c at %d", element, first, element, last);
            return;
        }

        if(str.charAt(idx) == element && first == -1){
            first = idx;
            last = idx;
        }
        if(str.charAt(idx) == element && first > idx){
            first = idx;
        }
        firstLastOccur(str, element, idx - 1, first, last);
        
    }
    public static void main(String[] args) {
        String str = "Hello world";
        firstLastOccur(str, 'x', str.length()-1, -1, -1);

        
    }
}
