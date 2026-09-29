package graph;

import java.util.ArrayList;

public class DFSTraversal {
    static void main() {
        int[][] edges = {
                {0, 1},
                {0, 2},
                {1, 3},
                {2, 4},
                {3, 5},
                {4, 5}
        };
        System.out.println(dfs(construct(edges,6),6));
    }
    static ArrayList<Integer>dfs(ArrayList<ArrayList<Integer>>adj,int V){


int[]visited=new int[V];
      ArrayList<Integer> ans=new ArrayList<>();
      visited[0]=1;
      ans.add(0);
            ans= dfsrecursive(visited,ans,0,adj);

        return ans;
    }

    private static ArrayList<Integer> dfsrecursive(int[] visited, ArrayList<Integer> list,
                                                   int node,ArrayList<ArrayList<Integer>>adj) {

for(int index:adj.get(node)){
    if(visited[index]==0){
        visited[index]=1;
        list.add(index);
        dfsrecursive(visited,list,index,adj);

    }
}
return list;
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
