public class setBit {
    public static void main(String[] args) {
        int num = 5;
        int pos = 10;
        int bitMask = 1<<pos;


        System.out.printf("After setting bit to 1 at %d position, the new number: %d", pos, (bitMask | num));
    }
}
