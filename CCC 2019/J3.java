import javax.crypto.spec.PSource;
import java.io.*;
import java.util.StringTokenizer;
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
        for(int i = 0; i < n;i++){
            String s = readLine();
            final StringBuilder eee = new StringBuilder();
            for(int j =0;j<s.length();j++){
                int constant_length = 1;
                while(j+1 < s.length() &&s.charAt(j)==s.charAt(j+1)){
                    constant_length++;
                    j++;
                }
                eee.append(constant_length + " ");
                eee.append(s.charAt(j) + " ");
            }
            System.out.println(eee.toString());
        }

    }
}
