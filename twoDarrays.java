import java.util.Scanner;

public class twoDarrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns for a 2d array: ");

        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];

        for(int x=0; x<rows; x++){
            for(int y=0; y<cols; y++){
                System.out.printf("Enter element at [%d][%d]: ", x, y);
                matrix[x][y] = sc.nextInt();
            }
        }
        for(int x=0; x<rows; x++){
            for(int y=0; y<cols; y++){
                System.out.print(matrix[x][y] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}