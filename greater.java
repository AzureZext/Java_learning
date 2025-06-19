import java.util.Scanner;

public class greater {
    public static void main(String[] args) {
        
        System.out.print("Enter two nnumbers:");
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int large = a>b?a:b;
        int small = a>b?b:a;

        System.out.println(large + " is larger than "+ small);

    }
}
