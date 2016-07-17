package practice.question.chapter1;

import java.util.Scanner;

/**
 * Created by aashish on 7/16/16.
 */
public class RotatingImagePixel {
    static void rotatePixel(int[][] input,int rows, int cols){
        int[][] rotateInput = new int[cols][rows];
        for(int row =0; row < rows ; row++){
            for(int col= cols-1, index=0; col >= 0;index ++,col --){
                rotateInput[row][index]= input[col][row];
            }
        }

        for(int row = 0 ; row < cols; row++){
            String a="";
            for(int col =0 ; col < rows; col++){
                a +=rotateInput[col][row];
            }
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        System.out.println("please give matrix dimension");
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.next());
        int cols = Integer.parseInt(sc.next());
        int[][] input = new int[rows][cols];

        System.out.println("please enter the element for the matrix seprated by enter key");
        for(int row = 0 ; row < rows; row++){
            for(int col =0 ; col < cols; col++){
                input[col][row]=Integer.parseInt(sc.next());
            }
        }

        for(int row = 0 ; row < rows; row++){
            String a="";
            for(int col =0 ; col < cols; col++){
                a +=input[col][row];
            }
            System.out.println(a);

        }System.out.println("           \n         ");

        RotatingImagePixel rip =new RotatingImagePixel();
        rip.rotatePixel(input,rows,cols);

    }
}
