import java.util.Scanner;

public class exercise5 {
    public static int power(int base, int exponent){
        int result = 1;
        for(int x=1; x<= exponent; x++ ){
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print("Enter the base number: ");

        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();

        System.out.print("Enter the power to be raised: ");
        int exp = sc.nextInt();

        sc.close();

        int result = power(base, exp);
        System.out.printf("%d raised to the power %d = %d", base, exp, result);
    }
}
