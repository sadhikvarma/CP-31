import java.io.*;

public class GoalsOfVictory {
    public static void solve(int n,int[] arr){
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println(-sum);
    }
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine().trim());
            String parts1[] = br.readLine().trim().split(" ");
            int arr[] = new int[n-1];
            for (int i = 0; i < n-1; i++) {
                arr[i] = Integer.parseInt(parts1[i]);
            }
            solve(n,arr);
        }
    }
}
