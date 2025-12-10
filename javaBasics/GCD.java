public class GCD{
    public static void findGCD(int n1, int n2){
        int GCD=1;
        for(int i = 1; i<n1 && i<n2; i++){
            if((n1%i == 0) && (n2%i == 0) ){
                GCD = i;
            }
        }
        System.out.print("GCD of " + n1 + " and " + n2 + " is " + GCD + ".");
    }
    public static void main(String args[]){
        int n1 = 8;
        int n2 = 16;
        findGCD(n1,n2);
    }
}