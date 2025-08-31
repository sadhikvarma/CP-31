import java.io.*;

public class thirteen{
    public static void solve(int n,long x,long[] arr){
        long left = arr[0] - x;
        long right = arr[0] + x;
        long count  = 0;

        for(int i = 1; i < n;i++){
            long l1 = arr[i] - x;
            long r1 = arr[i] + x;
            long l_check = Math.max(l1,left);
            long r_check = Math.min(r1,right);

            if(l_check > r_check){
                count++;
                left = l1;
                right = r1; 
            }
            else{
                left = l_check;
                right = r_check;
            }
        }

        System.out.println(count);
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            String parts[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(parts[0]);
            long x = Long.parseLong(parts[1]);
            long arr[] = new long[n];
            String parts1[] = br.readLine().trim().split(" ");

            for(int i = 0 ; i< n; i++){
                arr[i] = Long.parseLong(parts1[i]);
            }
            solve(n,x,arr);
        }
    }
}