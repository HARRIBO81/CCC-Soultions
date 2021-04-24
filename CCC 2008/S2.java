import java.io.*;import java.lang.reflect.Array;import java.util.ArrayList;import java.util.Collections;import java.util.StringTokenizer;public class Main {
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

    static int pennie_checker(int radius) {
        int count = 0;
        for (int i = 1; i <= radius; i++) {
            for (int j = 0; j <= radius; j++) {
                if (i * i + j * j <= radius * radius) {
                    ++count;
                } else {
                    break;
                }
            }
        }
        return 1 + 4 * count;
    }

    public static void main(String[] args) throws IOException {
        while(true){

            int radius = readInt();
            if(radius==0){
                break;
            }
            System.out.println(pennie_checker(radius));


        }
    }
}
