import java.io.*;

import java.util.ArrayList;
import java.util.Scanner;
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
        int anyonia = 100;
        int david = 100;
        int n = readInt();
        for(int i = 0; i < n;i++){
            int antonia_roll = readInt();
            int david_roll = readInt();
            if(david_roll > antonia_roll){
                anyonia-=david_roll;
            }
            else if(antonia_roll > david_roll){
                david-=antonia_roll;
            }
        }
        System.out.println(anyonia);
        System.out.println(david);


    }
}
