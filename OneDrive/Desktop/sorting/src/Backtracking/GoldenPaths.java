package Backtracking;

public class GoldenPaths {
    public static void main(String[]args){
        int [][]arr={{1,0,7},
                {2,0,6},
                {3,4,5},
                {0,3,0},
                {9,0,20}
        };
        System.out.println( goldenPath(arr));
    }
    static int  goldenPath(int[][] arr){
        int max=0,value=0;
        for(int row=0;row<arr.length;row++) {
            for (int col = 0; col < arr[0].length; col++) {
                max = Math.max(max, backtrack(arr, 0, 0, row, col, new boolean[arr.length][arr[0].length]));
            }
        }
       return max;
    }
    static int backtrack(int [][]arr,int count,int maxPath,int r,int c,boolean [][]visited){
        if(r>=arr.length||c>=arr[0].length||r<0||c<0){
            return maxPath=Math.max(maxPath,count);
        }
        if(arr[r][c]!=0) {
            if (!visited[r][c]) {
                visited[r][c] = true;
                maxPath = Math.max(maxPath, backtrack(arr, count + arr[r][c], maxPath, r + 1, c, visited));
                maxPath = Math.max(maxPath, backtrack(arr, count + arr[r][c], maxPath, r - 1, c, visited));
                maxPath = Math.max(maxPath, backtrack(arr, count + arr[r][c], maxPath, r, c + 1, visited));
                maxPath = Math.max(maxPath, backtrack(arr, count + arr[r][c], maxPath, r, c - 1, visited));
                visited[r][c] = false;
            }
        }
        return maxPath=Math.max(maxPath,count);
    }
}
