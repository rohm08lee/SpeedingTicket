import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new FileReader("speeding.in"));
        PrintWriter pw = new PrintWriter("speeding.out");
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] road = new int[100];
        int ind = 0;
        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            int mph = sc.nextInt();
            for (int j = 0; j < temp; j++) {
                road[ind + j] = mph;
            }
            ind += temp;
        }
        ind = 0;
        int diff = 0;
        for (int i = 0; i < M; i++) {
            int temp = sc.nextInt();
            int mph = sc.nextInt();
            for (int j = 0; j < temp; j++) {
                int tempdiff = (mph - road[j+ ind]);
                if (diff < tempdiff) {
                    diff = tempdiff;
                }
            }
            ind += temp;
        }

        pw.println(diff);
        pw.close();
    }
}