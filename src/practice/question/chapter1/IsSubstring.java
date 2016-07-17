package practice.question.chapter1;

/**
 * Created by aashish on 7/16/16.
 */
public class IsSubstring {
    static void checkForString(String s1, String s2){
        boolean flag = false;
            if((s1.length() == s2.length()) && ((s1+s1).indexOf(s2) != -1)){
                flag =true;
            }else {
                System.out.println("Not a substring");
            }
            if(flag){
                System.out.println("It is a match :"+flag);
            }
    }
    public static void main(String[] args) {
        String s1 = "shayak";
        String s2 = "akshaa";
        // test case: repeating string aakaakaakaakaakaakaakaak  vs kaakaakaakaakaakaakaakaakaa
        // test case: repeating pattern
        IsSubstring is= new IsSubstring();
        is.checkForString(s1,s2);
    }
}
