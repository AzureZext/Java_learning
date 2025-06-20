public class triangle01 {
    public static void main(String[] args) {
        int rows = 5;

        for(int x=0; x<rows; x++){
            for(int y=0; y<=x; y++){
                if((x+y)%2 == 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }
    
}
