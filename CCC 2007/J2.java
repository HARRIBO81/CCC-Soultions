import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
  // FAST INPUT
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
  // END OF FAST INPUT
    public static void main (String[]args) throws IOException {
        {
            while (true) {
                String n = readLine();
                if(n.equals("TTYL")){
                    System.out.println("talk to you later");
                    break;
                }
                switch ((n)) {
                    case "CU":
                        System.out.println("see you");
                        break;
                    case ":-)":
                        System.out.println("I'm happy");
                        break;
                    case ":-(":
                        System.out.println("I'm unhappy");
                        break;
                    case ";-)":
                        System.out.println("wink");
                        break;
                    case ":-P":
                        System.out.println("stick out my tongue");
                        break;
                    case "(~.~)":
                        System.out.println("sleepy");
                        break;
                    case "TA":
                        System.out.println("totally awesome");
                        break;
                    case "CCC":
                        System.out.println("Canadian Computing Competition");
                        break;
                    case "CUZ":
                        System.out.println("because");
                        break;
                    case "TY":
                        System.out.println("thank-you");
                        break;
                    case "YW":
                        System.out.println("you're welcome");
                        break;
                    default:
                        System.out.println(n);
                        break;
                }


            }
        }

    }
}
