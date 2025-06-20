public class invertedHalfPyrimadWithNumber {
    public static void main(String[] args) {
        int rows = 5;

        for(int x=rows; x>=1; x--){
            for(int y=1; y<=x; y++ ){
                System.out.print(y + " ");

            }
            System.out.println();
        }
    }
}
