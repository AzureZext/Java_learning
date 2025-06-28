import java.util.Scanner;

public class decToBin {

    public static void toBin(int num){
        if(num == 0){
            return;
        }
        toBin(num/2);
        System.out.print(num%2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        toBin(num);
        sc.close();
    }
}
