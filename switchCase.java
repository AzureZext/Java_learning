import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int button = sc.nextInt();
        sc.close();
        switch (button) {
            case 1:
                System.out.println("Namaste");
                break;
            case 2:
                System.out.println("Bonjour");
                break;
            case 3:
                System.out.println("Konichiwa");
                break;
            case 4:
                System.out.println("Hello");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }    
}
