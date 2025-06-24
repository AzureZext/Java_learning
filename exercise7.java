import java.util.Scanner;

public class exercise7 {
    public static void printFib(int num){
        int first = 0;
        int second = 1;

        for(int x = 1; x <= num; x++){
            System.out.printf("%d ", first);

            int temp = second;
            second = first + second;
            first = temp; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n terms of fibonacci series to print: ");
        int num = sc.nextInt();
        sc.close();
        printFib(num);

        
    }
}
