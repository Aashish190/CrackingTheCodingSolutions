package practice.question.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aashish on 7/16/16.
 */
public class UniqueStringCheck {
    static void noDataStructure(String input){
        boolean flag = false;
        char repeating=' ';
        char space =' ';
        for(int i= 0; i < input.length() ; i++){
            if(input.charAt(i)==space){
                continue;
            }
            for(int j=i+1; j<input.length(); j++){
                if(input.charAt(i) == input.charAt(j)){
                    flag = true;
                    repeating= input.charAt(j);
                    break;
                }
            }
        } if(flag){
            System.out.println(repeating+": repeatable");
        }
    }

    static void withDataStructure(String input){
        Map<Character, Integer> map= new HashMap<>();
        boolean flag = false;
        char repeatable = ' ';
        char space= ' ';
        for(int i=0 ; i <input.length(); i++){
            if(input.charAt(i)==space){
                map.put(space,1);
                continue;
            }
            if(map.containsKey(input.charAt(i))){
                repeatable = input.charAt(i);
                flag = true;
                break;
            }else{
                map.put(input.charAt(i),1);
            }
        }
        if(flag){
            System.out.println(repeatable+": is repeating ");
        }
    }
    public static void main(String[] args) {
        String input1 =" i am not repeatable"; // repeatable + space repeatable
        String input2 ="megha stkrlop zxcvbn";// no repeating word but space repeatble
        String input3 ="qwertyuiopasdfghjklzxcvbnm";
        String input4 ="qwertyuiopasdfghjklzxcvbnmm";
        UniqueStringCheck usc= new UniqueStringCheck();
        noDataStructure(input1);
        noDataStructure(input2);
        noDataStructure(input3);
        noDataStructure(input4);

        System.out.println("############################");

        withDataStructure(input1);
        withDataStructure(input2);
        withDataStructure(input3);
        withDataStructure(input4);

    }
}
