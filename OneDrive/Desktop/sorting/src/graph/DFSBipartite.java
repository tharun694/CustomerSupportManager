package graph;

import java.util.ArrayList;
import java.util.Arrays;

public class DFSBipartite {

    public static void main(String[] args) {
        int V=4;
        int[][] edges = {
                {0,2},
                {0,3},
                {1,2},
                {1,3},
        };
        boolean isBipartite=true;
        ArrayList<ArrayList<Integer>>adj=construct(edges,V);
        int []color=new int[V];
        Arrays.fill(color,-1);
        for(int i=0;i<V;i++){
            if(color[i]==-1){
                if(dfs(i,adj,0,color)==false){
                   isBipartite= false;
                };
            }
        }
        System.out.println(isBipartite);
    }
    private static boolean dfs(int i,ArrayList<ArrayList<Integer>>adj,int col,int []color){
int node=i;
color[node]=col;
for(int it:adj.get(node)){
    if(color[it]==-1){
        dfs(it,adj,1-col,color);
    }else if(color[node]==color[it]){
        return false;
    }
}
return true;
    }

    static ArrayList<ArrayList<Integer>> construct(int[][] edges, int V) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            result.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            result.get(u).add(v);
            result.get(v).add(u);
        }
        return result;
    }
}
