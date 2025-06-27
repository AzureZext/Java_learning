import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your email");
        String email = sc.nextLine();
        sc.close();
        String username = "";

        for(int x=0; x<email.length(); x++){
            if (email.charAt(x) == '@') {
                break;                
            }
            else{
                username += email.charAt(x);
            }
        }
        
        System.out.printf("Email: %s\nUsername: %s", email, username);
    }
}
