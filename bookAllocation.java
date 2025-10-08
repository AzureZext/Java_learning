import java.util.Arrays;

public class bookAllocation {

    public static boolean isValid(int[] arr, int students, int books, int mid){

        int st = 1, totalPages = 0;
        for(int x: arr){
            if(x> mid) return false;

            if(totalPages + x <= mid){
                totalPages += x;
            }
            else{
                st++;
                totalPages = x;
            }

        }
        if(st<= students) return true;
        else return false;
    }

    public static int solve(int[] arr, int students){
        int start = Arrays.stream(arr).max().getAsInt() , end = 0;
        for(int element: arr) end+= element;
        int books = arr.length;
        int mid, ans=-1;
        if(books>=students){
            while(start <= end){
                mid = start+(end-start)/2;

                if(isValid(arr, students, books, mid)){
                    ans = mid;

                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] tests = {
            {2,1,3,4},
            {2,1,3,4},
            {10},
            {5,5,5,5},
            {7,2,5,10,8},
            {1,1,1,1,1},
            {1,2,3,4,5},
            {9,8,7}
        };
        int[] students = {2,5,1,2,2,5,1,3};
        int[] expected = {6,-1,10,10,18,1,15,9};
        

        for(int i=0;i<tests.length;i++){
        
            int res = solve(tests[i], students[i]);
            System.out.printf("case %d: arr=%s students=%d -> got=%d expected=%d%n",
                i+1, java.util.Arrays.toString(tests[i]), students[i], res, expected[i]);
        }

    }
}
