package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class UndirectedGraphDFS {
    static void main() {
        int[][]edges={
                {0,1},
                {1,2},
                {2,3},
                {3,0}
        };
        System.out.println(isCycle(4,edges));
    }

    public  static boolean  isCycle(int V,int [][]edges){
        ArrayList<ArrayList<Integer>>adj= constructList(4,edges);
        boolean[]visited=new boolean[V];
        visited[0]=true;
        for(int i=0;i<V;i++){
            if(dfs(i,-1,visited,adj))return true;
        }
        return false;
    }

    private static boolean dfs(int node, int parent, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {

        for(int neighbor:adj.get(node)){
            if(!visited[neighbor]){
                visited[neighbor]=true;
                if(dfs(neighbor,parent,visited,adj))return true;
            }else if(parent!=neighbor){
                return true;
            }
        }
        return false;
    }

    static private ArrayList<ArrayList<Integer>> constructList(int V,int [][]edges) {
        ArrayList<ArrayList<Integer>>adjacency=new ArrayList<>();
        for(int i=0;i<V;i++){
            adjacency.add(new ArrayList<>());
        }
//        for(int[]edge:edges){
//            int u=edge[0];
//            int v=edge[1];
//           adjacency.get(u).add(v);
//           adjacency.get(v).add(u);
//        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adjacency.get(u).add(v);
            adjacency.get(v).add(u);
        }

        return adjacency;
    }
}
