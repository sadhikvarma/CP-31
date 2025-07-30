import java.io.*;

public class twelve {
    public static void solve(int n, int[] arr) {
        if (n == 1) {
            System.out.println(0);
            return;
        }

        int maxDiff = Integer.MIN_VALUE;
        int minBeforeLast = arr[0];       
        int maxAfterFirst = Integer.MIN_VALUE; 

        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                maxDiff = Math.max(maxDiff, arr[i] - arr[i + 1]);
            }

            if (i < n - 1) {
                minBeforeLast = Math.min(minBeforeLast, arr[i]);
            }

            if (i > 0) {
                maxAfterFirst = Math.max(maxAfterFirst, arr[i]);
            }
        }

        maxDiff = Math.max(maxDiff, arr[n - 1] - minBeforeLast);
        maxDiff = Math.max(maxDiff, maxAfterFirst - arr[0]);

        System.out.println(maxDiff);
    }

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine().trim());
            String parts[] = br.readLine().trim().split(" ");
            int arr[] = new int[n];

            for (int index = 0; index < n; index++) {
                arr[index] = Integer.parseInt(parts[index]);
            }

            solve(n,arr);
        }
    }
}
