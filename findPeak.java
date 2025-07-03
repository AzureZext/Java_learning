public class findPeak {
    public static int binarySearch(int arr[], int start, int end){
        

        if(start == end) return arr[start];
        int mid = start + (end-start)/2;


        if(arr[mid] > arr[mid+1]) return binarySearch(arr, start, mid);
        else if(arr[mid]< arr[mid+1]) return binarySearch(arr, mid+1, end);

        else if(arr[mid] == arr[mid+1]){
            if(arr[mid] == arr[mid-1]){
                int left = binarySearch(arr, start, mid);
                int right = binarySearch(arr, mid+1, end);
                return left>right? left:right;
            }

            else{
                int right = binarySearch(arr, mid+1, end);
                return right>arr[mid]? right:arr[mid];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,6,6,6,5,4,3,2,1};
        //{1,2,3,4,5}
        int answer = binarySearch(arr, 0, arr.length);

        System.out.println(answer);
    }
}
