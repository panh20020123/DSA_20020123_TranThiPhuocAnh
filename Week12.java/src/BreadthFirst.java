import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BreadthFirst {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(), m = sc.nextInt();
            ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(n+1);
            for(int i=0; i<n+1; i++)
                adj.add(new ArrayList<Integer>());

            for(int i=0; i<m; i++){
                int x = sc.nextInt(), y = sc.nextInt();
                adj.get(x).add(y); adj.get(y).add(x);
            }
            int s = sc.nextInt();
            bfs(s, adj, n);
            //System.out.println(bfs(s, adj, n));
        }
    }

    static void bfs(int s, ArrayList<ArrayList<Integer>> adj, int n){
        boolean[] vis = new boolean[n+1];
        vis[s] = true;

        int[] dist = new int[n+1];
        Arrays.fill(dist, -1);

        dist[s] = 0;
        Deque<Integer> q = new ArrayDeque<Integer>();

        q.add(s);

        while(q.size() > 0){
            int curr = q.peek();
            Iterator<Integer> it= adj.get(curr).iterator();
            while(it.hasNext()){
                int temp = it.next();
                if(!vis[temp]){
                    dist[temp] = dist[curr] + 1;
                    q.add(temp);
                    vis[temp] = true;
                }
            }
            q.remove();
        }

        for(int i=1; i<dist.length; i++){
            if(i != s)
                System.out.print(((dist[i] != -1)?dist[i]*6:-1 )+ " ");
        }
        System.out.println();
    }
}