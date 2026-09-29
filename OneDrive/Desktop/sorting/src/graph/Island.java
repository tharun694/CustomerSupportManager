package graph;

import java.util.LinkedList;
import java.util.Queue;

public class Island {


    static void main() {
        char grid[][]={
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        System.out.println(numIslands(grid));
    }
  static   public int numIslands(char[][] grid) {
        boolean[][] isVisited=new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'&& !isVisited[i][j]){
                    count++;
                    bfs(i,j,isVisited,grid);
                }
            }
        }
        return count++;
    }

  static  void bfs(int row,int col,boolean[][]isVisited,char [][]grid){
        isVisited[row][col]=true;
        int []arr=new int[2];
        Queue<int[]> queue=new LinkedList<>();
        queue.add(new int[]{row,col});
        while(!queue.isEmpty()){
            int []val=queue.poll();
            int r=val[0];
            int c=val[1];
            if(r>0){
                if(grid[r-1][c]=='1'&&!isVisited[r-1][c]){
                    queue.add(new int[]{r-1,c});
                    isVisited[r-1][c]=true;
                }
            }
            if(r<grid.length-1){
                if(grid[r+1][c]=='1'&&!isVisited[r+1][c]){
                    queue.add(new int[]{r+1,c});
                    isVisited[r+1][c]=true;

                }
            }
            if(c>0){
                if(grid[r][c-1]=='1'&&!isVisited[r][c-1]){
                    queue.add(new int[]{r,c-1});
                    isVisited[r][c-1]=true;

                }
            }
            if(c<grid[0].length-1){
                if(grid[r][c+1]=='1'&&!isVisited[r][c+1]){
                    queue.add(new int[]{r,c+1});
                    isVisited[r][c+1]=true;
                }
            }
        }
    }
}
