import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fourth {
    public static void solve(long a,long b,int n,long[] arr){
        long sum = b;
        for(int i = 0; i < n; i++){
            if((1+arr[i]) > a)
                sum += a-1;
            else
                sum += arr[i];
        }
        System.out.println(sum);
        
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0){
            String parts[] = br.readLine().trim().split(" ");
            long a = Integer.parseInt(parts[0]);
            long b = Integer.parseInt(parts[1]);
            int n = Integer.parseInt(parts[2]);
            String parts1[] = br.readLine().trim().split(" ");
            long arr[] = new long[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(parts1[i]);
            }
            solve(a,b,n,arr);
        }
    }
}
