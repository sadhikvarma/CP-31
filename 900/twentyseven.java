import java.io.*;

public class twentyseven {
    public static void solve(int n,long x,long[] arr){
        long min = 0;
        long max = 0;

        for(long num : arr){
            min += num;
            max += Math.ceil((double)num/x);
        }

        System.out.println((long)Math.ceil((double)min/x) + " "+ max);

    }
    public static void main(String args[]) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());

            while(t-- > 0){
            String parts1[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(parts1[0]);
            long x = Long.parseLong(parts1[1]);
            
            String parts[] = br.readLine().trim().split(" ");
            long arr[] = new long[n];

            for (int index = 0; index < n; index++) {
                arr[index] = Long.parseLong(parts[index]);
            }

            solve(n,x,arr);
        }
    }
}
