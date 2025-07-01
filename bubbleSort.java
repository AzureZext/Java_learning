public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,6,3,8,1,4,4,5,4,2,1,7,6,4,66,7,887,21};//{1,2,3,4}

        for(int x=0; x<arr.length-1; x++){
            for(int y=0; y<arr.length-x-1; y++){
                if(arr[y]>arr[y+1]){
                    int temp = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = temp;
                }
            }
        }

        for(int x=0; x<arr.length; x++){
            System.out.print(arr[x] + " ");
        }
    }
}
