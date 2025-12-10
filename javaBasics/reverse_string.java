public class reverse_string{

    public static void reverseString(String str){
        String revString = " ";
        for(int i = str.length()-1; i>=0;i--){
            revString += str.charAt(i);
        }
        System.out.print(revString);
    }

    public static void main(String args[]){
        String str = "apple";
        reverseString(str);
    }
}