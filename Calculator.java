import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Select operation\n1. Addition\n2. Subtraction\n3. Division\n4. Multiplication\n5. Modulo\ntype 1,2,3,4 or 5\n-> ");
        int choice = sc.nextInt();
    
        sc.close();

        switch(choice){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a/b);
                break;
            case 4:
                System.out.println(a*b);
                break;
            case 5:
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}