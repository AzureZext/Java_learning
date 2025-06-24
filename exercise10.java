import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        for(int x=0; x<size; x++){
            System.out.printf("Enter element %d: ", x+1);
            nums[x] = sc.nextInt();
        }

        boolean isAsc = true;
        for(int x = 0; x < size-1; x++){
            if(nums[x]>nums[x+1]){
                isAsc = false;
            }
        }
        if(isAsc) System.out.println("The array is in Ascesnding order");
        else System.out.println("The array is not in ascending order");
    }
}
