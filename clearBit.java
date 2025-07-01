public class clearBit {
    public static void main(String[] args) {
        int num = 10;
        int pos = 3;
        int bitMask = 1<<pos;

        System.out.printf("The number %d after clearing the bit at position %d is %d", num, pos, ~bitMask & num);
    }
}
