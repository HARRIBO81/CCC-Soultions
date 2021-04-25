import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class CCC_Hidden_Palindromes {
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
    public static boolean is_palindrome(String text) {
        StringBuilder r = new StringBuilder();
        char[] plain = text.toCharArray();
        for (int i = plain.length - 1; i >= 0; i--) {
            r.append(plain[i]);
        }
        return (r.toString()).equals(text);
    }

    public static void main(String[] args) throws IOException {
        String str = readLine();
        int length = str.length();
        int best = 0;

        for(int i = 0; i < length+1; i++){
            for(int j = 0; j < i; j++){
                if(is_palindrome(str.substring(j,i))){
                    if(str.substring(j,i).length() > best){
                        best = str.substring(j,i).length();
                    }
                }
            }
        }
        System.out.println(best);
    }
}
