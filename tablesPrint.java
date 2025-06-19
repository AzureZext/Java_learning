import  java.util.Scanner;
public class tablesPrint {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        for(int x=1; x<=num; x++){
            for(int y=1; y<11; y++){
                System.out.println(x + " x " + y + " = " + x*y);
            }
            System.out.println();
        }
    }
}
