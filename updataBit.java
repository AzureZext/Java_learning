import java.util.Scanner;

public class updataBit {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter the position: ");
        int pos = sc.nextInt();

        System.out.print("Enter the bit to set (0/1): ");
        int bit = sc.nextInt();
        sc.close();
        int bitMask = 1<<pos;

        int newNumber = bit == 1?(bitMask|num):(~bitMask&num); 
        System.out.printf("The number %d after updating the bit at position %d for %d is %d", num, pos, bit, newNumber);
    }
}
