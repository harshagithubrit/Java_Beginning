public class sellection_sort {
    public static void main(String []args){

        int arr[] = {6,5,2,8,9,4};
        int size = arr.length;
        int temp = 0;
        int minIndex = 0;
        System.out.println("Before Sorting");
        for(int num:arr) {
            System.out.print(num +" ");
        }

        for(int i=0;i<size-1;i++){
            minIndex=i;
            for(int j=i+1;j<size;j++){
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;

            System.out.println(" ");
            for(int num:arr) {
                System.out.print(num +" ");
            }
        }



        System.out.println(" ");
        System.out.println("After Sorting");
        for(int num:arr) {
            System.out.print(num +" ");
        }

    }
}
