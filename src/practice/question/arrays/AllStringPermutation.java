package practice.question.arrays;

import java.util.Stack;

/**
 * Created by aashish on 7/8/16.
 * given a string abcdef find all the possible sequence which are annagram/ mirror image of the word.
 * example
 * a   : a
 * ab  : ab, ba
 * abc : abc,cab, cab,bac, acb,bca
 */
public class AllStringPermutation {
    static int length, position;

    static String perm;
    public static void main(String[] args) {
        String s = "abc";
//        AllStringPermutation.totalPermuation("",s);
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(1);
        System.out.println(st.empty());
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.search(1));
        System.out.println("__________");
        st1 = (Stack<Integer>) st.clone();
        System.out.println(st1);
    }
    public static String totalPermuation(String prefix, String s) {
        for (int i = 0; i < s.length(); i++) {
            perm = totalPermuation(prefix + s.charAt(i), s.substring(0, i) + s.substring(i + 1, s.length()));
        }return null;
    }
}
