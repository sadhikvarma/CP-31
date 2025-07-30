import java.io.*;

public class twentyTwo{
    public static void solve(int n,long[] arr){
        long count_zero = 0;
        int count_one = 0;
        for(long num: arr){
            if(num == 0)
                count_zero++;
            else if(num == 1)
                count_one++;
        }
        long result = count_one*(1L << count_zero);
        System.out.println(result);
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