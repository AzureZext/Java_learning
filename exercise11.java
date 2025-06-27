import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        sc.nextLine();
        String[] names = new String[size];

        System.out.printf("Enter %d names\n", size);
        int sum = 0;
        for(int x=0; x<size; x++){
            names[x] = sc.nextLine();
        }

        for(int x=0; x<size; x++){
            sum += names[x].length();

        }

        sc.close();
        System.out.println("Cumulative length of all the names is " + sum);
    }
}
