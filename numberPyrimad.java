public class numberPyrimad {
    public static void main(String[] args) {
        int rows = 6;

        for(int x=1; x<= rows; x++){
            for(int k=0; k<=rows-x; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=x; j++){
                System.out.printf("%d ", x);
            }
            System.out.println();
        }
    }
}
