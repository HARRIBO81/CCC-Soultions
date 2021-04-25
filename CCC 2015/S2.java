import java.util.*;
public class homework {
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		int J = in.nextInt(), A = in.nextInt(), sz[] = new int[J+1];
		for(int i=1; i<=J; i++) {
			String s = in.next(); sz[i] = getSz(s);
		}
		int count = 0;
		for(int i=1; i<=A; i++) {
			String s = in.next(); int num = in.nextInt();
			if(sz[num] >= getSz(s)) {
				count ++; sz[num] = 0;
			}
		}
		System.out.println(count);
	}
	static int getSz(String s) {
		if(s.charAt(0) == 'S') return 1;
		else if(s.charAt(0) == 'M') return 2;
		else return 3;
	}
}
