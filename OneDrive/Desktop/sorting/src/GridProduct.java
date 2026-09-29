import java.util.Arrays;

public class GridProduct {
    static void main() {
        int [][]arr={
                {1,2},
                {3,4}
        };
        System.out.println(Arrays.toString(constructProductMatrix(arr)));
    }
   static public int[][] constructProductMatrix(int[][] grid) {
        int []prefix=new int[grid.length*grid[0].length];
        int []suffix=new int[grid.length*grid[0].length];
        int []arr=new int[grid.length*grid[0].length];
        prefix[0]=1;
        suffix[grid.length*grid[0].length-1]=1;
        int arr1pos=0,arr2pos=0,index=0,productVal=0;
        int [][]ans=new int[grid.length][grid[0].length];
        for( int row=0;row<grid.length;row++){
            for(int col=0;col<grid[0].length;col++){
                arr[arr1pos]=grid[row][col];
                arr1pos++;
            }
        }

        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]*arr[i-1];
        }
        for(int j=arr.length-1;j>0;j--){
            suffix[j-1]=suffix[j]*arr[j];
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                productVal=prefix[index]*suffix[index];
                if(productVal>=12345){
                    ans[i][j]=productVal%12345;
                }else{
                    ans[i][j]=productVal;
                }
                index++;
            }
        }
        return ans;
    }
}
