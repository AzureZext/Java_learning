import java.util.Scanner;
public class exercise9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];

        System.out.printf("Enter %d numbers\n", size);
        for(int x = 0; x<size; x++){
            nums[x] = sc.nextInt();
        }
        sc.close();
        int maxn = Integer.MIN_VALUE;
        int minn= Integer.MAX_VALUE;

        for(int x = 0; x<size; x++){
            if(nums[x]> maxn){
                maxn = nums[x];
            }
            else if(nums[x]<minn){
                minn = nums[x];
            }
        }
        System.out.printf("Min: %d\nMax: %d", minn, maxn);

        
    }
}
