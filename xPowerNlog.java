public class xPowerNlog {

    public static int pow(int num, int n){
        
        if(n == 1){
            return num;
        }
        int half = pow(num, n/2);
        if(n%2 != 0) return num*half*half;

        return half*half;
    }
    public static void main(String[] args) {
        int num = 2;
        int n = 9;
        int ans = pow(num, n);
        System.out.println(ans);

        
    }
}
