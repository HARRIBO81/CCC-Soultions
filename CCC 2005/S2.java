import java.io.*;
import java.util.*;
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static String next () throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static long readLong () throws IOException {
        return Long.parseLong(next());
    }
    static int readInt () throws IOException {
        return Integer.parseInt(next());
    }
    static double readDouble () throws IOException {
        return Double.parseDouble(next());
    }
    static char readCharacter () throws IOException {
        return next().charAt(0);
    }
    static String readLine () throws IOException {
        return br.readLine().trim();
    }
    public static void main(String[] args) throws IOException {
        int max_x = readInt(); int max_y = readInt();
        int base_x = 0; int base_y =0;
        while(true){

            int x = readInt(); int y = readInt();
            if(x == 0 && y == 0){
                break;
            }
            base_x += x;
            base_y += y;
            if(base_x < 0){
                base_x = 0;
            }
            else if(base_x > max_x){
                base_x = max_x;
            }

            if(base_y < 0){
                base_y = 0;
            }
            else if(base_y > max_y){
                base_y = max_y;
            }

            System.out.println(base_x + " " + base_y);

        }
    }
}
