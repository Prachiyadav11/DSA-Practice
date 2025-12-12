public class binarySearch{
    public static void binSearch(int arr[],int key){
        int first=0;
        int last = arr.length-1;
     
        while(first<=last){
               int mid = (first+last)/2;
            if(arr[mid] == key){
                System.out.print("key is at index" + mid);
                return;
            }
            else if(key>arr[mid]){
                first = mid+1;
            }
            else{
                last = mid-1;
            }
        }
        System.out.print("Key is not found.");
    }

    public static void main(String args[]){
        int arr[] ={12,23,34,45,56,78};
        int key = 23;
        binSearch(arr,key);
    }
}