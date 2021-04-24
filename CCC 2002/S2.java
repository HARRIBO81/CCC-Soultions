import java.io.*;
import java.util.StringTokenizer;

public class Main {static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
        int numerator = readInt();
        int denominator = readInt();
        int numerator_copy = numerator;
        int denominator_copy = denominator;
        int g = 0;
        while(denominator != 0){
            int dd = denominator;
            denominator = numerator % denominator;
            numerator = dd;
            g = numerator;
        }
        numerator_copy = numerator_copy/g;
        denominator_copy = denominator_copy/g;

        if(numerator_copy == 0)
        {
            System.out.println("0");
        }

        else if(denominator_copy == 1)
        {
            System.out.println(numerator_copy);
        }
        else if(numerator_copy < denominator_copy)
        {
            System.out.println(numerator_copy + "/" + denominator_copy);
        }
        else
        {
            System.out.println(numerator_copy/denominator_copy + " " + numerator_copy%denominator_copy + "/" + denominator_copy);
        }


    }
}
