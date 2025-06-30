import java.util.Scanner;

public class getBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter the position to find bit at: ");
        int pos = sc.nextInt();
        sc.close();
        int bitmask = num<<pos;

        System.out.printf("The bit at position %d is %d", pos, (bitmask&num)==0?0:1);

        
    }
}
