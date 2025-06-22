import java.util.Scanner;

public class factorial {

    public static void fact(int num){
        int f = 1;

        if(num<0){
            System.out.println("Invalid number");
            return;
        }

        for(int x=2; x<=num; x++){
            f *= x;
        }
        
        System.out.printf("factoria of %d = %d", num, f);
    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.close();

        fact(num);
        
    }
}
