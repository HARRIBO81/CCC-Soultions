import javax.crypto.spec.PSource;
import java.io.*;
import java.util.*;

public class Main {
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
        String[] arr = new String [3];
        boolean free_fix = true;
        for (int i=0 ;i<n ;i++)
        {
            for (int j =0;j<3;j++)
                arr [j]=readLine();
            if (
                    arr [2].startsWith (arr [0]) || arr [1].endsWith (arr [2]) || arr [2].endsWith (arr [1]) || arr [1].startsWith (arr [2]) || arr [2].endsWith (arr [0]) ||                    arr [1].startsWith (arr [0]) || arr [1].endsWith (arr [0]) || arr [2].startsWith (arr [1]) || arr [0].endsWith (arr [1]) || arr [0].endsWith (arr [2]) || arr [0].startsWith (arr [2]) || arr [0].startsWith (arr [1])
            )
            {
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}
