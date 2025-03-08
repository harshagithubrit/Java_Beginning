public class Search_algo {
    public static void main(String []args){
        int arr[] = {6,9,10,11,15,25};
        int target = 25;
        int result = binarySearch(arr,target);
        System.out.println("target emement found at the index of " + result);
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                start = mid+1;
            else
                end = mid-1;
        }
    return -1;
    }

}
