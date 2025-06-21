public class solidRhombus {
    public static void main(String[] args) {
        int rows = 5;

        for(int x=1; x<=rows; x++){
            for(int k=1; k <= rows-x; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=rows; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
