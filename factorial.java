import java.util.Scanner;

public class factorial {

    public static int fact(int num){
        int f = 1;
        for(int x=2; x<=num; x++){
            f *= x;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.close();
        
        int res = fact(num);
        System.out.printf("factoria of %d = %d", num, res);
    }
}
