public class fibRecursion {
    
    public static void printFib(int n, int first, int second){

        if(n == 0) return;
        int c = first+second;
        System.out.print(first + " ");

        
        printFib(n-1, second, c);
    }
    public static void main(String[] args) {
        int n = 10;
        printFib(n, 0, 1);

    }
}
