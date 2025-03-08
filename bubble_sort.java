public class bubble_sort {
    public static void main(String []args){
        int arr[] = {6,5,2,8,9,4};
        int size = arr.length;
        int temp=0;
        System.out.println("before Sorting");
        for(int num:arr){
            System.out.print(num +" ");
        }

        for(int i=0;i<size;i++){
            for(int j=0;j<size-1;j++){
                if(arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(" ");
        System.out.println("After Sorting");
        for(int num:arr){
            System.out.print(num +" ");
        }
    }
}
