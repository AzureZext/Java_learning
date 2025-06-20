public class butterflyPattern {
    public static void main(String[] args) {
        int rows = 4;

        for(int x = 1; x<=rows; x++){
            for(int j = 1; j<=x; j++){
                System.out.print("* ");
            }
            for(int k = 1; k<=(rows-x)*2; k++){
                System.out.print("  ");
            }
            for(int j = 1; j<=x; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int x = rows; x>=1; x--){
            for(int j = 1; j<=x; j++){
                System.out.print( "* ");
            }
            for(int k = 1; k<=(rows-x)*2; k++){
                System.out.print("  ");
            }
            for(int j = 1; j<=x; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
