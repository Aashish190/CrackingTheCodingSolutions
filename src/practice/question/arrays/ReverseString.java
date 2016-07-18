package practice.question.arrays;

/**
 * Created by aashish on 7/13/16.
 */
public class ReverseString {
    static String reverseString(String a){
        String reverse= "";
        for(int i=a.length()-1; i>=0; i--){
            reverse =reverse+a.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args) {
        ReverseString rs= new ReverseString();
        String a= "hello reverse me";
        String reverseString= reverseString(a);
        System.out.println(reverseString);
    }
}
