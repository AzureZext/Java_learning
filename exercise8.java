import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        //take an array as an input from the user and search for the index of a number x and print the index


        System.out.print("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];

        for(int x=0; x<size; x++){
            System.out.printf("Enter element %d: ", x+1);
            num[x] = sc.nextInt();
        }

        System.out.print("Enter a number to find it's index: ");
        int key = sc.nextInt();
        sc.close();
        boolean keyFound = false;

        for(int x=0; x<size; x++){
            if(num[x] == key){
                System.out.printf("%d is at index %d", key, x);
                keyFound = true;
                break;
            } 

        }
        if(!keyFound) System.out.println("No element found");
        
    }
}
