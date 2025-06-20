import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        
        int isPrime = 1;
        for(int x= 2; x<=num/2; x++){
            if(num%x == 0){
                isPrime = 0;
                break;
            }
        }

        if(isPrime == 0) System.out.println("Not a prime number");
        else if(num == 1) System.out.println("This number is neither prime nor composite");
        else System.out.println("Prime number");
    }
}
