public class towerOfHanoi{

    public static void tower(int n, String beg, String aux, String end){
        if(n <=1){
            System.out.printf("%s -> %s\n", beg, end);

            return;
        }
        tower(n-1, beg, end, aux);
        System.out.printf("%s -> %s\n", beg, end);
        tower(n-1, aux, beg, end);

        
    }
    public static void main(String[] args) {
        int n = 3;
        tower(n, "A", "B", "C");
    }
}