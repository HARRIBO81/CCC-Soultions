import java.io.*;

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
        int n = readInt();
        int[] swifts = new int[n];
        int[] semaphores = new int[n];
        int day = 0;
        int swifts_score = 0;
        int sem_scores = 0;
        for (int i = 0; i < n; i++) {
            swifts[i] = readInt();
        }
        for (int i = 0; i < n; i++) {
            semaphores[i] = readInt();
        }
        for(int i = 0; i < n;i++){
            swifts_score+=swifts[i];
            sem_scores+=semaphores[i];
            if(sem_scores == swifts_score){
                day = i+1;
            }
        }
        System.out.println(day);
    }
}
