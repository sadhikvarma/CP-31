import java.io.*;

public class ten {
    public static void solve(int n, int l, int r, long k, long[] pref) {
        long leftSum = (l > 1) ? pref[l - 2] : 0;
        long rightSum = (r < n) ? (pref[n - 1] - pref[r - 1]) : 0;
        long sum = leftSum + rightSum + k * (r - l + 1);

        if (sum % 2 != 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){

            String parts[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(parts[0]);
            int q = Integer.parseInt(parts[1]);
            String parts1[] = br.readLine().trim().split(" ");
            long arr[] = new long[n];

            for (int index = 0; index < n; index++) {
                arr[index] = Long.parseLong(parts1[index]);
            }

            long pref[] = new long[n];
            pref[0] = arr[0];
            for(int i = 1; i < n; i++){
                pref[i] = pref[i-1] + arr[i];
            }
            while(q-- > 0){
                String[] parts2 = br.readLine().trim().split(" ");
                int l = Integer.parseInt(parts2[0]);
                int  r = Integer.parseInt(parts2[1]);
                long k = Long.parseLong(parts2[2]);
                
                solve(n,l,r,k,pref);
            }
            
        }
    }
}
