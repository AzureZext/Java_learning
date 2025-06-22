import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if(num>0) posCount++;
            else if(num<0) negCount++;
            else if(num == 0) zeroCount++;
            else System.out.println("Invalid input");

            System.out.print("\nEnter another number? [y/n] ");
            String opt = sc.next();

            if(opt.equals("y")) continue;
            else break;


        }
        sc.close();
        System.out.printf("Total number of\nPositive numbers: %d\nNegative numbers: %d\nZeros: %d", posCount, negCount, zeroCount);

    }
}
