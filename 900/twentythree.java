import java.io.*;

public class twentythree{
    public static void solve(int n,long[] arr){
        long min = arr[0];

        for(long num : arr){
            min = min&num;
        }
        
        System.out.println(min);
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine().trim());
            String parts[] = br.readLine().trim().split(" ");
            long arr[] = new long[n];

            for (int index = 0; index < n; index++) {
                arr[index] = Long.parseLong(parts[index]);
            }

            solve(n,arr);
        }
    }
}