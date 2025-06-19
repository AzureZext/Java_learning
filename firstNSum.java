import java.util.Scanner;

public class firstNSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int sum = 0;
        while(num > 0){
            sum += num;
            num--;
        }
        System.out.println("Sum " + sum);


    }
}
