import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.logging.Logger;

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
        int T = readInt();
        for(int t =1;t<=T;t++){
            int n =readInt();
            int a[] = new int[n];
            for(int i =0;i<n;i++) a[i] = readInt();
                Stack<Integer> s = new Stack<>();
                int expected = 1;
                for(int i =n-1;i>=0;i--) {
                    s.push(a[i]);
                    while (!s.isEmpty() && s.peek() == expected) {
                        s.pop();
                        expected++;
                    }
                }
                if(expected>n) {
                    System.out.println("Y");
                }
                else{
                    System.out.println("N");
                }
            }

        }
        
}
