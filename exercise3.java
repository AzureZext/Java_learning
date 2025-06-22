import java.util.Scanner;

public class exercise3 {
    public static int sumNodd(int num){
        int sum = 0;
        for(int x = 1; x<=num; x++){
            if(x%2 != 0) sum += x;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int res = sumNodd(num);
        System.out.println(res);
    }
}
