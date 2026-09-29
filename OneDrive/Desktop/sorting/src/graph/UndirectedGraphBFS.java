package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class UndirectedGraphBFS {
    static void main() {
        int[][]edges={
                {0,1},
                {0,2},
                {1,3},
                {2,4},
                {3,5},
                {4,5}
                };
        isCycle(6,edges);
    }


     static    public boolean isCycle(int V, int[][]edges) {

            boolean[] visited = new boolean[V];
            ArrayList<ArrayList<Integer>> adj=constructList(V,edges);
            for(int i = 0; i < V; i++) {

                if(!visited[i]) {

                    if(bfs(i, visited, adj)) {
                        return true;
                    }
                }
            }

            return false;
        }

      static   public boolean bfs(int start,
                           boolean[] visited,
                           ArrayList<ArrayList<Integer>> adj) {

            Queue<int[]> q = new LinkedList<>();

            q.offer(new int[]{start, -1});

            visited[start] = true;

            while(!q.isEmpty()) {

                int[] curr = q.poll();

                int node = curr[0];
                int parent = curr[1];

                for(int neighbor : adj.get(node)) {

                    if(!visited[neighbor]) {

                        visited[neighbor] = true;

                        q.offer(new int[]{neighbor, node});

                    }
                    else if(neighbor != parent) {

                        return true;
                    }
                }
            }

            return false;
        }


   static private ArrayList<ArrayList<Integer>> constructList(int V,int [][]edges) {
       ArrayList<ArrayList<Integer>>adjacency=new ArrayList<>();
       for(int i=0;i<V;i++){
           adjacency.add(new ArrayList<>());
       }
       for(int[]edge:edges){
           int u=edge[0];
           int v=edge[1];
           adjacency.get(u).add(v);
           adjacency.get(v).add(u);
       }
       return adjacency;
    }
}

