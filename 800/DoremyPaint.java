import java.io.*;
import java.util.HashMap;

public class DoremyPaint {
    
    public static void solve(int n,int[] arr){
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        if (freqMap.size() > 2) {
            System.out.println("No");
            return;
        }

        if (freqMap.size() == 1) {
            System.out.println("Yes");
            return;
        }

        int[] freqs = new int[2];
        int index = 0;

        for (int freq : freqMap.values()) {
            freqs[index++] = freq;
        }

        if (Math.abs(freqs[0] - freqs[1]) <= 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine().trim());
            String parts[] = br.readLine().trim().split(" ");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
            solve(n,arr);
        }
    }
}
