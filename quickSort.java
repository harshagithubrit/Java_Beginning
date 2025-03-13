public class quickSort {



    public static int partition(int[] arr, int low, int high) {
        int pivot=arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }

    public static void quickSort2(int[] arr,int low,int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort2(arr, low, pi-1);
            quickSort2(arr, pi+1, high);

        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 62, 2, 3, 111, 81, 4};
        quickSort2(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}




