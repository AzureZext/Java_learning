public class palindromicPattern {
    public static void main(String[] args) {
        int rows = 5;

        for(int x = 1; x<= rows; x++){

            for(int k = 1; k<=rows-x; k++){
                System.out.print("  ");
            }

            for(int y=x; y>=1; y--){
                System.out.printf("%d ", y);
            }

            for(int j = 2; j<=x; j++){
                System.out.printf("%d ", j);
            }
            
            System.out.println();
        }
    }
}
