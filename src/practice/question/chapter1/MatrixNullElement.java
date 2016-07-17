package practice.question.chapter1;

/**
 * Created by aashish on 7/16/16.
 */
public class MatrixNullElement {
    static void checkZeroEntry(int[][] a){
        boolean flag = false;
        for(int i =0; i< 3 ; i++){
            String s="";
            for(int j =0; j<3; j++){
                if(a[j][i]==0){
                    setZero(j,i, a);
                }else{
                    continue;
                }
            }

        }
    }
    static void setZero(int j, int i, int[][] a){
        for(int row= 0; row<3 ; row++){
            a[j][row]=0;
        }
        for(int col=0; col<3;col++){
            a[col][i]=0;
        }
        for(int row =0; row< 3 ; row++){
            String s="";
            for(int col =0; col<3; col++){
                s+=a[col][row];
            }
            System.out.println(s);
        }
    }
    //i coloumn and j is row
    public static void main(String[] args) {
        int[][] a = {{1,2,0,},{5,6,8},{0,5,7},{2,3,8}};
        MatrixNullElement mne = new MatrixNullElement();
        mne.checkZeroEntry(a);
    }
}
