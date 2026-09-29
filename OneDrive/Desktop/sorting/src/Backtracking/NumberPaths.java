package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberPaths {
    public static void main(String[] args) {
        boolean [][]maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int [][]path=new int[maze.length][maze[0].length];
        NumberPathsRiverPath("",maze,path,0,0,0);
    }
    static List<String> Ways(String p, int r, int c,int count){

        ArrayList<String>left=new ArrayList<>();
        ArrayList<String>right=new ArrayList<>();
        if(c==2&&r==2){
            ArrayList<String>ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }

        if(r<3&&c<3){
            left.addAll(Ways(p+'D',r+1,c+1,count+1));
        }
        if(r<3){
      left.addAll(Ways(p+'H',r+1,c,count+1));
        }
        if(c<3){
          right.addAll(Ways(p+'V',r,c+1,count+1));
        }
        left.addAll(right);
      return left;
    }
    static void NumberPathsRiver(String p,boolean[][]maze ,int r,int c ){
if(r==maze.length-1&&c==maze[0].length-1) {
    System.out.println(p);
    return;
}

maze[r][c]=false;

if(r< maze.length-1){
   NumberPathsRiver(p+'D',maze,r+1,c);
}
        if(r>0){
            NumberPathsRiver(p+'U',maze,r-1,c);
        }
if(c< maze.length-1){
    NumberPathsRiver(p+'R',maze,r,c+1);
}
        if(c>0){
            NumberPathsRiver(p+'L',maze,r,c-1);
        }
        maze[r][c]=true;
    }
    static void NumberPathsRiverPath(String p,boolean[][]maze,int [][]path,int step,int r,int c ){
        if(r==maze.length-1&&c==maze[0].length-1) {
            path[r][c]=step;
            for(int []arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
if(!maze[r][c]){
    return;
}

        path[r][c]=step;
        maze[r][c]=false;
        if(r< maze.length-1){
            NumberPathsRiverPath(p+'D',maze,path,step+1,r+1,c);
        }
        if(r>0){
            NumberPathsRiverPath(p+'U',maze,path,step+1,r-1,c);
        }
        if(c< maze.length-1){
            NumberPathsRiverPath(p+'R',maze,path,step+1,r,c+1);
        }
        if(c>0){
            NumberPathsRiverPath(p+'L',maze,path,step+1,r,c-1);
        }
        maze[r][c]=true;
        path[r][c]=0;

    }
}
