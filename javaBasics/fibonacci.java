public class fibonacci{
    public static void printFibo(int n){
        int first = 0, second = 1, last;
        System.out.println("0\n1");
        for(int i =0; i< n-2; i++){
            last = first + second;
            System.out.println(last);
            first = second;
            second = last;
        }
    }
    public static void main(String args[]){
        int n = 5;
        printFibo(n);
    }
}