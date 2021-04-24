import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CCC {
    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     int t = scan.nextInt();
     int c = scan.nextInt();
     int current_value = 0;
     int cnt = 0;
     ArrayList<Integer> arr = new ArrayList<>();
     for(int i = 0; i < c;i++)
     {
         arr.add(scan.nextInt());
     }
        Collections.sort(arr);

        while(t >= 0)
      {
          t-=arr.get(current_value);
          current_value++;
          cnt++;
      }
        System.out.println(cnt-1);
    }
}
