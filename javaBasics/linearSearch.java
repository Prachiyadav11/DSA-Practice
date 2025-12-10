public class linearSearch{
    public static int linSearch(int arr[], int key){
        for(int i =0; i<arr.length;i++){
            if(arr[i] == key){
               return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,6,3,9,1};
        int key = 3;
        int result = linSearch(arr,key);
         if (result == -1)
            System.out.println("Key not found.");
        else
            System.out.println("Key found at index " + result);
    }
}