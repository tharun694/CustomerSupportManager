package graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOrange {
    public static void main(String[]args){
int [][]mat={
        {2,1,1},
        {1,1,1},
        {0,1,2}
};
        System.out.println(orangesRotting(mat));
    }
  static   public int orangesRotting(int[][] grid) {
        Queue<int []> queue=new LinkedList<>();
        int level=0,time=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    queue.add(new int []{i,j,0});
                }
            }
        }
        while(!queue.isEmpty()){
            int []curr=queue.poll();
            int r=curr[0];
            int c=curr[1];
            level=curr[2];
            if(r>0){
                if(grid[r-1][c]==1){
                    grid[r-1][c]=2;
                    queue.add(new int[]{r-1,c,level+1});
                }
            }
            if(r<grid.length-1){
                if(grid[r+1][c]==1){
                    grid[r+1][c]=2;
                    queue.add( new int[]{r+1,c,level+1});
                }
            }
            if(c>0){
                if(grid[r][c-1]==1){
                    grid[r][c-1]=2;
                    queue.add(new int[]{r,c-1,level+1});
                }
            }
            if(c<grid[0].length-1){
                if(grid[r][c+1]==1){
                    grid[r][c+1]=2;
                    queue.add(new int []{r,c+1,level+1});
                }
            }
            time=Math.max(level,time);
        }

        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[0].length;col++){
                if(grid[row][col]==1)return -1;
            }
        }
        return time;
    }
}
