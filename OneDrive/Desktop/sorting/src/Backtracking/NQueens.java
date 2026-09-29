package Backtracking;


import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {

        System.out.println(queens(4));
    }
    static List<List<String>> queens(int n){
        boolean[][]board=new boolean[n][n];
        List<List<String>>ans=new ArrayList<>();
        board(board,0,ans);
        return ans;
    }
    static void  board(boolean[][]board, int row,List<List<String>>ans){

        if(row== board.length){

            ans.addAll (displayB(board));
return;
        }

        for(int col=0;col<board.length;col++){
            board[row][col]=true;
            if(isSafe(board,row,col)){
            board(board,row+1,ans);
            }
            board[row][col]=false;
        }

    }

     static boolean isSafe(boolean[][] board, int row, int col) {
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        int maxLeft=Math.min(row,col);
        for(int i=1;i<=maxLeft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        int maxRight=Math.min(row,board.length-col-1);
        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

     static List<List<String>> displayB(boolean[][] board) {
         List<String>list=new ArrayList<>();
         List<List<String>>ans=new ArrayList<>();
         for (boolean[]row:board){
            StringBuilder sb=new StringBuilder();
            for(boolean element:row){
                if(element){
                    sb.append('Q');
                }
                else{
                   sb.append('.');
                }
            }
            list.add(sb.toString());
        }
         ans.add(list);
        return ans;
    }
}
