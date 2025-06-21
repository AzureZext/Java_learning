public class diamondPattern {
    public static void main(String[] args) {
        int rows = 10;

        for(int x=1; x<=rows; x++){
            for(int k=1; k<=rows-x; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=x*2-1; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        for(int x=rows; x>=1; x--){
            for(int k=1; k<=rows-x; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=x*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
