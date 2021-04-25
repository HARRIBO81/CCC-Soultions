import java.io.*;
import java.util.*;

public class ccc_choose_your_own_path {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char readCharacter() throws IOException {
        return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }


    public static void main(String[] args) throws IOException {
        int n = readInt();
        List<Integer> adj[] = new ArrayList[n+1];
        for(int i = 1; i <= n; i++)
        {
            adj[i] = new ArrayList<>();
            int m = readInt();
            for(int j = 1; j <=m;j++){
                adj[i].add(readInt());
            }
        }

        //BFS
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[n+1];
        int dis[] = new int[n+1];
        q.add(1);
        vis[1] = true;
        dis[1] = 0;
        int cnt = 0;
        while(!q.isEmpty()){
            int cur = q.poll(); cnt++;
            for(int nxt : adj[cur]){

                if(!vis[nxt]){
                    q.add(nxt);
                    vis[nxt]= true;
                    dis[nxt] = dis[cur]+1;
                }
            }
        }
        //END OF BFS
        if(cnt==n){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        int ans = Integer.MAX_VALUE;
        for(int i  = 1; i <= n; i++){
            if(vis[i] && adj[i].size()==0){
                ans = Math.min(ans,dis[i]);
            }
        }
        System.out.println(ans+1);

    }
}
