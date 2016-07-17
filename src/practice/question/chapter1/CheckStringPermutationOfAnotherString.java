package practice.question.chapter1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aashish on 7/16/16.
 */
public class CheckStringPermutationOfAnotherString {
    static void checkPermutation(String input, String check){
        boolean flag= false;
        char extraCheckCharacter =' ';
        if(check.length()<=input.length()){
            Map<Character, Integer> checkMap = new HashMap<>();
            Map<Character, Integer> inputMap = new HashMap<>();

            for(int i = 0; i < check.length();i ++){
                if(checkMap.containsKey(check.charAt(i))){
                    int count = checkMap.get(check.charAt(i)) + 1;
                    checkMap.put(check.charAt(i),count);
                }else{
                    checkMap.put(check.charAt(i),1);
                }
            }

            for(int i = 0; i < input.length();i ++){
                if(inputMap.containsKey(input.charAt(i))){
                    int count = inputMap.get(input.charAt(i)) + 1;
                    inputMap.put(input.charAt(i),count);
                }else{
                    inputMap.put(input.charAt(i),1);
                }
            }
            for(char c :checkMap.keySet()){
                if(inputMap.containsKey(c)){
                    if(checkMap.get(c) <= inputMap.get(c)){
                        continue;
                    }else{
                        flag = true;
                        extraCheckCharacter = c;
                        break;
                    }
                }else{
                    flag = true;
                    extraCheckCharacter = c;
                    break;
                }
            }


        }else{
            System.out.println("string "+check +" is not permuation of given input :"+input);
        }
        if(flag){
            System.out.println("failure :-: the character :"+extraCheckCharacter +"  occurs more than it occurs in the input string.");
        }
    }
    public static void main(String[] args) {
        String input = "aashish";
        String check = "aasiss";
        CheckStringPermutationOfAnotherString csp = new CheckStringPermutationOfAnotherString();
        csp.checkPermutation(input,check);
        csp.checkPermutation("qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm","qwertyuiopqwertyuiopasdfghjcvbnmcvbnmcvbnm");

    }
}
