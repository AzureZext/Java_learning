import java.util.Scanner;

public class sumFunction {
    
    public static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum = add(a,b);
        System.out.printf("%d + %d = %d", a, b, sum);

    }
}
