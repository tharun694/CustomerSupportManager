package prefix;

public class Matrix {

    public static void main(String[] args) {
int [][]mat={
        {3, 0, 1, 4, 2},
        {5, 6, 3, 2, 1},
        {1, 2, 0, 1, 5},
        {4, 1, 0, 1, 7},
        {1, 0, 3, 0, 5},

};
        System.out.println(sumregion(mat,1, 1, 2, 2));
    }
    static int sumregion(int [][]matrix,int row1,int col1,int row2,int col2){
        int [][]prefix=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int top=i>0?prefix[i-1][j]:0;
                int left=j>0?prefix[i][j-1]:0;
                int overlap=i>0&&j>0?prefix[i-1][j-1]:0;
                prefix[i][j]=matrix[i][j]+top+left-overlap;
            }
        }
        int top=row1>0?prefix[row1-1][col2]:0;
        int left=col1>0?prefix[row2][col1-1]:0;
        int overlap=row1>0 ?prefix[row1-1][col1-1]:0;
        int total=prefix[row2][col2];
        return (total-top-left)+overlap;

    }
}
