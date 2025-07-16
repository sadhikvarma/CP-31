import java.io.*;

public class TwinPermutations {
    public static void solve(int n, int[] arr) {

        for(int i = 0;i < n;i++){
            System.out.print((n - arr[i])+1 + " ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while ((t--) > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] parts = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }

            solve(n, arr); 
            
            
        }
    }
}
