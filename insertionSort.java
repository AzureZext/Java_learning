public class insertionSort {
    
    public static void main(String[] args) {
        int[] arr = {2,1,5,3,22,3,2,22,2,43,9};

        for(int x=1; x<arr.length; x++){
            int current = arr[x];
            int j = x-1;

            while(j>=0 && current<arr[j]){
                arr[j+1] = arr[j];
                j--;

            }
            arr[j+1] = current;
        }

        for(int x=0; x<arr.length; x++){
            System.out.print(arr[x] + " ");
        }
    }
}
