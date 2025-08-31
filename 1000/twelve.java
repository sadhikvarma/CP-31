import java.io.*;

public class twelve {
    public static void solve(int n,long k,long b,long s){
        long start = k*b;
        long end = start + n*(k-1);
        long arr[] = new long[n];
        if(s < start || s > end)
            System.out.println(-1);
        else{
            arr[0] = start;
            s -= start;
            for(int i = 0;i < n;i++){
                long add = Math.min(k-1,s);
                if(s >= 0){
                    arr[i] += add;
                    s -= add;
                }
            }
            for(long num : arr){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            String parts[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(parts[0]);
            long k = Long.parseLong(parts[1]);
            long b = Long.parseLong(parts[2]);
            long s = Long.parseLong(parts[3]);
            solve(n,k,b,s);
        }
    }
}
