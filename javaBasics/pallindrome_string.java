public class pallindrome_string{

public static boolean isPallindrime(String str){
    int n = str.length();
    int i = 0;
   while(i<n){
        if(str.charAt(i) != str.charAt(n-1)){
            return false;
        }
        n--;
        i++;
    }
    return true;
}

  public static void main(String args[]){
    String str = "madam";
    System.out.print(isPallindrime("madam"));
    }
}