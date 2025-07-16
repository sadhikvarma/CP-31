import java.io.*;

public class DeSorting {
    public static void solve(int n, int[] arr) {
        int min = Integer.MAX_VALUE;
        int count = 0;
        int diff = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if(arr[i] < arr[i - 1]) {
                System.out.println("0");
                return;
            }
            else if (arr[i] >= arr[i - 1]) {
                diff = arr[i] - arr[i - 1];
                count++;
            }
            if(diff < min) {
                min = diff;
            } 
        }
        System.out.println(min/2 + 1);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine().trim());
            String[] parts = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
            solve(n, arr);
        }
        
    }
}
