public class sumNRecursion {

    public static int sum(int num){
        if(num == 0) return 0;

        return num + sum(num-1);
    }
    
    public static void main(String[] args) {
        int num = 100;

        int sm = sum(num);
        System.out.println(sm);
    }
}
