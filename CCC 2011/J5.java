import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         // FAST INPUT
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
                  
    // END OF FAST INPUT

    public static void main(String[] args) throws IOException {
        int n =readInt();
        int[] way = new int[7];
        Arrays.fill(way,1);
        for(int i = 1; i < n;i++)
        {
            int invite = readInt();
            way[invite] *= (way[i]+1);
        }
        System.out.println(way[n]);
    }
}
