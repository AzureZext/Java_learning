import java.util.Scanner;

public class matrixNSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns number: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.printf("Enter elements in the %dx%d matrix\n", rows, cols);
        for(int x=0; x<rows; x++){
            for(int y=0; y<cols; y++){
                matrix[x][y] = sc.nextInt();
            }
        }

        System.out.println("Enter element to find: ");
        int key = sc.nextInt();
        sc.close();
        for(int x=0; x<rows; x++){
            for(int y=0; y<cols; y++){
                if(matrix[x][y] == key){
                    System.out.printf("Element found at row %d and column %d", x, y);
                }
            }
        }

    }
}
