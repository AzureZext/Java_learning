public class selectionSort {
    
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,7,55,3,32,1009,2221,33,44,33221,44,998};

        for(int x=0; x<arr.length-1; x++){
            int smallest = x;
            for(int y=x+1; y<arr.length; y++){
                if(arr[smallest]>arr[y]){
                    smallest = y;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[x];
            arr[x] = temp;
        }
        for(int x=0; x<arr.length; x++){
            System.out.print(arr[x] + " ");
        }
    }
}
