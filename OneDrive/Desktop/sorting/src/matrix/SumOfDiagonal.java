package matrix;

import java.util.Arrays;

public class SumOfDiagonal {
    public static void main(String[]args){
        int [][]mat={
                {1,2,3,4}
        };
System.out.println(Arrays.toString(matrixReshape(mat,2,2)));



    }
   static public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length!=r*c) return mat;
        int [][]ans=new int [r][c];
        for(int i=0;i<c*r;i++){
            ans[i/c][i%c]=mat[i/mat.length][i%mat.length];
        }
        return ans;
    }
}
