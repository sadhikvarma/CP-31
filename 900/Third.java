import java.io.*;

public class Third{
    public static void solve(long n,long k,long x){
        long min_sum = k*(k+1)/2;
        long max_sum = (n*(n+1)/2) - (n-k)*(n-k+1)/2;

        if((x >= min_sum) && (x <= max_sum))
            System.out.println("YES");
        else
            System.out.println("NO");
        
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0){
            String parts[] = br.readLine().trim().split(" ");
            long n = Integer.parseInt(parts[0]);
            long k = Integer.parseInt(parts[1]);
            long x = Long.parseLong(parts[2]);
            solve(n,k,x);
        }
    }
}