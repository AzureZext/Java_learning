public class floydTriangle {
    public static void main(String[] args) {
        
        int rows = 5;
        int counter = 1;

        for(int x=0; x<rows; x++){
            for(int y=0; y<=x; y++ ){
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }
    }
}
