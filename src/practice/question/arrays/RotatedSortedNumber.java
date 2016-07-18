package practice.question.arrays;

/**
 * Created by aashish on 7/7/16.
 * trying to find the smallest in the sorted roated array of integer:
 * case scenarios: 5,6,7,8,9,10,1,2,3,4
 *                      8,9,10,1,2,3,4,5,6,7
 *                      1,2,3,4,5,6,7,8,9,10
 *                      10,1,2,3,4,5,6,7,8,9
 */
public class RotatedSortedNumber {
    static int mid, position,last;

    public static void main(String[] args) {
        RotatedSortedNumber rsn= new RotatedSortedNumber();
        int[] input= {5,6,7,8,9,10,1,2,3,4};
        last = input.length -1;
        position = last/2;
        mid = input[position];
        if(input.length == 1){
            System.out.println(input[0]);
        }
        rsn.findMid(input);
    }
    public void findMid(int[] input){

            if (mid > input[last]) {
                position++;
                mid = input[position];
                findMid(input);
            } else if (mid < input[last]){
                last= position;
                position = last/2;
                mid = input[position];
                findMid(input);
            }else{
                System.out.println(""+mid);
            }
    }
}
