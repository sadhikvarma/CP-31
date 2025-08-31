import java.io.*;

public class seventeen {

    public static void solve(int n) {
      
        int power = 1;
        while (power * 2 < n) {
            power <<= 1;
        }

        for (int i = power - 1; i >= 0; i--) {
            System.out.print(i + " ");
        }

        for (int i = power; i < n; i++) {
            System.out.print(i + (i + 1 < n ? " " : ""));
        }

        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            solve(n);
        }
    }
}
