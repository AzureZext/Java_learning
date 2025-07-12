public class recursion11 {
    public static int peopleComb(int n){

        if(n <= 1) return 1;
        

        // for single
        int single = peopleComb(n-1);

        // for pairs
        int pairs = (n-1)*peopleComb(n-2);

        return single+pairs;
    }

    public static void main(String[] args) {
        int ans = peopleComb(1090);
        System.out.println(ans);
    }
}
