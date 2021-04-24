import java.io.*;
import java.util.Arrays;
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
        while(true){
            int n = readInt();
            if(n == 0){
                break;
            }
            else{
                int[] a = new int[n];
                for(int i=0; i<n;i++){
                    a[i] = readInt();
                }
                int dif[] = new int[a.length -1];
                for(int i = 0; i <dif.length;i++){
                    dif[i] = a[i+1] - a[i];
                }



                int cycle = 0;
                if(n == 1){
                    System.out.println("0");
                    continue;
                }
                for(cycle = 1; cycle < dif.length;cycle++){
                    boolean flag = true;
                    for(int i  =0; i<dif.length;i++){
                        if(dif[i] != dif[i%cycle]) flag = false;
                    }
                    if(flag) break;
                }
                System.out.println(cycle);
            }
        }
    }
}
