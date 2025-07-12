import java.util.ArrayList;

public class recursion12 {
    public static void printSubset(int n, ArrayList<Integer> subset){

        if(n == 0){
            
            for(int x = 0; x<subset.size();x++){
                System.out.print(subset.get(x)+" ");

            }
            System.out.println();

            return;
        }
        subset.add(n);
        printSubset(n-1, subset);

        subset.remove(subset.size()-1);
        printSubset(n-1, subset);

    }

    public static void main(String[] args) {
        ArrayList<Integer> subset = new ArrayList<>();

        int n = 3;
        printSubset(n, subset);


    }
}
