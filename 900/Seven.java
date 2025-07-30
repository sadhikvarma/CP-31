import java.io.*;
import java.util.*;

public class Seven {
    public static void solve(int n,long k,long[] arr){
        Arrays.sort(arr);
        int count = 0;
        int max = 0;
        for(int i = 1; i < n; i++){
            if((arr[i]-arr[i-1]) <= k){
                count++;
            }
            else
                count = 0;
            max = Math.max(max,count);
        }
        System.out.println(n-max-1);
    } 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){

            String parts[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(parts[0]);
            long k = Integer.parseInt(parts[1]);
            String parts1[] = br.readLine().trim().split(" ");
            long arr[] = new long[n];

            for (int index = 0; index < n; index++) {
                arr[index] = Long.parseLong(parts1[index]);
            }

            solve(n,k,arr);
        }
    }
}
