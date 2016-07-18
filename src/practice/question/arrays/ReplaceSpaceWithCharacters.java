package practice.question.arrays;

/**
 * Created by aashish on 7/16/16.
 */
public class ReplaceSpaceWithCharacters {
    static void replaceSpace(String input){
        char space= ' ';
        String s="";
        for(int i = 0; i< input.length(); i++){
            if(input.charAt(i)==space){
                s+="%20";
            }else{
                s+=input.charAt(i);
            }
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        String input = " i am here in the space zone";
        ReplaceSpaceWithCharacters rswc= new ReplaceSpaceWithCharacters();
        replaceSpace(input);
    }
}
