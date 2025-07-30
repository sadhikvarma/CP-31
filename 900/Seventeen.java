import java.io.*;
import java.util.*;

public class Seventeen{
    public static void solve(int n, long[] arr) {
        int ops = 0;
        Map<Long, Integer> freqmap = new HashMap<>();

        for (long num : arr) {
            freqmap.put(num, freqmap.getOrDefault(num, 0) + 1);
        }

        int freq = 0;
        for (int count : freqmap.values()) {
            freq = Math.max(freq, count);
        }

        while (freq < n) {
            ops++;  
            if (2 * freq <= n) {
                ops += freq; 
                freq *= 2;
            } else {
                ops += n - freq;  
                break;
            }
            
        }

        System.out.println(ops);
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){

            int n = Integer.parseInt(br.readLine().trim());
            String[] parts = br.readLine().trim().split(" ");
            long arr[] = new long[n];

            for(int i = 0;i < n; i++){
                arr[i] = Long.parseLong(parts[i]);
            }
            
            solve(n, arr);
        }
    }
}