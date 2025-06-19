public class halfPyrimadPattern {
    public static void main(String[] args) {
        int n = 5;

        for(int x=0; x<n; x++){
            for(int y=0; y<=x; y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
