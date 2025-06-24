import java.util.Scanner;

public class exercise6 {

    public static int greatesCommonDivisor(int a, int b){

        int large = a>b?a:b;
        int small = a>b?b:a;

        int rem = 1;
        while(large%small != 0){
            rem = large%small; 
            large = small;
            small = rem;
        }
        return small;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        int ans = greatesCommonDivisor(a,b);

        System.out.printf("Greatest Common Divisor of %d and %d = %d", a, b, ans);
    }
}
