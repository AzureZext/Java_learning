public class hollowRectanglePattern {
    public static void main(String[] args) {
        int n = 10;

        for(int x=1; x<=n; x++){
            for(int y=1; y<=n+1; y++){
                if(x==1 || x==n || y== 1 || y==n+1){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
