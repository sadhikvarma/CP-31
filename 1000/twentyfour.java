import java.io.*;

public class twentyfour {
    public static void solve(int n, int m, int[][] arr) {
        int absSum = 0;
        int countNeg = 0;
        int minAbs = Integer.MAX_VALUE;

        for (int[] row : arr) {
            for (int val : row) {
                if (val < 0) countNeg++;
                absSum += Math.abs(val);
                minAbs = Math.min(minAbs, Math.abs(val));
            }
        }

        if (countNeg % 2 == 0)
            System.out.println(absSum);
        else
            System.out.println(absSum - 2 * minAbs);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String[] parts = br.readLine().trim().split(" ");
            int n = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);

            int[][] arr = new int[n][m];

            for (int i = 0; i < n; i++) {
                String[] row = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(row[j]);
                }
            }

            solve(n, m, arr);
        }
    }
}
