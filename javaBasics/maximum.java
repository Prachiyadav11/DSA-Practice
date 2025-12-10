public class maximum{

    public static int printLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
       for(int i =0;i<arr.length-1; i++){
         if(arr[i]>largest){
            largest =arr[i];
        }
       }
       return largest;
    }

    public static void main(String args[]){
        int arr[] = {45,89,21,46};
       System.out.print(printLargest(arr));
    }
}