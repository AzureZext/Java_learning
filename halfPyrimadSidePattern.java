public class halfPyrimadSidePattern {
    public static void main(String[] args) {
        int n=4;

        for(int x = 1; x<=n; x++){
            for(int k=1; k<=n-x; k++){
                System.out.print(" ");

            }
            for(int y=1; y<=x; y++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
