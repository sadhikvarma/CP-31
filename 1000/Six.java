import java.io.*;

public class Six{

    public static void solve(int n,long k,long q,long[] arr){
        long ans = 0;
        long conseq = 0;

        for(long num : arr){
            if(num <= q){
                conseq++;
            }
            else{
                if(conseq >= k){
                    ans += (long)(conseq-k+1)*(conseq-k+2)/2;
                }
                conseq = 0;
            }
        }
        
        if(conseq >= k){
            ans += (conseq-k+1)*(conseq-k+2)/2;
        }
        
        System.out.println(ans);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            String parts[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(parts[0]);
            long k = Long.parseLong(parts[1]);
            long q = Long.parseLong(parts[2]);
            String parts1[] = br.readLine().trim().split(" ");
            long arr[] = new long[n];

            for(int i = 0;i < n;i++){
                arr[i] = Long.parseLong(parts1[i]);
            }
            solve(n,k,q,arr);
        }
    }
}