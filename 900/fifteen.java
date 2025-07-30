import java.io.*;

public class fifteen {
    public static void solve(int n, long[] arr) {
        int count = 0;
        for (int i = n - 2; i >= 0; i--) {
            while (arr[i] >= arr[i + 1] && arr[i] > 0) {
                arr[i] /= 2;
                count++;
            }
            if (arr[i] >= arr[i + 1]) {
                System.out.println("-1");
                return;
            }
        }
        System.out.println(count);
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] parts = br.readLine().trim().split(" ");
            long[] arr = new long[n];

            for (int index = 0; index < n; index++) {
                arr[index] = Long.parseLong(parts[index]);
            }

            solve(n, arr);
        }
    }
}
