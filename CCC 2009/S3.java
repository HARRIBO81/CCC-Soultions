// THIS SOULTION ONLY PASSES 30/40

import java.io.*;
import java.util.*;

public class ccc_degrees_of_separation {
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
        int[][] adj = new int[50][50];
        adj[1][6] = 1;
        adj[6][1] = 1;
        adj[2][6] = 1;
        adj[6][2] = 1;
        adj[1][6] = 1;
        adj[6][1] = 1;
        adj[7][6] = 1;
        adj[6][7] = 1;
        adj[3][6] = 1;
        adj[6][3] = 1;
        adj[6][4] = 1;
        adj[4][6] = 1;
        adj[6][5] = 1;
        adj[5][6] = 1;
        adj[3][5] = 1;
        adj[5][3] = 1;
        adj[3][4] = 1;
        adj[4][3] = 1;
        adj[4][5] = 1;
        adj[5][4] = 1;
        adj[7][8] = 1;
        adj[8][7] = 1;
        adj[8][9] = 1;
        adj[9][8] = 1;
        adj[9][12] = 1;
        adj[12][9] = 1;
        adj[9][10] = 1;
        adj[10][9] = 1;
        adj[11][10] = 1;
        adj[10][11] = 1;
        adj[11][12] = 1;
        adj[12][11] = 1;
        adj[3][15] = 1;
        adj[15][3] = 1;
        adj[15][13] = 1;
        adj[13][15] = 1;
        adj[13][12] = 1;
        adj[12][13] = 1;
        adj[13][14] = 1;
        adj[14][13] = 1;
        adj[16][18] = 1;
        adj[18][16] = 1;
        adj[18][17] = 1;
        adj[17][18] = 1;
        adj[17][16] = 1;
        adj[16][17] = 1;
        while (true) {
            String command = readLine();
            if (command.equals("q")) {
                break;
            }
            if (command.equals("i")) {
                int x = readInt();
                int y = readInt();
                adj[x][y] = 1;
                adj[y][x] = 1;
            }
            if (command.equals("d")) {
                int x = readInt();
                int y = readInt();
                adj[x][y] = 0;
                adj[y][x] = 0;
            }
            if (command.equals("n")) {
                int sum = 0;
                int x = readInt();
                for (int i = 0; i < 50; i++) {
                    if(adj[x][i] == 1){
                        sum++;
                    }
                }
                System.out.println(sum);
            }
            if (command.equals("f")) {
                int x = readInt();
                int sum = 0;
                int[][] copy = Arrays.copyOf(adj, 50);
                for (int i = 0; i < 50; i++) {
                    if (copy[x][i] == 1) {
                        for (int j = 0; j < 50; j++) {
                            if (copy[i][j] == 1 && j != x && copy[x][j] == 0) {
                                copy[x][j] = 10;
                            }
                        }
                    }

                }
                for (int e = 0; e < 50; e++) {
                    if (copy[x][e] == 10) {
                        sum++;
                    }
                }
                System.out.println(sum);
            }
            if (command.equals("s")) {
                int x = readInt();
                int y = readInt();
                int cnt = 0;
                int[][] copy_array = Arrays.copyOf(adj, 50);
                for(int i = 0; i<50;i++){
                    for(int j = 0; j<50;j++){
                        if(copy_array[i][j]==0){
                            copy_array[i][j]=10000;
                        }
                    }
                }
                for(int i =0;i<50;i++){
                        for(int j = 0;j<50;j++){
                            if(copy_array[i][j]>0){
                                for(int q = 0; q < 50; q++){
                                    if(copy_array[j][q]>0 && copy_array[i][j]+copy_array[j][q]<copy_array[i][q]){
                                        copy_array[i][q]=copy_array[i][j]+copy_array[j][q];
                                        copy_array[q][i]=copy_array[i][j]+copy_array[j][q];
                                    }
                                }
                            }
                    }
                }
                if(copy_array[x][y]==10000){
                    System.out.println("Not connected");
                }
                else{
                    System.out.println(copy_array[x][y]);
                }







            }


        }

    }
}
