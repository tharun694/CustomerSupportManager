package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {
    static void main() {
        int[][] edges = {
                {0, 1},
                {0, 2},
                {1, 3},
                {2, 4},
                {3, 5},
                {4, 5}
        };
        System.out.println(bfs(6,construct(edges,6)));
    }
   static ArrayList<Integer> bfs(int v,ArrayList<ArrayList<Integer>>adj){
        int []visited=new int[v];
        Queue<Integer>queue=new LinkedList<>();
        ArrayList<Integer>ans=new ArrayList<>();
        queue.add(0);
        visited[0]=1;
        while(!queue.isEmpty()){
            int n=queue.poll();
            ans.add(n);
            for(int node:adj.get(n)){
                if(visited[node]==0){
                    visited[node]=1;
                    queue.add(node);
                }
            }

        }
        return ans;
    }
 static    ArrayList<ArrayList<Integer>>  construct(int [][]edges,int V){
       ArrayList<ArrayList<Integer>>result=new ArrayList<>();
       for(int i=0;i<V;i++){
           result.add(new ArrayList<>());
       }
        for(int []edge:edges){
            int u=edge[0];
            int v=edge[1];
            result.get(u).add(v);
            result.get(v).add(u);
        }
       return result;
    }
}
