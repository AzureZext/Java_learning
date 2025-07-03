public class xPowerN {
    public static int pow(int num, int n){
        if(n == 0){
            return 1;
        }
        return num * pow(num, n-1);
        
    }

    public static void main(String[] args) {
        int num = 2;

        int n = 4;
        int ans = num* pow(num, n-1);
        System.out.println(ans);
    }
}
