import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        char[]  charr = new char[21];
        String[] bin_rep = new String[21];
        for(int i = 0; i < x;i ++){
            charr[i] = scan.next().charAt(0);
            bin_rep[i] = scan.next();
            scan.nextLine();
        }
        String number = scan.nextLine();
        String fin = "";
        while(number.length() > 0){
            int i = 0;
            while(number.startsWith(bin_rep[i]) != true)
                i++;
            fin = fin + charr[i];
            number = number.substring(bin_rep[i].length());
        }
        System.out.println(fin);
    }
}
