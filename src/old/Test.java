package old;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Test {
    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int v = adj.size();
        boolean[] visited = new boolean[v];
        ArrayList<Integer> res = new ArrayList<>();
        int src = 0;
        Queue<Integer> q = new LinkedList<>();
        visited[src] = true;
        q.add(src);
        while(!q.isEmpty()){
            int curr = q.poll();
            res.add(curr);
            for(int x:adj.get(curr)){
                if(!visited[x]){
                    visited[x]=true;
                    q.add(x);
                }
            }
        }
        return res;
     }
    }
