import java.util.Scanner;

public class exercise2 {

    public static void printAvg(float a, float b, float c){
        float avg = (a+b+c)/3;

        System.out.println("Average: " + avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        sc.close();

        printAvg(a, b, c);
    }
}
