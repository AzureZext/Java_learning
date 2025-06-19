import java.util.Scanner;

public class oddevenChecker {
    public static void main(String[] args){

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.close();
        if(num%2 == 0){
            System.out.println(num + " is Even");
            return;
        }
        System.out.println(num + " is odd");
        

    }
}
