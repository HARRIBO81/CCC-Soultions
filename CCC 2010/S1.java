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
    public static void main (String[]args) throws IOException {
        int n = readInt();
        String best_current_name = "";
        String SecondBest_current_name = "";
        int current_best_value = 0;
        int second_current_best_value = 0;
        for(int i = 0; i < n;i++){
            String ee = readLine();
            String current_name = ee.split(" ")[0];
            int our_value = 2 * Integer.parseInt(ee.split(" ")[1]) + 3 * Integer.parseInt(ee.split(" ")[2]) + Integer.parseInt(ee.split(" ")[3]);
            if(our_value > current_best_value || our_value == current_best_value && current_name.compareTo(best_current_name) < 0){
                SecondBest_current_name = best_current_name;
                second_current_best_value = current_best_value;
                best_current_name = current_name;
                current_best_value = our_value;
            }

            else if(our_value > second_current_best_value || our_value == second_current_best_value && current_name.compareTo(SecondBest_current_name)<0){
                SecondBest_current_name=current_name;
                second_current_best_value=our_value;
            }

        }

        System.out.println(best_current_name);
        System.out.println(SecondBest_current_name);
    }
}
