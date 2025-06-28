import java.util.*;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        StringBuilder name = new StringBuilder(sc.nextLine());
        sc.close();
        for(int x = 0; x<(name.length())/2; x++){
            char temp = name.charAt(x);
            int lastIndex = name.length() - (x+1);
            name.setCharAt(x, name.charAt(lastIndex));
            name.setCharAt(lastIndex, temp);

        }
        System.out.println(name);




    }
}
