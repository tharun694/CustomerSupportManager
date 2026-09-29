package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import static graph.BFSTraversal.bfs;

public class BipartiteBFS {
    public static void main(String[] args) {
        int[][] edges = {
                {0,2},
                        {0,3},
                        {1,2},
                        {1,3},
        };
        int V = 4;
        ArrayList<ArrayList<Integer>> adj=construct(edges,V);
        int []color=new int[V];
        Arrays.fill(color,-1);
        boolean isBipartite=true;
        for (int i = 0; i < V; i++) {
            if(color[i]==-1) {
                if (!bfs(i, V, color, adj)) {
                    isBipartite = false;
                }
            }
        }
        System.out.println(isBipartite);
    }

    public  static boolean bfs(int start,int V,int []color,ArrayList<ArrayList<Integer>> adj){
        Queue<Integer>queue=new LinkedList<>();
        queue.add(start);
        color[start]=0;
        while(!queue.isEmpty()){
            int node=queue.remove();
            for(int i:adj.get(node)){
                if(color[i]==-1){
                    queue.add(i);
                    color[i]=1-color[node];
                }else if(color[node]==color[i]){
                    return false;
                }
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
