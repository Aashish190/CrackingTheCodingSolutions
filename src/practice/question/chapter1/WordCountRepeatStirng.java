package practice.question.chapter1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aashish on 7/16/16.
 */
public class WordCountRepeatStirng {
    static void createString(String input){
        Map<Character, Integer> map= new HashMap<>();
        for(int i=0; i <input.length(); i++){
            if(map.containsKey(input.charAt(i))){
                int count = map.get(input.charAt(i)) + 1;
                map.put(input.charAt(i), count);
            }else{
                map.put(input.charAt(i), 1);
            }
        }
        String finalString = "";
        for(char c : map.keySet()){
            finalString += c+""+map.get(c);
        }
        System.out.println(finalString);

    }

    public static void main(String[] args) {
        String input = "aaaaaaaaacccccccccbbbbbbbbbbbddddeeeeeecccccc";
        WordCountRepeatStirng.createString(input);

    }
}
